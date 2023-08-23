
class Ex6_22 {
	
//	다음과 같이 정의된 메서드를 작성하고 테스트하시오. 
//	 메서드명 : isNumber
//	 기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//	 모두 숫자로만 이루어져 있으면 true를 반환하고, 
//	 그렇지 않으면 false를 반환한다.
//	 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
//	 반환타입 : boolean
//	 매개변수 : String str - 검사할 문자열
	
//	static boolean isNumber(String str) {
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			if(!(ch>='0' && ch<='9')) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	static boolean isNumber(String str) {
		if(str == null || str == "") return false;
//		str == "" 대신에 str.length() == 0으로 해도 됨
		boolean flag = true;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}

// 123는 숫자입니까? true
// 1234o는 숫자입니까? false