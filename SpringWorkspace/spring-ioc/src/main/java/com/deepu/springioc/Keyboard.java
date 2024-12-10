package com.deepu.springioc;

import org.springframework.stereotype.Component;

@Component
public class Keyboard {

	public void plugIn() {
		System.out.println("Keyboard plugged in");
	}
}
