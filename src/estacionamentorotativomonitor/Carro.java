package estacionamentorotativomonitor;

public class Carro extends Thread {
    
    private String idCarro;
    private Estacionamento estacionamento;
    
    public Carro(String idCarro, Estacionamento estacionamento) {
        this.idCarro = idCarro;
        this.estacionamento = estacionamento;
    }
    
    public void run() {
        
    }

    public String getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

}