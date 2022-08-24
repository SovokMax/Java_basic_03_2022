package ru.itone.otushw.homework6;

import java.util.*;
import java.util.stream.Collectors;

public class Bank {
    private Map<Client, List<Account>> clientAccounts = new HashMap<>();
    private Map<Account, Client> accountClient = new HashMap<>();

    public List<Account> getAccounts(Client client) {
       return clientAccounts.get(client);
    }



    public Client findClient(Account account){
        return accountClient.get(account);

    }

    public void addClientAccount(Client client, Account account){
        accountClient.put(account, client);
        getAccounts(client).add(account);
    }

    public void addClient(Client client) {
        clientAccounts.put(client, new ArrayList<>());
    }

    public void addClient(Client client, List<Account> account) {
        addClient(client);
        for (int i = 0; i < account.size(); i++) {
            addClientAccount(client, account.get(i));
        }
    }

}
