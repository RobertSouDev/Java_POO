package Aula_Inte;

public class Computador implements  Maquina,Teste{
    @Override
    public void ligar() {
        System.out.println("Pc ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Pc desligando...");
    }

    @Override
    public void Testar() {
        System.out.println("Pc sendo testado...");
    }
}
