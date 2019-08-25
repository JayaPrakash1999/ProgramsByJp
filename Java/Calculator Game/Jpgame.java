import java.util.*;
public class Jpgame
{

	public static void main(String[] args)
	{
         try
               {
		 int count=0;
		 boolean ja=true;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter ur name");
			String name=sc.nextLine();
			System.out.println("hai "+name+"\n****Welcome to jps game****\n @about the game:This game is about calculations,it includes 3 levels and also you can select easy,medium,hard \n please select levels\n1.easy\n2.medium\n3.hard\n");
			
			int z=sc.nextInt();
			while(ja==true)
			{
			if(count==5)
				System.out.println("!!!welcome to first level!!!");
			else if(count==10)
				System.out.println("!!!!welcome to second level!!!!");
			else if(count==15)
				System.out.println("welcome to third level\n you just need 5 points to win the game\n all the best"+name);
			else if(count==20)
			{
				System.out.println("*****congrats "+name+"****\n you won \n enter 1 to exit or any other number to start new game");
			    	    int kj=sc.nextInt();
				    	  if(kj==1)
				    	  {
				    		  System.out.println("byee"+name);
				    		   ja=false;
				    	  }
				count=0;
			}
		    Random r=new Random();
		    
		    	int a=r.nextInt(15);
				int b=r.nextInt(15);
			
				if(a==0||b==0)
				{
					a++;
					b++;
				}
		  
			switch(z)
			{
			case 1:{
					System.out.println("answer for "+a+"+"+b+" is ?");//addition operation
			      int d=sc.nextInt();
			        if(a+b==d)
			        {
			    	   System.out.println("you are correct carry on!");
			           count++;
			           z=(count>10)?2:r.nextInt(1);
			        }
			        else
			        {
			    	   System.out.println("***game over***\n"+name+" your score is"+count+"\nenter 1 to exit or any other number to start new game");
			    	    int kj=sc.nextInt();
				    	  if(kj==1)
				    	  {
				    		  System.out.println("byee "+name);
				    		   ja=false;
				    	  }
						
			        }
				   }
			    	break;
			case 0:{
					System.out.println("answer for "+a+"-"+b+" is ?");//sub oper
             int e=sc.nextInt();
                   if(a-b==e)
                   {  
                       System.out.println("you are correct carry on!");
                	   count++;z=(count>10)?2:r.nextInt(1);
                   }
                	   else
                	   {
    			    	   System.out.println("***game over***\n"+name+" your score is"+count+"\nenter 1 to exit or any other numberto start new game");
    			    	    int kj=sc.nextInt();
    				    	  if(kj==1)
    				    	  {
    				    		  System.out.println("byee"+name);
    				    		   ja=false;
    				    	  }
    						
    			        }
					}
                     break;			
			case 2:{
				    System.out.println("answer for "+a+"*"+b+" is ?");//mul oper
			int f=sc.nextInt();
			        if((a*b)==f)
			        {
			    	   System.out.println("you are correct carry on!");
			           count++;z=(count>15)?3:2;
			        }
			        else
			        {
				    	   System.out.println("***game over***\n"+name+" your score is"+count+"\nenter 1 to exit or any other number to start new game");
				    	    int kj=sc.nextInt();
					    	  if(kj==1)
					    	  {
					    		  System.out.println("byee "+name);
					    		   ja=false;
					    	  }
							
				        }
			       }
			       break;
			case 3:{
			        System.out.println("hope you know the differnce between '/'=quotient and '%'remainder\n answer for "+a+"/"+b+" is ?");//div oper
		         int g=sc.nextInt();
		            if((a/b)==g)
		           {
		    	    System.out.println("you are correct carry on!");
		            count++;z=4;
		           }
		           else
		           {
			    	   System.out.println("***game over***\n"+name+" your score is"+count+"\nenter 1 to exit or any other numberto start new game");
			    	    int kj=sc.nextInt();
				    	  if(kj==1)
				    	  {
				    		  System.out.println("byee"+name);
				    		   ja=false;
				    	  }
						
			        }
		          }
		          break;
			case 4:{
		        System.out.println("hope you know the differnce between '/'=quotient and '%'=remainder left \n answer for "+a+"%"+b+" is ?");//rem oper
	          int h=sc.nextInt();
	            if((a%b)==h)
	           {
	    	    System.out.println("you are correct carry on!");
	            count++;z=3;
	           }
	           else
	           {
		    	   System.out.println("***game over***\n"+name+" your score is"+count+"\nenter 1 to exit or any other number to start new game");
		    	    int kj=sc.nextInt();
			    	  if(kj==1)
			    	  {
			    		  System.out.println("byee "+name);
			    		   ja=false;
			    	  }
					
		        }
			}
	          break;
			default:count=count;
			}
			}
			sc.close();
			}
catch(Exception e)
{
System.out.println("plz enter crct option  run again"); 
}		
}
}
