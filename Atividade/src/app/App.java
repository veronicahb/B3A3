import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner l = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println(" ");
        System.out.println("Escolha o programa:");
        System.out.println(" ");
        System.out.println("1 - Pessoa");
        System.out.println("2 - Veiculos");
        System.out.println(" ");
        System.out.println("Opção: ");
        String prog = l.next();
        int programa = Integer.parseInt(prog);
        if(programa == 1){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            BufferedReader leitor = new BufferedReader(new FileReader(endereco));
            String nome = leitor.readLine();
            String pai = leitor.readLine();
            String mae = leitor.readLine();
            String irmao = leitor.readLine();
            String pai2 = leitor.readLine();
            String mae2 = leitor.readLine();
            String parente = leitor.readLine();
            leitor.close();

            Pessoa pes;
            pes = new Pessoa();
            pes.SetNome(nome);
            pes.SetPessoa(nome, pai, mae);
            pes.GetNome();
            pes.GetMae();
            pes.GetPai();
            pes.Irmaos(irmao, pai2, mae2);
            pes.Antecessor(parente);

        }else if(programa == 2){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            System.out.println("-------- Veiculos --------");
            System.out.println(" ");
            System.out.println("Escolha o tipo de veiculo:");
            System.out.println(" ");
            System.out.println("1 - Moto");
            System.out.println("2 - Carro");
            System.out.println("3 - Bicicleta");
            System.out.println(" ");
            System.out.println("Opção: ");
            String q = l.next();
            int qual = Integer.parseInt(q);
            if(qual==1){
                BufferedReader leitor = new BufferedReader(new FileReader(endereco));
                String marca = leitor.readLine();
                String modelo = leitor.readLine();
                String qtsR = leitor.readLine();
                String velo = leitor.readLine();
                String poten = leitor.readLine();
                String part = leitor.readLine();
                String veloace = leitor.readLine();
                String velofre = leitor.readLine();
                int qtsRodas = Integer.parseInt(qtsR);
                int velocidade = Integer.parseInt(velo);
                int veloacelerar = Integer.parseInt(veloace);
                int velofrear = Integer.parseInt(velofre);
                double potenciaDoMotor = Double.parseDouble(poten);
                boolean partidaEletrica = Boolean.parseBoolean(part);
                leitor.close();

                Moto mo;
                mo = new Moto(marca, modelo, qtsRodas, velocidade, potenciaDoMotor, partidaEletrica);
                mo.setMarca(marca);
                mo.setModelo(modelo);
                mo.setQtsRodas(qtsRodas);
                mo.setVelocidade(velocidade);
                mo.setPotenciaDoMotor(potenciaDoMotor);
                mo.setPartidaEletrica(partidaEletrica);
                mo.setVelocidadeAtual(velocidade);
                mo.getMarca();
                mo.getModelo();
                mo.getQtsRodas();
                mo.getVelocidade();
                mo.getPotenciaDoMotor();
                mo.getPartidaEletrica();
                mo.getVelocidadeAtual();
                mo.Acelerar(veloacelerar);
                mo.Frear(velofrear);
                mo.ImprimirV();
                mo.ImprimirA();
                mo.ImprimirM();
            }else if(qual==2){
                BufferedReader leitor = new BufferedReader(new FileReader(endereco));
                String marca = leitor.readLine();
                String modelo = leitor.readLine();
                String qtsR = leitor.readLine();
                String velo = leitor.readLine();
                String poten = leitor.readLine();
                String por = leitor.readLine();
                String veloace = leitor.readLine();
                String velofre = leitor.readLine();
                int qtsRodas = Integer.parseInt(qtsR);
                int velocidade = Integer.parseInt(velo);
                double potenciaDoMotor = Double.parseDouble(poten);
                int qtdPortas = Integer.parseInt(por);
                int veloacelerar = Integer.parseInt(veloace);
                int velofrear = Integer.parseInt(velofre);
                leitor.close();

                Carro ca;
                ca = new Carro(marca, modelo, qtsRodas, velocidade, potenciaDoMotor, qtdPortas);
                ca.setMarca(marca);
                ca.setModelo(modelo);
                ca.setQtsRodas(qtsRodas);
                ca.setVelocidade(velocidade);
                ca.setPotenciaDoMotor(potenciaDoMotor);
                ca.setQtdPortas(qtdPortas);
                ca.setVelocidadeAtual(velocidade);
                ca.getMarca();
                ca.getModelo();
                ca.getQtsRodas();
                ca.getVelocidade();
                ca.getPotenciaDoMotor();
                ca.getQtdPortas();
                ca.getVelocidadeAtual();
                ca.Acelerar(veloacelerar);
                ca.Frear(velofrear);
                ca.ImprimirV();
                ca.ImprimirA();
                ca.ImprimirC();
            }else if(qual==3){
                BufferedReader leitor = new BufferedReader(new FileReader(endereco));
                String marca = leitor.readLine();
                String modelo = leitor.readLine();
                String qtsR = leitor.readLine();
                String velo = leitor.readLine();
                String num = leitor.readLine();
                String bag = leitor.readLine();
                String veloace = leitor.readLine();
                String velofre = leitor.readLine();
                int qtsRodas = Integer.parseInt(qtsR);
                int velocidade = Integer.parseInt(velo);
                int numMarchas = Integer.parseInt(num);
                boolean bagageiro = Boolean.parseBoolean(bag);
                int veloacelerar = Integer.parseInt(veloace);
                int velofrear = Integer.parseInt(velofre);
                leitor.close();

                Bicicleta bi;
                bi = new Bicicleta(marca, modelo, qtsRodas, velocidade, numMarchas, bagageiro);
                bi.setMarca(marca);
                bi.setModelo(modelo);
                bi.setQtsRodas(qtsRodas);
                bi.setVelocidade(velocidade);
                bi.setNumMarchas(numMarchas);
                bi.setBagageiro(bagageiro);
                bi.setVelocidadeAtual(velocidade);
                bi.getMarca();
                bi.getModelo();
                bi.getQtsRodas();
                bi.getVelocidade();
                bi.getNumMarchas();
                bi.getBagageiro();
                bi.getVelocidadeAtual();
                bi.Acelerar(veloacelerar);
                bi.Frear(velofrear);
                bi.ImprimirV();
                bi.ImprimirB();
            }
        }else{
            System.out.println("Número Invalido");
        }
        l.close();
    }
}
