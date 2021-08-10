package test;

import com.study.day28.Rect;

// 自行撰寫測試時需於執行時會手動加上 -ea 參數
public class TestRect {
	public static void main(String[] args) {
		// 測試 Rect
		// 1. 測試標的
		Rect rect = new Rect();
		// 2. 測試參數與期望
		int h = 10; // 參數 1
		int w = 5;  // 參數 2
		int expect = 50; // 期望的結果 (重要 ! 一定要有~)
		// 3. 測試結果
		int result = rect.getArea(h, w);
		// 4. 驗證
		assert(result == expect) : String.format("result:%d expect:%d 測試失敗\n", result, expect);
		System.out.println("測試成功");
	}
}
