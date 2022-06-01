package day11;

import java.util.Scanner;

public class Quiz02 {
/*
 updown게임을 만들기
 메인에서 기본 보여지는 화면을 만들고, 기능은 메소드로 구현
 기능
 랜덤값 뽑는 기능, 최고기록 체크, 정답기능 , 최고 기록 확인 기능
 */
public static void main(String[] args) {
	int sel=0, com=0, dummy=0, player=0, score=0, result=0;
	Scanner input = new Scanner (System.in);
	QuizTest02 t = new QuizTest02();
	
	System.out.println("==up&down==");
	System.out.println("1.시작");
	System.out.println("2.전적");
	System.out.println("3.종료");
	System.out.println(">>>>>");
	sel = input.nextInt();
	
	switch(sel){
		case 1:
			com = t.ranNum();
			System.out.println("컴 숫자: "+com);
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
					System.out.println(score+"회 만에 맞췄습니다.");
					result = t.scoreCheck(score); //최고기록 저장
					score=0; //점수 초기화
					if(result==0) {
						System.out.println("최고시록 갱신");
					}
					break;
				}
				System.out.println("input number-->");
				player = input.nextInt();
				
				dummy = t.comPlayerCheck(player);
			}break;
		case 2:
			if(t.record()==99) {
				System.out.println("게임을 시작하지 않았습니다.");
				break;
			}
			System.out.println("최고점수는 "+t.record()+"회 입니다.");
			break;
		case 3:
			System.out.println("게임종료");
			return; //break랑 비슷
	}
	
	 
	
	
	}
}
