import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Ex1e2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        nomesSeparadosPorSexo(s);
        nomesOrdenadosComArray(s);

        s.close();




        }


    // Ler um nome separado por "," e guardar em um metodo, ordenar e imprimir no console.
    private static void nomesOrdenadosComArray(Scanner s) {
        System.out.println("| ***** NomesOrdenadosComArray ***** |");
        System.out.print("digite nomes separados por virgula: ");
        String nome = s.nextLine();
        String[] nomes = nome.split(",");
        Arrays.sort(nomes); // Metodo para organizar o Array

        System.out.println("[" + String.join(", ", nomes) + " ]"); // nomes ordenados

    }

    //  Ler como " nome - Sexo ",  e separar por sexo em 2 grupos e imprimir cada.
    private static void nomesSeparadosPorSexo(Scanner s) {
            HashMap<String, String> dados = new HashMap<>();
        System.out.println("| ***** nomesSeparadosPorSexo ***** |");
            System.out.println("Digite 'nome - sexo' (M/F). Digite 'sair' para encerrar.");

            while (true) {
                System.out.print("Entrada: ");
                String entrada = s.nextLine();

                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                // Divide a string em nome e sexo
                String[] partes = entrada.split(" - ", 2);

                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String sexo = partes[1].trim();

                    // Armazena no HashMap
                    dados.put(nome, sexo);
                } else {
                    System.out.println("Formato inválido! Use 'nome - sexo'.");
                }
            }

            // Separando os nomes por sexo
            System.out.println("\nGrupo Masculino:");
            for (Map.Entry<String, String> entry : dados.entrySet()) {
                if (entry.getValue().equalsIgnoreCase("M")) {
                    System.out.println(entry.getKey());
                }
            }

            System.out.println("\nGrupo Feminino:");
            for (Map.Entry<String, String> entry : dados.entrySet()) {
                if (entry.getValue().equalsIgnoreCase("F")) {
                    System.out.println(entry.getKey());
                }
            }

        }
}
