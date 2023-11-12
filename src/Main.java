import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //----------CASOS DE PRUEBA----------------

        //CASO 1
        String[] dna = {"TTGCGA", "CGGTGC", "TTAAGT", "AGAAGG", "CCCCAA", "TCACTA"};
        System.out.println("---CASO 1---");
        mostrarDna(dna); //Método para mostrar las secuencias de DNA en formato 6x6
        boolean esMutante = isMutant(dna); //Verifica si es mutante o no  devuelve un booleano
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 2
        String[] dna2 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        System.out.println("---CASO 2---");
        mostrarDna(dna2);
        esMutante = isMutant(dna2);

        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 3
        String[] dna3 = {"ATGCGA", "CAGTAC", "TTGAGT", "AGAAGG", "CAACTA", "ACACTG"};
        esMutante = isMutant(dna3);
        System.out.println("---CASO 3---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 4
        String[] dna4 = {"ATGCGA", "CAGTGC", "TTGTGT", "AGAATG", "CCCCTA", "TCACTG"};
        esMutante = isMutant(dna4);
        System.out.println("---CASO 4---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 5
        String[] dna5 = {"ATGCGA", "CAGTGC", "TTGTGT", "AGAAGG", "CCCCTA", "TCACTG"};
        esMutante = isMutant(dna5);
        System.out.println("---CASO 5---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 6
        String[] dna6 = {"AAAAAA", "CCCCCC", "TTTTTT", "GGGGGG", "CCCCCC", "AAAAAA"};
        esMutante = isMutant(dna6);
        System.out.println("---CASO 6---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 7
        String[] dna7 = {"ATGCCA", "CAGTGC", "TTATGT", "AAAAGG", "CCACAA", "TCACTA"};
        esMutante = isMutant(dna7);
        System.out.println("---CASO 7---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 8
        String[] dna8 = {"AAAAAA", "CAGTGC", "TTGTGT", "AGAAGG", "CCACTA", "TCACTG"};
        esMutante = isMutant(dna8);
        System.out.println("---CASO 8---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 9
        String[] dna9 = {"AAAAAA", "CAGTGC", "TTGTGT", "AGAAGG", "CCACTA", "TCACTG"};
        esMutante = isMutant(dna9);
        System.out.println("---CASO 9---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

        //CASO 10
        String[] dna10 = {"ATAAAA", "AAGTGC", "ATGTGT", "AGAAGG", "ACACTA", "ACACTG"};
        esMutante = isMutant(dna10);
        System.out.println("---CASO 10---");
        if (esMutante) {
            System.out.println("ES MUTANTE\n");
        } else {
            System.out.println("NO ES MUTANTE\n");
        }

    }

    private static void mostrarDna(String[] dna) {
        for (String s : dna) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    private static boolean isMutant(String[] dna) {
        int contador = 0;


        //oblicuo de izq a der
        List<Integer> repetidas=new ArrayList<Integer>();// este arreglo guarda las posiciones ya usadas

        for (int i = 0; i < dna.length - 3; i++) {  //filas
            for (int j = 0; j < dna[i].length() - 3; j++) { //columnas
                if (dna[i].charAt(j) == dna[i + 1].charAt(j + 1) && !repetidas.contains(i-j)) { // se encarga de ver si existe un secuencia oblicua y valida que no se repita
                    if (dna[i + 1].charAt(j + 1) == dna[i + 2].charAt(j + 2)) {
                        if (dna[i + 2].charAt(j + 2) == dna[i + 3].charAt(j + 3)) {
                            contador++;

                            repetidas.add(i-j);


                        }
                    }
                }
            }
        }





        //oblicuo de der a izq
        for (int i = 0; i < dna.length - 3; i++) { // filas
            for (int j = dna[i].length() - 1; j > 2; j--) { // columnas
                if (dna[i].charAt(j) == dna[i + 1].charAt(j - 1)) {
                    if (dna[i + 1].charAt(j - 1) == dna[i + 2].charAt(j - 2)) {
                        if (dna[i + 2].charAt(j - 2) == dna[i + 3].charAt(j - 3)) {
                            contador++;


                        }
                    }
                }
            }
        }

        //horizontal
        for (int i = 0; i < dna.length; i++) { // filas
            for (int j = 0; j < dna[i].length() - 3; j++) { // columnas
                if (dna[i].charAt(j) == dna[i].charAt(j + 1) && dna[i].charAt(j) == dna[i].charAt(j + 2) && dna[i].charAt(j) == dna[i].charAt(j + 3)) { // se encarga de encontrar  secuencias horizontales
                    contador++;

                    break;
                }
            }
        }

        //vertical
        int columna = 0;
        for (int i = 0; i < dna.length - 3; i++) {
            for (int j = columna; j < dna[i].length(); j++) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j) && dna[i].charAt(j) == dna[i + 2].charAt(j) && dna[i].charAt(j) == dna[i + 3].charAt(j)) {
                    contador++;
                    columna++;

                }
            }

        }

        System.out.println("Contador de secuencias: "+contador+"\n");

        return contador > 1;
    }




}