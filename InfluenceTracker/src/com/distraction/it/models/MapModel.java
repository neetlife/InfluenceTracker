package com.distraction.it.models;

import com.distraction.it.MapData;

public class MapModel {
	
	private final MapData mapData;
	
	private Influence influence = Influence.NONE;
	
	public enum Influence {
		NONE,
		SHAPER,
		ELDER
	}
	
	public MapModel(final MapData mapData) {
		this.mapData = mapData;
	}
	
	public void setInfluence(Influence influence) {
		this.influence = influence;
	}
	
	public void removeInfluence() {
		influence = Influence.NONE;
	}
	
}
