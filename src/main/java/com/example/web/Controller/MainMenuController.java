package com.example.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * メインメニューController
 */
@Controller
public class MainMenuController {

	/**
	 * 初期画面表示
	 * @return メインメニュー画面
	 */
	@GetMapping("/mainMenu")
	public String mainMenu() {
		return "mainMenu/mainMenu";
	}

}
