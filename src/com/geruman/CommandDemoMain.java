package com.geruman;

import com.geruman.tank.Aim;
import com.geruman.tank.Move;
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
		commander.addOrder(new TankAimCommand(tank, Aim.LEFT));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Move.NORTH));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Move.NORTH));
		commander.addOrder(new TankAimCommand(tank, Aim.FORWARD));
		commander.addOrder(new TankShootCommand(tank));
		commander.addOrder(new MoveTankCommand(tank, Move.SOUTH));
		commander.executeOrders();
	}
}
