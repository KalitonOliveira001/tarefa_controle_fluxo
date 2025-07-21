import java.util.Scanner;  // Importa a classe Scanner para ler do console

public class NotasAluno {
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4;

        // Solicita ao usuário que digite as quatro notas
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();

        // Calcula a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprime a média calculada
        System.out.println("Média do aluno: " + media);

        // Condicional para verificar a situação do aluno
        if (media >= 7) {
            // Se a média for maior ou igual a 7, o aluno está aprovado
            System.out.println("Aprovado");
        } else if (media >= 5) {
            // Se a média for entre 5 (inclusive) e 7, está de recuperação
            System.out.println("Recuperação");
        } else {
            // Se a média for menor que 5, está reprovado
            System.out.println("Reprovado");
        }

        // Fecha o scanner para evitar vazamento de recurso
        scanner.close();
    }
}
