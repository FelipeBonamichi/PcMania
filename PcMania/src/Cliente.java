public class Cliente {
    String nome;
    String cpf;
    float total = 0.0f;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void CalcularTotal(float preco) {
        total += preco;
    }

    void ImprimirTotal() {

        System.out.println("Total da compra: R$" + total);
    }
}
