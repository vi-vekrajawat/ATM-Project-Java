import java.util.Scanner;
class Atmcard{
    Scanner sc = new Scanner(System.in);
    int pin = 123,currentBalance = 1000000,diposit,withdrawl,diposit1,withdrawl1;
    void detail(){
        System.out.println();
        System.out.println("What Do You Want\n1. Change Pin\n2. Diposit Money\n3. Withdrawl Money\n4. Account Balance");
    }
    void getchoice(){
        detail();
        System.out.println();
        System.out.print("Enter......");
        int choice  = sc.nextInt();
        if(choice==1){
            while(true){
            System.out.println("1. Change Pin");
            System.out.print("New Pin......");
            int pin1 = sc.nextInt();
            System.out.print("Confirm.....");
            int pin2 = sc.nextInt();
            if(pin1 == pin2){
                if(pin1 == pin && pin2 == pin){
                    System.out.println();
                    System.out.println("Already Used !");
                }
                else{
                    pin = pin2;
                    System.out.println();
                System.out.println("Successfully ! Changed");
                break;
                }
            }
            else{
                System.out.println();
                System.out.println("You Are Not Sure !");
                System.out.println();
            }
        }
    }
        else if(choice == 2){
            System.out.println("How Much Many Want To Diposited");
            diposit = sc.nextInt();
            currentBalance+=diposit;
            diposit1+=diposit;
            System.out.println();
            System.out.println("Successfully ! Diposited");
            System.out.println();
        }
        else if(choice == 3){
            System.out.println("How Much Money You Want To Withdrawl");
            withdrawl = sc.nextInt();
            if(currentBalance>=withdrawl){
                currentBalance-=withdrawl;
                withdrawl1+=withdrawl;
                System.out.println();
                System.out.println("Successfully ! Withdrawled");
            }
            else{
                System.out.println();
                System.out.println("Insufficient Money In Your Account");
                System.out.println();
            }
        }
        else if (choice == 4){
            System.out.println();
            System.out.println("Your Total Account Balance = "+currentBalance);
            System.out.println("Total Diposited Money = "+diposit1);
            System.out.println("Total Withdrwaled Money = "+withdrawl1);
            System.out.println();
        }
        while (true) {
            System.out.println();
            System.out.println("Do You Want To\n1. Continue\n2. Exit( enter any number instead of 1 )");
            int uchoice = sc.nextInt();
            if(uchoice==1){
                pin();
            }
            else{
                break;
            }
            break;           
        }        
    }
    
    void pin(){
        int count =3;
        while(count>=1){
            System.out.println();
            System.out.print("Enter Pin....");
            int pin3 = sc.nextInt();
            if(pin == pin3){
                getchoice();
                break;
            }
            else{
                System.out.println("Incorrect Pin");
                System.out.println();
            }
            count--;
        }      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome In My ATM");
        Atmcard ac = new Atmcard();
        System.out.println();
        ac.pin();
        // System.out.println("You Are Not User !");
        //    System.out.println("You Are A Stranger! Chal Bhaag");
    }
}