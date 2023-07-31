package com.github.valdemirogomes.banco.entity;

public class AccountData {
    public void printAccountData(Account account){
        System.out.println("Person "+ account.getPerson().getName());
        System.out.println("Person "+ account.getPerson().getDocument());
        System.out.println("Agency "+ account.getAgency());
        System.out.println("Person "+ account.getNumber());
        System.out.println("Person "+ account.getBalance());
    }

}
