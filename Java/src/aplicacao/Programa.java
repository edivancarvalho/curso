package aplicacao;

import entidade.Produto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author suporte
 */
public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        Produto produto = new Produto();
        System.out.println("Enter dados do produtor");
        System.out.println("Name: ");
        produto.name = sc.nextLine();
        
        System.out.println("price: ");
        produto.price = sc.nextDouble();
        
        System.out.println("Quantidade : ");
        produto.quantidade = sc.nextInt();
        
        System.out.println(produto.name +"\n"+ produto.price+"\n" + produto.quantidade+"\n");
        
        
        sc.close();
    }
    
}
