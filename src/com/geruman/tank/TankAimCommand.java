package com.geruman.tank;

public class TankAimCommand extends AbstractTankCommand{

	Aims aim;
	public TankAimCommand(Tank tank,Aims aim) {
		super(tank);
		this.aim = aim;
	}

	@Override
	public void execute() {
		tank.setAim(aim);
		
	}

}
