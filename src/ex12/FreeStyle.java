package ex12;

public class FreeStyle implements Decoratable {
	private String str;
	
	public FreeStyle(String str){
		this.str=str;
	}
	
	public void decorate(){
		printLine1();
		System.out.println("＞"+str+"＜");
		printLine2();
	}
	
	public void printLine1(){
		final String drawLine1="＿人人 人人＿";
		System.out.println(drawLine1);
		}
	public void printLine2(){
		final String drawLine2=" ￣Y^Y^Y^Y￣";
		System.out.println(drawLine2);
		}
	}


