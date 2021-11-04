package com.geruman.tank;

public abstract class AbstractTankCommand {
	protected Tank tank;
	public AbstractTankCommand(Tank tank) {
		this.tank = tank;
	}
	public abstract void execute();
}
