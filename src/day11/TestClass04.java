package day11;

import java.util.Scanner;

public class TestClass04 {/*
	public static String name;
	public static int age;
	public static Scanner sc = new Scanner(System.in);
	public String inpu() {
		//Scanner input = new Scanner(System.in);
		System.out.println("�̸��Է�: ");
		name = sc.next();
		
		return name;
		
	}public int input() {
		System.out.println("�����Է�: ");
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
		System.out.println("�̸��Է�");
		name = input.next();
		System.out.println("�����Է�");
		age= input.nextInt();
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}*/
	//����1
	public String name;
	public int age;
	public void input() {
		System.out.println("�Է¹޴� ��� ����");
		Scanner input = new Scanner(System.in);
		System.out.println("�̸��Է�: ");
		name = input.next();
		System.out.println("�����Է�: ");
		age=input.nextInt();
		//op(); ���⼭ ȣ���Ͽ� ���. ���ο��� op();��������
	}
	public void op() {
		System.out.println("���� ��� ����");
		age=age-1;
		System.out.println("age: "+age);

	}
	public void print() {
		System.out.println("����ϴ� ��� ����");
		System.out.println("�̸� : "+name);
		System.out.println("����: "+age);
	}
	
	
	
}
