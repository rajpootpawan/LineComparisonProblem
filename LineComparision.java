import java.util.*;
class LineComparision
{
	public static void main(String []args)
        {
                //Master Added code for Welcome line..
                System.out.println("Welcome to Line Computation Program on Master Branch");
 		//User1 added code for Calculate the Length
                System.out.println("Enter the Four co-ordinate (x1,y1) and (x2,y2)");
                Scanner sx=new Scanner(System.in);
                double x1=sx.nextDouble();
                double y1=sx.nextDouble();
                double x2=sx.nextDouble();
                double y2=sx.nextDouble();

                double length1=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
                System.out.println("The length of line is "+length1);
		String  l1=String.valueOf(length1);
                //User2 Added the code for Check Equality of two length.
                System.out.println("Enter the four co-ordinate for calculate length of another Line (x3,y3) and (x4,y4)");
                double x3=sx.nextDouble();
                double y3=sx.nextDouble();
                double x4=sx.nextDouble();
                double y4=sx.nextDouble();

                double length2=Math.sqrt(((x3-x4)*(x3-x4))+((y3-y4)*(y3-y4)));
                String l2=String.valueOf(length2);
                if(l1.equals(l2))
                {
                        System.out.println("Lengths are equal");
                }
                else
                {
                        System.out.println("Lengths are not equals");

                }



	}

}
