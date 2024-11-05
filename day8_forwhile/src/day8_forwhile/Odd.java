package day8_forwhile;

public class Odd {

	public static void main(String[] args) {
		// while문으로 1~10까지으 홀수만 출력하시오
		int i =1; //초기값
		while(i<=10) {//조건
			
			if(i%2==1)
			System.out.println(i);
			i++;
		}
	}
}
