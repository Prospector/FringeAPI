package io.github.prospector.fringe.util;

public enum DisplayType {
	NORMAL(0),
	EXTENDED(1), // Shows extra information. The intended use case is for elements that contain unnecessary information that the player does not always need to see or has a lot of information and the renderer would likely take up lots of space
	DEBUG(2); // Not meant to be shown to normal players in survival mode

	private int infoLevel;

	DisplayType(int infoLevel) {
		this.infoLevel = infoLevel;
	}

	public int getInfoLevel() {
		return infoLevel;
	}
}
