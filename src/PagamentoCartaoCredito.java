import java.util.Date;

public class PagamentoCartaoCredito implements Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private Date dataValidade;
    private String cvv;


    @Override
    public void processarPagamento(double valor) {
        // Lógica para processar o pagamento com cartão de crédito
    }

    @Override
    public boolean validarPagamento() {
        // Lógica para validar o pagamento com cartão de crédito
        return true;
    }

    @Override
    public void estornarPagamento(double valor) {
        // Lógica para estornar o pagamento com cartão de crédito
    }
    
}
