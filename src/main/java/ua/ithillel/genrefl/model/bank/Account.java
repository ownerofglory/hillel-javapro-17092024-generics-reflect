package ua.ithillel.genrefl.model.bank;

import java.util.List;

public class Account {

    public void execDeposit(List<? super Deposit> deposits) {
       deposits.add(new Deposit());
    }

    public void execWithdrawal(List<? super Withdrawal> withdrawals) {
        withdrawals.add(new Withdrawal());
    }
}
