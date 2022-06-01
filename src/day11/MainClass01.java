package day11;

public class MainClass01 {
	public static void main(String[] args) 
	{//지역변수= 지역에서만 사용가능
		/*
		if (true)
		{int num = 100; 
			System.out.println("if : "+num);
			num=200;
		}
		System.out.println("main: "+num);
		*/
		
		
		TestClass01 t = new TestClass01();
		int a = t.test01();
		t.test02(a);
	}
}
