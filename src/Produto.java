public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix) {
            return preco - descontoParaPix;
        } else {
            return preco;
        }
    }

}
