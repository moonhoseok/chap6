package chap6;
/*
 * Rectangle2 클래스 구현하기
 * 멤버변수: width(가로),height(세로),sno(사각형번호),
 *         cnt(클래스변수)로 사각형 객체의 갯수
 * 멤버메서드 : 
 *     void area()  : 사각형의 면적 출력
 *     void length() : 사각형의 둘레 출력
 *     String toString() 
 *     
 *    toString : 1번사각형 : 가로(10),세로(20),현재까지 생성된 사각형(1) 형식으로 
 *        출력하기         
 */
class Rectangle2 {
	int width,height,sno;
	static int cnt;
	void area() { System.out.println("면적:"+(width*height));	}
	void length() {	System.out.println("둘레:"+(width+height)*2);	}
	public String toString() {
		return "가로("+width+"),세로("+height+
				"),현재까지 생성된 사각형("+cnt+")";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2();
		r1.width=10;
		r1.height=20;
		r1.sno = ++Rectangle2.cnt;
		System.out.println(r1);
	}
}
