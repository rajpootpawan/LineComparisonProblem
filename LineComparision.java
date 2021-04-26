import java.util.*;
class LineComparision
{
	public static void main(String []args)
        {
                //Master Added code for Welcome line..
                System.out.println("Welcome to Line Computation Program on Master Branch");
 		//User1 added code for Calculate the Length
                System.out.println("Enter the Four co-ordinate (x1,y1) and (x2,y2");
                Scanner sx=new Scanner(System.in);
                double x1=sx.nextDouble();
                double y1=sx.nextDouble();
                double x2=sx.nextDouble();
                double y2=sx.nextDouble();

                double length1=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
                System.out.println("The length of line is "+length1);


	}

}
