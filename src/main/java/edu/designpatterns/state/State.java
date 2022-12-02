package edu.designpatterns.state;

class State {
	static GumballMachineState SO = new SoldOutState();
	static GumballMachineState NQ = new NoQuarterState();
	static GumballMachineState HQ = new HasQuarterState();
}
