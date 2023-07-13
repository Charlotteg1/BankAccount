public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance = 0;
    private String accountType;
//    private double overdraft;

    public BankAccount(String firstName, String lastName, String dateOfBirth,String accountNumber, double balance, String accountType){ //double overdraft
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth =dateOfBirth;
        this.accountNumber= accountNumber;
        this.balance = balance;
        this.accountType= accountType;
//        this.overdraft = overdraft;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){

        this.firstName= firstName;
    }
    public String getLastName(){

        return this.lastName;
    }
    public void setLastName(String lastName){

        this.lastName= lastName;
    }
    public String getDateOfBirth(){

        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){

        this.dateOfBirth= dateOfBirth;
    }
    public String getAccountNumber(){

        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber){

        this.accountNumber= accountNumber;
    }
    public double getBalance(){

        return this.balance;
    }
    public void setBalance(double balance){

        this.balance= balance;
    }
    public void deposit(double amount){
        this.balance=this.balance + amount;
    }
    public void withdrawal(double amount){
        this.balance =this.balance - amount;
    }
    public void payInterest(){
        if(this.accountType.equals("savings")) {
            this.balance = this.balance * 1.05;
        }
        if(this.accountType.equals("current")) {
            this.balance = this.balance * 1.03;
        }
    }


}
