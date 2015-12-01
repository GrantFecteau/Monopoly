
public class NoPurchase extends Tiles
{
	
	public NoPurchase(String n, String a, int p)
	{
		name = n;
		action = a;
		position = p;
		buyable = false;
		isBought = false;
	}
	
	
	@Override
	public String doAction() 
	{
		
		return null;
	}

	@Override
	public String doLand() 
	{
		
		return null;
	}

}
