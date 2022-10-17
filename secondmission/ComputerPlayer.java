package secondmission;

public class ComputerPlayer extends PlayerImlp{
	/**
	 * Имя компьютера
	 */
	private String name = "Comuter";

	@Override
	public void winMessage() {
		System.out.println("Computer is Winner!\nХА ХА ХА. Ты думал я тебя не переиграю?");
	}
	@Override
	public String getName() {
		return this.name;
	}

}
