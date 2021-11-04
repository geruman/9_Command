package com.geruman.tank;

public class Tank {

	private Aim aim;
	private int shots = 0;
	private Move position;
	public Move getPosition() {
		return position;
	}

	public Aim getAim() {
		return aim;
	}

	public Integer getShotsFired() {
		return shots;
	}

	public void setAim(Aim aim) {
		System.out.println("Aiming "+aim);
		this.aim = aim;
		
	}

	public void shoot() {
		System.out.println("Booom!");
		shots++;
		
	}

	public void move(Move move) {
		System.out.println("Moving "+move);
		this.position = move;
		
	}

	

}
