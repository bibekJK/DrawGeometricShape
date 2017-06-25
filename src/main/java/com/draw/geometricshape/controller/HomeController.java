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

		switch (userInputs.getShape()) {
		case "TRIANGLE":
			strategyContext.setShape(new Triangle());
			break;
		case "RECTANGLE":
			strategyContext.setShape(new Rectangle());
			break;
		case "DIAMOND":
			strategyContext.setShape(new Diamond());
			break;
		case "SQUARE":
			strategyContext.setShape(new Square());
			break;
		default:
			result = "Not a valid input";

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
