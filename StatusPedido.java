public enum StatusPedido {
    RECEBIDO("Pedido recebido"),
    EM_PREPARO("Pedido em preparo"),
    SAIU_ENTREGA("Saiu para entrega"),
    ENTREGUE("Pedido entregue");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
