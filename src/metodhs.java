import java.util.ArrayList;


public class metodhs {

	ArrayList<account>ListOfAccounts=new ArrayList<>();
	
	public void kreiranjeRacuna(String user,int accountCode,double amount){
		 
		account account=new account(user,accountCode,amount);
		if(accountCode<0){
			System.out.println("Broj racuna mora biti pozitivan,pokusajte ponovo!");
		}
		for(int i=0;i<ListOfAccounts.size();i++){
			if(ListOfAccounts.get(i).getAccountCode()==accountCode){
				System.out.println("Upisani racun vec postoji,pokusajte ponovo!");
			}
			else if(amount<0){
				System.out.println("Iznos na racunu ne smije biti negativan.");
			}
			else{
				System.out.println("Uspjesno kreiran racun!");
			}
	
			ListOfAccounts.add(new account(user,accountCode,amount));
			
		}
	


		}
		public void uplata(int accountCode,double amount,double deposit) {
	
			if(amount<0){
				System.out.println("Iznos na racunu mora biti pozitivan!");
				return;
			}
			else if(amount>0){
				deposit+=amount;
					System.out.println("Uspjesno uplaceno "+amount+" na racun!Sada imate "+ deposit + "  maraka!");
		}		
		}
		
		
		public void transfer(int sourceAccount,int targetAccount,double amount,double deposit){
			
			if(amount<0){
				System.out.println("Ne smijete prebaciti negativan iznos novca");
				return;
			}
			if(amount>deposit){
				System.out.println("Nemate dovoljno sredstava na racunu!Molimo uplatite!");
				return;
			}
			for(int i=0;i<ListOfAccounts.size();i++){
				account racun=ListOfAccounts.get(i);
				if(sourceAccount != racun.getAccountCode()){
					System.out.println("Racun je nevazeci!Ne mozete sa njega poslati!");
				}
				
			}
			
			deposit+=amount;
			deposit-=amount;
			System.out.println("Transakcija je uspjesno izvrsena!");
		


			
			}
		}
		
		
		













			














































