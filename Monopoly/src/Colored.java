
public class Colored extends Purchasable
	{
		
		private String color;
		private int numOfSameColor;
		private int houses;
		
		public Colored(boolean p, boolean m, String ow, int bP, int sP, int r, String c, int nSC, int h, String n, int pS)
		{
			isPurchased = p;
			owner = ow;
			isMortgaged = m;
			buyPrice = bP;
			sellPrice = sP;
			rent = r;
			color = c;
			name = n;
			houses = h; 
			numOfSameColor = nSC;
			position = pS;
			buyable = true;
			isBought = false;
			
		}

		public String getColor() 
		{
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getNumOfSameColor() {
			return numOfSameColor;
		}

		public void setNumOfSameColor(int numOfSameColor) {
			this.numOfSameColor = numOfSameColor;
		}

		public int getHouses() {
			return houses;
		}

		public void setHouses(int houses) {
			this.houses = houses;
		}

		@Override
		public int increasePrice()
			{
				// TODO Auto-generated method stub
				return 0;
			}

		@Override
		public void removeMortgage()
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void getBought()
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public String doAction()
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public String doLand()
			{
				// TODO Auto-generated method stub
				return null;
			}
		
		public static String becomeMonopoly(String c)
		{
			return (c + "has become a monopoly!");
		}
		
		
		
	}
