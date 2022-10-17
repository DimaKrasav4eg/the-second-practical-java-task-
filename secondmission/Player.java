package secondmission;

import secondmission.PlayerImlp.DicesValues;

public interface Player {
	/**
	 * Бросок кубика игроком
	 * @param nDices число кубиков
	 * @return значения на кубиках в виде класса {@link DicesValues}
	 */
	DicesValues throwDices(int nDices);
	/**
	 * @return имя игрока
	 */
	String getName();
	/**
	 * Выводит в {@link System#out} сообщение победителя
	 */
	public void winMessage();
}
