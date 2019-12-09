package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	static Account account=null;
	@BeforeClass
	public static void setUp() {
		account=new Account();
	}
	@Test
	public void testGettersAndSetters() {
		account=new Account();
		account.setAccountno(1);
		account.setFirstname("bharath");
		account.setLastname("reddy");
		account.setCity("tirupati");
		account.setState("ap");
		account.setAmount(45000);
		account.setCheqfacil("yes");
		account.setAccounttype("savings");
		assertEquals(1,account.getAccountno());
		assertEquals("bharath", account.getFirstname());
		assertEquals("reddy", account.getLastname());
		assertEquals("tirupati", account.getCity());
		assertEquals("ap", account.getState());
		assertEquals(45000, account.getAmount());
		assertEquals("yes", account.getCheqfacil());
		assertEquals("savings", account.getAccounttype());
	}

}
