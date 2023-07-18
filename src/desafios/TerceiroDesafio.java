package desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class TerceiroDesafio {
    private final Scanner SCANNER = new Scanner(System.in);

    private int[] array;
    private int k = 2;

    public TerceiroDesafio() {
        menuTerceiroDesafio();

    }

    public void menuTerceiroDesafio() {
        System.out.println("Defina o valor de K:");
        k = SCANNER.nextInt();
        System.out.println("Defina o tamanho do array.");
        int tamanhoArray = SCANNER.nextInt();
        gerarArray(tamanhoArray);
        int paresEncotrados = quantidadePares();
        System.out.printf("O número de pares que satisfazem o critério: %d\n", paresEncotrados);
    }

    private void gerarArray(int tamanhoArray) {
        int[] arrayCriado = new int[tamanhoArray];
        for (int i = 0; i < arrayCriado.length; i++) {
            System.out.printf("Defina o %s valor do array\n", i+1);
            int inputUsuario = SCANNER.nextInt();
            arrayCriado[i] = inputUsuario;
        }
        this.array = arrayCriado;
    }

    private int quantidadePares() {
        int valoresEncontrados = 0;
        for (int valor : array) {
            boolean encontrado = Arrays.stream(array).anyMatch(numero -> numero - valor == k);
            if (encontrado) {
                valoresEncontrados++;
            }
        }
        return valoresEncontrados;
    }
}






