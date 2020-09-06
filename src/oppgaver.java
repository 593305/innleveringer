import java.util.Scanner;

public class oppgaver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-------- Oppgave 4 --------");
		System.out.println("Skriv inn tall lønn  :  ");
		int lonn = sc.nextInt();
		double trinnskatt = 0;
		if (lonn > 934050) {
			trinnskatt = lonn * 0.01452;
			System.out.println("Din trinnskatt er " + trinnskatt);
		} else if (lonn > 580650) {
			trinnskatt = lonn * 0.01152;
			System.out.println("Din trinnskatt er " + trinnskatt);
		} else if (lonn > 230950) {
			trinnskatt = lonn * 0.00241;
			System.out.println("Din trinnskatt er " + trinnskatt);
		} else if (lonn > 164100) {
			trinnskatt = lonn * 0.00093;
			System.out.println("Din trinnskatt er " + trinnskatt);
		} else {
			System.out.println("Du trenger ikke betale trinnskatt");
		}
		

		System.out.println("-------- Oppgave 5 a, b og c --------");
		System.out.println("Skriv inn poengsum");
		
		for(int i = 1; i<11; i++) 
		{
			System.out.println("Skriv inn poengsum nummer " + i);
			int poeng1 = sc.nextInt();
			
			while (poeng1 < 0 || poeng1 > 100) 
			{
				System.out.println("Skriv inn poengsum nummer " + i + "på nytt");
				poeng1 = sc.nextInt();
			}
			
			if(poeng1 > 90) 
			{
				System.out.println("Din karakter er A");
			}
			else if(poeng1 > 80) 
			{
				System.out.println("Din karakter er B");
			}
			else if(poeng1 > 60) 
			{
				System.out.println("Din karakter er C");
			}
			else if(poeng1 > 50) 
			{
				System.out.println("Din karakter er D");
			}
			else if(poeng1 > 40) 
			{
				System.out.println("Din karakter er E");
			}
			else 
			{
				System.out.println("STRYYYKK");
			}
		}
		
		System.out.println("-------- Oppgave 6 --------");
		System.out.println("skriv inn ett heltall");
		int total = 1;
		int fakultet = sc.nextInt();
		for (int i = fakultet; i>0; i--) {
			total*=i;
		}
		System.out.println(fakultet + "! = " +total);

	}

}
