
public abstract class Purchasable extends Tiles
	{
		protected int rent;
		protected String owner;
		protected boolean isPurchased;
		protected int buyPrice;
		protected int sellPrice;
		protected boolean isMortgaged;
		
		
		public abstract int increasePrice();
		public abstract void removeMortgage();
		public abstract void getBought();
		
		
	}
