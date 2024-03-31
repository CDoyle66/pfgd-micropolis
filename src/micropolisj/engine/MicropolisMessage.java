// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.engine;

/**
 * Enumeration of every possible message for the user generated by the game engine.
 */
public enum MicropolisMessage
{
	                       //orig_num        generated       last tested/verified
	NEED_RES,              //   1            doMessages           1/19
	NEED_COM,              //   2            doMessages           1/19
	NEED_IND,              //   3            doMessages           1/19
	NEED_ROADS,            //   4            doMessages           1/19
	NEED_RAILS,            //   5            doMessages           1/20
	NEED_POWER,            //   6            doMessages           1/19
	NEED_STADIUM,          //   7            doMessages           1/20
	NEED_SEAPORT,          //   8            doMessages           1/20
	NEED_AIRPORT,          //   9            doMessages
	HIGH_POLLUTION,        //  10            doMessages           1/20
	HIGH_CRIME,            //  11            doMessages           1/19
	HIGH_TRAFFIC,          //  12            doMessages           1/20
	NEED_FIRESTATION,      //  13            doMessages           1/19
	NEED_POLICE,           //  14            doMessages           1/19
	BLACKOUTS,             //  15            doMessages           1/19
	HIGH_TAXES,            //  16            doMessages           1/19
	ROADS_NEED_FUNDING,    //  17            doMessages
	FIRE_NEED_FUNDING,     //  18            doMessages
	POLICE_NEED_FUNDING,   //  19            doMessages
	FIRE_REPORT,           //  20
	MONSTER_REPORT,
	TORNADO_REPORT,
	EARTHQUAKE_REPORT,     //  23            makeEarthquake
	PLANECRASH_REPORT,
	SHIPWRECK_REPORT,
	TRAIN_CRASH_REPORT,
	COPTER_CRASH_REPORT,
	HIGH_UNEMPLOYMENT,
	OUT_OF_FUNDS_REPORT,
	FIREBOMBING_REPORT,  //30
	NEED_PARKS,
	EXPLOSION_REPORT,
	INSUFFICIENT_FUNDS,    //  33            MainWindow.applyCurrentTool
	BULLDOZE_FIRST,        //  34            MainWindow.applyCurrentTool
	POP_2K_REACHED,        //  35            checkGrowth          1/19
	POP_10K_REACHED,       //  36            checkGrowth
	POP_50K_REACHED,       //  37            checkGrowth
	POP_100K_REACHED,      //  38            checkGrowth
	POP_500K_REACHED,      //  39            checkGrowth
	BROWNOUTS_REPORT,      //  40                                 1/20
	HEAVY_TRAFFIC_REPORT,  //  41           HelicopterSprite
	FLOOD_REPORT,
	MELTDOWN_REPORT,        // 43            doMeltdown
	RIOTING_REPORT,
	TOURISTS_VISIT,
	NO_TOURISTS,
	TOURISM_DEMAND,

	// added by Jason
	NO_NUCLEAR_PLANTS;

	/** Whether the message should be displayed in the notification pane. */
	public boolean useNotificationPane = false;

	static
	{
	// not location-specific
	POP_2K_REACHED.useNotificationPane = true;
	POP_10K_REACHED.useNotificationPane = true;
	POP_50K_REACHED.useNotificationPane = true;
	POP_100K_REACHED.useNotificationPane = true;
	POP_500K_REACHED.useNotificationPane = true;
	HIGH_CRIME.useNotificationPane = true;
	HIGH_POLLUTION.useNotificationPane = true;

	// location-specific
	FLOOD_REPORT.useNotificationPane = true;
	FIRE_REPORT.useNotificationPane = true;
	TORNADO_REPORT.useNotificationPane = true;
	MELTDOWN_REPORT.useNotificationPane = true;
	EARTHQUAKE_REPORT.useNotificationPane = true;
	TRAIN_CRASH_REPORT.useNotificationPane = true;
	SHIPWRECK_REPORT.useNotificationPane = true;
	COPTER_CRASH_REPORT.useNotificationPane = true;
	PLANECRASH_REPORT.useNotificationPane = true;
	}
}
