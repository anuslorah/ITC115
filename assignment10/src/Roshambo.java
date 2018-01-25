
public enum Roshambo {
	ROCK,
	PAPER,
	SCISSORS;
	
	@Override
	public String toString(){
		String s = "";
		if (ordinal() == 0){
			s = "Rock";
		}
		else if (ordinal() == 1){
			s = "Paper";
		}
		else if (ordinal() == 2){
			s = "Scissors";
		}
		return s;
	}
}
