package day12;

import java.util.Scanner;

public class MainClass04 {

	public static void main(String[] args) {
		
		int k,e,m;
		// 국 영 수 합 평균 구하기
		// 각 setter getter 생성, 연산하는 메소드 생성 
		
		TestClass04 t = new TestClass04();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어 점수");
		k = input.nextInt();
		System.out.println("영어 점수");
		e = input.nextInt();
		System.out.println("수학 점수");
		m = input.nextInt();
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum();
		t.setAvg();
		
		System.out.println("국어 : " + t.getKor());
		System.out.println("영어 : " + t.getEng());
		System.out.println("수학 : " + t.getMath());
		System.out.println("합 : " + t.getSum());
		System.out.println("평균 : " + t.getAvg());
		
	}
}
