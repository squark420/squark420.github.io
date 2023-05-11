package io.diffblue.corebanking.account;

import static org.junit.Assert.assertEquals;

import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.branch.Branch;
import org.junit.Test;

public class AccountTest {
    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    public void testAddToBalance() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L, new Branch(1, "name", "0X1 1PT"));
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }

    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    public void testAddToBalance2() throws AccountException {
        Client client = new Client("Dr Jane Doe");
        Account account = new Account(1234567890L, client, 10L, new Branch(1, "Name", "OX1 1PT"));
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }
}

