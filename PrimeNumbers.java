package nas.lab.samples;

import java.util.Scanner;
import java.util.ArrayList;

/**
*	This is a sample prepared for the interview.
*/

class PrimeNumbers{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	void getPrimeNumbers(int range){
		
		for(int i = 2; i <= range; i++){
			
			boolean flag = true;
			for(int j = 2; j <= i / 2; j++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			
			if(flag) list.add(i);
			
		}
		
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
			System.out.println("The prime numbers are: ");
			for(int i = 0; i < list.size(); i++){
				
				if(i == list.size() - 1){
					System.out.print("& " + list.get(i) + ".\n");
				} else {
					System.out.print(list.get(i) + ", ");
				}
				
				if((i + 1) % 10 == 0) System.out.println();
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the range (a number) to list the prime numbers: ");
		primeNumbers.getPrimeNumbers(scan.nextInt());
		scan.close();
		
	}
}