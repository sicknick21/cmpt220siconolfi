import java.util.*;

class Player{
	
	String name;
	int goals;
	String team;

		Player()
{
				name = team = "";
				goals = 0;
	}
		Player(String name, int goal, String team)
{
			this.name = name;
			this.goals = goal;
			this.team = team;
	}	
		void setName(String name)
{
			this.name = name;
	}
		void setTeam(String team)
{
			this.team = team;
	}
		void setGoals(int goals)
{
			this.goals = goals;
	}

		String getName()
{
		return name;
	}
		String getTeam()
{
		return team;
	}
	int getGoals()	
{
		return goals;
	}
	public String toString()

{
		return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
	}
}

class Goal{

 int minute;
 Player player;

 	Goal()
{
 	minute = 0;
 	player = null;
	}
 	Goal(int min, Player p)
{
 	minute = min;
 	player = p;
	}
 			void setMinute(int minute)
{
 			this.minute = minute;
	}
 			void setPlayer(Player player)
{
 			this.player = player;
	}
 int getMinute()

{
	 	return minute;
	}
 	Player getPlayer()
{
 		return player;
	}
 	public String toString()
{

 		return "\n Minute the goal is scored: " + minute + "\n The player who scored the goal: " + player.getName();
	}
}
	public class SoccerMatch{

	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerCounter, visitPlayerCounter;
	int homeGoalCounter, visitGoalCounter;
		SoccerMatch()
{
	startTime = endTime = null;
	venue = home = visitor = null;
	homePlayers = new Player[11];
	visitorPlayers = new Player[11];
	homeGoals = new Goal[10];
	visitorGoals = new Goal[10];
	homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;

  for(int x = 0; x < 11; x++)
{
	homePlayers[x] = new Player();
	visitorPlayers[x] = new Player();
	}
  for(int x = 0; x < 10; x++)
{
	homeGoals[x] = new Goal();
	visitorGoals[x] = new Goal();
	}
}
	SoccerMatch(Date st, Date en, String ven, String ho, String vi)
{
			this();

	startTime = st;
	endTime = en;
	venue = ven;
	home = ho;
	visitor = vi;
}
	void addHomePlayer(Player p)
{
	homePlayers[homePlayerCounter++] = p;
	}
	void addVisitorPlayer(Player p)
{
	visitorPlayers[visitPlayerCounter++] = p;
	}
	void addHomeGoal(Goal g)
{
	homeGoals[homeGoalCounter++] = g;
	}
	void addVisitorGoal(Goal g)
{
	visitorGoals[visitGoalCounter++] = g;
	}
	int [] getHomeGoals()
{
	int goals[] = new int[10];

	for(int x = 0; x < 10; x++)
		goals[x] = homeGoals[x].getPlayer().getGoals();

	return goals;
}
	int [] getVisitorGoals()
{
	int goals[] = new int[10];

	for(int x = 0; x < 10; x++)
		goals[x] = visitorGoals[x].getPlayer().getGoals();

	return goals;
}

	String getWinner()

{
		String winStatus = "";
	int homeGoals[] = getHomeGoals();
	int visitGoals[] = getVisitorGoals();
	int totHome = 0, totVisit = 0;

	for(int x = 0; x < 10; x++)

{
		totHome += homeGoals[x];
		totVisit += visitGoals[x];
}
	winStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;

		if(totHome > totVisit)
			winStatus += "\n Winner: Home Team";
		else if(totVisit > totHome)
			winStatus += "\n Winner: Visitor Team";
		else
			winStatus += "\n It is a tie";

		return winStatus;

	}
	public static void main(String[] args){

		Random rand = new Random();

		Date d1 = new Date(2019, 11, 12, 10, 12, 30);
		Date d2 = new Date(2019, 11, 12, 12, 40, 30);
		SoccerMatch sm = new SoccerMatch(d1, d2, "", "Team 1", "Team 2");
		String homePlayerName [] = {"Nick", "Joe", "Matt", "Mike", "Scott", "Aidan", "Cole", "Gio", "Anthony", "John", "Chuck"};
		String visitPlayerName [] = {"Danny", "Nate", "Peter", "Paul", "Devin", "Larry", "Tom", "Brendan", "Jake", "Marc", "Sean"};

		for(int x = 0; x < 11; x++)
{
			sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Team 1"));
			sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Team 2"));
	}

		for(int x = 0; x < 10; x++)
{
			sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));
			sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));
}
		System.out.print("\n\n Home Team Players: \n ");

		for(int x = 0; x < 11; x++)

		System.out.println(sm.homePlayers[x]);
		System.out.print("\n\n Visitor Team Players: \n ");

		for(int x = 0; x < 11; x++)

		System.out.println(sm.visitorPlayers[x]);
		System.out.print("\n\n Home Team Goals: \n ");

		for(int x = 0; x < 10; x++)
		System.out.println(sm.homeGoals[x]);
		System.out.print("\n\n Visitor Team Goals: \n ");
		
		for(int x = 0; x < 10; x++)
		System.out.println(sm.visitorGoals[x]);
		System.out.print("\n\n Game Stats: \n ");
		System.out.println(sm.getWinner());

	}
}