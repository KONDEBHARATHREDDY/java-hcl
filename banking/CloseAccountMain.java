package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {

	public static void main(String[] args) {
		int accountno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno");
		accountno=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.closeAccount(accountno));
		
	}
	
}
