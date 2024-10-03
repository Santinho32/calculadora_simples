import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner calcular = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser calculado: ");
        double num1 = calcular.nextDouble();

        System.out.println("Digite a operação matemática que deseja fazer: ");
        String op = calcular.next();

        System.out.println("Digite o segundo numero a ser calculado: ");
        double num2 = calcular.nextDouble();

        if (op.equals("+")){
            System.out.println("O resultado da soma é: " + (num1+num2) );
        }
        else if (op.equals("-")){
            System.out.println("O resultado da subtração é: " + (num1-num2));
        }
        else if (op.equals("*")){
            System.out.println("O resultado da multiplicação é: " + (num1 * num2));
        }
        else if (op.equals("/")){
            System.out.println("O resultado da divisão é: " + (num1 / num2));
        } else {
            System.out.println("Operação inválida, tente novamente.");
        }
    }
}
