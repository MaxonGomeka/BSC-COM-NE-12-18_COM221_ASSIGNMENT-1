import java.util.*;
import java.io.IOException;
//This class is a subclass for BankAccount1
class ExecutiveBankAccount extends BankAccount1{
	     private  double balance;
	     private  int accountNumber;
	     private  String nationalID; 
       private double balance1;
       private String name;
       private String branchName;
    	 Scanner input = new Scanner(System.in);
   // Creating n0-argument constructor

	ExecutiveBankAccount(){}
  //constructor with arguments
	ExecutiveBankAccount(String  name, String branchName,int accountNumber, String nationalID, double balance,double balance1){
                   super(name, branchName);
                   this.balance = balance;   
                   this. nationalID = nationalID; 
                   this.balance1 = balance1;
	}
	
     //Method for creating an account
     public void openAccount(){
           System.out.println(" ");
       	   System.out.println("\t\tCreating a new Executive Bank Account");
           System.out.println("\t_________________________________________________________________________ ");
           //Generating Account number 
           String accN="";
           //Loop 5 times
           for (int i=0;i<5;i++) {
           accN+= 1+(int)(Math.random()*9)+"";
       }
           accountNumber=Integer.parseInt(accN);
           System.out.println(" ");
           System.out.print("\tAccount Number is : "+accountNumber);
           System.out.println(" ");
           System.out.print("\tEnter name:");
           name = input.nextLine();
           System.out.print("\tNational ID:");
           nationalID=input.nextLine();
           System.out.print("\tEnter Branch name:");
           branchName = input.nextLine(); 
           System.out.print("\tEnter a book balance of MWK20000:");
           balance =input.nextLong();
           //enables the user to open an account if and only if he/she has entered a book balance of MWK20000.
           if(balance==20000){
           System.out.println("\t\tAccount successfully created.");
           System.out.println("\t_________________________________________________________________________ ");
           System.out.println(" ");
           next();
         }
         //when balance is greater than mwk20000 the customer must be denied to create an a account.
           if(balance>20000){
            System.out.println(" ");
            System.out.println("\tBook balance should be equal to MWK20000......please try again ");
         }
         //denies the user to open account if the book balance is below MWK20000
           if (balance <20000){
           System.out.println(" "); System.out.println(" ");
           System.out.println("\tExecutive account must have a book balance of MWK20000......so please try again ");
           next();
            }
        

        }
        //Method for showing account details for a Executive
   public void showAccount(){
    	     System.out.println("\tAccount Number\tAccount Name\tType\tBranch\t\tBalance\tNational ID\t\tDate");
           System.out.println("\t---------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\t"+accountNumber+"\t\t"+this.name+    "\t\tsavings\t"+this.branchName+"\tMWK"+balance+"\t  "+nationalID+"\t\t"+getDateCreated());
           System.out.println(" ");
           
    }
    //Search method for any account Number
    boolean search(int acn) {
        if (accountNumber==acn) {
            showAccount();
            return (true);
        } 
        return (false);
        
    }
     //Method for depositing money
    public void deposit(){
           System.out.print("\tEnter the amount you to deposit...MWK");
           double amount = input.nextLong();
           balance = balance+amount;
           System.out.println("\tHello "+name+ ".....your new balance is MWK"+balance);
           System.out.println(" ");
           next();       
    }
    //Method is used by the user to withdraw the money
    public void withdraw(){   
           System.out.print("\tEnter the amount you want to withdraw.....MWK");
           double amount1 = input.nextLong();
           //allows the user to withdraw the whole amount in the account.
           if(amount1>0 && amount1<=balance){
              balance= balance-amount1;
                System.out.println("\tHello "+name+ "......your new balance is MWK"+balance);
           } 
          //If amount1 is greater than balance then apply for overdraft   
          if(amount1 > balance ){
             System.out.println("\tThere is insufficient fund in your Account Number."); 
             System.out.println(" ");
             System.out.println("\tWould you like to apply for an ovedraft?"); 
             System.out.println(" ");
             System.out.println("\t1:Yes");
             System.out.println("\t2.Back to Menu");
             System.out.print("\tEnter your Choice:");
             int choice = input.nextInt(); 
             if(choice==1){
                   //If balance1 is less or equal than to 50000  , apply for overdraft
                   if((balance1 = balance - amount1)<=-55000){
                    System.out.println(" "); 
                    System.out.println("\tYou have exceeded your Overdraft Limit, you will now be returned back to the menus"); 
                     return; 
                     } 
                     //if not exceeding bank balance
                    else{ 
                    balance -= amount1;
                    System.out.println("\tYou have withdrawen MWK"+ amount1); 
                    System.err.println("\t Hello "+name+ "....You now have a balance of MWK" +balance);
                    return;
                 }
                
             }
             //back to menus if the user does not want to use overdraft
            else if(choice==2){
              next();
            }

            }

         next();
            
    }
     //Method for checking the balance
    public void bbalance(){
           System.out.println("\tHello "+name+ ".....Your current balance is MWK"+balance);
            System.out.println(" ");
            next();
         }
    //Method use to continue once we have done with any action.
    public static void next(){
    System.out.print ("\tPress Any Key To Continue: <Enter>");
    try{
      int read = System.in.read(new byte[2]);
    }
    catch (IOException e){
      e.printStackTrace();
    }
   }      	 



}