package com.roniantonius.colours.services.impl;

import org.springframework.stereotype.Component;

import com.roniantonius.colours.services.BluePrinter;
import com.roniantonius.colours.services.ColourPrinter;
import com.roniantonius.colours.services.GreenPrinter;
import com.roniantonius.colours.services.RedPrinter;

@Component
public class ColourPrinterImpl implements ColourPrinter {
	private RedPrinter redPrinter;
	private BluePrinter bluePrinter;
	private GreenPrinter greenPrinter;
	
	// anotasi Component membuat class ini menjadi Dependency Injection untuk setiap constructor di bawah ini
	// tapi pastiin penerapan dari interface constructor (dependency) ini merupakan Component juga. Makannya kalau ada yang sama, tinggal ganti aja
	public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
		this.redPrinter = redPrinter;
		this.bluePrinter = bluePrinter;
		this.greenPrinter = greenPrinter;
	}
	
	@Override
	public String print() {
		return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
	}
}
