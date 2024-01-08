import java.util.Scanner;
public class AndersonPayDay { 
    

    public static double computeTaxRate1(double correctedGross, double tax1) {
                    double tax25 = correctedGross * tax1;
                    return tax25;
    }
    public static double computeTaxRate2(double correctedGross, double tax2) {
                    double tax15 = correctedGross * tax2;
                    return tax15;
    }
    public static double computeTaxRate3(double correctedGross, double tax3) {
                    double tax10 = correctedGross * tax3;
                    return tax10;
    }
    public static double computeTaxRate4(double correctedGross, double tax4) {
                    double tax5 = correctedGross * tax4;
                    return tax5;
    }
                   
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double numOfHours;
        double hourlyPayRate;
        char unionMember;
        double medicalHold;
        String name;
        double tax1 = 25.0 / 100;
        double tax2 = 15.0 / 100;
        double tax3 = 10.0 / 100;
        double tax4 = 5.0 / 100;
        
        System.out.println("***********************************************************");
        System.out.println("                   Payday V1.0                             ");
        System.out.println("***********************************************************");
        System.out.print("Enter name: ");
        name = scan.nextLine();
        System.out.print("Enter hours work: ");
        numOfHours = scan.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = scan.nextDouble();
        System.out.print("Are you a union member (y or n)? ");
        unionMember = scan.next().charAt(0);
        System.out.print("What percentage do you want to withold for your medical savings account? ");
        medicalHold = scan.nextDouble();
        double grossPay,unionDues,medicalAmt,correctedGross,tax=0,netPay,tax25,tax15,tax10,tax5;
        grossPay = numOfHours * hourlyPayRate;
        unionDues = grossPay * 0.05;
        medicalAmt = grossPay * (medicalHold / 100);
        correctedGross = grossPay - unionDues - medicalAmt;

        tax25 = computeTaxRate1(correctedGross,tax1);
        tax15 = computeTaxRate2(correctedGross, tax2);
        tax10 = computeTaxRate3(correctedGross, tax3);
        tax5 = computeTaxRate4(correctedGross, tax4);

         if (correctedGross > 2500) {
            tax = tax25;
          }else if (correctedGross > 1500 &&  correctedGross < 2500) 
            tax = tax15;
           else if (correctedGross > 500 && correctedGross < 1500) 
            tax = tax10;
           else if (correctedGross < 500) 
            tax = tax5;
           
            netPay = correctedGross - tax;

        System.out.println("-----------PAYCHECK-----------");
        System.out.printf("Grosspay\t $\t %.2f\n" , grossPay);
        System.out.printf("Union dues\t $\t %.2f\n" , unionDues);
        System.out.printf("Med Witholding\t $\t %.2f\n" , medicalAmt);
        System.out.printf("Taxes\t\t $\t %.2f\n" , tax);
        System.out.printf("Net Pay\t\t $\t %.2f\n" , netPay);
        System.out.println("------------------------------");
        System.out.println("Prepared for " + name);
        System.out.printf("\n");
        System.out.println("Thank you for using this program");
        System.out.printf("\n");
        
         
        


        

    
       
        








    }
}