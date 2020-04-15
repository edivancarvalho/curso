
package entidade;

/**
 *
 * @author suporte
 */
public class Produto {
    public String name;
    public double price;
    public int quantidade;
    
    public double totalVelhoNoStock(){
        return price * quantidade;
    }
    // criando funçao com parametro para adicionar produto;
    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }
    // criando função com parametro para remove produto;
    public void removeProduto(int quantidade){
        this.quantidade -= quantidade;
    }
    
}
