package com.shilpa.quickstart;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive()
	{
		System.out.println("riding bike.........");
	}
}
