package edu.designpatterns.state;

import edu.designpatterns.enums.GumballStateEnum;

public class State {
	public static GumballStateEnum SO = GumballStateEnum.SoldOutState;
	public static GumballStateEnum NQ = GumballStateEnum.NoQuarter;
	public static GumballStateEnum HQ = GumballStateEnum.HasQuarter;
}
