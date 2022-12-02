package edu.designpatterns.state;

class NoQuarterState extends GumballMachineState {
	@Override
	void start(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.NQ_START);
	}

	@Override
	void insertQuarter(GumballMachine gumballMachine) {
		gumballMachine.setState(State.HQ);
	}

	@Override
	void ejectQuarter(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.NQ_EJECT);
	}

	@Override
	void turnCrank(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.NQ_CRANK);
	}
}
