package exc;

public class Ex5 {

	public static void main(String[] args) {
		//for(int i=0; i<=10; i++) {
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i)	{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
