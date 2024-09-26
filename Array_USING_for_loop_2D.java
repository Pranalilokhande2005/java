package theory;

public class Arrayforloop2d {

	public static void main(String[] args) {
		// array with for loop 2D
		int ar[][]= {{1,2,3,7},{4,5,6,8},{4,6,8,5}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(ar[i][j]);
			}
		}

	}

}
