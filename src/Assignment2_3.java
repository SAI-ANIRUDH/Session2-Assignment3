import java.util.*;
public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 1; i <=5; i++) {
		for (int j=1;j<=5;j++) {
			if (i==j) {
				System.out.print("*");
				}
			if (i==1 && j== 5) {
				System.out.print("*");
			}
			if (i==2 && j== 4) {
				System.out.print("*");
			}
			if (i==4 && j== 2) {
				System.out.print("*");
			}
			if (i==5 && j== 1) {
				System.out.print("*");
			}
			else if(i+j ==5) {
			System.out.print(" ");	
			}
			else 
				System.out.print("_");
				}
		System.out.println();
	}
	}

}

			