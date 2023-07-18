package desafios;

import java.util.*;

public class PrimeiroDesafio {
    private List<Integer> numeros = new LinkedList<>();
    private final Scanner SCANNER = new Scanner(System.in);

    public PrimeiroDesafio() {
        menuPrimeiroDesafio();
    }

    public void menuPrimeiroDesafio(){
        System.out.println("Quantos números deseja inserir?");
        int qtdNumeros = SCANNER.nextInt();
        adicionarNumeros(qtdNumeros);
        ordenarNumeros(numeros);
    }

    private void adicionarNumeros(int qtdInsercoes){
        for (int i = 0; i < qtdInsercoes; i++){
            System.out.printf("Adicione o %sº número:\n", i+1);
            int valor = SCANNER.nextInt();
            numeros.add(valor);
        }
    }

    private void ordenarNumeros(List<Integer> listaDeNumeros){
        List<Integer> numerosPares = new LinkedList<>();
        List<Integer> numerosImpares = new LinkedList<>();
        for (int numero: listaDeNumeros) {
            if(numero % 2 == 0){
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }
        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);
        Collections.reverse(numerosImpares);
        numeros.clear();
        numeros.addAll(numerosPares);
        numeros.addAll(numerosImpares);
        for (int numero: numeros) {
            System.out.println(numero);
        }
    }
}
