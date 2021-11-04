package com.geruman.tank;

public class TankShootCommand extends AbstractTankCommand{

	public TankShootCommand(Tank tank) {
		super(tank);
	}

	@Override
	public void execute() {
		tank.shoot();
		
	}

}
