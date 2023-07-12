public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance = 0;

    public BankAccount(String firstName, String lastName, String dateOfBirth,String accountNumber, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth =dateOfBirth;
        this.accountNumber= accountNumber;
        this.balance = balance;
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
    public void interest(){
        this.balance = this.balance*1.03;
    }



}
