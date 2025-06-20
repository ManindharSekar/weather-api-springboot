package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.WeatherResponse;
import com.example.demo.service.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/")
	public String display() {
		return "weather";
	}
	
	@GetMapping("weather")
	public String showWeatherDetails(@RequestParam String city, Model model) {
		WeatherResponse weatherResponse=weatherService.getWeather(city);
		model.addAttribute("weather", weatherResponse);
		return "weather";
		
	}

}
