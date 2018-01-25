
public class Bart extends Player{
	public Bart(){
		super();
	}
	
	@Override
	public String getName() { 
		return "Bart"; 
	}
	
	@Override
	public Roshambo RoshamboValue(){
		return Roshambo.ROCK;
	}
}

