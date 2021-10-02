public class Lista_3 {

    public static void main(String[] args) {

        //cria dois enderecos e uma pessoa com qtdEnd=3
        //atribuie os enderecos a essa pessoa
        Endereco adress1 = new Endereco("rua da praca","centro",3);

        Endereco adress2 = new Endereco("rua da praca2","centro",5);

        Pessoa person1 = new Pessoa("Bruce Wayne",123,3);
        person1.addEndereco(adress1);
        person1.addEndereco(adress2);
        person1.mostraInfo();

        //pessoa com qtdEnd=4
        //endereco criado atraves do contrutor
        Pessoa person2 = new Pessoa("Rick Sanchez",137,4);
        person2.addEndereco(new Endereco("rua 1","Reta",122));
        person2.mostraInfo();

    }

}
