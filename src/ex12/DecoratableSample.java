package ex12;

public class DecoratableSample {
	public static void main(String[] args) {
	      Decoratable star, box, list, free;
	      star = new Star("Hello Tokyo");
	      box = new Box("Hello Japan");
	      list = new List("Hello Universe", 3);
	      free=new FreeStyle("突然の死");
	      star.decorate();
	      box.decorate();
	      list.decorate();
	      free.decorate();
	   }


}
