package secondmission;

public interface Game {
	/**
	 * Запускает игру в кости
	 * @param startPlayer игрок, кидающий кубики в раунде первым
	 */
	void startRound (int startPlayer);
	/**
	 * Запускает игру в кости
	 * @param nRounds число раундов
	 */
	void startGame (int nRounds);
}
