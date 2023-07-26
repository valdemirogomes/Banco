import java.util.Objects;

public class Account {
    private Person person;
    private int agency;
    private int number;
    private double balance;
    Account(Person person, int agency, int number, double balance){
        Objects.requireNonNull(person);
    this.person = person;
    this.agency = agency;
    this.number = number;
    this.balance = balance;
}
    Account(){

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void depositary(double value){
        if (value<=0){
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        balance = balance+value;
    }
    void remove(double value){
        if (value<=0){
            throw new IllegalArgumentException("Cashout amount must be greater than 0");
        }
        if (balance-value<0){
            throw new IllegalStateException("Insufficient balance for withdrawal");
        }
        balance = balance-value;
    }

    void remove(double value, double rate){
        remove(value + rate);
    }



}
