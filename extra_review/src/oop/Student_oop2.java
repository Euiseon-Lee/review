package oop;
//학생 정보
public class Student_oop2 {

//	oop.getter2	다음 데이터를 요구사항에 맞게 구조화하여 출력하시오.

//	우리반 학생 성적 정보
//	이름			과목		서술형점수	평가자체크리스트점수
//	피카츄	응용SW기초기술활용		50			60
//	라이츄	응용SW기초기술활용		40			80
//	파이리	프로그래밍언어활용		60			65
	
//	요구사항
//	시험점수는 0 이상 100 이하의 정수로만 설정이 가능하도록 구현
//	결과 출력 시 총점과 평균, 통과 여부를 확인할 수 있어야 함
//	과목별 40점 이상이고 평균 60점 이상이면 통과, 아니면 재평가
	
	public static void main(String[] args) {
		
		Exam_oop2 e1 = new Exam_oop2();
		Exam_oop2 e2 = new Exam_oop2();
		Exam_oop2 e3 = new Exam_oop2();
		
		e1.setting("피카츄", "응용SW기초기술활용", 50, 60);
		e2.setting("라이츄", "응용SW기초기술활용", 40, 80);
		e3.setting("파이리", "프로그래밍언어활용", 60, 65);
		
		e1.print();
		System.out.println("");
		e2.print();
		System.out.println("");
		e3.print();
		
	}


}