package skill.bilders;

public class GameCharacter 
{
	//Declare instance variables
	private String name;
	private int health;
	
	//Default constructor
	public GameCharacter()
	{
		name = null;
		health = 0;
	}
	
	//Overload Constructor method
	public GameCharacter(String charName, int starHealth)
	{
		name = charName;
		health = starHealth;
	}
	
	//Behavior: actions the character can do
	//method 1
	
	public void attack()
	{
		System.out.println(name + " attacks! deals 10 damege. ");
	}
	
	//method 2
	public void takeDamage(int damage)
	{
		health = health - damage;
		
		if(health < 0)
		{
			health = 0;
			System.out.println(name + "'s health is now " + health);
		}
	}
	
	public String getStatus()
	{
		return name + " has " + health + " health.";
	}
}
