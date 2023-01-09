package edu.designpatterns.state;

import edu.designpatterns.enums.GumballStateEnum;

public class GumballMachine {
	private final GumballHardwareDevice device;
	private GumballStateEnum state;

	public void setState(GumballStateEnum state) {
		this.state = state;
		state.start(this);
	}

	public GumballMachine(GumballHardwareDevice device) {
		this.device = device;
		setState(State.SO);
	}

	public void insertQuarter() {
		state.insertQuarter(this);
	}

	public void ejectQuarter() {
		state.ejectQuarter(this);
	}

	public void turnCrank() {
		state.turnCrank(this);
	}

	public void refill() {
		state.refill(this);
	}

	public GumballHardwareDevice getDevice() {
		return device;
	}

}
