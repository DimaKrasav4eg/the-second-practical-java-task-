package secondmission;

import java.util.LinkedList;
import java.util.Scanner;

import secondmission.PlayerImlp.DicesValues;

public class GameImpl implements Game{
	
	public static void main(String[] argv) {
		Game myGame = new GameImpl(3, 3);
		myGame.startGame(7);
	}
	/**
	 * Число игроков в игре
	 */
	private int nPlayers;
	/**
	 * Число костей в игре
	 */
	private int nDices;
	/**
	 * Номер текущего победителя в {@link GameImpl#players}
	 */
	private int currentWinner = 0;
	/**
	 * Список игроков
	 */
	LinkedList<Player> players =  new LinkedList<>();
	/**
	 * Создание игры
	 * @param nPlayers число игроков
	 * @param nDices число кубиков
	 */
	public GameImpl(int nPlayers, int nDices) {
		this.nPlayers = nPlayers+1;
		this.nDices = nDices;
		setPlayers();
	}
	/**
	 * Формирует список игроков
	 */
	private void setPlayers() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < nPlayers-1; ++i) {
			String name = in.nextLine();
			players.add(new HumanPlayer(name));
		}
		players.add(new ComputerPlayer());
		in.close();
	}

	@Override
	public void startRound(int startPlayer) {
		/**
		 * Текущий игрок
		 */
		int player = startPlayer;
		/**
		 * Наибольшая сумма, выпавшая на кубиках
		 */
		int maxSum = 0;
		/**
		 * Значения на кубиках и их сумма в виде объекта класса {@link DicesValues}
		 */
		DicesValues values;
		// Игроки кидают кубики
		do {
			System.out.printf("The dice are thrown by the %s player:\n", players.get(player%nPlayers).getName());
			values = players.get(player%nPlayers).throwDices(nDices);
			System.out.println(values.toString());
			
			if (maxSum < values.sumValues) {
				maxSum = values.sumValues;
				this.currentWinner = player%nPlayers;
			}
			++player;
		} while (player%nPlayers != startPlayer);
		players.get(this.currentWinner).winMessage();
		
	}

	@Override
	public void startGame(int nRounds) {
		for (int i = 0; i < nRounds; ++i) {
			System.out.println("**************************");
			startRound(this.currentWinner);
			System.out.println("**************************");
		}
		
	}

}
