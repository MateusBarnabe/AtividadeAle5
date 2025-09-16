package src.main.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Conversor de Temperatura");
        System.out.println("2 - Calculadora de IMC");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura:");
                double temp = scanner.nextDouble();
                System.out.println("Escolha a conversão:");
                System.out.println("1 - Celsius para Fahrenheit");
                System.out.println("2 - Fahrenheit para Celsius");
                int escolha = scanner.nextInt();

                if (escolha == 1) {
                    System.out.println(temp + " °C = " + ConversorTemperatura.celsiusParaFahrenheit(temp) + " °F");
                } else if (escolha == 2) {
                    System.out.println(temp + " °F = " + ConversorTemperatura.fahrenheitParaCelsius(temp) + " °C");
                } else {
                    System.out.println("Opção inválida!");
                }
                break;

            case 2:
                System.out.println("Digite o peso (kg):");
                double peso = scanner.nextDouble();
                System.out.println("Digite a altura (m):");
                double altura = scanner.nextDouble();

                double imc = CalculadoraIMC.calcular(peso, altura);
                String classificacao = CalculadoraIMC.classificar(imc);
                System.out.printf("IMC: %.2f - %s%n", imc, classificacao);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
