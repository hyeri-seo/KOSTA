package ch05;

public class Ex5_6 {

	public static void main(String[] args) {
		// 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		// 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		// 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
		// (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		// [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
//		500원 몫: 5, 나머지: 180원
//		100원 몫: 1, 나머지: 80원
//		50원 몫: 1, 나머지: 30원
//		10원 몫: 3, 나머지: 0
		
		for(int i=0;i<coinUnit.length;i++) {
			int j = money/coinUnit[i];
			money = money%coinUnit[i];
			System.out.println(String.format("%d원: %d개", coinUnit[i], j));
			//System.out.println(String.format("%d원: %d개", coinUnit[i], money/coinUnit[i]));
		}
	}

}
