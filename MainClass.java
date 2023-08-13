import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Dobro dosli u igru Skocko!");
		
		System.out.println("Pogadjate kombinaciju od 4 broja, brojeve koje mozete uneti kao clanove kombinacije su od 1-6 i mogu se ponavljati.");
		
		
		int opcija =0;
			
		
		do {
			LinkedList<Integer> kombinacija = new LinkedList<Integer>();
			
			for(int i=0; i<4;i++) {
				
				Random random = new Random();
				
				int number = random.nextInt(6)+1;
				
				kombinacija.add(number);

			}
			
			
			//System.out.println(kombinacija);
			
			
			
			int brojPokusaja = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			
			do {
				
				brojPokusaja ++;

				LinkedList<Integer> pokusaj = new LinkedList<Integer>();
				
			
				for(int m=0;m<4;m++) {
					
				
					System.out.println("Unesite "+(m+1)+". clan kombinacije. ");
					
					int vrednost = scanner.nextInt();
					
					pokusaj.add(vrednost);
	
					}

				
				boolean pogodak = (pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(2)==kombinacija.get(2)&&pokusaj.get(3)==kombinacija.get(3));
				
				boolean promasaj = (pokusaj.get(0)!=kombinacija.get(0)&&pokusaj.get(1)!=kombinacija.get(1)&&pokusaj.get(2)!=kombinacija.get(2)&&pokusaj.get(3)!=kombinacija.get(3));
				
			    boolean p1tm = (pokusaj.get(0)==kombinacija.get(0))||(pokusaj.get(1)==kombinacija.get(1))||(pokusaj.get(2)==kombinacija.get(2))||(pokusaj.get(3)==kombinacija.get(3));
				
				boolean p2tm = (pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(1)==kombinacija.get(1))||(pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(2)==kombinacija.get(2))||(pokusaj.get(2)==kombinacija.get(2)&&(pokusaj.get(3)==kombinacija.get(3)))||(pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(2)==kombinacija.get(2))||(pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(3)==kombinacija.get(3))||(pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(3)==kombinacija.get(3));
				
				boolean p3tm = (pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(2)==kombinacija.get(2))||(pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(3)==kombinacija.get(3))||(pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(2)==kombinacija.get(2)&&pokusaj.get(3)==kombinacija.get(3))||(pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(2)==kombinacija.get(2))||(pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(0)==kombinacija.get(0)&&pokusaj.get(3)==kombinacija.get(3))||pokusaj.get(1)==kombinacija.get(1)&&pokusaj.get(2)==kombinacija.get(2)&&pokusaj.get(3)==kombinacija.get(3);
				
				
				
				boolean p4vm = (kombinacija.contains(pokusaj.get(0)))&&(kombinacija.contains(pokusaj.get(1)))&&(kombinacija.contains(pokusaj.get(2)))&&(kombinacija.contains(pokusaj.get(3)));
				
				boolean p3vm = (kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2)))||(kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.contains(pokusaj.get(3))&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(2)))||(kombinacija.contains(pokusaj.get(3))&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1)))||(kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1)));
				
				boolean p2vm = (kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1)))||(kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(2)))||(kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2)))||(kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(13)));

				boolean p1vm = (kombinacija.contains(pokusaj.get(0)))||(kombinacija.contains(pokusaj.get(1)))||(kombinacija.contains(pokusaj.get(2)))||(kombinacija.contains(pokusaj.get(3)));

				
				boolean p1tm3vm = (kombinacija.get(0)==pokusaj.get(0)&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.get(1)==pokusaj.get(1)&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.get(2)==pokusaj.get(2)&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.get(3)==pokusaj.get(3)&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2)));
				
				boolean p2tm2vm = (kombinacija.get(0)==pokusaj.get(0)&&kombinacija.get(1)==pokusaj.get(1)&&kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.get(2)==pokusaj.get(2)&&kombinacija.get(3)==pokusaj.get(3)&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(1)))||(kombinacija.get(0)==pokusaj.get(0)&&kombinacija.get(3)==pokusaj.get(3)&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(2)))||(kombinacija.get(1)==pokusaj.get(1)&&kombinacija.get(2)==pokusaj.get(2)&&kombinacija.contains(pokusaj.get(0))&&kombinacija.contains(pokusaj.get(3)))||(kombinacija.get(1)==pokusaj.get(1)&&kombinacija.get(3)==pokusaj.get(3)&&kombinacija.contains(pokusaj.get(2))&&kombinacija.contains(pokusaj.get(0))||(kombinacija.get(0)==pokusaj.get(0)&&kombinacija.get(2)==pokusaj.get(2)&&kombinacija.contains(pokusaj.get(1))&&kombinacija.contains(pokusaj.get(3))));
				
				
			   
				if(pogodak) {
					System.out.println("uneli ste tacnu kombinaciju");
					
				}

				else if(p2tm2vm) {
					
					System.out.println("Imate dva pogodka na tacnom mestu i dva van mesta");
				}
			
			    else if(p1tm3vm ) {
				System.out.println("Imate jedan pogodak na tacnom mestu i tri van mesta");
			    }
			
				
				else if(p3tm) {
					System.out.println("Imate tri pogodka na tacnom mestu");
				}
				
				else if(p2tm) {
					System.out.println("Imate dva tacna pogodka na tacnom mestu");
				}	
				else if(p1tm) {
					System.out.println("Imate jedan tacnan pogodak na tacnom mestu");
				}
				else if(p4vm) {
					System.out.println("Imate cetiri pogodka van mesta.");
				}
				else if(p3vm) {
					System.out.println("imate tri pogodka vam mesta");
				}
				else if(p2vm) {
					System.out.println("imate dva pogodka van mesta");
				}
				else if(p1vm) {
					System.out.println("Imate jedan pogodak van mesta");
				}
				else if(promasaj) {
					System.out.println("Niste pogodili kombinaciju");
				}

				
				
				
				if(brojPokusaja<6 &&pogodak) {
					System.out.println("Osvojili ste 30 poena!");
					break;
				}
				else if(brojPokusaja==7 &&pogodak) {
					System.out.println("Osvojili ste 20 poena!");
				}
		
				
			} while (brojPokusaja<7);
			
			
			System.out.println("Ako zelite da igarte ponovo unesite 1, ako zelite da zavrsite unestie bilo koji drugi broj");
			opcija = scanner.nextInt();
			
			
		} while (opcija==1);
		
	
	}

}
