package edu.designpatterns.enums;

import edu.designpatterns.state.GumballMachine;
import edu.designpatterns.state.IGumballMachineState;
import edu.designpatterns.state.Messages;
import edu.designpatterns.state.State;

public enum GumballStateEnum implements IGumballMachineState {
    SoldOutState()   {
        @Override
        public void start(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.SO_START);
        }

        @Override
        public void insertQuarter(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.SO_QUART);
            gumballMachine.getDevice().dispenseQuarter();
        }

        @Override
        public void ejectQuarter(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.SO_EJECT);
        }

        @Override
        public void turnCrank(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.SO_CRANK);
        }

        @Override
        public void refill(GumballMachine gumballMachine) {
            gumballMachine.setState(State.NQ);
        }
    },
    HasQuarter() {
        @Override
        public void start(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.HQ_START);
        }

        @Override
        public void insertQuarter(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.HQ_QUART);
            gumballMachine.getDevice().dispenseQuarter();
        }

        @Override
        public void ejectQuarter(GumballMachine gumballMachine) {
            gumballMachine.setState(State.NQ);
            gumballMachine.getDevice().displayLine(Messages.HQ_EJECT);
            gumballMachine.getDevice().dispenseQuarter();
        }

        @Override
        public void turnCrank(GumballMachine gumballMachine) {
            if (!gumballMachine.getDevice().dispenseGumball()) {
                gumballMachine.getDevice().dispenseQuarter();
                gumballMachine.setState(GumballStateEnum.SoldOutState);
            } else {
                gumballMachine.setState(State.NQ);
            }
        }

        @Override
        public void refill(GumballMachine gumballMachine) {

        }

    },
    NoQuarter {
        public void start(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.NQ_START);
        }

        @Override
        public void insertQuarter(GumballMachine gumballMachine) {
            gumballMachine.setState(State.HQ);
        }

        @Override
        public void ejectQuarter(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.NQ_EJECT);
        }

        @Override
        public void turnCrank(GumballMachine gumballMachine) {
            gumballMachine.getDevice().displayLine(Messages.NQ_CRANK);
        }

        @Override
        public void refill(GumballMachine gumballMachine) {

        }
    }
}
