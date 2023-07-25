public class Account {
    Person person;
    int agency;
    int number;
    double balance;

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
