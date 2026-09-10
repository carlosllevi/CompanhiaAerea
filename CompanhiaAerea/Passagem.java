class Passagem {
  private String codLocalizador;
  private double valorBase;
  private StatusPassagem status;
  private Passageiro passageiro;
  private Voo voo;
  protected Assento assento; // no diagrama está private, mas nessa condição o programa não compila.
  /*
  SOLUCOES:
  1 - Manter protected e alterar o digrama.
  2 - Cria métodos getters.*/

   public double calcularValorTotal() {
    return 0;
   }

   public void cancelar(){
    
   }
}