import java.util.Scanner;
class Add
{
   public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int x,y,z;
  System.out.println("Enter the two numbers:");
  x=sc.nextInt();
  y=sc.nextInt();
  z=x+y;
  System.out.println("The sum of "+x+" and "+y+" is "+z);
}
}