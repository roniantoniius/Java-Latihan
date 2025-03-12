package com.roniantonius.colours.services.impl;

import org.springframework.stereotype.Component;

import com.roniantonius.colours.services.BluePrinter;

@Component
public class IndoBluePrinter implements BluePrinter{
	@Override
	public String print() {
		return "Biru";
	}
}
