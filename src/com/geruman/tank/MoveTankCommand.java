package com.geruman.tank;

public class MoveTankCommand extends AbstractTankCommand{

	private Move move;
	public MoveTankCommand(Tank tank, Move move) {
		super(tank);
		this.move = move;
	}

	@Override
	public void execute() {
		tank.move(move);
		
	}

}
