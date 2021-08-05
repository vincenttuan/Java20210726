package com.study.day22;

public class AreaMain {

	public static void main(String[] args) {
		
		Area area = new Area() {
			@Override
			public int calc(int h, int w) {
				int result = h * w;
				return result;
			}
		};
		
		System.out.println(area.calc(10, 20));
		
		
	}

}
