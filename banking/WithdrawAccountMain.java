package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountno,withdrawamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno");
		accountno=sc.nextInt();
		System.out.println("enter withdrawamount");
		withdrawamount=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.withdrawAccount(accountno, withdrawamount));
	}
}
