package com.example.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 清算Controller
 */
@Controller
public class SettlementController {

	@GetMapping("/settlement")
	public String settlement() {
		return "settlement/settlement";
	}
}
