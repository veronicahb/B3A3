public class Automovel extends Veiculos{
    private double potenciaDoMotor;

    public Automovel(String marca, String modelo, int qtsRodas, int velocidade, double potenciaDoMotor){
        super(marca, modelo, qtsRodas, velocidade);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public void ImprimirA(){
        System.out.println("Potencia do Motor: "+potenciaDoMotor);
    }

    public double getPotenciaDoMotor(){ 
        return potenciaDoMotor; 
    }
    public void setPotenciaDoMotor(double potenciaDoMotor){ 
        this.potenciaDoMotor = potenciaDoMotor; 
    }
}