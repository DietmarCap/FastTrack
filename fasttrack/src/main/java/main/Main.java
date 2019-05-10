package main;

import com.capgemini.fasttrack.Supermarket;
import com.capgemini.fasttrack.impl.Lidl;
import com.capgemini.fasttrack.impl.Woman;

public class Main {

	public static void main(String[] args) {
		
		Supermarket shop = new Lidl();
		Woman w = new Woman(shop);
		w.setName("Momo");
		String answer = w.speak();
		System.out.println(answer);
	}

}
