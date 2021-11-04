package com.geruman.tank;

import java.util.ArrayList;
import java.util.List;

public class TankCommander {
	private List<AbstractTankCommand> commandsList;
	public TankCommander() {
		commandsList = new ArrayList<AbstractTankCommand>();
	}
	public void addOrder(AbstractTankCommand command) {
		this.commandsList.add(command);
	}
	public void executeOrders() {
		for(AbstractTankCommand command : commandsList) {
			command.execute();
		}
	}
}
