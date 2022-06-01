package day11;

import java.util.Scanner;

public class QuizTest01 {
	/*
 입력 연산 출력 기능을 만들어 주세요
 입력: 이름 국 영 수 
 연산: 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
 출력: 이름 국 영 수 합 평균 등급
 등급: 평균이 90이상 a 80이상 b 나머진 c
 */
public String name,grade;
public int kor,eng,math,sum;
public double avg;

public void input() {
	Scanner input = new Scanner (System.in);
	System.out.println("이름 입력: ");
	name= input.next();
	System.out.println("국어 성적 입력: ");
	kor= input.nextInt();
	System.out.println("영어 성적 입력: ");
	eng= input.nextInt();
	System.out.println("수학 성적 입력: ");
	math = input.nextInt();
	
	op();
	}
	
public void op() {
	sum = kor+eng+math;
	avg = sum/3.0; //소수점까지 적기
	if(avg>=90) {
		grade="A";
	}else if(avg>=80) {
		grade="B";
	}else {
		grade="C";
	}
}

public void print() {
	System.out.println("이름: "+name);
	System.out.println("국어: "+kor);
	System.out.println("영어: "+eng);
	System.out.println("수학: "+math);
	System.out.println("합: "+sum);
	System.out.println("평균: "+avg);
	System.out.println("등급: "+grade);
	/*
	 System.out.println("이름,국,영,수,합,평균,등급");
	 System.out.println("name,kor,eng,math,sum,avg,grade");
	 */

}


}