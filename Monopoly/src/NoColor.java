
public class NoColor extends Purchasable
{
	
	public NoColor(boolean p, boolean m, String ow, int bP, int sP, int r, String n,int pS)
		{
			isPurchased = p;
			owner = ow;
			isMortgaged = m;
			buyPrice = bP;
			sellPrice = sP;
			rent = r;
			name = n;
			position = pS;
			isBought = false;
		}

	@Override
	public int increasePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeMortgage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBought() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String doLand() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int calculateRent() 
	{
		return 0;
	}
	

}
