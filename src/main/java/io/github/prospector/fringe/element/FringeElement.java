package io.github.prospector.fringe.element;

import io.github.prospector.fringe.util.DisplayType;

public abstract class FringeElement {
	public boolean hide = false;

	public abstract DisplayType getDisplayType();

	public boolean isVisible(DisplayType displayType) {
		return !hide && displayType.getInfoLevel() >= getDisplayType().getInfoLevel();
	}
}
