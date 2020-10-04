public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=4;j++) {
				while(i<4) {
					if(i>=j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				if((i+j)>=4 && (i+j)<=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				System.out.print("\n");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
