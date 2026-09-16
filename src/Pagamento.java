public interface Pagamento {
    
    public void processarPagamento(double valor);

    public boolean validarPagamento();

    public void estornarPagamento(double valor);

}
