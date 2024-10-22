package ua.ithillel.genrefl.model.bank;


public class Withdrawal implements Transaction {
    @Override
    public void execute() {
        System.out.println("Executing transaction");
    }
}
