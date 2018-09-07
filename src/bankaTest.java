import java.util.Scanner;
public class bankaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		metodhs kreiranje=new metodhs();
			
		System.out.println("  D O B R O D O S L I  U  B A N K U  ");
		System.out.println("     M     E      N      I      ");
		System.out.println("Koju transakciju zelite izvrsiti:");
		System.out.println("1.Kreiranje racuna!");
		System.out.println("2.Uplata!");
		System.out.println("3.Transfer novca sa jednog na drugi racun!");
		int odgovor=input.nextInt();
		
			try{
				do{
					odgovor=input.nextInt();
					if(odgovor<1 || odgovor>3)
						System.out.print("Pogresan unos, pokusajte ponovo.");
					
				}while(odgovor<1 || odgovor>3);
			}catch(Exception e){
				System.out.println("Pogresan unos,pokusajte ponovo.");
			}
		
			if(odgovor==1){
			System.out.println("Izabrali ste kreiranje racuna!Molimo unesite ime i prezime!");
			String imePrezime=input.nextLine();
			input.nextLine();
			System.out.println("Unesite broj racuna!");
			int broj=input.nextInt();
			System.out.println("Unesite iznos koji polazete!");
			double iznos=input.nextDouble();
			kreiranje.kreiranjeRacuna(imePrezime,broj,iznos);
			}
		else if(odgovor==2){
			System.out.println("Izabrali ste uplatu novca!");
			System.out.println("Unesite broj racuna!");
			int broj=input.nextInt();
			System.out.println("Unesite iznos koji zelite uplatiti!");
			double iznos=input.nextDouble();
			System.out.println("Unesite postojece stanje racuna!");
			double stanje=input.nextDouble();
			kreiranje.uplata(broj,iznos,stanje);
			}
		else if(odgovor==3){
			System.out.println("Izabrali ste transfer novca!");
			System.out.println("Unesite broj racuna sa kojeg zelite prebaciti!");
			int racun1=input.nextInt();
			System.out.println("Unesite broj racuna na koji zelite prebaciti!");
			int racun2=input.nextInt();
			System.out.println("Unesite iznos koji zelite prebaciti!");
			double iznos=input.nextDouble();
			System.out.println("Unesite postojece stanje racuna!");
			double stanje=input.nextDouble();
			kreiranje.transfer(racun1,racun2,iznos,stanje);
			}
		
				
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	}

}
