package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		//몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int sum = 0;
		int i=0;
		
//		처음에 작성한 지저분한 if문..
//		int i=1;
//		for(i=1;;i++)	{
//				if(i%2!=0)	{
//					sum+=i;
//				}else	{
//					sum+=-i;
//				} if(sum>=100)
//					break;
//		}	System.out.println(i);
		
		while(sum<100){
			i++;
			if(i%2!=0)	{
				sum+=i;
			}else	{
				sum+=-i;
			}
		}	System.out.println(i);
	}


}	
