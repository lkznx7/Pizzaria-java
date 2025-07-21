import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Cardapio> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.RECEBIDO;
    }

    public void adicionarItem(Cardapio item) {
        itens.add(item);
    }

    public void exibirPedido() {
        System.out.println("Itens do pedido:");
        double total = 0;
        for (Cardapio item : itens) {
            System.out.println("- " + item.getNome() + " - R$" + item.getPreco());
            total += item.getPreco();
        }
        System.out.println("Total: R$" + total);
        System.out.println("Status: " + status.getDescricao());
        System.out.println();
    }

    public void avancarStatus() {
        switch (status) {
            case RECEBIDO:
                status = StatusPedido.EM_PREPARO;
                break;
            case EM_PREPARO:
                status = StatusPedido.SAIU_ENTREGA;
                break;
            case SAIU_ENTREGA:
                status = StatusPedido.ENTREGUE;
                break;
            case ENTREGUE:
                System.out.println("O pedido já foi entregue.");
                break;
        }
    }

    public StatusPedido getStatus() {
        return status;
    }
}
