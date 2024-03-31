import java.util.Scanner;
class conversion {
    public static void main(String[] args)
    {
        int ch;
        System.out.println("Welcome");
        System.out.println("*******");
        System.out.println("1.Inches to Cm");
        System.out.println("       or     ");
        System.out.println("2.Cm to Inches");
        System.out.println("--------------");
        System.out.println("Press any option");
        Scanner s =new Scanner(System.in);
        ch = s.nextInt();
         if(ch==1)
          {
             System.out.println("enter inch:");
             double inch=s.nextDouble();
             System.out.println("inch to cm:" +inch*2.54);
          }
          else 
          {
            System.out.println("enter cm:");
            double cm=s.nextDouble();
            System.out.println("cm to inches:" +cm/2.54);

          }

    }
}