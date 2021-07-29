package com.study.day10;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// 調查五位學生之身高及體重如下:
		// 身高：172、168、164、170、176(公分)
        // 體重：62、57、58、64、64(公斤)
		int[] heights = {172, 168, 164, 170, 176};
		int[] weights = {62, 57, 58, 64, 64};
		// 求身高,體重分散程度哪一個大
		// C.V 變異係數
		// cv 值愈小越集中, cv 值愈大越分散
		// cv = sd(標準差) / 平均
		// 求 身高與體重 的 sd 與 cv
		double h_sd = Util.getSD(heights);
		double w_sd = Util.getSD(weights);
		double h_cv = Util.getCV(heights);
		double w_cv = Util.getCV(weights);
		System.out.printf("身高 SD:%.1f CV:%.5f\n", h_sd, h_cv);
		System.out.printf("體重 SD:%.1f CV:%.5f\n", w_sd, w_cv);
		
		
	}

}
