public class Player
{
	public static int totalPlayer=0;
	public String playerName;
	
	public static void main(String []args)
	{
		Player obj1=new Player();
		obj1.playerName="Dhoni";
		totalPlayer++;	
			
		Player obj2=new Player();
		obj2.playerName="Sachin";
		totalPlayer++;
		
		System.out.println("Total Players: "+totalPlayer);
	}
}
		

		