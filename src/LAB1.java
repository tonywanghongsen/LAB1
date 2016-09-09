import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years you plan to work");
		double numYearsWorking = input.nextDouble();
		
		double CurrAnnualReturn;
		do{
			System.out.println("Enter the current rate of annual return which should be 0 to 20");
			CurrAnnualReturn = input.nextDouble();
		}while (CurrAnnualReturn <= 0||CurrAnnualReturn > 20);
		
		System.out.println("Enter the number of years after retirement");
		double numYearsAfterRetirement = input.nextDouble();
		
		double FutAnnualReturn;
		do{
			System.out.println("Enter the future rate of annual return which should be 0 to 3");
			FutAnnualReturn = input.nextDouble();
		}while (FutAnnualReturn <= 0||FutAnnualReturn > 3);
		
		System.out.println("Enter your required income");
		double ReqIncome = input.nextDouble();
		
		System.out.println("Enter your monthly Social Security Reimbursement");
		double SSIPay = input.nextDouble();
		double PV = (ReqIncome - SSIPay)*(1-1/(Math.pow(1+FutAnnualReturn/1200, numYearsAfterRetirement*12)))/(FutAnnualReturn/1200);
	
		double Monthlypayment=(PV*(CurrAnnualReturn/1200))/((Math.pow(1+(CurrAnnualReturn/1200), numYearsWorking*12))-1);
		System.out.printf("This is the total money you will needed to save:$% .2f \n", PV);
		System.out.printf("This is the money you will needed to save each month:$% .2f \n", Monthlypayment);
	}
	
}
