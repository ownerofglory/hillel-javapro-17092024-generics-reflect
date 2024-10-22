package ua.ithillel.genrefl.model.bank;

public class Deposit implements Transaction {
    @Override
    public void execute() {
        System.out.println("Executing deposit");
    }
}
