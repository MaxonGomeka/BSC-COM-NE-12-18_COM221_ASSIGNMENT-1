import java.util.Date;
//The main class
class BankAccount1{
	public static String name;
	public static String branchName;
	private double balance = 0;
	public static Date dateCreated = new Date();
  
	//creating a constructors
    BankAccount1(){}
    BankAccount1(String name, String branchName){
        this.name= name;
        this.branchName = branchName;
       
    }
  //accessor and mutators method
   public  void setName(String name){
        this.name = name;
    }
   public String getName(){
        return this.name;
   }
    public  void setBranchName(String branchName){
         this.branchName = branchName;
    }
    public String getBranchName(){
       return this.branchName;
    }
    //date method
      public Date getDateCreated(){
    	return this.dateCreated;
    }
}