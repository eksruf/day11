package day11;

public class TestClass03 {
	public static final String KOREA = "대한민국";
	//static , final 
	
//static 이 적혀있으면 가장 먼저 자동 생성
	public static int num = 1000;
	public void test02() {
		num=1234;
	}
	
	
	
public static String name = "홍길동"; //객체를 만들지 않아도 사용가능 
//static 이 없으면 객체 생성 필수, 프로그램 종료까지 살아있음(어디서나 자주 쓰이면 사용)
public static void test() {
	System.out.println("test 실행");
}
}
