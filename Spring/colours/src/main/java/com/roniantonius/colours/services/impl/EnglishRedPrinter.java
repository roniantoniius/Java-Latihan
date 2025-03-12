package com.roniantonius.colours.services.impl;

import org.springframework.stereotype.Component;

import com.roniantonius.colours.services.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter{
	@Override
	public String print() {
		return "Red";
	}
}
