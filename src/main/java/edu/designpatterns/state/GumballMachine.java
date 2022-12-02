package edu.designpatterns.state;

public class GumballMachine {
	private final GumballHardwareDevice device;
	private GumballMachineState state;

	void setState(GumballMachineState state) {
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

	GumballHardwareDevice getDevice() {
		return device;
	}

}
