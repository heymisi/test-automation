package com.exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private static LedgerService ledgerService;
    private static Bank bank;
    private static Account from;
    private static Account to;

    @BeforeAll
    public static void setUpClass(){
        ledgerService = Mockito.mock(LedgerService.class);
        bank = new Bank(ledgerService);

    }
    @BeforeEach
    public void setUpMethod(){
        from = new Account();
        to = new Account();
        from.addTransaction(new Transaction("", 3000));
    }
    @Test
    public void transferWhenAmountIsNotEnoughShouldThrowException(){
        assertThrows(NotAllowedException.class, () ->
                bank.transfer(from, to, 4000));
    }
    @Test
    public void transferWhenAmountIsEnoughShouldReceiverGetsMoney() throws NotAllowedException {
        int amount = 2000;
        bank.transfer(from, to, amount);
        assertEquals(amount,to.getBalance());
    }

    @Test
    public void transferWhenAmountIsEnoughShouldGiverMoneyTakeAway() throws NotAllowedException {
        int amount = 3000;
        bank.transfer(from, to, amount);
        assertEquals(0,from.getBalance());
    }

    @Test
    public void transferWhenAmountIsEnoughRegisterTransferShouldRun() throws NotAllowedException{
        bank.transfer(from, to, 1000);
        verify(ledgerService,times(1)).registerTransfer(from, to, 1000);
    }

    @Test
    @Disabled
    public void testTransfer() throws NotAllowedException {
        Account from = new Account();
        from.addTransaction(new Transaction("", 10000));
        Account to = new Account();
        Bank bank = new Bank(new LedgerService() {
            @Override
            public void registerTransfer(Account from, Account to, int amount) {
                //
            }
        });
        bank.transfer(from, to, 3000);
        System.out.println(from.getBalance());
        System.out.println(to.getBalance());
        bank.transfer(from, to, 10000);
    }


}