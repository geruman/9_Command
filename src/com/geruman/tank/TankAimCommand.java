package com.geruman.tank;

public class TankAimCommand extends AbstractTankCommand{

	Aim aim;
	public TankAimCommand(Tank tank,Aim aim) {
		super(tank);
		this.aim = aim;
	}

	@Override
	public void execute() {
		tank.setAim(aim);
		
	}

}
