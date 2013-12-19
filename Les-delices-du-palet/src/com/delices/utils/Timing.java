package com.delices.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Timing {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public static String getCurrentTime() {
		return sdf.format(Calendar.getInstance().getTime()).toString();
	}
}
