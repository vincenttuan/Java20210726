package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadWebImage {

	public static void main(String[] args) throws MalformedURLException {
		String fromPath = "https://img.ltn.com.tw/Upload/business/page/800/2020/05/26/240.jpg";
		String toPath = "src/main/java/com/io/data/apple_car.jpg";
		
		URL url = new URL(fromPath);
		try(InputStream is = url.openStream();
			FileOutputStream fos = new FileOutputStream(toPath);) {
			
			byte[] bytes = new byte[1];
			while(is.read(bytes) != -1) {
				fos.write(bytes);
			}
			
			System.out.println("寫檔完成");
			
		} catch(IOException e) {
			
		}

	}

}
