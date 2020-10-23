package com.exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LedgerServiceTest {
    private static LedgerService ledgerService;
    private static Account from;
    private static Account to;
    @BeforeAll
    public static void setUp(){
        ledgerService = new LedgerService();
        from = new Account();
        to = new Account();
    }
    @Test
    public void registerTransferShouldThrowRuntimeException(){
        assertThrows(RuntimeException.class, () ->
            ledgerService.registerTransfer(from,to,1000)
        );
    }
}
