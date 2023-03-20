package com.JALA.utils;

import java.util.Date;

public class utilities {

public static String generateemailtimestamp() {
	Date date = new Date();
	String timestamp = date.toString().replace(" ", "_").replace(":", "_");
	return "training@"+generateemailtimestamp()+"jalaacademy.com";
}
}


