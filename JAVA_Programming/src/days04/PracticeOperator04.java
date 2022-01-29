package days04;

public class PracticeOperator04 {

	public static void main(String[] args) {
		int kor=35, eng=98, mat=95;
		double avg;
		//평균이 80이상이면서 영어점수가 75점 이상이면 true 출력	}
		avg = (kor+eng+mat)/3.0;
		boolean r = avg>=80 && eng>=75;
		System.out.println("평균 80, 영어 75 이상 : " + r);
		// 세과목 중 한 과목이라도 40 미만이라면 true, 모두 40이상 false
		r=kor<40||eng<40||mat<40;
		System.out.println("한 과목이라도 40 미만 : " + r);
		
		// 국어점수가 짝수이면 true, 홀수이면 false
		r = kor%2==0;
		System.out.println("국어가 짝수점수 : " + r);


	}
}
