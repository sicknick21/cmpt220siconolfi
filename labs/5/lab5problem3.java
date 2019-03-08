import java.util.Scanner;
public class lab5problem3 {

		String name;
	    int score;
	    
	    
	    public void setNames(String n)
	    {
	        name=n;
	    }
	    public void setScore(int s)
	    {
	        score=s;
	    }
	    public int getScore()
	    {
	        return score;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public static void main(String args[])
	    {
	        Scanner scan1=new Scanner(System.in);
	        Scanner scan2=new Scanner(System.in);
	        int length;
	        int i;
	        System.out.print("Enter the number of students:");
	        length=scan2.nextInt();
	        lab5problem3 s[]=new lab5problem3[length];
	        System.out.println("Enter the student names and their scores:");
	        for(i=0;i<length;i++)
	        {
	            s[i]=new lab5problem3();
	            System.out.print("Enter student name #"+(i+1)+": ");
	            s[i].setNames(scan1.nextLine());
	            System.out.print("Enter student score #"+(i+1)+": ");
	            s[i].setScore(scan2.nextInt());
	        }

	        int j;
	        lab5problem3 t=new lab5problem3();
	        for(i=0;i<length;i++)
	        {
	            for(j=0;j<length-1;j++)
	            {
	                if(s[j].getScore()>s[j+1].getScore())
	                {
	                    t=s[j];
	                    s[j]=s[j+1];
	                    s[j+1]=t;
	                }
	            }
	        }
	    
	        //print
	        System.out.println("The sorted names are: ");
	        for(i=0;i<length;i++)
	        {
	            System.out.println(s[i].getName()+": "+s[i].getScore());
	        }
	    }
	}




