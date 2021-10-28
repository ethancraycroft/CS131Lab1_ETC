
public abstract class SportsTeam 
{
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam()
	{
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach)
	{
		wins = 0;
		losses = 0;
	}
	
	public double getWinPercentage()
	{
		return (wins/(wins+losses));
	}

	public abstract double[] getStats();
}
