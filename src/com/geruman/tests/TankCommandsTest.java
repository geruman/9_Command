package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.geruman.tank.Aims;
import com.geruman.tank.Moves;
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
		MoveTankCommand command = new MoveTankCommand(tank,Moves.NORTH);
		command.execute();
		assertEquals(tank.getPosition(),Moves.NORTH);
	}
	@Test
	void testAimCommand() {
		System.out.println("Aiming");
		Tank tank = new Tank();
		TankAimCommand command = new TankAimCommand(tank,Aims.FORWARD);
		command.execute();
		assertEquals(tank.getAim(),Aims.FORWARD);
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
		tankCommander.addOrder(new MoveTankCommand(tank,Moves.NORTH));
		tankCommander.addOrder(new TankAimCommand(tank,Aims.LEFT));
		tankCommander.addOrder(new MoveTankCommand(tank,Moves.SOUTH));
		tankCommander.executeOrders();
		assertEquals(tank.getPosition(),Moves.SOUTH);
		assertEquals(tank.getAim(),Aims.LEFT);
		assertEquals(tank.getShotsFired(),2);
	}
	

}
