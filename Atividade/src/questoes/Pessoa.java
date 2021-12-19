public class Pessoa {

    public String nome;
    public String pai;
    public String mae;

    public void SetNome(String nome) {
        this.nome = nome;
        this.pai = "";
        this.mae = "";
    }

    public void SetPessoa(String nome, String pai, String mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String GetNome() {
        return nome;
    }

    public String GetPai() {
        return pai;
    }

    public String GetMae() {
        return mae;
    }

    public void Irmaos(String irmao, String pai2, String mae2) {
        if(pai2.equals (pai) && mae2.equals (mae)){
            System.out.println(""+irmao+" e "+nome+" são irmãos");
        }else if(pai2.equals (pai)){
            System.out.println(""+irmao+" e "+nome+" são meio-irmãos");
        }else if(mae2.equals (mae)){
            System.out.println(""+irmao+" e "+nome+" são meio-irmãos");
        }else{
            System.out.println(""+irmao+" e "+nome+" não são irmãos");
        }
    }

    public void Antecessor(String parente){
        if(parente.equals (pai)){
            System.out.println("Pai de "+nome);
        }else if(parente.equals (mae)){
            System.out.println("Mae de "+nome);
        }else{
            System.out.println(""+parente+" não é antecessor de "+nome);
        }
    }
}