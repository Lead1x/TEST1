
public class IfElseExample 
{
	
	public static void main(String[] args) 
	{

		getHighestInteger(0, 0, 0);
	}					
	
		public static int getHighestInteger (int FirstInt, int SecondInt, int ThirdInt) 
		{
			int Numberone = 10;
			int Numbertwo = 15;
			int Numberthree = 8; 
						
			if (Numberone > Numbertwo)
			{
				System.out.println("The higher number is " +Numberone);
			}
			else if (Numbertwo > Numberthree)
			{
				System.out.println("The higher number is " +Numbertwo);
			}
			
			else if (Numberthree > Numberone)
			{
				System.out.println("The higher number is " +Numberthree);
			}
						
				return(Numbertwo);
		}		      
}
