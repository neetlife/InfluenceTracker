package com.distraction.it.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MapList {
	
	@SerializedName("mapdata")
	private final List<MapData> mapDataList;
	
	public MapList(List<MapData> mapDataList) {
		this.mapDataList = mapDataList;
	}
	
	public List<MapData> getMapDataList() {
		return mapDataList;
	}
	
}
