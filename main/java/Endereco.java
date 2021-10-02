public class Endereco {

    String rua;
    String bairro;
    int num;

    Endereco(String rua,String bairro,int num){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;

    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", num=" + num +
                '}';
    }
}
