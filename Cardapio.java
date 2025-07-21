public enum Cardapio {
    PIZZA_CALABRESA("Pizza de calabresa", 35.00),
    PIZZA_PORTUGUESA("Pizza portuguesa", 45.00),
    PIZZA_PRESUNTO("Pizza de presunto", 25.00);

    private String nome;
    private double preco;

    Cardapio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
