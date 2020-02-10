package com.thebrenny.thedeep;

import com.thebrenny.jumg.MainGame;

public class TheDeep extends MainGame {

	public TheDeep(String[] args) {
		super(args, "th3 d33p", "com.thebrenny.thedeep");
		this.engineTicks = 100;
	}

	protected void loadImages() {
	}
	protected void loadTiles() {
	}
	protected void loadItems() {
	}
	protected void setupKeyBinds() {
	}
	public boolean initialise() {
		return false;
	}

	public static void main(String[] args) {
		new TheDeep(args);
	}
}