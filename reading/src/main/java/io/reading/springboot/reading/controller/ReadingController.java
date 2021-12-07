package io.reading.springboot.reading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import io.reading.springboot.reading.order.Order;

@Controller
public class ReadingController {

	private Service service;
	
	public ReadingController(Service service) {
		super();
		this.service = service;
	}
	

	
	

	
}
	
