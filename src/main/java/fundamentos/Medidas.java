// 1 -Pacote
package fundamentos;

// 2 - bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    //3.1 - Atributos
    static Scanner entrada;


    //3.2 - M�todos e Fun��es
    public static void main(String[] args) {
        String opcao;
        int area = 0; // receber o resultado dos c�lculos de �reas

        entrada = new Scanner(System.in); //instanciar o objeto de leitura do console

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); //Leitura da op��o
        switch (opcao){
            case "1":
               area = calcularAreaDoQuadrado();
               break;
            case "2":
                // ToDo: calcular �rea do ret�ngulo
                break;
            case "3":
                // ToDo: calcular �rea do Triangulo
                break;
            case "4":
                // ToDo: calcular �rea do Circulo
                break;
            default:
                System.out.println("Opcao invalida: " + opcao);
        };
        if(area > 0){
            System.out.println("a area e de " + area + "m�");
        }
    }

    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado * lado;  //retorna a �rea do quadrado


    }
}

