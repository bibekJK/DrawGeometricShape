package com.draw.geometricshape.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.draw.geometricshape.enums.ShapesList;
import com.draw.geometricshape.strategy.Diamond;
import com.draw.geometricshape.strategy.Rectangle;
import com.draw.geometricshape.strategy.StrategyContext;
import com.draw.geometricshape.strategy.Triangle;

@Controller
public class HomeController {
	@Autowired
	private StrategyContext strategyContext;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String drawShape(Model model) {
		strategyContext.getStrategyContext(new Triangle(2, 3, "Triangle", "t")).draw();
		strategyContext.getStrategyContext(new Diamond(2, 3, "Diamond", "t")).draw();
		strategyContext.getStrategyContext(new Rectangle(2, 4, 3, "Rectangle", "t")).draw();
		addListToShowInJsp(model);
		return "home";
	}

	private void addListToShowInJsp(Model model) {
		List<ShapesList> shapes = new ArrayList<>(Arrays.asList(ShapesList.values()));
		model.addAttribute("lstOfShapes", shapes);
	}

}
