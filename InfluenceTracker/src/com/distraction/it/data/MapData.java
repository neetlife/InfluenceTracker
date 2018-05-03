package com.distraction.it.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public final class MapData {
	
	@SerializedName("name")
	private final String name;
	
	@SerializedName("tier")
	private final int tier;
	
	@SerializedName("unique")
	private final boolean unique;
	
	@SerializedName("links")
	private final List<String> links;
	
	public MapData(int tier, String name, boolean unique, List<String> links) {
		this.tier = tier;
		this.name = name;
		this.unique = unique;
		this.links = links;
	}
	
	public final int getTier() {
		return tier;
	}
	
	public final String getName() {
		return name;
	}
	
	public final boolean isUnique() {
		return unique;
	}
	
	public final List<String> getLinks() {
		return links;
	}
	
}
