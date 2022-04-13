package exercicio05;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		int rotacao[][] = new int [3][3];
		int i =0 ;
		int j = 0 ;
		
		Scanner ler = new Scanner ( System.in) ;
		System.out.print("Entrada de dados da matriz ! \n\n ");
		
		for (i =0 ; i < 3 ; i++) {
			for (j=0 ; j<3 ; j++) {
				System.out.printf("Digite os valores da matriz [%d][%d] : " , i+1, j+1);
			 matriz[i][j]=ler.nextInt();
				
			}
			System.out.print("\n");
		}   
		
		System.out.print(" Matriz apos 90 graus ! \n");
		
		  for (i =0  ; i < 3 ; i++) {
			  for (j=0 ; j <3; j++) {
				  rotacao[i][j] = matriz[3- j- 1][i];
					System.out.printf("[%d]", rotacao[i][j]);
					
				}
			System.out.print("\n");
			}
		
		
ler.close();
	}

}
