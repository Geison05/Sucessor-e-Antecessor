import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //variavel
    int numero = 0;
    int sucessor = 0;
    int antecessor = 0 ;
    //Entrada de Dados
    System.out.println("Número Inteiro :");
    numero = leitor.nextInt();
    //Processamento
    sucessor = numero +1; 
    antecessor = numero -1 ;
    //Saida 
    System.out.println("O Sucessor de :"+ numero + " é " + sucessor);
    System.out.println("\nO Antecessor de :" + numero + " é " + antecessor);
  
  
  }
}