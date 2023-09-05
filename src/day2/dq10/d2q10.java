package day2.dq10;

import Main.begin;
import java.util.*;

public class d2q10 implements begin {
	public void beginn() {
		Scanner sc  = new Scanner(System.in);
		fileWrite fw = new fileWrite();
		fw.writ(sc.nextLine());
		
		fileRead fr = new fileRead();
		fr.read();
	}

}
