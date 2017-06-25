package com.draw.geometricshape.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.draw.geometricshape.domain.interfaces.UserInputs;
import com.draw.geometricshape.domain.shapes.Diamond;
import com.draw.geometricshape.domain.shapes.Rectangle;
import com.draw.geometricshape.domain.shapes.Square;
import com.draw.geometricshape.domain.shapes.Triangle;
import com.draw.geometricshape.enums.ShapeType;
import com.draw.geometricshape.services.GeometricShapeService;

/**
 * This class contains controller methods to serve the requests coming from view
 * page
 * 
 * @author Bibek
 */

@Controller
public class HomeController {
	@Autowired
	private GeometricShapeService strategyContext;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String getHomePage(Model model) {
		addShapeList(model);
		return "home";
	}

	/**
	 * 
	 * @param userInputs
	 * @param results
	 * @param model
	 * @return result string for display
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String drawShape(@Valid @ModelAttribute("userInputs") UserInputs userInputs, BindingResult results,
			Model model) {
		if (results.hasErrors()) {
			addShapeList(model);
			return "home";
		}

		String result = null;
		if (userInputs.getShape().equalsIgnoreCase("Triangle")) {
			strategyContext.setShape(new Triangle());// .draw(userInputs);
			// model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Rectangle")) {
			strategyContext.setShape(new Rectangle());
			// model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Diamond")) {
			strategyContext.setShape(new Diamond());
			// model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Square")) {
			strategyContext.setShape(new Square());
			// model.addAttribute("result", result);
		} else {
			result = "Not a valid input";
			// model.addAttribute("result", result);
		}

		if (result == null) {
			result = strategyContext.draw(userInputs);
		}
		model.addAttribute("result", result);

		addShapeList(model);
		return "home";
	}

	private void addShapeList(Model model) {
		List<ShapeType> shapes = new ArrayList<>(Arrays.asList(ShapeType.values()));
		model.addAttribute("lstOfShapes", shapes);
	}

}
