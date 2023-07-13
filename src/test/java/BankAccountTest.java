import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {


    @Test
    public void canReturnFirstName(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000 , "savings");

        String result= bankAccount.getFirstName();

        String expected = "John";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canReturnLastName(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        String result= bankAccount.getLastName();

        String expected = "Smith";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canReturnDateOfBirth() {

        BankAccount bankAccount = new BankAccount("John", "Smith", "11/08/1991", "12345678", 3000,"savings");

        String result = bankAccount.getDateOfBirth();

        String expected = "11/08/1991";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canReturnAccountNumber(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        String result= bankAccount.getAccountNumber();

        String expected = "12345678";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canReturnBalance(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        double result= bankAccount.getBalance();

        double expected = 3000;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetFirstName(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        bankAccount.setFirstName("John");
        String result= bankAccount.getFirstName();

        String expected = "John";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetLastName(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        bankAccount.setFirstName("Smith");
        String result= bankAccount.getLastName();

        String expected = "Smith";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetDateOfBirth(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        bankAccount.setDateOfBirth("11/08/1991");
        String result= bankAccount.getDateOfBirth();

        String expected = "11/08/1991";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetAccountNumber(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000, "savings");

        bankAccount.setDateOfBirth("12345678");
        String result= bankAccount.getAccountNumber();

        String expected = "12345678";

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetBalance(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        bankAccount.setBalance(3000);
        double result= bankAccount.getBalance();

        double expected = 3000;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canDeposit(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000, "savings");

        bankAccount.deposit(500);
        double result= bankAccount.getBalance();

        double expected = 3500;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canWithdraw(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000, "savings");

        bankAccount.withdrawal(800);
        double result= bankAccount.getBalance();

        double expected = 2200;

        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canAddInterest(){

        BankAccount bankAccount = new BankAccount("John","Smith", "11/08/1991","12345678",3000,"savings");

        bankAccount.payInterest();
        double result= bankAccount.getBalance();

        double expected = 3150;

        assertThat(result).isEqualTo(expected);
    }
}
