package com.github.valdemirogomes.banco.app;

import com.github.valdemirogomes.banco.entity.Account;
import com.github.valdemirogomes.banco.entity.InvestmentAccount;
import com.github.valdemirogomes.banco.entity.Person;

public class Application {
    public static void main(String[] args) {
        InvestmentAccount c1 = new InvestmentAccount();
        Person p1 = new Person();
        p1.setName("Zé");
        p1.setDocument("98076556789");
        c1.setPerson(p1);
        c1.depositary(15_000);
        c1.remove(1_000,0);
        c1.creditIncome(0.8);
        System.out.println(c1.getPerson().getName());
        System.out.println(c1.getBalance());

    }
}
