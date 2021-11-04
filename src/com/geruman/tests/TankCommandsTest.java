package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.geruman.tank.Aim;
import com.geruman.tank.Move;
import com.geruman.tank.MoveTankCommand;
import com.geruman.tank.Tank;
import com.geruman.tank.TankAimCommand;
import com.geruman.tank.TankCommander;
import com.geruman.tank.TankShootCommand;

class TankCommandsTest {

	
	@Test
	void testMoveCommand() {
		System.out.println("Move command");
		Tank tank = new Tank();
		MoveTankCommand command = new MoveTankCommand(tank,Move.NORTH);
		command.execute();
		assertEquals(tank.getPosition(),Move.NORTH);
	}
	@Test
	void testAimCommand() {
		System.out.println("Aiming");
		Tank tank = new Tank();
		TankAimCommand command = new TankAimCommand(tank,Aim.FORWARD);
		command.execute();
		assertEquals(tank.getAim(),Aim.FORWARD);
	}
	@Test 
	void testShootCommand() {
		System.out.println("Shooting");
		Tank tank = new Tank();
		TankShootCommand command = new TankShootCommand(tank);
		command.execute();
		assertEquals(tank.getShotsFired(),1);
	}
	@Test 
	void testTankCommander() {
		System.out.println("Commander");
		Tank tank = new Tank();
		TankCommander tankCommander = new TankCommander();
		tankCommander.addOrder(new TankShootCommand(tank));
		tankCommander.addOrder(new TankShootCommand(tank));
		tankCommander.addOrder(new MoveTankCommand(tank,Move.NORTH));
		tankCommander.addOrder(new TankAimCommand(tank,Aim.LEFT));
		tankCommander.addOrder(new MoveTankCommand(tank,Move.SOUTH));
		tankCommander.executeOrders();
		assertEquals(tank.getPosition(),Move.SOUTH);
		assertEquals(tank.getAim(),Aim.LEFT);
		assertEquals(tank.getShotsFired(),2);
	}
	

}
