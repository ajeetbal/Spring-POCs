package com.demo.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainController {

	@Autowired
	private ResourceBundleMessageSource messageSource;

	@GetMapping()
	public String getMessage(@RequestParam("msg") String message) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(message, null, locale);
	}
}
