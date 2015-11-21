
public class Player 
{
	
	protected int properties;
	protected int cash;
	protected int monopolies;
	protected boolean isInJail;
	protected int cardsOwned;
	protected int position;
	
	public Player(int p, int c, int m, boolean iIJ, int cO, int pS)
	{
		properties = p;
		cash = c;
		monopolies = m;
		isInJail= iIJ;
		cardsOwned= cO;
		position = p;
		
	}
	
	
	
	
	public static int rollDice()
	{
		int d1 = (int)(Math.random()*6+1);
		int d2 = (int)(Math.random()*6+1);
		
		return d1+d2;
	}
	
	public static int doTurn(int d, int p)
	{
		int newPos = (d + p) % 40;
		
		return newPos;
	}




	public int getProperties() {
		return properties;
	}




	public void setProperties(int properties) {
		this.properties = properties;
	}




	public int getCash() {
		return cash;
	}




	public void setCash(int cash) {
		this.cash = cash;
	}




	public int getMonopolies() {
		return monopolies;
	}




	public void setMonopolies(int monopolies) {
		this.monopolies = monopolies;
	}




	public boolean isInJail() {
		return isInJail;
	}




	public void setInJail(boolean isInJail) {
		this.isInJail = isInJail;
	}




	public int getCardsOwned() {
		return cardsOwned;
	}




	public void setCardsOwned(int cardsOwned) {
		this.cardsOwned = cardsOwned;
	}




	public int getPosition() {
		return position;
	}




	public void setPosition(int position) {
		this.position = position;
	}




	
	

}
