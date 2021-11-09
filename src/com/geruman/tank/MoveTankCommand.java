package com.geruman.tank;

public class MoveTankCommand extends AbstractTankCommand{

	private Moves move;
	public MoveTankCommand(Tank tank, Moves move) {
		super(tank);
		this.move = move;
	}

	@Override
	public void execute() {
		tank.move(move);
		
	}

}
