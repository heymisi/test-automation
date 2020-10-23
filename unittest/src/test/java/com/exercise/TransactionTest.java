package com.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransactionTest {
    @Test
    public void transactionConstructor(){
        Transaction transaction = new Transaction("1",1000);
        assertEquals("1",transaction.getId());
        assertEquals(1000,transaction.getAmount());
    }
}
