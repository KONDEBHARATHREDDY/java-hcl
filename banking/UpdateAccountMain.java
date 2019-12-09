package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {

	public static void main(String[] args) {
		int accountno;
		String city,state;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno");
		accountno=Integer.parseInt(sc.nextLine());
		System.out.println("city");
		city=sc.nextLine();
		System.out.println("State");
		state=sc.nextLine();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.updateAccount(accountno, city, state));
	}
	
}
