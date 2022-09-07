import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
                // calculaMedia(double notaUm, double notaDois, double notaTres);
                    
                System.out.println("Digite a primeira nota.");
                Double n1 = scanner.nextDouble();
                System.out.println("Digite a segunda nota.");
                Double n2 = scanner.nextDouble();
                System.out.println("Digite a terceira nota.");
                Double n3 = scanner.nextDouble();  
                Double median = calculaMedia(n1,n2,n3);
                System.out.println("A média das notas é:" +calculaMedia(  n1,   n2,   n3 ));

            
                    
            
                    
                            
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                // qualMes(int mes);
                System.out.println("Digite um número que corresponda a um mês:");
                int mes = scanner.nextInt();
                System.out.println("O mes digitado é: " + qualMes(mes));
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                char[]=letraALetra(String palavra);
                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                System.out.println("Digite um nmero inteiro");
                int parimpar = scanner.nextInt();
                numerosImpares(parimpar);
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                // imc(double altura, double peso);
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia( Double n1,  Double n2,  Double n3) {
        double media = (n1+n2+n3)/3;
        System.out.println("A média das notas é:"+media);
        if(media>7)
        {
            System.out.println("O aluno passou");
        }
        else
        {
            System.out.println("Reprovado");
        }
        return media;
    }

    public static String qualMes(int mes) {
        switch(mes){

            case 1:
            return "Janeirinho";
            
            case 2:
            return "Fevereirinho";
            case 3:
            return "Marçozinho";
            case 4:
            return "Abrilzinho";
            case 5:
            return "Maiozinho";
            case 6:
            return "Junhozinho";
            case 7:
            return "Julhozinho";
            case 8:
            return "Agostinho";
            case 9:
            return "Setembrozinho";
            case 10:
            return "Outubrozinho";
            case 11:
            return "Novembrozinho";
            case 12:
            return "Dezembrozinho";
            default:
            return null;        }

    }

    public static int[] tabuada(int numero) {
       

        return new int[10];
    }

    public static char[] letraALetra(String palavra) {
        System.out.println("");

        return new char[1];
    }

    public static int numerosImpares(int parimpar) {
     for(String i='pinto'){

     }
    
    }

    public static double calculaMedia(double[] notas) {

        return 0;
    }

    public static int fatorial(int numero) {
        return 0;
    }

    public static double imc(double altura, double peso) {
        double result = (altura*altura)/peso;
        if(result<18.5)
        {
            System.out.println("Abaixo do peso");
        }
        if((result>18.6) && (result<24.9))
        {
            System.out.println("Peso ideal");
        }
        if((result>25.0) && (result<29.9))
        {
            System.out.println("Acima do peso");
        }
        if((result>30.0) && (result<34.9))
        {
            System.out.println(" Obesidade Grau I");
        }

        

        return 0;
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        return 0;
    }

    public static int[] notasNecessarias(int valor) {
        return new int[6];
    }
}
