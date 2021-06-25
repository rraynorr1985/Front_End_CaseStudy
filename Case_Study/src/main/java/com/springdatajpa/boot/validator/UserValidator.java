package com.springdatajpa.boot.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springdatajpa.boot.entities.User;
import com.springdatajpa.boot.service.UserService;

//Validation class for Spring Security
@Component
public class UserValidator implements Validator {
	//userService
	@Autowired
	private UserService userService;
	//supporting Validation
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	//Validation implementation, refer to validation.properties file, where messages determined
	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;
		//Not Empty
		ValidationUtils.rejectIfEmpty(errors, "username", "NotEmpty");
		if(user.getUsername().length() <6 || user.getUsername().length()>32)
		{
			errors.rejectValue("username", "Size.userForm.username");
		}
		//Duplicate user
		if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }
		//password >8 and <32 symbols
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }
        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
		
	}

}
