package com.study.day22;

class Job {
	// 方法
	void start() {
		// 方法內部類別
		class Report {
			
			void content() {
				System.out.println("年度報告");
			}
			
		}
		// 建立
		Report report = new Report();
		report.content();
	}
}

public class MethodClass {
	public static void main(String[] args) {
		Job job = new Job();
		job.start();
	}
}
