public abstract class Player {
	private String name;
	private int roshamboValue;
	
	public Player(){
		name = "";
		roshamboValue = 0;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoshamboValue() {
		return roshamboValue;
	}

	public void setRoshamboValue(int roshamboValue) {
		this.roshamboValue = roshamboValue;
	}
	
	public abstract Roshambo RoshamboValue();
}
