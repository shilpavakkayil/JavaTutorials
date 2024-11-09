package com.shilpa.springannotation;

public class Samsung {
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("Configuration of samsung");
		cpu.process();
	}
}
