public class Veiculos {
    private String marca;
    private String modelo;
    private int qtsRodas;
    private int velocidade;
    private int velocidadeatual;
    
    public Veiculos(String marca, String modelo, int qtsRodas, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtsRodas = qtsRodas;
        this.velocidade = velocidade;
        this.velocidadeatual = velocidade;
    }

    public void ImprimirV(){
        System.out.println("Dados do Veiculo:");
        System.out.println("");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Quantidade de rodas: "+qtsRodas);
        System.out.println("Velocidade: "+velocidade);
        System.out.println("Velocidade Atual: "+velocidadeatual);
    }

    public void Acelerar(int velocidadeatual){
        this.velocidadeatual+=velocidadeatual;
        System.out.println("Velocidade Atual: "+velocidadeatual);
    }

    public void Frear(int velocidadeatual){
        this.velocidadeatual-=velocidadeatual;
        System.out.println("Velocidade Atual: "+velocidadeatual);
    }

    public String getMarca(){ 
        return marca; 
    }
    public void setMarca(String marca){ 
        this.marca = marca;
    }
    public String getModelo(){ 
        return modelo; 
    }
    public void setModelo(String modelo){ 
        this.modelo = modelo;
    }
    public int getQtsRodas(){ 
        return qtsRodas; 
    }
    public void setQtsRodas(int qtsRodas){ 
        this.qtsRodas = qtsRodas; 
    }
    public int getVelocidade(){ 
        return velocidade; 
    }
    public void setVelocidade(int velocidade){ 
        this.velocidade = velocidade; 
    }
    public int getVelocidadeAtual(){ 
        return velocidadeatual; 
    }
    public void setVelocidadeAtual(int velocidade){ 
        this.velocidadeatual = velocidade; 
    }
}

