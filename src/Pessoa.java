public class Pessoa {

    public String str ="Robert";
    public int ano_nascimento = 1998;
// public -> Nao realizar  restricoes de acesso a variaveis  ou metodos
    void falar(){
        System.out.println("Ola, seu nome é "+ str);
    }

    void ano(){
        System.out.println("Eu nasci em: "+ano_nascimento);
    }


}
