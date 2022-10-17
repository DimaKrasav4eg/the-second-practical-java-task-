package secondmission;

public class HumanPlayer extends PlayerImlp{
	/**
	 * Имя игрока
	 */
	private String name;
	/**
	 * @param name имя игрока
	 */
	public HumanPlayer(String name) {
		this.name = name;
	}

	@Override
	public void winMessage() {
		System.out.println(getName() + " is Winner!");
	}

	@Override
	public String getName() {
		return this.name;
	}
	
}
