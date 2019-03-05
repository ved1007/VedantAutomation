public class PrintOneToHundred {

	public static void main(String[] args) {
		
		int p;
		System.out.println("Prime Number");
		for(int i=1; i<=100; i++){
			
			p=0;
			for (int v=2; v<i; v++)
			{
				if(i%v==0){
					p++;
					break;
				}
				if(p==0){
					System.out.println("\t" +i);
				}
			}
}
	}
}