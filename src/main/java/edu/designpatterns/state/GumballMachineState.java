package edu.designpatterns.state;

abstract class GumballMachineState {
	abstract void start(GumballMachine gumballMachine);

	abstract void insertQuarter(GumballMachine gumballMachine);

	abstract void ejectQuarter(GumballMachine gumballMachine);

	abstract void turnCrank(GumballMachine gumballMachine);

	void refill(GumballMachine gumballMachine) { }
}
