package edu.designpatterns.state;

class HasQuarterState extends GumballMachineState {
	@Override
	void start(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.HQ_START);
	}

	@Override
	void insertQuarter(GumballMachine gumballMachine) {
		gumballMachine.getDevice().displayLine(Messages.HQ_QUART);
		gumballMachine.getDevice().dispenseQuarter();
	}

	@Override
	void ejectQuarter(GumballMachine gumballMachine) {
		gumballMachine.setState(State.NQ);
		gumballMachine.getDevice().displayLine(Messages.HQ_EJECT);
		gumballMachine.getDevice().dispenseQuarter();
	}

	@Override
	void turnCrank(GumballMachine gumballMachine) {
		if (!gumballMachine.getDevice().dispenseGumball()) {
			gumballMachine.getDevice().dispenseQuarter();
			gumballMachine.setState(State.SO);
		} else {
			gumballMachine.setState(State.NQ);
		}
	}

}
