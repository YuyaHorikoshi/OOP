package ex4;

public class Card {
    private int mark;
    private int number;
    private int colorNum;
    private String markStr;
    private String numStr;
    private String str;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public static final int BLACK = 0;
    public static final int RED = 1;

    public Card(int m, int num) {
    	this.mark=m;
    	this.number=num;
    }
    public int getMark() {
    	return mark;
    }
    public int getNumber() {
    	return number;
    }
    public int color(){
    	switch (getMark()){
    	case 0:
    		colorNum=0;
    		break;
    	case 1:
    		colorNum=1;
    		break;
    	case 2:
    		colorNum=0;
    		break;
    	case 3:
    		colorNum=1;
    		break;
    	}
    		return colorNum ;
    }

    public String toString(){
    	switch(getMark()){
    	case 0:
    		markStr="S";
    		break;
    	case 1:
    		markStr="H";
    		break;
    	case 2:
    		markStr="C";
    		break;
    	case 3:
    	    markStr="D";
    	    break;
    	}

    	if(getNumber()>=2 && getNumber()<=10){
    		numStr=Integer.toString(getNumber());
    	}

    	switch(getNumber()){
    	case 1:
    		numStr="A";
    		break;
    	case 11:
    		numStr="J";
    		break;
    	case 12:
    		numStr="Q";
    		break;
    	case 13:
    		numStr="K";
    		break;

    	}
    	str="Card"+"("+numStr+","+markStr+")";

    	return str;
    }

    public static void main(String[] args) {
	Card card1, card2, card3;
	card1 = new Card(Card.SPADE, 1);
	card2 = new Card(Card.DIAMOND, 2);
	card3 = new Card(Card.SPADE, 13);

	System.out.println(card1.color());
	System.out.println(card1.toString());
	System.out.println(card2.color());
    System.out.println(card2.toString());
	System.out.println(card3.color());
	System.out.println(card3.toString());
    }


}
