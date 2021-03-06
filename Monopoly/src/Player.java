import java.util.*;
public class Player 
{
	
	private ArrayList<Purchasable> properties;
	private int cash;
	private int monopolies;
	private boolean isInJail;
	protected int cardsOwned;
	protected int position;
	protected boolean isBack;
	
	public Player(int c, int m, boolean iIJ, int cO, int pS, boolean iB)
	{
		properties = new ArrayList<Purchasable>();
		cash = c;
		monopolies = m;
		isInJail= iIJ;
		cardsOwned= cO;
		position = pS;
		isBack = iB;
		
	}
	
	
	
	
	public boolean isBack() {
		return isBack;
	}




	public void setBack(boolean isBack) {
		this.isBack = isBack;
	}




	public static int rollDice()
	{
		int d1 = (int)(Math.random()*6+1);
		int d2 = (int)(Math.random()*6+1);
		
		return d1+d2;
	}
	
	public static int doTurn(int d, int p)
	{
		if (d+p>=40)
			{
				Runner.players.get(0).setCash(Runner.players.get(0).getCash()+200);
				System.out.println("You passed 'Go' and collected 200 credits!");
			}
		
		int newPos = (d + p) % 40;
		
		
		
		return newPos;
	}
	
	public static int doBackTurn(int d, int p)
	{
		
		int newPos = ((p-d)+40) % 40;
		
		
		return newPos;
	}


	public ArrayList<Purchasable> getProperties()
		{
			return properties;
		}




	public void setProperties(ArrayList<Purchasable> properties)
		{
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
