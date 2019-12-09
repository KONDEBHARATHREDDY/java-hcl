package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no");
		accountno=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		Account account=dao.searchAccount(accountno);
		if(account!=null) {
			System.out.println("firstname"+account.getFirstname());
			System.out.println("lastname"+account.getLastname());
			System.out.println("city"+account.getCity());
			System.out.println("state"+account.getState());
			System.out.println("amount"+account.getAmount());
		}else {
			System.out.println("account not found");
		}
	}
	
}
