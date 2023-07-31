package com.github.valdemirogomes.banco.entity;

public class SpecialAccount extends Account{
    //valor do cheque especial
    private double limitValue;

    public SpecialAccount(){

    }
    public SpecialAccount(Person person, int agency, int number, double balance, double limitValue) {
        // chamando o construtor da classe Account
        super(person, agency, number, balance);
        this.limitValue = limitValue;

    }

    public double getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(double limitValue) {
        this.limitValue = limitValue;
    }

    @Override
    public Double getBalanceAvailable() {
        return getBalance() + getLimitValue();
    }
}
