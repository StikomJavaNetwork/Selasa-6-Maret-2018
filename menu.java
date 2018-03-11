import java.util.*;

public class menu{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
	do{
		System.out.println("========");
		System.out.println("1. Sego pecel");
		System.out.println("2. Nasi Konoha");
		System.out.println("3. Oseng-oseng kadal");
		System.out.println("4. Nyambek bakar rasa PISCOK");
		System.out.println("5. Keluar");
		System.out.println();
		
		System.out.print("Masukkan menu pilhan:");
		int menu = scan.nextInt();
		
		switch(menu){
			case 1:
				System.out.println("Rp. 8.000");
				System.out.println("Iwak Ndok");
			break;
			
			case 2:
				System.out.println("Rp. 12.000");
				System.out.println("Empal + Tempura");
			break;
			case 3:
				System.out.println("Rp. 18.000");
				System.out.println("Iwak teri+sambel pencit");
			break;
			case 4:
				System.out.println("Rp. 25.000");
				System.out.println("PISCOK + Susu murni nasional");
			break;
			case 5:
				System.exit(0);
			break;
			
		}
	}while(true);
	}
		
		
	}