package com.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadTextFromHttp {

	public static void main(String[] args) throws MalformedURLException {
		String fromPath = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		
		URL url = new URL(fromPath);
		try(InputStream is = url.openStream(); // byte[]
			InputStreamReader isr = new InputStreamReader(is);) { // char[]
			
			int value = 0;
			StringBuilder json = new StringBuilder();
			while((value = isr.read()) != -1) {
				json.append((char)value);
			}
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
