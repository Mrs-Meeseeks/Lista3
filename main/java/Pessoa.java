public class Pessoa {

    String nome;
    int cpf;
    int qtdEnd = 0;

    Endereco[] Vetordeenderecos;

    public Pessoa(String nome, int cpf,int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        this.Vetordeenderecos = new Endereco[qtdEnd];

    }

    public void addEndereco(Endereco end) {
        this.Vetordeenderecos[qtdEnd++] = end;

    }

    public void mostraInfo(){
        for (Endereco end : this.Vetordeenderecos) {
            if (end != null)
                System.out.println(end);
        }


    }
}