import java.util.Scanner;
public class atminterfac{
   public static void main(String args[]){
         int balance=100000,withdraw,deposit;

         Scanner s=new Scanner(System.in);
         while(true){
             System.out.println("Welcome");
             System.out.println("Automated Machine");
              System.out.println("Choose 1 for withdraw");
               System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Balance");
                 System.out.println("Choose 4 for Histroy");
                  System.out.println("Choose 5 for Transfer");
                   System.out.println("Choose 6 for EXIT");
                    System.out.println("Choose the operation to perform: ");
                    int choice=s.nextInt();
                    switch(choice){
                        case 1: System.out.println("Enter money to be withdraw:");
                        withdraw=s.nextInt();
                        if(balance>=withdraw){
                            balance=balance-withdraw;
                             System.out.println("Collect your money.");

                        }
                        else{
                             System.out.println("insufficient Balance.");

                        }
                         System.out.println("");
                         break;
                         case 2: System.out.println("Enter money to be Deposited");
                         deposit=s.nextInt();
                         balance=balance+deposit;
                         System.out.println("Your money has been successfully deposited :");
                         System.out.println("");
                         break;
                         case 3:System.out.println("Balance:"+balance);
                         System.out.println("");
                         break;
                         case 4:System.out.println("Previous transaction.");
                         System.out.println("");
                         break;
                         case 5:System.out.println("Transfer: ");
                         System.out.println("");
                         break;
                         case 6:
                         System.exit(0);
                    
              }
         }
   } 
}
