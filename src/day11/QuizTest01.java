package day11;

import java.util.Scanner;

public class QuizTest01 {
	/*
 �Է� ���� ��� ����� ����� �ּ���
 �Է�: �̸� �� �� �� 
 ����: ���� ���ϴ� ���, ����� ���ϴ� ���, ����� ���ϴ� ���
 ���: �̸� �� �� �� �� ��� ���
 ���: ����� 90�̻� a 80�̻� b ������ c
 */
public String name,grade;
public int kor,eng,math,sum;
public double avg;

public void input() {
	Scanner input = new Scanner (System.in);
	System.out.println("�̸� �Է�: ");
	name= input.next();
	System.out.println("���� ���� �Է�: ");
	kor= input.nextInt();
	System.out.println("���� ���� �Է�: ");
	eng= input.nextInt();
	System.out.println("���� ���� �Է�: ");
	math = input.nextInt();
	
	op();
	}
	
public void op() {
	sum = kor+eng+math;
	avg = sum/3.0; //�Ҽ������� ����
	if(avg>=90) {
		grade="A";
	}else if(avg>=80) {
		grade="B";
	}else {
		grade="C";
	}
}

public void print() {
	System.out.println("�̸�: "+name);
	System.out.println("����: "+kor);
	System.out.println("����: "+eng);
	System.out.println("����: "+math);
	System.out.println("��: "+sum);
	System.out.println("���: "+avg);
	System.out.println("���: "+grade);
	/*
	 System.out.println("�̸�,��,��,��,��,���,���");
	 System.out.println("name,kor,eng,math,sum,avg,grade");
	 */

}


}