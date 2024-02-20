package conceito_Heranca;

public class Funcionario {

    public String nome;

    protected int idade;

    protected float salario;

    protected float bonus;

    protected float bonusExtra(int h, int f){
        return(h*1.5f)+(f*2f);
    }

    protected String trabalha(){
        String texto =  "trabalho feito";
        return texto;
    }
}
