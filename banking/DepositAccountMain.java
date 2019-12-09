package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		int accountno,depositamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno");
		accountno=sc.nextInt();
		System.out.println("enter depositamount");
		depositamount=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.depositAccount(accountno, depositamount));
	}
}
