package com.geruman;

import com.geruman.tank.Aims;
import com.geruman.tank.Moves;
import com.geruman.tank.MoveTankCommand;
import com.geruman.tank.Tank;
import com.geruman.tank.TankAimCommand;
import com.geruman.tank.TankCommander;
import com.geruman.tank.TankShootCommand;

public class CommandDemoMain {
	
	public static void main(String[] args) {
		Tank tank = new Tank();
		TankCommander commander = new TankCommander();
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new TankAimCommand(tank, Aims.LEFT));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Moves.NORTH));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Moves.NORTH));
		commander.addOrder(new TankAimCommand(tank, Aims.FORWARD));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Moves.SOUTH));
		commander.executeOrders();
	}
}
