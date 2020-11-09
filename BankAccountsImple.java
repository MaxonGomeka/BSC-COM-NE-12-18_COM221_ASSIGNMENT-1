import java.util.Scanner;
//Implementing a Bank Management System 
public class BankAccountsImple{
   public static void main(String[] args) {
      //scanner's object
   	 Scanner input = new Scanner(System.in);
           System.out.println(" ");
   	    //Welcoming remarks
        System.out.println("\t_________________________________________________________________________ ");   
        System.out.println(" ");
   	    System.out.println("\t\t WELCOME TO BANK MANAGEMENT SYSTEM");
        System.out.println("\t_________________________________________________________________________ ");
        System.out.println(" ");
        //prompt the user to enter the number of customers he/she wants to input.
   	    System.out.print("\tHow many Customers do you want to input?  ");
   	  	int d = input.nextInt();
        //Student Bank Account's object
   	  	StudentBankAccount  [] account = new StudentBankAccount[d];
        //Executive's object
   	  	ExecutiveBankAccount[] account1= new 	ExecutiveBankAccount[d];
        BankAccount1 [] account2 = new BankAccount1[d];
              
   	        
        //Do While loop to loop 5 times
          int choice;
          do{
            //Bank Main Menu
             System.out.println(" ");
             System.out.println("\t\t\t SELECT OPERATION BELOW");
             System.out.println("\t_________________________________________________________________________ ");
             System.out.println(" ");
             System.out.println("\tMain Menu ");
             System.out.println("\t1.List All Accounts And Their Balances");
             System.out.println("\t2.Create A New Account");
             System.out.println("\t3.Deposit Money Into An Account");
             System.out.println("\t4.Withdraw Money From An Account");
             System.out.println("\t5.Check Account Balance");
             System.out.println("\t6.Search By Account. ");
             System.out.println("\t7.Exit");
             System.out.println(" ");

             System.out.print("\tEnter your choice: ");

             choice=input.nextInt();
          
             switch(choice){
                    //Checking account details
       	       case 1:
                        System.out.println("\t\t\tSELECT ACCOUNT DETAILS YOU WANT TO LIST");
                        System.out.println("\t_______________________________________________________________________________________________________________________________ ");
                        System.out.println(" ");
                        System.out.println("\t1.List all Students accounts & Their balances");
                        System.out.println("\t2.List all Executive accounts & Their balances ");
                        System.out.println(" ");
                        System.out.print("\tEnter your choice: ");
                        int ch1 = input.nextInt();
                        //Prompt the user to list account details for student account number 
                         if(ch1==1){
                             for (int i =0; i<account.length; i++ ){
                                  account[i].showAccount();
                                 }
                           }
                           // Listing account details for executive account number
                        else if(ch1==2){
                         
                             for (int i =0; i<account1.length; i++ ){
                                  account1[i].showAccount();
                                }
                         }
       	                break;

                    //Creating a bank account,both student and executive separately
       	       case 2:
           	          	System.out.println("\t\t\tSELECT THE BANK TYPE. ");
                        System.out.println("\t_________________________________________________________________________ ");
                        System.out.println(" ");
           	           	System.out.println("\t1. Student ");
           	          	System.out.println("\t2. Executive ");
                        System.out.println(" ");
                        System.out.print("\tEnter your choice: ");
                        int ch = input.nextInt();
                       //Allows the user to open the student account for the customer
                  	    
                  	   	if(ch==1){
                             for (int i =0; i<account.length; i++ ){
                               account[i]=new StudentBankAccount();
                               account[i].openAccount();
                             }
                           
                    }  //Allows the user to open the executive account for the customer
       	    		        else if(ch==2){
                          for (int i =0; i<account1.length; i++ ){
                             account1[i] = new ExecutiveBankAccount();
                             account1[i].openAccount();
                          }
                          
                           }  
                  	    else {
                           System.out.print("\tPlease try again");
                     }
                    
                       break;

                     //Depositing money to bank accounts
               case 3:
                        System.out.println("\t\t\tSELECT YOUR ACCOUNT TYPE TO DEPOSIT.");
                        System.out.println("\t_________________________________________________________________________ ");
                        System.out.println(" ");
                        System.out.println("\t1.Student Account ");
                        System.out.println("\t2.Executive Account ");
                        System.out.print("\tEnter your choice: ");
                        int type = input.nextInt();
                        if(type==1){
                            System.out.print("\tEnter Account Your Number : ");
                            int acn = input.nextInt();
                            Boolean found = false;
                            //allows th user to deposit money to student account number 
                             for (int i =0;i<account.length;i++ ){
                             found = account[i].search(acn);
                                if (found) {
                                account[i].deposit();
                                break;
                              }
     
                           }
                                if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                        }
                        break;
                         
                          }
                             //allows the user to deposit money to executive account number    
                        else if(type==2){
                            System.out.print("\tEnter Account Your Number : ");
                            int acn = input.nextInt();
                            Boolean found = false;

                              for (int i =0;i<account1.length;i++ ){
                                found = account1[i].search(acn);
                                if (found) {
                               
                                account1[i].deposit();
                                break;
                            }
                        
                          }
                                if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                        }
                        break;
                         
                      } 
                        
                        break;
                        //Withdraw money from user's account
           case 4: 
                        System.out.println("\t\t\tSELECT YOUR ACCOUNT TYPE TO WITHDRAW.");
                        System.out.println("\t_________________________________________________________________________ ");
                        System.out.println(" ");
                        System.out.println("\t1.Student Account ");
                        System.out.println("\t2.Executive Account ");
                        System.out.print("\tEnter your choice: ");
                        int type1 = input.nextInt();
                        //allows the user ro withdraw money from student account
                          if(type1==1){
                            System.out.print("\tEnter Account Your Number : ");
                            int acn = input.nextInt();
                            Boolean found = false;
                            for (int i=0;i<account.length;i++){
                               found = account[i].search(acn);
                                if (found) {
                                account[i].withdraw();
                                break;
                            }   
                         }      if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                      }
                        break;
                           
                   }  //withdrawing money from exetive account
                          else if(type1==2){
                            System.out.print("\tEnter Account Your Number : ");
                            int acn = input.nextInt();
                            Boolean found = false; 
                             for (int i=0;i<account1.length;i++){
                               found = account1[i].search(acn);
                                  if (found) {
                                account1[i].withdraw();
                                break;
                            }
                                
                             }  if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                      }
                        break;
             }  break;   
                        //Checking the balances in different acounts created
           case 5: 
                        System.out.println("\t\t\tSELECT YOUR ACCOUNT TYPE TO CHECK BALANCE.");
                        System.out.println("\t_________________________________________________________________________ ");
                        System.out.println(" ");
                        System.out.println("\t1.Student Account Balance.");
                        System.out.println("\t2.Executive Account Balance.");
                        System.out.print("\tEnter your choice: ");
                        int choice1 = input.nextInt();
                        //printing balance for student account
                        if(choice1==1){
                            System.out.print("\tEnter Account Your Number : ");
                            int acn = input.nextInt();
                            Boolean found = false;
                          for (int i=0;i<account.length;i++){
                              found = account[i].search(acn);
                                if (found) {
                               account[i].bbalance();
                                break;
                              }
                            }
                               if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                           } break;
                          }
                          //printing balance for executive account number
                        else if(choice1==2){
                           System.out.print("\tEnter Account Your Number : ");
                           int acn = input.nextInt();
                           Boolean found = false;

                          for (int i=0;i<account1.length;i++) {
                             found = account1[i].search(acn);
                             if (found) {
                               account1[i].bbalance();
                                break;
                              }
                            
                          } if (!found) {
                                System.out.println("\tSearch Failed..Account Not Exist..");
                           } break; 

                        }
                       
                       break; 
                       //It allows the user to search the account number for the customer in the system
           case 6:     System.out.println("\t\t\tTYPE OF ACCOUNT YOU WANT TO SEARCH ");
                       System.out.println("\t_________________________________________________________________________ ");
                       System.out.println(" ");
                       System.out.println("\t1.Student Account ");
                       System.out.println("\t2.Executive Account");
                       System.out.print("\tnter your choice: ");
                       int choice4=input.nextInt();
                       //Searching student account number
                       if(choice4==1){
                        System.out.print("\tEnter Account No U Want to Search...: ");
                        int acn = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < account.length; i++) {
                            found = account[i].search(acn);

                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("\tSearch Failed..Account Not Exist..");
                            } break;           
                         }
                         //Searching executive account number
       	              else if(choice4==2){
                        System.out.print("\tEnter Account No U Want to Search...: ");
                        int acn = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < account1.length; i++) {
                            found = account1[i].search(acn);

                            if (found) {
                                break;
                            }
                        }
                            if (!found) {
                            System.out.println("\tSearch Failed..Account Not Exist..");
                        } break;                       
                    }break;
                    // This case allows the user to exit from banking system
         case 7:     System.out.println(" ");
                     System.out.print("\tThank you for Banking with us!");
                     System.out.println(" ");
                     break;     
       }
          }
          while(choice!=7);choice++;	
}
       
}
            
   