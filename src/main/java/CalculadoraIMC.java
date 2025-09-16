package src.main.java;
public class CalculadoraIMC {

    public static double calcular(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        return peso / (altura * altura);
    }

    public static String classificar(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
