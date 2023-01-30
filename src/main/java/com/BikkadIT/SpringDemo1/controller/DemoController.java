package com.BikkadIT.SpringDemo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	public DemoController() {
	
		System.out.println("Demo class constructor");
		
		}

	@GetMapping("/GoodEvening")
	public String getdata(Model model) {
		
				
		List<String> list = new ArrayList<String>();
		list.add("Hello World");
		list.add("Good Evening");
				
		model.addAttribute("Message",list);
		
		return "hello";
		
	}
	@GetMapping("/GoodEveningAll")
	public String getdata1(Model model) {
		
				
		List<String> list = new ArrayList<String>();
		list.add("I want to become Java Developer");
		list.add("Best Luck");
				
		model.addAttribute("Message1",list);
		
		return "hello1";
		
	}
	
}
