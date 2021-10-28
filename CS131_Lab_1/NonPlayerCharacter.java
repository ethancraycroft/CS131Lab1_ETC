import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter
{
	public String intelligenceType = "";
	public boolean active;
	Random random = new Random();
	
	public void setActive(boolean torf)
	{
		active = torf;
	}
	
	public boolean getActive()
	{
		return active;
	}
	
	public void setIntelligenceType(String IT)
	{
		intelligenceType = IT;
	}
	
	public String getIntelligenceType()
	{
		return intelligenceType;
	}
	
	public NonPlayerCharacter()
	{
		super();
		setActive(false);
		setIntelligenceType("Active");
		
	}
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType)
	{
		super();
		setActive(active);
		setIntelligenceType(intelligenceType);
		
	}

	public String reportStructure()
	{
		super.reportStructure();
		StringBuilder sb = new StringBuilder("");
		sb.append("Active: "+getActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();
	}
	
	public String introduce()
	{
		return ("Hello my name is " + uniqueID);
	}
	
	public String exclaim()
	{
		int exclamation = random.nextInt(5);
		if (exclamation ==0)
		{
			return ("Dag Gummit");
		}
		else if (exclamation == 1)
		{
			return ("Doggone it");
		}
		else if (exclamation == 2)
		{
			return ("Holy cow");
		}
		else if (exclamation == 3)
		{
			return ("Jeez");
		}
		else if (exclamation == 4)
		{
			return ("Well cheese and crackers");
		}
		else
			return null;
	}
}//end class
