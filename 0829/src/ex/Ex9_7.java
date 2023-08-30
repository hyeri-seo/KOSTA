package ex;

//메서드명 : contains
//기 능 : 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
//포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
//반환타입 : boolean
//매개변수 : String src
//		   String target

public class Ex9_7 {
	/*
	 * (1) contains메서드를 작성하시오.
	 */
	public static boolean contains(String src, String target) {
		if(src.indexOf(target)>=0) return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}

//true
//false
//어디갔더영,,,