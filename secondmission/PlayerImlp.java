package secondmission;


import java.util.LinkedList;

public abstract class PlayerImlp implements Player{

	@Override
	public DicesValues throwDices(int nDices) {
		DicesValues values = new DicesValues();
		for (int i = 0; i < nDices; ++i) {
			values.dicesNumbers.add((int) Math.round(Math.random()*6));
			values.sumValues += values.dicesNumbers.getLast();
		}
		return values;
	};
	/**
	 * Класс служащий для того, чтобы в методе {@link PlayerImlp#throwDices(int)} 
	 * вернуть одновременно значения на кубиках и их сумму
	 */
	public static class DicesValues{
		/**
		 * Значения, выпавшие на кубиках
		 */
		public LinkedList<Integer> dicesNumbers= new LinkedList<>();
		/**
		 * Сумма значений на кубиках
		 */
		public int sumValues = 0;
		@Override
		public String toString() {
			StringBuffer prod = new StringBuffer().append("values:");
			int len = dicesNumbers.toArray().length;
			for (int i = 0; i < len; ++i) {
				prod.append(dicesNumbers.get(i)).append(" ");
			}
			return prod.append("sum=").append(sumValues).toString();
		}
	}

}
