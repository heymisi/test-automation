package com.exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private static Account acc;
    private List<Transaction> transactions = new LinkedList<>();
    private Transaction t1;
    private Transaction t2;

    @BeforeAll
    public static void setUpClass(){
        acc = new Account();
    }

    @BeforeEach
    public void setUpMethod(){
        t1 = new Transaction("1",1000);
        t2 = new Transaction("2",2000);
        transactions.add(t1);
        transactions.add(t2);
    }
    @Test
    public void addTransactionShouldAddToTransactions(){
        acc.addTransaction(t1);
        acc.addTransaction(t2);
        assertEquals(2,acc.getTransactions().size());
    }
    @Test
    public void getTransactionShouldReturnAllTransaction(){
        acc.addTransaction(t1);
        acc.addTransaction(t2);
        assertEquals(transactions,acc.getTransactions());
    }

    @Test
    public void getBalanceShouldReturnSum(){
        assertEquals(0,acc.getBalance());
        acc.addTransaction(t1);
        acc.addTransaction(t2);
        assertEquals(3000,acc.getBalance());
    }
}
