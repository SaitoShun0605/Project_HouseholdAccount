package com.example.web.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.Form.RegistrationForm;

/**
 * 登録Mapper
 */
@Mapper
public interface RegistrationMapper {

	void insertTest(RegistrationForm aForm);

}
