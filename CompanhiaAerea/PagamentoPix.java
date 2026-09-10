public class PagamentoPix implements Pagamento {

    private double valor;
    private String chavePix;

    @Override
    public void processarPagamento(double valor) {
        // Lógica para processar o pagamento com PIX
    }

    @Override
    public void estornarPagamento(double valor) {
        // Lógica para estornar o pagamento com PIX
    }

    @Override
    public boolean validarPagamento() {
        // Lógica para validar o pagamento com PIX
        return true;
    }

}