//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int nota1 = 8;
//        int nota2 = 7;
//
//        double media = (nota1 + nota2) / 2.0;
//        boolean aprovado = media >= 7;
//
//        System.out.println("Média " + media);
//        System.out.println("Aprovado " + aprovado);
//
//        System.out.println();
//
//        String nome = "Francisco";
//        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
//        System.out.println("Número de letras: " + nome.length());
//        System.out.println("Primeira letra: " + nome.charAt(4));

        System.out.println();

        double[] notas = {7.5, 8.0, 6.5, 9.0};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média da turma: " + media);


    }
}