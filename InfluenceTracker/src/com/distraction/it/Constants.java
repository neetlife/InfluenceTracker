package com.distraction.it;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.distraction.it.data.MapData;
import com.distraction.it.data.MapList;
import com.google.gson.Gson;

public class Constants {
	
	public static final String TITLE = "Influence Tracker";
	
	public static final String PATH_ATLAS = "/atlas.jpg";
	
	public static final class Colors {
		public static final Color BG_ITEM_SELECTED = new Color(40, 80, 160);
		public static final Color BG_ITEM_HIGHLIGHTED = new Color(200, 220, 255);
	}
	
	public static final Map<String, MapData> MAP_DATA = new HashMap<>();
	
	@SuppressWarnings("resource")
	static final void init() {
		Scanner s = new Scanner(Constants.class.getResourceAsStream("/mapdata.json")).useDelimiter("\\A");
		String json = s.next();
		MapList mapList = new Gson().fromJson(json, MapList.class);
		for (MapData mapData : mapList.getMapDataList()) {
			MAP_DATA.put(mapData.getName(), mapData);
		}
	}
	
}
