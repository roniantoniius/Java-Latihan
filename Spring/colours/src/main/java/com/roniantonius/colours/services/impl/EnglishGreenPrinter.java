package com.roniantonius.colours.services.impl;

import org.springframework.stereotype.Component;

import com.roniantonius.colours.services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter{
	@Override
	public String print() { return "Green"; }
}
