package com.example.web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Form.RegistrationForm;
import com.example.web.Mapper.RegistrationMapper;

/**
 * 登録Service
 */
@Service
public class RegistrationService {

	@Autowired
	RegistrationMapper mapper;

	public void registrationTest(RegistrationForm aForm) {
		mapper.insertTest(aForm);
	}

}
