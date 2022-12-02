package edu.designpatterns.state;

class SoldOutState extends GumballMachineState {
	@Override
	void start(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.SO_START);
	}

	@Override
	void insertQuarter(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.SO_QUART);
		gumballMachine.getDevice().dispenseQuarter();
	}

	@Override
	void ejectQuarter(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.SO_EJECT);
	}

	@Override
	void turnCrank(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.SO_CRANK);
	}

	@Override
	void refill(GumballMachine gumballMachine) {
		gumballMachine.setState(State.NQ);
	}
}
