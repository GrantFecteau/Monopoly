import java.util.*;
public class Runner 
{
	public static int positionH;
	public static boolean stillGoing;
	public static ArrayList<Tiles> squares = new ArrayList<Tiles>();
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<String> properties = new ArrayList<String>();
	public static String cash = "";
	


	public static void main(String[] args) 
	{
		
		addSquares();
		addPlayers();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Press Enter to roll the dice! To stop testing, enter n.");
		while (stillGoing = true)
		{
		String blank = userInput.nextLine();
		if (blank.equals("n"))
		{
			System.exit(0);
		}
		else
		{
		int playerPos = players.get(0).getPosition();
		int dieRoll = Player.rollDice();
		if (players.get(0).isBack()==false)
		{
		players.get(0).setPosition(Player.doTurn(dieRoll, playerPos));
		}
		else if (players.get(0).isBack()==true)
		{
		players.get(0).setPosition(Player.doBackTurn(dieRoll, playerPos));
		}
		
		if (players.get(0).getPosition() == 10 && players.get(0).isBack()==false)
		{
			players.get(0).setBack(true);
		}
		else if (players.get(0).getPosition() == 10 && players.get(0).isBack()==true)
		{
			players.get(0).setBack(false);
		}
		System.out.println("You rolled a(n) "+ dieRoll + ".");
		System.out.println("You landed on " + squares.get(players.get(0).getPosition()).getName()+".");
		printInventory(players.get(0).getCash(), properties);
		if (squares.get(players.get(0).getPosition()).getIsBought()== false && squares.get(players.get(0).getPosition()) instanceof Purchasable &&players.get(0).getCash()>=((Purchasable) squares.get(players.get(0).getPosition())).getBuyPrice())
		{
			System.out.println("Would you like to purchase " + squares.get(players.get(0).getPosition()).getName() +" for " + ((Purchasable) squares.get(players.get(0).getPosition())).getBuyPrice() +" "+cash+"(s)? (Y)/(N)");
			String buyAnswer = userInput.nextLine();
			if(buyAnswer.equals("Y")||buyAnswer.equals("y"))
			{
				properties.add(new String(squares.get(players.get(0).getPosition()).getName()));
				
				squares.get(players.get(0).getPosition()).setBought(true);
				
				players.get(0).setCash(players.get(0).getCash()-((Purchasable) squares.get(players.get(0).getPosition())).getBuyPrice());
				
				System.out.println("Congrats, you bought " + squares.get(players.get(0).getPosition()).getName()+".");
			}
		}
		
		}
		
		
		}
	}
	
	public static void addSquares()
	{
		System.out.println("Please select a board. Type '1' for Star Wars and '2' for original.");
		
		Scanner starA = new Scanner (System.in);
		
		int ban = starA.nextInt();
		
		if (ban==1)
			{
				cash = "credit";
		squares.add(new NoPurchase("Go","go",0));
		squares.add(new Colored(false,false,"",60,0,0,"Purple",0,0,"Swamp - Dagobah",1));
		squares.add(new NoPurchase("Rebel Scum", "drawCom",2));
		squares.add(new Colored(false,false,"",60,0,0,"Purple",0,0,"Yoda's Hut - Dagobah",3));
		squares.add(new NoPurchase("Docking Tax", "tax", 4));
		squares.add(new NoColor(false, false,"",200,0,0,"TIE Fighter",5));
		squares.add(new Colored(false,false,"",100,0,0,"Light Blue",0,0,"Echo Base - Hoth",6));
		squares.add(new NoPurchase("Imperial Chance", "drawCh", 7));
		squares.add(new Colored(false,false,"",100,0,0,"Light Blue",0,0,"Frozen Plains - Hoth",8));
		squares.add(new Colored(false,false,"",120,0,0,"Light Blue",0,0,"North Ridge - Hoth",9));
		squares.add(new NoPurchase("CARBONATION ", "visit", 10));
		squares.add(new Colored(false,false,"",140,0,0,"Light Pink",0,0,"Lars Homestead - Tatooine",11));
		squares.add(new NoColor(false, false,"",150,0,0,"Reactor Core",12));
		squares.add(new Colored(false,false,"",140,0,0,"Light Pink",0,0,"Mos Eisley - Tatooine",13));
		squares.add(new Colored(false,false,"",160,0,0,"Light Pink",0,0,"Yoda's Other Swamp - Tatooine",14));
		squares.add(new NoColor(false, false,"",200,0,0,"Millennium Falcon",15));
		squares.add(new Colored(false,false,"",180,0,0,"Orange",0,0,"War Room - Yavin Four",16));
		squares.add(new NoPurchase("Rebel Scum", "drawCom", 17));
		squares.add(new Colored(false,false,"",180,0,0,"Orange",0,0,"Massassi Temple - Yavin Four",18));
		squares.add(new Colored(false,false,"",200,0,0,"Orange",0,0,"Temple Throne Room - Yavin Four",19));
		squares.add(new NoPurchase("Free Fighter Parking", "freePr", 20));
		squares.add(new Colored(false,false,"",220,0,0,"Red",0,0,"Landos Platform - Cloud City",21));
		squares.add(new NoPurchase("Imperial Chance", "drawCh", 22));
		squares.add(new Colored(false,false,"",220,0,0,"Red",0,0,"Carbon Freezing Chamber - Cloud City",23));
		squares.add(new Colored(false,false,"",240,0,0,"Red",0,0,"Reactor Control Room - Cloud City",24));
		squares.add(new NoColor(false, false,"",200,0,0,"X-Wing Fighter",25));
		squares.add(new Colored(false,false,"",260,0,0,"Yellow",0,0,"Landing Bay - Death Star",26));
		squares.add(new Colored(false,false,"",260,0,0,"Yellow",0,0,"Throne Room - Death Star",27));
		squares.add(new NoColor(false, false,"",150,0,0,"Moisture Farm",28));
		squares.add(new Colored(false,false,"",280,0,0,"Yellow",0,0,"Central Core - Death Star",29));
		squares.add(new NoPurchase("It's a Trap!", "goJ", 30));
		squares.add(new Colored(false,false,"",300,0,0,"Green",0,0,"Forest - Endor",31));
		squares.add(new Colored(false,false,"",300,0,0,"Green",0,0,"Shield Generator - Endor",32));
		squares.add(new NoPurchase("Rebel Scum", "drawCom", 33));
		squares.add(new Colored(false,false,"",320,0,0,"Green",0,0,"Ewok Village - Endor",34));
		squares.add(new NoColor(false, false,"",200,0,0,"Star Destroyer",35));
		squares.add(new NoPurchase("Imperial Chance", "drawCh", 36));
		squares.add(new Colored(false,false,"",350,0,0,"Purple",0,0,"Monument Square - Coruscant" ,37));
		squares.add(new NoPurchase("Bounty", "taxL", 38));
		squares.add(new Colored(false,false,"",400,0,0,"Purple",0,0,"Imperial Palace - Coruscant",39));
			}
		
		else if (ban == 2)
			{
				cash = "dollar";
			squares.add(new NoPurchase("Go","go",0));
			squares.add(new Colored(false,false,"",60,0,0,"Brown",0,0,"Mediteranean Avenue",1));
			squares.add(new NoPurchase("Community Chest", "drawCom",2));
			squares.add(new Colored(false,false,"",60,0,0,"Brown",0,0,"Baltic Avenue",3));
			squares.add(new NoPurchase("Income Tax", "tax", 4));
			squares.add(new NoColor(false, false,"",200,0,0,"Reading Railroad",5));
			squares.add(new Colored(false,false,"",100,0,0,"Light Blue",0,0,"Oriental Avenue",6));
			squares.add(new NoPurchase("Chance", "drawCh", 7));
			squares.add(new Colored(false,false,"",100,0,0,"Light Blue",0,0,"Vermont Avenue",8));
			squares.add(new Colored(false,false,"",120,0,0,"Light Blue",0,0,"Connecticut Avenue",9));
			squares.add(new NoPurchase("Just Visiting", "visit", 10));
			squares.add(new Colored(false,false,"",140,0,0,"Light Pink",0,0,"St. Charles Place",11));
			squares.add(new NoColor(false, false,"",150,0,0,"Electric Company",12));
			squares.add(new Colored(false,false,"",140,0,0,"Light Pink",0,0,"States Avenue",13));
			squares.add(new Colored(false,false,"",160,0,0,"Light Pink",0,0,"Virginia Avenue",14));
			squares.add(new NoColor(false, false,"",200,0,0,"Pennsylvania Railroad",15));
			squares.add(new Colored(false,false,"",180,0,0,"Orange",0,0,"St. James Place",16));
			squares.add(new NoPurchase("Chance", "drawCh", 17));
			squares.add(new Colored(false,false,"",180,0,0,"Orange",0,0,"Tennessee Avenue",18));
			squares.add(new Colored(false,false,"",200,0,0,"Orange",0,0,"New York Avenue",19));
			squares.add(new NoPurchase("Free Parking", "freePr", 20));
			squares.add(new Colored(false,false,"",220,0,0,"Red",0,0,"Kentucky Avenue",21));
			squares.add(new NoPurchase("Chance", "drawCh", 22));
			squares.add(new Colored(false,false,"",220,0,0,"Red",0,0,"Indiana Avenue",23));
			squares.add(new Colored(false,false,"",240,0,0,"Red",0,0,"Illinois Avenue",24));
			squares.add(new NoColor(false, false,"",200,0,0,"B. & O. Railroad",25));
			squares.add(new Colored(false,false,"",260,0,0,"Yellow",0,0,"Atlantic Avenue",26));
			squares.add(new Colored(false,false,"",260,0,0,"Yellow",0,0,"Ventnor Avenue",27));
			squares.add(new NoColor(false, false,"",150,0,0,"Water Works",28));
			squares.add(new Colored(false,false,"",280,0,0,"Yellow",0,0,"Marvin Gardens",29));
			squares.add(new NoPurchase("Go To Jail", "goJ", 30));
			squares.add(new Colored(false,false,"",300,0,0,"Green",0,0,"Pacific Avenue",31));
			squares.add(new Colored(false,false,"",300,0,0,"Green",0,0,"North Carolina Avenue",32));
			squares.add(new NoPurchase("Community Chest", "drawCom", 33));
			squares.add(new Colored(false,false,"",320,0,0,"Green",0,0,"Pennsylvania Avenue",34));
			squares.add(new NoColor(false, false,"",200,0,0,"Short Line",35));
			squares.add(new NoPurchase("Chance", "drawCh", 36));
			squares.add(new Colored(false,false,"",350,0,0,"Purple",0,0,"Park Place",37));
			squares.add(new NoPurchase("Luxury Tax", "taxL", 38));
			squares.add(new Colored(false,false,"",400,0,0,"Purple",0,0,"Boardwalk",39));
			}
		
		else 
		{
			System.out.println("Please choose a valid board.");
			addSquares();
		}
	}
	
	public static void test()
	{
		for (int i = 0; i < squares.size(); i++)
		{
			System.out.println(squares.get(i).getName());
		}
	}
	
	public static void addPlayers()
	{
		players.add(new Player(1500,0,false,0,0,false));
	}
	
	public static void printInventory(int c, ArrayList<String> p)
	{
		System.out.println("You have " + c + " "+cash+"(s) left.");
		if(p.size()<1)
		{
			System.out.println("You currently have no properties.");
		}
		else
		{
		System.out.println("Here are your current properties.");
		for(int i = 0; i < p.size(); i++)
		{
			System.out.print("|" + p.get(i) + "|");
		}
		}
		
		System.out.println();
		
		
	}

}
