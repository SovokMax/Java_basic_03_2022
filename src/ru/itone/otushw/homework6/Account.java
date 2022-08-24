package ru.itone.otushw.homework6;

import java.util.Objects;

public class Account {
    private String account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return Objects.equals(account, account1.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    public Account(String account) {
        this.account = account;
    }

}
