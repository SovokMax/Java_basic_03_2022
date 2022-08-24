package ru.itone.otushw.homework6;

import java.util.*;

public class Bank {
    private Map<Client, List<Account>> clientToAccountsАssociation = new HashMap<>();
    private Map<Account, Client> accountClient = new HashMap<>();

    public List<Account> getAccounts(Client client) {
       return clientToAccountsАssociation.get(client);
    }
    
    public Client findClient(Account account){
        return accountClient.get(account);

    }

    public void addClientAccount(Client client, Account account){
        accountClient.put(account, client);
        getAccounts(client).add(account);
    }

    public void addClient(Client client) {
        clientToAccountsАssociation.put(client, new ArrayList<>());
    }

    public void addClient(Client client, List<Account> account) {
        addClient(client);
        for (int i = 0; i < account.size(); i++) {
            addClientAccount(client, account.get(i));
        }
    }

}
