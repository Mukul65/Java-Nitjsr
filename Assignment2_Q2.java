import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter Centre co-ordinates: ");
		Scanner as2 = new Scanner(System.in);
		
		int c1 =as2.nextInt();
		int c2 =as2.nextInt();
		
		
		System.out.println("Enter the Radius: ");
        int rad=as2.nextInt();
        
        System.out.println("Enter the co-ordinates of the points : ");
        int x =as2.nextInt();
		int y =as2.nextInt();
	
	    int t=((x-c1)*(x-c1)+(y-c2)*(y-c2));
	    if(t==(rad*rad))
	    
	    System.out.println("Point is ont the circle ");
	    else if(t<(rad*rad))
	    System.out.println("Point inside Circle ");
	    else
	    System.out.println("Point is outside Circle ");
	    
	}

}
