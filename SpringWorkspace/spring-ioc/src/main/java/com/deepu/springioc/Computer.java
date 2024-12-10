package com.deepu.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	@Autowired
	Keyboard keyboard;
	
	public void start() {
		keyboard.plugIn();
		System.out.println("Computer starting");
	}
}
