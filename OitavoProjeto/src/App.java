import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
                // DECLARAÇÃO DE ARRAY ESTÁTICO

        // Classe nomeObjeto = new ArrayList();
        // Array (vetor) -> com um tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5]; // {"João", "Maria"}
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Vegeta";
        arrayEstatico[4] = "Bob Esponja";

                // EXIBIÇÃO DE ARRAY ESTÁTICO

        System.out.println("Primeira posição " + arrayEstatico[0]); // Consigo saber no 'Array Estático' qual o valor no índice 0

        System.out.println("Última posição " + arrayEstatico[4]); // Consigo saber no 'Array Estático' qual o valor no índice 4

        System.out.println("Imprimindo o Array Estático"); // Imprimindo Array Estático completo
        for (int indice = 0; indice < arrayEstatico.length; indice ++){
            System.out.println(arrayEstatico[indice]);
        }

/* ------------------------------------------------------------------------------------------------------------- */

                // DECLARAÇÃO DE ARRAYLIST COM STRING E INTEGER

        // ArrayList<Tipo> nome = new ArrayList<Tipo>(); declaração para ArrayList do tipo 'String'

        /*
         * Tipo Primitivo   ->   Wrapper Class
         * int              ->   Integer
         * float            ->   Float
         * double           ->   Double
         * char             ->   Character
         * 
         * Exemplos:
         * 
         * Declaração de ArrayList do tipo 'int' seria:
         * ArrayList<Integer> numeros = new ArrayList<Integer>();
         * 
         * Declaração de ArrayList do tipo 'char' seria:
         * ArrayList<Character> numeros = new ArrayList<Character>();
         */

        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); // automaticamente índice 0
        arrayDinamico.add("Maria"); // automaticamente índice 1
        arrayDinamico.add("Pedro"); // automaticamente índice 2
        arrayDinamico.add("Vegeta"); // automaticamente índice 3
        arrayDinamico.add("Bob Esponja"); // automaticamente índice 4

        // Ordena Array de String

        Collections.sort(arrayDinamico); // sort ordena as String na forma crescente
        Collections.sort(arrayDinamico, Collections.reverseOrder()); // ordena as String na forma decrescente
        for (String string : arrayDinamico) {
            System.out.println(string);
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        // Ordena Array de Integer

        Collections.sort(numeros); // sort ordena os números na forma crescente
        Collections.sort(numeros, Collections.reverseOrder()); // ordena os números na forma decrescente
        for (Integer integer : numeros) {
            System.out.println(numeros);
        }

        // Exemplo de declaração de objeto utilizando o arraylist
  
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 20));
        pessoas.add(new Pessoa("Maria", 22));
        pessoas.add(new Pessoa("Pedro", 75));

        // Exibe as pessoas através do método getNome da classe Pessoa.java
        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }

                // EXIBIÇÃO DE ARRAYLIST        

        // arrayDinamico.size() Consigo saber no ArrayList quantos índices existem usando o .size()

        System.out.println("Primeira posição " + arrayDinamico.get(0)); // Consigo saber no 'ArrayList' qual o valor no índice 0 por meio do 'Método GET'

        int ultimoIndice = arrayDinamico.size() - 1; // Consigo saber no 'ArrayList' qual o valor do último índice
        System.out.println("Última posição " + arrayDinamico.get(ultimoIndice));

        System.out.println("Imprimindo o ArrayList com o 'FOR'"); // Imprimindo ArrayList completo com o 'FOR'
        for (int indice = 0; indice < arrayDinamico.size(); indice ++){
            System.out.println(arrayDinamico.get(indice));
        } 

        System.out.println("Imprimindo o ArrayList com o 'FOREACH'"); // Imprimindo ArrayList com o 'FOREACH'
        for (String nome : arrayDinamico){ 
            System.out.println(nome);
        }

                // REMOVER UM ELEMENTO POR ÍNDICE NO ARRAYLIST

        System.out.println("Remove Pedro");
        arrayDinamico.remove(2);
        } 

                // LIMPAR TODO O ARRAYLIST
        
        // arrayDinamico.clear();
}

