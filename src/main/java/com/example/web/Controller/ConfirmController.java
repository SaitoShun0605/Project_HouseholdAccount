package com.example.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 確定Controller
 */
@Controller
public class ConfirmController {

	@GetMapping("/confirm")
	public String confirm() {
		return "confirm/confirm";
	}

}
