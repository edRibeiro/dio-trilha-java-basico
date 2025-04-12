import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
            System.out.println("Você deve digitar apenas números inteiros.");
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
