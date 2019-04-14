package ex3;
public class MyPoint {

	private int x;
	private int y;



	public MyPoint(int x,int y){
	this.x=x;
	this.y=y;


	}


	int getX(){
		return x;
		}

	int getY(){
		return y;
	}

	double getR(){
		double r=Math.pow(x*x+y*y,0.5);
		return r;
	}

	double getTheta(){
	    double radian=java.lang.Math.atan2(y, x);
	    double degree=radian*180d/Math.PI;
		return degree;
	}

	double distance(MyPoint anotherPoint){
		 double dx=Math.pow((anotherPoint.x-x),2);
		 double dy=Math.pow((anotherPoint.y-y), 2);
		 double distance=Math.pow(dx+dy,0.5);
		return distance;
	}

	public String toString(){
		return "a MyPoint("+getX()+","+getY()+")";
	}

	public boolean equals(MyPoint anotherPoint){
		boolean ans;
		ans=(getX()==anotherPoint.getX())&&(getY()==anotherPoint.getY());
		return ans;
	}
}
