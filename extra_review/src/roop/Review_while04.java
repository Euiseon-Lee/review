package roop;

import java.util.Random;
import java.util.Scanner;

public class Review_while04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while 반복  Test04 업다운 게임

		//숫자를 하나 정해두고 이를 맞추는 게임을 업다운 게임이라고 합니다.

		//프로그램이 랜덤으로 1에서 1000 사이의 숫자를 하나 정합니다.
		//사용자가 범위 내에서 숫자를 입력합니다.
		//프로그램은 사용자가 입력한 값과 정답을 비교해서 
		//업, 다운, 정답 세 개중 하나를 알려줍니다.
		//업은 정답이 입력값보다 크다는 의미입니다.
		//다운은 정답이 입력값보다 작다는 의미입니다.
		//업다운 게임을 구현하시고 정답을 맞추면 몇번 만에 맞췄는지 계산해서 출력해주세요.

		//추가문제
		//주사위를 1000번 정도 던지면 어떤 숫자가 가장 많이 나오는지 알고 싶습니다. 랜덤을 이용하여 주사위를 1000번 던진 결과를 만들어 낸 뒤 각각의 숫자를 카운트하여 출력

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int com = r.nextInt(1000) + 1;
		System.out.println("컴퓨터가 1부터 1000 사이의 수 중에서 하나를 골랐습니다");

		int count = 0;

		while(true) {
			System.out.print("뭘까요? ");
			int user = sc.nextInt();

			count++;

			if(com > user) {
				System.out.println("업!");
			}
			else if(com < user) {
				System.out.println("다운!");
			}
			else {//com == user
				System.out.println("정답!");
				break;
			}
		}

		sc.close();

		System.out.println("시도 횟수 : " + count + "번");	
	

	}

}
