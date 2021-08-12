package com.nio;

import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class OpenWeather {
	private static final String KEY = "ab99f5242005a98291f643ea873b363d";
	private static final String WEATHER_PATH = "https://api.openweathermap.org/data/2.5/weather?q=%s,%s&appid=%s";
	private static final String ICON_PATH = "https://openweathermap.org/img/wn/%s@4x.png";
	
	public static void main(String[] args) throws Exception {
		String w_path = String.format(WEATHER_PATH, "taoyuan", "tw", KEY);
		URL url = new URL(w_path);
		InputStream inputStream = url.openStream();
		// 將 InputStream 轉 String
		String jsonString = IOUtils.toString(inputStream, "UTF-8");
		System.out.println(jsonString);
	}

}
