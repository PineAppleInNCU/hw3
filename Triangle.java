package A3_103403526;

import  java.lang.Math;

public class Triangle {
	private int  x1,y1,x2,y2,x3,y3;//declare the private value in the Triangle object
	
	/*-- Create Constructor to set default value --*/
	public Triangle() {

	}

	/*-- Get point's coordinate --*/
	public void getPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
		//三角形第一個點
		this.x1=x1;
		this.y1=y1;
		
		//三角形第二個點
		this.x2=x2;
		this.y2=y2;
		
		//三角形第三個點
		this.x3=x3;
		this.y3=y3;
	}

	/*--Calculate area  --*/
	public double getArea() {
		
		//declare the longth of the side of the triangle
		double s1;
		double s2;
		double s3;
		double s;//海龍公式的s
		double area;//the area of the triangle
		
		s1= Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5);
		
		s2= Math.pow(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2),0.5);
		
		s3= Math.pow(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2),0.5);
		
		
		s=(s1+s2+s3)/2;
		area = Math.pow( s*(s-s1)*(s-s2)*(s-s3),0.5);
		
		
		
		return area;
	}

}