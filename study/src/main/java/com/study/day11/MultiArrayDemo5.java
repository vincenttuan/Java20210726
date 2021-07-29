package com.study.day11;

public class MultiArrayDemo5 {

	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 90);
		Exam e3 = new Exam("英文", 80);
		
		Exam e4 = new Exam("國文", 60);
		Exam e5 = new Exam("數學", 70);
		Exam e6 = new Exam("英文", 90);
		
		Exam[][] exams = {
				{e1, e2, e3}, {e4, e5, e6}
		};
		// 利用 for-in 把所有的成績逐一列出...
		for(Exam[] exam : exams) {
			for(Exam e : exam) {
				System.out.println(e.getName() + " = " + e.getScore());
				System.out.println(e);
			}
		}
	}

}
