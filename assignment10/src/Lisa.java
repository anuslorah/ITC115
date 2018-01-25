import java.util.Random;

public class Lisa extends Player{

	public Lisa (){
		super();
	}
		
	@Override
	public String getName() { return "Lisa"; }
	
	@Override
	public Roshambo RoshamboValue() {
		Random rand = new Random();
		int value = rand.nextInt(3);
		if (value == 0)	{
			return Roshambo.ROCK;
		}
		else if (value == 1){
			return Roshambo.PAPER;
		}
		else {
			return Roshambo.SCISSORS;
		}
	}
}