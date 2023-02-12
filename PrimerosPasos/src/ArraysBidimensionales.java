
public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bidimensional[][]=new int[4][5];
		
		bidimensional[0][0]=1;
		bidimensional[0][1]=2;
		bidimensional[0][2]=3;
		bidimensional[0][3]=4;
		bidimensional[0][4]=5;
		
		bidimensional[1][0]=6;
		bidimensional[1][1]=7;
		bidimensional[1][2]=8;
		bidimensional[1][3]=9;
		bidimensional[1][4]=10;
		
		bidimensional[2][0]=11;
		bidimensional[2][1]=12;
		bidimensional[2][2]=13;
		bidimensional[2][3]=14;
		bidimensional[2][4]=15;
		
		bidimensional[3][0]=16;
		bidimensional[3][1]=17;
		bidimensional[3][2]=18;
		bidimensional[3][3]=19;
		bidimensional[3][4]=20;
		
		
//		for(int i=0; i<4;i++) {
//			System.out.println();
//			for(int j=0; j<5;j++) {
//				System.out.print(bidimensional[i][j]+" ");
//			}
//		}
	for(int[] elementos: bidimensional) {
		System.out.println();
		for (int z: elementos) {
			System.out.print(z + " ");
		}
	}
		
	}

}
