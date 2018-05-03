package com.distraction.it;

import java.awt.Color;

public class Constants {
	
	public static final String TITLE = "Influence Tracker";
	
	public static final String PATH_ATLAS = "/atlas.jpg";
	
	public static final class Colors {
		public static final Color BG_ITEM_SELECTED = new Color(40, 80, 160);
		public static final Color BG_ITEM_HIGHLIGHTED = new Color(200, 220, 255);
	}
	
	public static final class Maps {
		
		// i made a huge mistake
		public static final MapData BEACH = new MapData(1, "Beach");
		public static final MapData DUNGEON = new MapData(1, "Dungeon");
		public static final MapData GRAVEYARD = new MapData(1, "Graveyard");
		public static final MapData LOOKOUT = new MapData(1, "Lookout");
		
		public static final MapData ALLEYWAYS = new MapData(2, "Alleyways");
		public static final MapData ARID_LAKE = new MapData(2, "Arid Lake");
		public static final MapData DESERT = new MapData(2, "Desert");
		public static final MapData FLOODED_MINE = new MapData(2, "Flooded Mine");
		public static final MapData MARSHES = new MapData(2, "Marshes");
		public static final MapData PEN = new MapData(2, "Pen");
		
		public static final MapData ARCADE = new MapData(3, "Arcade");
		public static final MapData BURIAL_CHAMBERS = new MapData(3, "Burial Chambers");
		public static final MapData CAGE = new MapData(3, "Cage");
		public static final MapData CELLS = new MapData(3, "Cells");
		public static final MapData EXCAVATION = new MapData(3, "Excavation");
		public static final MapData ICEBERG = new MapData(3, "Iceberg");
		public static final MapData LEYLINE = new MapData(3, "Leyline");
		public static final MapData PENINSULA = new MapData(3, "Peninsula");
		public static final MapData PORT = new MapData(3, "Port");
		public static final MapData SPRINGS = new MapData(3, "Springs");
		
		public static final MapData CANYON = new MapData(4, "Canyon");
		public static final MapData CHATEAU = new MapData(4, "Chateau");
		public static final MapData CITY_SQUARE = new MapData(4, "City Square");
		public static final MapData COURTHOUSE = new MapData(4, "Courthouse");
		public static final MapData GORGE = new MapData(4, "Gorge");
		public static final MapData GROTTO = new MapData(4, "GROTTO");
		public static final MapData LIGHTHOUSE = new MapData(4, "Lighthouse");
		public static final MapData RELIC_CHAMBERS = new MapData(4, "Relic Chambers");
		public static final MapData STRAND = new MapData(4, "Strand");
		public static final MapData VOLCANO = new MapData(4, "Volcano");
		
		public static final MapData ANCIENT_CITY = new MapData(5, "Ancient City");
		public static final MapData BARROWS = new MapData(5, "Barrows");
		public static final MapData CHANNEL = new MapData(5, "Channel");
		public static final MapData CONSERVATORY = new MapData(5, "Conservatory");
		public static final MapData HAUNTED_MANSION = new MapData(5, "Haunted Mansion");
		public static final MapData IVORY_TEMPLE = new MapData(5, "Ivory Temple");
		public static final MapData MAZE = new MapData(5, "Maze");
		public static final MapData SPIDER_LAIR = new MapData(5, "Spider Lair");
		public static final MapData SULPHUR_VENTS = new MapData(5, "Sulphur Vents");
		public static final MapData TOXIC_SEWER = new MapData(5, "Toxic Sewer");
		
		public static final MapData ACADEMY = new MapData(6, "Academy");
		public static final MapData ATOLL = new MapData(6, "Atoll");
		public static final MapData ASHEN_WOOD = new MapData(6, "Ashen Wood");
		public static final MapData CEMETERY = new MapData(6, "Cemetery");
		public static final MapData FIELDS = new MapData(6, "Fields");
		public static final MapData JUNGLE_VALLEY = new MapData(6, "Jungle Valley");
		public static final MapData MAUSOLEUM = new MapData(6, "Mausoleum");
		public static final MapData PHANTASMAGORIA = new MapData(6, "Phantasmagoria");
		public static final MapData THICKET = new MapData(6, "Thicket");
		public static final MapData UNDERGROUND_SEA = new MapData(6, "Underground Sea");
		public static final MapData WHARF = new MapData(6, "Wharf");
		
		public static final MapData ARACHNID_NEST = new MapData(7, "Arachnid Nest");
		public static final MapData BAZAAR = new MapData(7, "Bazaar");
		public static final MapData BONE_CRYPT = new MapData(7, "Bone Crypt");
		public static final MapData CORAL_RUINS = new MapData(7, "Coral Ruins");
		public static final MapData DUNES = new MapData(7, "Dunes");
		public static final MapData GARDENS = new MapData(7, "Gardens");
		public static final MapData LAVA_CHAMBER = new MapData(7, "Lava Chamber");
		public static final MapData RAMPARTS = new MapData(7, "Ramparts");
		public static final MapData RESIDENCE = new MapData(7, "Residence");
		public static final MapData TRIBUNAL = new MapData(7, "Tribunal");
		public static final MapData UNDERGROUND_RIVER = new MapData(7, "Underground River");
		
		public static final MapData ARMOURY = new MapData(8, "Armoury");
		public static final MapData COURTYARD = new MapData(8, "Courtyard");
		public static final MapData GEODE = new MapData(8, "Geode");
		public static final MapData INFESTED_VALLEY = new MapData(8, "Infested Valley");
		public static final MapData LABORATORY = new MapData(8, "Laboratory");
		public static final MapData MINERAL_POOLS = new MapData(8, "Mineral Pools");
		public static final MapData MUD_GEYSER = new MapData(8, "Mud Geyser");
		public static final MapData OVERGROWN_RUIN = new MapData(8, "Overgrown Ruin");
		public static final MapData SHORE = new MapData(8, "Shore");
		public static final MapData TROPICAL_ISLAND = new MapData(8, "Tropical Island");
		public static final MapData VAAL_PYRAMID = new MapData(8, "Vaal Pyramid");
		
		public static final MapData ARENA = new MapData(9, "Arena");
		public static final MapData ESTUARY = new MapData(9, "Estuary");
		public static final MapData MOON_TEMPLE = new MapData(9, "Moon Temple");
		public static final MapData MUSEUM = new MapData(9, "Musem");
		public static final MapData PLATEAU = new MapData(9, "Plateau");
		public static final MapData SCRIPTORIUM = new MapData(9, "Scriptorium");
		public static final MapData SEPULCHRE = new MapData(9, "Sepulchre");
		public static final MapData TEMPLE = new MapData(9, "Temple");
		public static final MapData TOWER = new MapData(9, "Tower");
		public static final MapData VAULT = new MapData(9, "Vault");
		public static final MapData WASTE_POOL = new MapData(9, "Waste Pool");
		
		public static final MapData ARACHNID_TOMB = new MapData(10, "Arachnid Tomb");
		public static final MapData BELFRY = new MapData(10, "Belfry");
		public static final MapData BOG = new MapData(10, "Bog");
		public static final MapData CURSED_CRYPT = new MapData(10, "Cursed Crypt");
		public static final MapData ORCHARD = new MapData(10, "Orchard");
		public static final MapData PIER = new MapData(10, "Pier");
		public static final MapData PRECINCT = new MapData(10, "Precinct");
		public static final MapData SHIPYARD = new MapData(10, "Shipyard");
		public static final MapData SIEGE = new MapData(10, "Siege");
		public static final MapData WASTELAND = new MapData(10, "Wasteland");
		
		public static final MapData COLONNADE = new MapData(11, "Colonnade");
		public static final MapData COVES = new MapData(11, "Coves");
		public static final MapData FACTORY = new MapData(11, "Factory");
		public static final MapData MESA = new MapData(11, "Mesa");
		public static final MapData LAIR = new MapData(11, "Lair");
		public static final MapData PIT = new MapData(11, "Pit");
		public static final MapData PRIMORDIAL_POOL = new MapData(11, "Primordial Pool");
		public static final MapData PROMENADE = new MapData(11, "Promenade");
		public static final MapData SPIDER_FOREST = new MapData(11, "Spider Forest");
		public static final MapData WATERWAYS = new MapData(11, "Waterways");
		
		public static final MapData CASTLE_RUINS = new MapData(12, "Castle Ruins");
		public static final MapData CRYSTAL_ORE = new MapData(12, "Crystal Ore");
		public static final MapData DEFILED_CATHEDRAL = new MapData(12, "Defiled Cathedral");
		public static final MapData NECROPOLIS = new MapData(12, "Necropolis");
		public static final MapData OVERGROWN_SHRINE = new MapData(12, "Overgrown Shrine");
		public static final MapData RACECOURSE = new MapData(12, "Racecourse");
		public static final MapData SUMMIT = new MapData(12, "Summit");
		public static final MapData TORTUE_CHAMBER = new MapData(12, "Torture Chamber");
		public static final MapData VILLA = new MapData(12, "Villa");
		
		public static final MapData ARSENAL = new MapData(13, "Arsenal");
		public static final MapData CALDERA = new MapData(13, "Caldera");
		public static final MapData CORE = new MapData(13, "Core");
		public static final MapData DESERT_SPRING = new MapData(13, "Desert Spring");
		public static final MapData GHETTO = new MapData(13, "Ghetto");
		public static final MapData MALFORMATION = new MapData(13, "Malformation");
		public static final MapData PARK = new MapData(13, "Park");
		public static final MapData SHRINE = new MapData(13, "Shrine");
		public static final MapData TERRACE = new MapData(13, "Terrace");
		
		public static final MapData ACID_LAKES = new MapData(14, "Acid Lakes");
		public static final MapData COLOSSEUM = new MapData(14, "Colosseum");
		public static final MapData CRIMSON_TEMPLE = new MapData(14, "Crimson Temple");
		public static final MapData DARK_FOREST = new MapData(14, "Dark Forest");
		public static final MapData DIG = new MapData(14, "Dig");
		public static final MapData PALACE = new MapData(14, "Palace");
		public static final MapData PLAZA = new MapData(14, "Plaza");
		
		public static final MapData BASILICA = new MapData(15, "Basilica");
		public static final MapData CARCASS = new MapData(15, "Carcass");
		public static final MapData LAVA_LAKE = new MapData(15, "Lava Lake");
		public static final MapData REEF = new MapData(15, "Reef");
		public static final MapData SUNKEN_CITY = new MapData(15, "Sunken City");
		
		public static final MapData FORGE_OF_THE_PHOENIX = new MapData(16, "Forge of the Phoenix");
		public static final MapData LAIR_OF_THE_HYDRA = new MapData(16, "Lair of the Hydra");
		public static final MapData MAZE_OF_THE_MINOTAUR = new MapData(16, "Maze of the Minotaur");
		public static final MapData PIT_OF_THE_CHIMERA = new MapData(16, "Pit of the Chimera");
		
	}
	
}
