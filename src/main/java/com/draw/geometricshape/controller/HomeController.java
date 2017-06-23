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

import com.draw.geometricshape.domain.UserInputs;
import com.draw.geometricshape.enums.ShapesList;
import com.draw.geometricshape.strategy.Diamond;
import com.draw.geometricshape.strategy.Rectangle;
import com.draw.geometricshape.strategy.Square;
import com.draw.geometricshape.strategy.StrategyContext;
import com.draw.geometricshape.strategy.Triangle;

@Controller
public class HomeController {
	@Autowired
	private StrategyContext strategyContext;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String getHomePage(Model model) {
		addListToShowInJsp(model);
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String drawShape(@Valid @ModelAttribute("userInputs") UserInputs userInputs, BindingResult results,
			Model model) {
		if (results.hasErrors()) {
			addListToShowInJsp(model);
			return "home";
		}
		if (userInputs.getShape().equalsIgnoreCase("Triangle")) {
			String result = strategyContext.getStrategyContext(new Triangle()).draw(userInputs);
			model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Rectangle")) {
			String result = strategyContext.getStrategyContext(new Rectangle()).draw(userInputs);
			model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Diamond")) {
			String result = strategyContext.getStrategyContext(new Diamond()).draw(userInputs);
			model.addAttribute("result", result);
		} else if (userInputs.getShape().equalsIgnoreCase("Square")) {
			String result = strategyContext.getStrategyContext(new Square()).draw(userInputs);
			model.addAttribute("result", result);
		} else {
			String result = "Not a valid input";
			model.addAttribute("result", result);
		}
		addListToShowInJsp(model);
		return "home";
	}

	private void addListToShowInJsp(Model model) {
		List<ShapesList> shapes = new ArrayList<>(Arrays.asList(ShapesList.values()));
		model.addAttribute("lstOfShapes", shapes);
	}

}
