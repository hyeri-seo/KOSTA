
public class ContinueTest2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%4==0 || i%7==0) continue;	//||는 논리 합. or
			sum+=i;
		}
		System.out.println(sum);
	}

}
