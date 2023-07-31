package com.github.valdemirogomes.banco.app;

import com.github.valdemirogomes.banco.entity.Account;
import com.github.valdemirogomes.banco.entity.InvestmentAccount;
import com.github.valdemirogomes.banco.entity.Person;
import com.github.valdemirogomes.banco.entity.SpecialAccount;

public class Application {
    public static void main(String[] args) {
        SpecialAccount c1 = new SpecialAccount();
        Person p1 = new Person();
        p1.setName("Zé");
        p1.setDocument("98076556789");
        c1.setPerson(p1);
        c1.depositary(15_000);
        c1.setLimitValue(1000);
        c1.remove(16_000,0);
        //c1.creditIncome(0.8);
        System.out.println(c1.getPerson().getName());
        System.out.println(c1.getBalance());

    }
}
