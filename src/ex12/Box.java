package ex12;

public class Box implements Decoratable{
	private String str;
	
	public Box(String str){
		this.str=str;
	}
	
	public void decorate(){
		printLine();
		System.out.println("|"+str+"|");
		printLine();
	}
	
	public void printLine(){
		final String drawLine="+-----------+";
		System.out.println(drawLine);
	}

}
