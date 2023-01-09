package edu.designpatterns.state;

public interface IGumballMachineState {
    void start(GumballMachine gumballMachine);

    void insertQuarter(GumballMachine gumballMachine);

    void ejectQuarter(GumballMachine gumballMachine);

    void turnCrank(GumballMachine gumballMachine);

    void refill(GumballMachine gumballMachine);
}
