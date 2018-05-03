package com.distraction.it;

import java.util.ArrayList;
import java.util.List;

public final class MapData {
	
	private final int tier;
	private final String title;
	private final List<String> neighbors;
	
	// TODO: id maps by String #title
	// TODO: move all of the map constants to some data file for easy read/modify
	public MapData(int tier, String title) {
		this.tier = tier;
		this.title = title;
		neighbors = new ArrayList<>();
	}
	
	public final int getTier() {
		return tier;
	}
	
	public final String getTitle() {
		return title;
	}
	
	public final List<String> getNeighbors() {
		return neighbors;
	}
	
}
