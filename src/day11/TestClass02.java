package day11;

public class TestClass02 {
	public int num = 100; //여러번 반복해 사용할때 만들어준다.(인스턴스변수)
	public String name;
	public void test01() {
		name= "홍길동";
		System.out.println("test01: "+num);
	}
	public void test02() {
		System.out.println("이름: "+name);
		System.out.println("test02: "+num);
	}
}
