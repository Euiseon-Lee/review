package feb17;

public class ReviewTest15_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문 과제(Test15)
		//고대 그리스에 아주 현명한 노인이 살고 있었습니다

		//어느날 소문을 들은 왕이 노인을 찾아가서 이렇게 말했습니다

		//"가지고 싶은게 있다면 다 줄테니 어디 말해봐라~"
		//노인이 다음과 같이 말했습니다

		//"저는 많은건 필요없습니다. 첫째날 1원만 주시고 
		//둘째날부터 전날의 두 배를 주실 수 있으십니까?"
		//(1) 30일간 노인에게 매일 얼마씩 줘야 하는지 계산해서 출력하세요 
		//(2) 30일동안 노인이 받게되는 총 금액을 출력하세요 
		//(3) 30일이 아니라 40일로 기간이 늘어나게 된다면 얼마를 받게되는지 출력하세요

	
		int money = 1;
		int total = 0;
		
		for (int day = 1; day <=30; day++) {
			System.out.println(day+"일차: "+money+"원");
			total += money;
			money *= 2;
		}
	
		
		System.out.println("총액 "+total+"원 입니다.");
	}

}
