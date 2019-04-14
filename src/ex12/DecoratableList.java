package ex12;
import java.util.ArrayList;

public class DecoratableList {
	public static void main(String[] args){
		ArrayList<Decoratable> aList=new ArrayList<Decoratable>();
		 Decoratable star1,star2, box1,box2, list1,list2, free1,free2;
		 
	      star1 = new Star("Hello Tokyo");
	      star2 = new Star("Hello Tokyo");
	      box1 = new Box("Hello Japan");
	      box2 = new Box("Hello Japan");
	      list1 = new List("Hello Universe", 3);
	      list2 = new List("Hello Universe", 3);
	      free1=new FreeStyle("突然の死");
	      free2=new FreeStyle("突然の死");
		
		aList.add(star1);
		aList.add(star2);
		aList.add(box1);
		aList.add(box2);
		aList.add(list1);
		aList.add(list2);
		aList.add(free1);
		aList.add(free2);
		
		for(Decoratable style:aList){
			style.decorate();
		}
	}
}
