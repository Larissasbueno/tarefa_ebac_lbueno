package br.com.lbueno.tarefa_cotroleDeFluxo;

public class ControleDeFluxo {
    public static void main (String args[]) {
        int n1 = 0;
        int n2 = 5;
        int n3 = 5;
        int n4 = 5;

        int media = (n1 + n2 + n3 + n4) / 4;
        System.out.println(media);

        int result = media;
         if (result >= 7) {
            System.out.println("Aprovado");
        } else if  (result == 5){
            System.out.println("Recuperação");
        } else if (result <5){
            System.out.println("Reprovado");
        }

    }
}
