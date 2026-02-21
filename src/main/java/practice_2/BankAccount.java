package practice_2;

public class BankAccount {
    String owner;
    float balance;
    BankAccount(String owner, float balance){
        this.owner = owner;
        this.balance = balance;
    }
    String getOwner(){
        return this.owner;
    }
    float getBalance(){
        return this.balance;
    }
    void setOwner(String newOwner){
        this.owner = newOwner;
    }
      float deposit(float amount){
        this.balance = this.balance + amount;
        return getBalance();
    }
    float withdraw(float amount){
        this.balance = this.balance - amount;
        return getBalance() ;
    }
    void printBalance(){
        System.out.println("Баланс равен: " + getBalance());
    }
}
