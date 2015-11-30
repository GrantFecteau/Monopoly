import java.util.*;
public class Runner 
{
	public static int positionH;
	public static boolean stillGoing;
	public static ArrayList<Tiles> squares = new ArrayList<Tiles>();
	public static ArrayList<Player> players = new ArrayList<Player>();
	


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
		players.get(0).setPosition(Player.doTurn(dieRoll, playerPos));
		System.out.println("You rolled a(n) "+ dieRoll + ".");
		System.out.println("You landed on " + squares.get(players.get(0).getPosition()).getName()+".");
		}
		
		
		}
	}
	
	public static void addSquares()
	{
		squares.add(new NoPurchase("Go","go",0));
		squares.add(new Colored(false,false,"",0,0,0,"Brown",0,0,"Mediteranean Avenue",1));
		squares.add(new NoPurchase("Community Chest", "drawCom",2));
		squares.add(new Colored(false,false,"",0,0,0,"Brown",0,0,"Baltic Avenue",3));
		squares.add(new NoPurchase("Income Tax", "tax", 4));
		squares.add(new NoColor(false, false,"",0,0,0,"Reading Railroad",5));
		squares.add(new Colored(false,false,"",0,0,0,"Light Blue",0,0,"Oriental Avenue",6));
		squares.add(new NoPurchase("Chance", "drawCh", 7));
		squares.add(new Colored(false,false,"",0,0,0,"Light Blue",0,0,"Vermont Avenue",8));
		squares.add(new Colored(false,false,"",0,0,0,"Light Blue",0,0,"Connecticut Avenue",9));
		squares.add(new NoPurchase("Just Visiting", "visit", 10));
		squares.add(new Colored(false,false,"",0,0,0,"Light Pink",0,0,"St. Charles Place",11));
		squares.add(new NoColor(false, false,"",0,0,0,"Electric Company",12));
		squares.add(new Colored(false,false,"",0,0,0,"Light Pink",0,0,"States Avenue",13));
		squares.add(new Colored(false,false,"",0,0,0,"Light Pink",0,0,"Virginia Avenue",14));
		squares.add(new NoColor(false, false,"",0,0,0,"Pennsylvania Railroad",15));
		squares.add(new Colored(false,false,"",0,0,0,"Orange",0,0,"St. James Place",16));
		squares.add(new NoPurchase("Chance", "drawCh", 17));
		squares.add(new Colored(false,false,"",0,0,0,"Orange",0,0,"Tennessee Avenue",18));
		squares.add(new Colored(false,false,"",0,0,0,"Orange",0,0,"New York Avenue",19));
		squares.add(new NoPurchase("Free Parking", "freePr", 20));
		squares.add(new Colored(false,false,"",0,0,0,"Red",0,0,"Kentucky Avenue",21));
		squares.add(new NoPurchase("Chance", "drawCh", 22));
		squares.add(new Colored(false,false,"",0,0,0,"Red",0,0,"Indiana Avenue",23));
		squares.add(new Colored(false,false,"",0,0,0,"Red",0,0,"Illinois Avenue",24));
		squares.add(new NoColor(false, false,"",0,0,0,"B. & O. Railroad",25));
		squares.add(new Colored(false,false,"",0,0,0,"Yellow",0,0,"Atlantic Avenue",26));
		squares.add(new Colored(false,false,"",0,0,0,"Yellow",0,0,"Ventnor Avenue",27));
		squares.add(new NoColor(false, false,"",0,0,0,"Water Works",28));
		squares.add(new Colored(false,false,"",0,0,0,"Yellow",0,0,"Marvin Gardens",29));
		squares.add(new NoPurchase("Go To Jail", "goJ", 30));
		squares.add(new Colored(false,false,"",0,0,0,"Green",0,0,"Pacific Avenue",31));
		squares.add(new Colored(false,false,"",0,0,0,"Green",0,0,"North Carolina Avenue",32));
		squares.add(new NoPurchase("Community Chest", "drawCom", 33));
		squares.add(new Colored(false,false,"",0,0,0,"Green",0,0,"Pennsylvania Avenue",34));
		squares.add(new NoColor(false, false,"",0,0,0,"Short Line",35));
		squares.add(new NoPurchase("Chance", "drawCh", 36));
		squares.add(new Colored(false,false,"",0,0,0,"Purple",0,0,"Park Place",37));
		squares.add(new NoPurchase("Luxury Tax", "taxL", 38));
		squares.add(new Colored(false,false,"",0,0,0,"Purple",0,0,"Boardwalk",39));
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
		players.add(new Player(0,0,false,0,0));
	}

}
