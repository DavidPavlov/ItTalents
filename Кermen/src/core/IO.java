package core;

import java.util.Scanner;

public class IO {

	Scanner sc = new Scanner(System.in);

	public void print(String s) {
		System.out.print(s);
	}

	public String readLine() {
		return sc.nextLine();
	}
}
