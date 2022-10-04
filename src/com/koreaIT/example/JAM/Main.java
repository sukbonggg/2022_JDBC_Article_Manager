package com.koreaIT.example.JAM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("명령어)");
			String cmd = sc.nextLine().trim();
			if (cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}

		sc.close();
	}
}
