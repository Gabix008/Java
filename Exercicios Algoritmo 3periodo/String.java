import java.util.Scanner;

public class String {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
	
		int maxc = 100;
		int i = 0;
		int TsVogais;
	
		char[] sVogais = new char[maxc];
	
		System.out.println("Digite uma palavra");
		java.lang.String palavra = ent.nextLine();
	
		TsVogais = 0;
	
		for(i=0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
	
			if( c!='a'&& c!='A'&&
				c!='e'&& c!='E'&&
				c!='i'&& c!='I'&&    
				c!='o'&& c!='O'&&
				c!='u'&& c!='U'
			) {
				sVogais[TsVogais] = c;
				TsVogais++;
			}
	
		
		}
	
		System.out.print("A string sem vogais é: ");
		for(i=0; i< TsVogais;i++) {
			System.out.print(sVogais[i]);
		}
	
		System.out.println();
	}
}