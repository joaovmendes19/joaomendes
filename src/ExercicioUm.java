import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            
            case 1:
                // media(double notaUm, double notaDois, double notaTres)
                
                media(3, 4, 3);

                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                // area(double ladoUm, double ladoDois)
                System.out.println(area(15,12));
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                // volume(double largura, double altura, double profundidade)
                double largura=10;
                double altura = 20;
                double profundidade=30;
                double volume = (volume(largura,altura,profundidade));
                System.out.println(volume);
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
            double base =20;
            double verificar = 30;
            boolean batata  = valorMaiorQueDobro( base, verificar);
            if(batata){
                System.out.println("O valor é maior que o dobro de "+ verificar);
            }
            else{
                System.out.println("O valor é menor que o dobro de "+ verificar );
            }

            System.out.println(batata ? "O valor é maior que o dobro de "+ verificar : "O valor é menor que o dobro de "+ verificar );
                // valorMaiorQueDobro(double base, double verificar)
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // bhaskara(int a, int b, int c);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                // mediaViagem(double distancia, double tempo)
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
            int valor =15;     
            boolean verificacao = parOuImpar( valor);
            if(verificacao=true)
            
            {
                System.out.println("\n Esse valor é par: " +valor);
            }
            else{
                System.out.println("\n Esse valor é impar: "+valor);
            }
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
    
                double media = (notaUm + notaDois+ notaTres)/3;
                System.out.println("O valor da média é" + media);

        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        System.out.println("Valor da area");
        double area  = (ladoUm * ladoDois);
        


        
        return area;
    }

    public static double volume(double largura, double altura, double profundidade) {
        System.out.println("Calcular volume");
        double volume  = (largura * altura * profundidade);
        return volume;

    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        System.out.println("Calculo maior que o Dobro.");

        if((base*2) < verificar){

            return true;

        }

            return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b*b) - (4*a*c);
        double x1=0;
        double x2=0;
        if(delta<0){
            System.out.println("Delta é negativo");

        } else if (delta==0){
            x1= -b/(2*a);
        x2=x1;
        }else{
            x1=((-b)+Math.sqrt(delta))/(2*a);
            x1=((-b)-Math.sqrt(delta))/(2*a);

        }
        System.out.println(x1);
        System.out.println(x2);
        return new double[] {x1,x2};
    }

    public static double mediaViagem(double distancia, double tempo) {
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {

        return (qtdImposto*100)/faturamento;
    }

    public static boolean parOuImpar(int valor) {
        if(valor%2==0)
        {
             return true;
        }

        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return (int) Double.parseDouble(valor);
    }

    public static double percentualImpostoSalario(double salario) {
        if(salario<=1983) {
            return 0;
            
        }
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}