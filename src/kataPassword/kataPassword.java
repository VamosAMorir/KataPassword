package kataPassword;

import java.util.Scanner;

public class kataPassword implements Generable {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int letras, numeros, simbolos;
		String password;

		System.out.print("Numero de letras: ");
		letras = leer.nextInt();
		System.out.print("Numero de numeros: ");
		numeros = leer.nextInt();
		System.out.print("Numero de simbolos: ");
		simbolos = leer.nextInt();

	}
	@Override
	public String generatePassword(int letter, int numbers, int symbol){
			String password;
			char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
			char[] simbolos = {'º','ª','!','·','$','%','&','/','(',')','=','?','¿','¡','|','#','€','¬',',','.','-','_'};
			
			
			
			return password;
	}

}
