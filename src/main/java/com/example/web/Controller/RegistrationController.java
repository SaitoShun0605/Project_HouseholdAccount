package com.example.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.web.Form.RegistrationForm;
import com.example.web.Service.RegistrationService;

/**
 * 登録Controller
 */
@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	/**
	 * 登録画面表示
	 * @return 登録画面
	 */
	@GetMapping("/registration")
	public String registration() {
		return "registration/registration";
	}

	/**
	 * 登録処理
	 * @param form 登録フォーム
	 * @return 未定（ひとまず登録画面） //TODO
	 */
	@PostMapping("/registration")
	public String registrationObject(@ModelAttribute RegistrationForm form) {
		registrationService.registrationTest(form);

		return "registration/registration";
	}

}
