public class Bicicleta extends Veiculos{
    private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(String marca, String modelo, int qtsRodas, int velocidade, int numMarchas, boolean bagageiro){
        super(marca, modelo, qtsRodas, velocidade);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro; 
    }

    public void ImprimirB(){
        System.out.println("Numero de Marchas: "+numMarchas);
        System.out.println("Bagageiro: "+bagageiro);
    }

    public int getNumMarchas(){ 
        return numMarchas; 
    }
    public void setNumMarchas(int numMarchas){ 
        this.numMarchas = numMarchas; 
    }
    public boolean getBagageiro(){ 
        return bagageiro; 
    }
    public void setBagageiro(Boolean bagageiro){ 
        this.bagageiro = bagageiro; 
    }
}