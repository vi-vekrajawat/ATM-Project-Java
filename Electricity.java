import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
class Bill{
	void bill(String name1 , String add,long mob,float cr1,String ft1,int rd1,float day1,float finalAmount) {
		
	    System.out.println("----------------------------------------------------------------------------------------------------------");
	    System.out.println("                  Madhya Pradesh Pachsim Kshtera Vidyut Vitran Company Ltd.                       ");
	    System.out.println("                         G.P.H Compound,Pologround,Indore(M.P)                       ");
	    System.out.println("                            (Wholly owned by Govt. of M.P)                      ");
	    System.out.println("GST No.--------                CIN No.   ------              Call centre No.   -----         https://www.mpwz.co.in");
	    System.out.println("---------------------------------------------------------------------------------------------------------");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	    System.out.println("Consumer No. N"+rd1);
	    System.out.println("Domestic ");
	    System.out.println("Mr./Ms. "+name1);
	    System.out.println(add);
	    System.out.println("Mobile No."+mob);
	    System.out.println("Customer Care Details          ");
	    System.out.println("Call center No. 1912            ");
	    System.out.println("A.E.: Mangilal (7312570808)     ");
	    System.out.println("A.E.: Changilal (7312556834)    ");
	    System.out.println("--------------------------------------------------------------------------------------------------------");
	    System.out.println();
	    System.out.println("reading Detail");
	    System.out.println("Current Reading "+cr1);
	    System.out.println("current Reading date "+ft1);
	    System.out.println("M.F."+1);
	    System.out.println("Metered Unit Consumption "+1);
	    System.out.println("Assessed Units "+0.00);
	    System.out.println("Final Consumption "+(cr1-1));
	    System.out.println("Average Unit Per Day  "+(String.format("%.2f", day1)));
	    System.out.println("-----------------------------------------------------------------------------------------------------------");
	    System.out.println();
	    System.out.println("Billings Details                                             Amount in INR   ");
	    System.out.println("Energy Charges                                  ");
	    System.out.println("Fuel and power purchase adjustment surcharge      ");
	    System.out.println("Fixed Charge                                     ");
	    System.out.println("Electricity Duty                                  ");
	    System.out.println("Addition SD Installment                          ");
	    System.out.println("Other Charges                                    ");
	    System.out.println("Current Bill Month Amount                                      "+(String.format("%.2f", finalAmount)));
	    System.out.println("M.P.Govt. Subsidy Amount                         ");
	    System.out.println("Interest On Security Deposit(-)                  ");
	    System.out.println("CCB Adjustment                                    ");
	    System.out.println("Lock Credit /Employee Rebate(-)                   ");
	    System.out.println("Previous Month Delayed Payment surcharged         ");
	    System.out.println("Online /Advance Payment Incentive(-)              ");
	    System.out.println("Current Bill Month Amount                         ");
	    System.out.println("Amount Recived against Bill                       ");
	    System.out.println("Smart Meter Rc/Dc Amount Recieved                 ");
	    System.out.println("Total Amount Payable                               ");
	    System.out.println("Vigilance/O&M Due Amount                             ");
	    System.out.println("Interest on Vigilance /O&M Due                     ");
	    System.out.println("--------------------------------------------------------------------------------------------------");
	    System.out.println("Save Energy For Better Tomorrow                    ");

	}
}
public class Electricity {
    	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000000000;
		int max = 2000000000;

		Random rd1 = new Random();
		int rd = rd1.nextInt(max-min+1)+min;
		System.out.print("Enter Consumer Name :");
		String name = sc.nextLine();
		System.out.print("Enter Address :");
		String add = sc.nextLine();
		System.out.println("Mobile Number :");
		long num = sc.nextLong();
		System.out.println("Enter Current Reading");
		float cr = sc.nextFloat();
		SimpleDateFormat ft = new SimpleDateFormat(" dd-MM-yyy");
		String str = ft.format(new Date());
		float finalAmount=0.0f ;
		float day = (cr)/30;
		if(cr<=50 && cr>=0) {
			finalAmount = cr*(4.85f);
		}
		else if(cr<=100 && cr>=51) {
			finalAmount = cr*(6.10f);
		}
		else if(cr<=300 && cr>=101) {
			finalAmount = cr*(6.75f);
		}
		else if(cr>300) {
			finalAmount = cr*(7.60f);
		}
		
		
		
		Bill b= new Bill();
		
		b.bill(name,add,num,cr ,str,rd,day,finalAmount);
	
	}
	

}
