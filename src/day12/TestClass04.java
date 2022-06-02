package day12;

public class TestClass04 {

	private int kor,eng,math,sum;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int k) {
		this.kor = k;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int e) {
		this.eng = e;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int m) {
		this.math = m;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum() {
		this.sum = kor + eng + math;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg() {
		this.avg = sum / 3.0;
	}
}
