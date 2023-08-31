package day2.dq5;

public class spliit {
public void sepe(String s) {
		
		String l[]= new String [s.length()]; 
		l=s.split(":");
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		
		
	}

}
