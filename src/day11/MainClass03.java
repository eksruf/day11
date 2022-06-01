package day11;

public class MainClass03 {
	public void test() {
		System.out.println("main test입니다");
	}
public static void main(String[] args) {
	MainClass03 m = new MainClass03();
	m.test(); //객체 생성후 호출가능
	//test(); 생성 없이 그냥 사용 불가능
	
	
	//TestClass03 t =new TestClass03();
	System.out.println(TestClass03.name);
	TestClass03.test();
	
	System.out.println(TestClass03.KOREA);
}
}
