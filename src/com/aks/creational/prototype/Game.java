package com.aks.creational.prototype;

public class Game implements Cloneable {

	private int id;
	private String name;
	private MemberShip memberShip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MemberShip getMemberShip() {
		return memberShip;
	}

	public void setMemberShip(MemberShip memberShip) {
		this.memberShip = memberShip;
	}

	@Override
	protected Game clone() throws CloneNotSupportedException {
		// Shallow Copy
//		return (Game) super.clone();
		// Deep Copy
		Game game = (Game) super.clone();
		game.setMemberShip(new MemberShip());
		return game;
	}

	public Game() {

	}

	// Copy constractor for another way of deep copy
	public Game(Game game) {
		this.id = game.id;
		this.name = game.name;
		this.memberShip = new MemberShip();
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", memberShip=" + memberShip + "]";
	}

}
