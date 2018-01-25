public class Die {

	private int numOfSides;
	private int faceValue;
	
	public Die(){
		numOfSides = 6;
	}
	
	public Die(int numOfSides){
		this.numOfSides = numOfSides;
	}
	
	public int getValue() {
		return faceValue;
	}
	
	public void roll(){
		faceValue=(int)(Math.random()*numOfSides+1);
	}
}