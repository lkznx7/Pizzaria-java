public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Adicionando pizzas
        pedido.adicionarItem(Cardapio.PIZZA_CALABRESA);
        pedido.adicionarItem(Cardapio.PIZZA_PORTUGUESA);
        pedido.adicionarItem(Cardapio.PIZZA_PRESUNTO);

        // Exibindo pedido inicial
        pedido.exibirPedido();

        // Avançando status 3 vezes
        pedido.avancarStatus(); // EM_PREPARO
        pedido.exibirPedido();

        pedido.avancarStatus(); // SAIU_ENTREGA
        pedido.exibirPedido();

        pedido.avancarStatus(); // ENTREGUE
        pedido.exibirPedido();

        pedido.avancarStatus(); // Já foi entregue
    }
}
