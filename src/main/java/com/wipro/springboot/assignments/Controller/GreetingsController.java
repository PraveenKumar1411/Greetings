package com.wipro.springboot.assignments.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot.assignments.Names;
import com.wipro.springboot.assignments.Names.userNames;

@RestController
public class GreetingsController {


		@GetMapping("/greetings")
		public String greetUser(@RequestParam("name") String inputName) {
			for (Names.userNames names : userNames.values()) {
				if (inputName.equalsIgnoreCase(names.toString())) {
					return "Hello, "+names;
				}
			}
			return HttpStatus.NOT_FOUND.toString();
		}
}
