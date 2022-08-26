package ru.itone.otushw.homework6;

import java.util.List;

public class HomeWork6 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("Максим", 33);
        Client client2 = new Client("Дмитрий", 25);
        bank.addClient(client);
        bank.addClient(client2);

        Account account = new Account("account1");
        bank.addClientAccount(client, account);
        bank.addClientAccount(client2, account);
        Client client1 = bank.findClient(account);
        System.out.println();
        List<Account> accounts = bank.getAccounts(new Client("Максим", 33));
        System.out.println(accounts);
    }
}