
public class BasketballTeam extends SportsTeam 
{
	int fieldGoals;
	int fieldGoalsAttempted;
	int freeThrows;
	int freeThrowsAttempted;
	double [] Stats = new double [3];
	
	public BasketballTeam()
	{
		teamName = "";
		teamMascot = "";
		headCoach = "";
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0; 
		freeThrowsAttempted = 0;
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach)
	{
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0; 
		freeThrowsAttempted = 0;
		wins = 0;
		losses = 0;
	}
	
	public double fieldGoalPercentage()
	{
		return (fieldGoals/fieldGoalsAttempted);
	}
	
	public double freeThrowPercentage()
	{
		return (freeThrows/freeThrowsAttempted);
	}
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		Stats [0] = getWinPercentage();
		Stats [1] = fieldGoalPercentage();
		Stats [2] = freeThrowPercentage();
	}
	
	public double[] getStats()
	{
		return Stats;
	}
	
	
	
}
