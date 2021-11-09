package com.geruman.tank;

public class Tank {

	private Aims aim;
	private int shots = 0;
	private Moves position;
	public Moves getPosition() {
		return position;
	}

	public Aims getAim() {
		return aim;
	}

	public Integer getShotsFired() {
		return shots;
	}

	public void setAim(Aims where) {
		System.out.println("Aiming "+where);
		this.aim = where;
		
	}

	public void shoot() {
		System.out.println("Booom!");
		shots++;
		
	}

	public void move(Moves where) {
		System.out.println("Moving "+where);
		this.position = where;
		
	}

	

}
