public class Moto extends Automovel{
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int qtsRodas, int velocidade, double potenciaDoMotor, boolean partidaEletrica){
        super(marca, modelo, qtsRodas, velocidade, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public void ImprimirM(){
        System.out.println("Partida Eletrica: "+partidaEletrica);
    }

    public boolean getPartidaEletrica(){ 
        return partidaEletrica; 
    }
    public void setPartidaEletrica(boolean partidaEletrica){ 
        this.partidaEletrica = partidaEletrica; 
    }
}