import java.util.Random;
import java.util.Scanner;

public class jpgame2
{
	static public void main(String ...args)
	 { 
                try
               {
                System.out.println("welcome to jps game");
		boolean choice=true;
		int c=0,d=0;
		Scanner sc=new Scanner(System.in);
		Random r =new Random();
               
		int a=r.nextInt(4);
               	System.out.println("select ur choice such that there exist 3 consecutive boxes out of 6");	
                while(choice==true)
	   {	
		d++;
	    System.out.println("enter your choice and should not repeat the same number ");
     	int b=sc.nextInt();
		if(b==a||b==a+1||b==a+2)
		 {
			if(c==2)
			{
				System.out.println("kill");
				System.out.println("you won");
				System.out.println("your made  in "+d+"attempts");
				System.out.println("enter 1 to exit ");
			    int jh=sc.nextInt();
			if(jh==1)
				choice=false;


			}
			else
			{
			System.out.println("hit");
			c++;
		    }
		 }
		else
			System.out.println("miss");
	   }

}

  catch(Exception e)
 {
  System.out.println("please enter correct number or choice"+e);
 }
}
}
