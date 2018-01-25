public class PairOfDice {
	
	private int die1Value;
	private int die2Value;
	private int sum;
	int sides;
	
	Die die1 = new Die(),
		die2 = new Die();
	
	public int getValue1() {
		int die1Value = die1.getValue();
		return die1Value;
	}
	
	public int getValue2() {
		int die2Value = die2.getValue();
		return die2Value;
	}
	
	public void roll(){
		die1.roll();
		die2.roll();
	}
	
	public int getSum(int die1Value, int die2Value) {
		int sum = die1Value + die2Value;
		return sum;
	}
}
