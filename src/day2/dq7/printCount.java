package day2.dq7;

public class printCount {
	public void cou(int l[]) {
		int count = 0,count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<20;i++) {
			if(l[i]%2==0) {
				count++;
				if(l[i]<0) {
					count2++;
				}
				else if(l[i]>0) {
					count3++;
				}
				else{
					count4++;
				}
			}
			else if(l[i]%2!=0){
				count1++;
				if(l[i]<0) {
					count2++;
				}
				else if(l[i]>0) {
					count3++;
				}
				else{
					count4++;
				}
			}
			
		}
		System.out.println(count+" "+count1+" "+count2+" "+count3+" "+count4);
	}
}


