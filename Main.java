package A3_103403526;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random ran = new Random();
		int x1,y1,x2,y2,x3,y3;

		/*-- Create a 6x11 map--*/
		int[][] map = new int[6][11];//make a 6x11 map
		
		
		
		/*-- Create a Triangle class object name with default value --*/
		Triangle t = new Triangle();
		

		/*-- Generate points by random--*/
		
		/* the first point*/
		x1=ran.nextInt(6);
		y1=ran.nextInt(11);
		
		/*the second point*/
		x2=ran.nextInt(6);
		y2=ran.nextInt(11);
		
		/*the third point*/
		x3=ran.nextInt(6);
		y3=ran.nextInt(11);

		/*-- Transfer points to triangle object--*/

		t.getPoint(x1,y1,x2,y2,x3,y3);
		
		/*-- Show map--*/
		
		// put in the first point
		map[x1][y1]=1;
		
		// put in the second point
		map[x2][y2]=2;
		
		//put in the third point
		map[x3][y3]=3;
		
		for(int i=0;i<6;i++){
			for(int j=0;j<11;j++){
				System.out.printf("%d",map[i][j]);
			}
			System.out.println();
		}
		/*-- Show points coordinate--*/
		System.out.printf("Point 1 is at (%d,%d).\n",x1,y1);
		
		System.out.printf("Point 2 is at (%d,%d).\n",x2,y2);
		
		System.out.printf("Point 3 is at (%d,%d).\n",x3,y3);

		/*-- Show area--*/
		if(t.getArea()==0)
		{
			System.out.printf("It's not a triangle.");//若結果為零，則圖形非三角形
		}
		else{
			System.out.printf("The area is %f", t.getArea());//若結果非零，則顯示面積
		}
			
	}

}
