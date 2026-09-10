import java.time.LocalDateTime;

public class Voo {
    private String numero;
    private String origem;
    private String destino;
    private LocalDateTime dataHora;
    private int qtdTripulantes;
    private int qtdTripulacao; // alterar para qtdPassageiros

    public boolean verificarDisponibilidade() {
        return true;
    }

}
