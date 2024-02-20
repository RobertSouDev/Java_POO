package conceito_Heranca;

public class Main_func {
    public static void main(String[] args) {
//        Operario op = new Operario();
//        op.nome = "Maria";
//        op.idade = 19;
//        op.salario = 1400f;
//        op.bonus = 300f;
//        float h = op.bonusExtra(10, 10);
//        System.out.println("O ganho mensal do(a) "+ op.nome+" é de: "+(op.salario+h+ op.bonus));
//
        Funcionario f = new Operario();

        polimorfismo(f);
    }
    private static void polimorfismo(Funcionario f){
        f.trabalha();
    }

}//git remote add origin "https://github.com/RobertSouDev/Java_POO.git"

