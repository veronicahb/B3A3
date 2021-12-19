public class Carro extends Automovel{
    private int qtdPortas;

    public Carro(String marca, String modelo, int qtsRodas, int velocidade, double potenciaDoMotor, int qtdPortas){
        super(marca, modelo, qtsRodas, velocidade, potenciaDoMotor);
        this.qtdPortas = qtdPortas;
    }

    public void ImprimirC(){
        System.out.println("Quantidade de Portas: "+qtdPortas);
    }

    public int getQtdPortas(){ 
        return qtdPortas; 
    }
    public void setQtdPortas(int qtdPortas){ 
        this.qtdPortas = qtdPortas; 
    }
}