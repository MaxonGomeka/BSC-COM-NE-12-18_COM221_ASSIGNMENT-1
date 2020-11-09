
import java.util.*;
import java.io.IOException;
//This class is a subclass for BankAccount 1
class StudentBankAccount extends BankAccount1{
	     private double balance;
	     private   int accountNumber;
	     private  String studentRegNumber; 
       private String name;
       private String branchName;
    	 Scanner input = new Scanner(System.in);
       
       // Creating two different constructors
	     StudentBankAccount(){}
       StudentBankAccount(String  name, String branchName,int accountNumber, String studentRegNumber, double balance){
                 super(name, branchName);
                   this.balance = balance;   
                   this.studentRegNumber = studentRegNumber;
                   
                  
  }
    
      //Method for creating an account
       public void openAccount(){
       System.out.println(" ");
       System.out.println("\t\t\tCreating a new student Bank Account");
       System.out.println("\t_________________________________________________________________________ ");
       //generating account number
       String acc="";
       
       for (int i=0;i<5;i++) {
            acc+= 1+(int)(Math.random()*9)+"";
       }
        accountNumber=Integer.parseInt(acc);

       System.out.print("\tAccount Number is : "+accountNumber);
       System.out.println(" ");
       System.out.print("\tEnter name:");
       name = input.nextLine();
       System.out.print("\tYour reg#:");
       studentRegNumber =input.nextLine();
       System.out.print("\tEnter Branch name:");
       branchName = input.nextLine();
       System.out.print("\tEnter k200 balance for Student Acc.  ");
       balance =input.nextLong();  
       if(balance==200){
           System.out.println("\t\tAccount successfully created.");
           System.out.println("\t_________________________________________________________________________ ");
           System.out.println(" ");
           next();
         }
        //when balance is greater than mwk200 the customer must be denied to create an a account.
       if(balance>200){
            System.out.println(" ");
            System.out.println("\tBook balance should be equal to MWK200......please try again ");
         }
       //the if statement will display a message to user if he/she has entered a book balance of less than MWK200
       if (balance <200){
       System.out.println(" ");
       System.out.println("\tBook balance should be equal to MWK200......please try again");
        }
       
      }
      //Method for showing account details for a Student
       public void showAccount(){
          
         System.out.println("\tAccount Number\tAccount Name\t\tType\tBranch\t\tBalance\tStudent Number\t\tDate");
         System.out.println("\t--------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("\t"+accountNumber+"\t\t\t"+name+"\tsavings\t"+branchName+"\t\tMWK"+balance+"\t"+studentRegNumber+"\t\t"+getDateCreated());
         System.out.println(" ");
        
    }
      boolean search(int acn) {
        if (accountNumber==acn) {
            showAccount();
            return (true);
        }  
        return (false);
       

    }

     //Method for depositing money
     public void deposit(){
        System.out.print("\tEnter the amount you want to deposit......!");
        double amount = input.nextLong();
        balance = balance+amount;
        System.out.println("\tHello "+name+".....your new balance is MWK"+balance);
       
        System.out.println(" ");
         next();         
    }
      //Method is used by the user to withdraw the money
      public void withdraw(){
        System.out.print("\tEnter the amount you want to withdraw......!");
        double amount1 = input.nextLong();
        //the user will withdraw the money but the book balance will remain intack.
            if(amount1>200 && amount1<=(balance-200)){
               balance= balance-amount1;
                System.out.println("\tHello "+name+"....your new balance is MWK"+balance);
              } 
                else{
                System.out.println("\tYou can not withdraw together with book balance K200.... please try again....");
           }
                next();
    }
    //Method for checking the balance
    public void bbalance(){
          System.out.println("\tHello "+name+"....Your current balance is MWK"+balance);
          System.out.println(" ");
          next();
    }
    //Method use to continue once we have done with any action.
   public static void next(){
    System.out.print ("\t\t Press Any Key To Continue: <Enter>");
    try{
      int read = System.in.read(new byte[2]);
    }
    catch (IOException e){
      e.printStackTrace();
    }
   }
  
}