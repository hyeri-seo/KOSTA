

public class Ex7_18 {
//	메서드명 : action
//	 기 능 : 주어진 객체의 메서드를 호출한다.
//	 		DanceRobot인 경우, dance()를 호출하고,
//			 SingRobot인 경우, sing()을 호출하고,
//	 		DrawRobot인 경우, draw()를 호출한다.
//	 반환타입 : 없음
//	 매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스

//	 instanceof연산자를 사용해서 형변환한다

	/*
	 * (1) action메서드를 작성하시오.
	 */
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		} else if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
	}
//	action메서드 내에서는 실제로 받아온 인스턴스가 어떤 것인지 알 수 없다.
//	단지 Robot클래스 또는 그 자손클래스의 인스턴스일 것이라는 것만 알 수 있다.
//	그래서 instanceof연산자를 이용해야만 실제 인스턴스의 타입을 확인할 수 있다.

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
//	action메서드의 매개변수가 Robot타입이므로 Robot클래스의 자손클래스인 
//	DanceRobot, SingRobot, DrawRobot의 인스턴스는 모두 매개변수로 가능
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

//춤을 춥니다.
//노래를 합니다.
//그림을 그립니다.