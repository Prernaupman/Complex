import java.util.Scanner;
public class ComplexCal {
	public static void main (String args[]) {
		double n1,n2,ex;
		int option;
		do {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter your choice from the following menu:");
			 System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
			 option = sc.nextInt();
			 if(option!=5){
			 System.out.println("Enter the first number");
			 n1=sc.nextDouble();
			 System.out.println("Enter the second number");
			 n2=sc.nextDouble();
			 }
			 else
			 break;
			 switch(option)
			 {
			 case 1:System.out.println("Addition of "+n1+" and "+n2+" is "+(n1+n2));
			 break;
			 case 2:System.out.println("Subtraction of "+n1+" and "+n2+" is "+(n1-n2));
			 break;
			 case 3:System.out.println("Multiplication of "+n1+" and "+n2+" is "+(n1*n2));
			 break;
			 case 4: if(n2==0)
			 System.out.println("Error!!! In Division denominator cannot be 0!");
			 else{
			 System.out.println("In division of "+n1+" by "+n2+" quotient is "+(n1/n2)+" and remainder is "+(n1%n2));} 
			 break;
			 case 5: break;
			 default: System.out.println("Invalid choice");
			 }
			 System.out.println("Do you want to continue?1.Yes 2.No");
			 ex=sc.nextDouble();
			 }while(ex==1);
		}
	}
	


