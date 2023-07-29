package com.github.valdemirogomes.banco.entity;

public class InvestmentAccount extends Account {
    public InvestmentAccount(Person person, int agency, int number, double balance) {
        super(person, agency, number, balance);
    }

    public InvestmentAccount(){

    }

    public void creditIncome(double percentageInterest) {
        var incomeValue = getBalance() * percentageInterest / 100;
        depositary(incomeValue);
    }

}
