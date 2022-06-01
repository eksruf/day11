package day11;

import java.util.Scanner;

public class TestClass04 {/*
	public static String name;
	public static int age;
	public static Scanner sc = new Scanner(System.in);
	public String inpu() {
		//Scanner input = new Scanner(System.in);
		System.out.println("이름입력: ");
		name = sc.next();
		
		return name;
		
	}public int input() {
		System.out.println("나이입력: ");
		age = sc.nextInt();
		int age1= age-1;
	return age1;
	}
	
	public void print (String name,int age1) {
		System.out.println(name,age1);
	}
	*/
	/*
	public void display() {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("이름입력");
		name = input.next();
		System.out.println("나이입력");
		age= input.nextInt();
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}*/
	//문제1
	public String name;
	public int age;
	public void input() {
		System.out.println("입력받는 기능 실행");
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력: ");
		name = input.next();
		System.out.println("나이입력: ");
		age=input.nextInt();
		//op(); 여기서 호출하여 계산. 메인에서 op();생략가능
	}
	public void op() {
		System.out.println("연산 기능 실행");
		age=age-1;
		System.out.println("age: "+age);

	}
	public void print() {
		System.out.println("출력하는 기능 실행");
		System.out.println("이름 : "+name);
		System.out.println("나이: "+age);
	}
	
	
	
}
