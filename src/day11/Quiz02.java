package day11;

import java.util.Scanner;

public class Quiz02 {
/*
 updown������ �����
 ���ο��� �⺻ �������� ȭ���� �����, ����� �޼ҵ�� ����
 ���
 ������ �̴� ���, �ְ��� üũ, ������ , �ְ� ��� Ȯ�� ���
 */
public static void main(String[] args) {
	int sel=0, com=0, dummy=0, player=0, score=0, result=0;
	Scanner input = new Scanner (System.in);
	QuizTest02 t = new QuizTest02();
	
	System.out.println("==up&down==");
	System.out.println("1.����");
	System.out.println("2.����");
	System.out.println("3.����");
	System.out.println(">>>>>");
	sel = input.nextInt();
	
	switch(sel){
		case 1:
			com = t.ranNum();
			System.out.println("�� ����: "+com);
			dummy = 3;
			while(true) {
				if(dummy==3) {
				System.out.println("==start==");
				player= input.nextInt();
				}else if(dummy==2) {
					score++;
					System.out.println("==up==");
				}else if(dummy==1) {
					score++;
					System.out.println("==down==");
				}else {
					score++;
					System.out.println(score+"ȸ ���� ������ϴ�.");
					result = t.scoreCheck(score); //�ְ��� ����
					score=0; //���� �ʱ�ȭ
					if(result==0) {
						System.out.println("�ְ�÷� ����");
					}
					break;
				}
				System.out.println("input number-->");
				player = input.nextInt();
				
				dummy = t.comPlayerCheck(player);
			}break;
		case 2:
			if(t.record()==99) {
				System.out.println("������ �������� �ʾҽ��ϴ�.");
				break;
			}
			System.out.println("�ְ������� "+t.record()+"ȸ �Դϴ�.");
			break;
		case 3:
			System.out.println("��������");
			return; //break�� ���
	}
	
	 
	
	
	}
}
