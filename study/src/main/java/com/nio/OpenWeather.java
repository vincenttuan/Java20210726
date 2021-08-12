package com.nio;

import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
		// 分析 json
		JsonElement jsonElement = JsonParser.parseString(jsonString);
		JsonObject root = jsonElement.getAsJsonObject();
		JsonObject main = root.getAsJsonObject("main");
		System.out.println(main);
		double temp = main.get("temp").getAsDouble();
		System.out.println(temp);
		temp -= 273.15;
		System.out.println(temp);
		// 溫度=? 體感=? 濕度=?
		
		JsonArray weather = root.getAsJsonArray("weather");
		String description = weather.get(0).getAsJsonObject().get("description").getAsString();
		System.out.println(description);
		
		// homework 將 icon 抓下來並儲存
		
		
	}

}
