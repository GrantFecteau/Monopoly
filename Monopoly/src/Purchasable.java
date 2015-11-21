
public abstract class Purchasable extends Tiles
	{
		protected int rent;
		protected String owner;
		protected boolean isPurchased;
		protected int buyPrice;
		protected int sellPrice;
		protected boolean isMortgaged;
		
		
		public int getRent() {
			return rent;
		}
		public void setRent(int rent) {
			this.rent = rent;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public boolean isPurchased() {
			return isPurchased;
		}
		public void setPurchased(boolean isPurchased) {
			this.isPurchased = isPurchased;
		}
		public int getBuyPrice() {
			return buyPrice;
		}
		public void setBuyPrice(int buyPrice) {
			this.buyPrice = buyPrice;
		}
		public int getSellPrice() {
			return sellPrice;
		}
		public void setSellPrice(int sellPrice) {
			this.sellPrice = sellPrice;
		}
		public boolean isMortgaged() {
			return isMortgaged;
		}
		public void setMortgaged(boolean isMortgaged) {
			this.isMortgaged = isMortgaged;
		}
		public abstract int increasePrice();
		public abstract void removeMortgage();
		public abstract void getBought();
		
		
	}
