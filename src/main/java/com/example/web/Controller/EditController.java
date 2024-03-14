package com.example.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 編集Controller
 */
@Controller
public class EditController {

	@GetMapping("/edit")
	public String edit() {
		return "edit/edit";
	}

}
