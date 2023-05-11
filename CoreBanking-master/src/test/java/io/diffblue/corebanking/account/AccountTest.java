package io.diffblue.corebanking.account;

import static org.junit.Assert.assertEquals;

import io.diffblue.corebanking.client.Client;
import org.junit.Test;

public class AccountTest {
    /**
     * Method under test: {@link Account#addToBalance(long)}
     */
    @Test
    public void testAddToBalance() throws AccountException {
        Account account = new Account(1234567890L, new Client("Dr Jane Doe"), 10L);
        account.addToBalance(10L);
        assertEquals(20L, account.getCurrentBalance());
    }
}

