package main;

import com.capgemini.fasttrack.impl.Woman;

public class Main {

	public static void main(String[] args) {
		Woman w = new Woman();
		w.setName("Momo");
		String answer = w.speak();
		System.out.println(answer);
	}

}
