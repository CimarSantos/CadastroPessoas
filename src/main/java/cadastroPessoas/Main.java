package cadastroPessoas;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nome = new String[10];
        String[] sexo = new String[10];
        float[] altura = new float[10];
        float menorAlt=5000, maiorAlt=0, mediaAlt=0;
        int qtdH=0, qtdM=0;
        int op;

        System.out.println(" --- Cadastro de Pessoas --- ");
        do{

            System.out.println("\n1 - Cadastrar Pessoas");
            System.out.println("2 - Mostrar Pessoas");
            System.out.println("3 - Conjunto de Dados Cadastrais");
            System.out.println("0 - Finalizar Programa\n");
            System.out.print("Qual sua opção?: ");
            op = input.nextInt();
            input.nextLine();

            switch (op){

                case 1:

                    for (int i=0; i<nome.length; i++){

                        System.out.print("\nNome: ");
                        nome[i] = input.nextLine();
                        System.out.print("Altura: ");
                        altura[i] = input.nextFloat();

                            if (altura[i] < menorAlt){
                                menorAlt = altura[i];
                            } if (altura[i] > maiorAlt) {
                                maiorAlt = altura[i];
                            }
                        input.nextLine();
                        System.out.print("Sexo (m/f): ");
                        sexo[i] = input.nextLine();
                            if (sexo[i].equals("m")) {

                                qtdH++;
                                mediaAlt = altura[i];
                                mediaAlt = mediaAlt / qtdH;

                            } else {

                                qtdM++;

                            }
                    }

                    break;
                case 2:

                    for (int i=0; i<nome.length; i++){

                        System.out.println("Nome: " + nome[i]);
                        System.out.println("Altura: " + altura[i]);
                        System.out.println("Sexo: " + sexo[i]);
                        System.out.println("\n");
                    }

                    break;
                case 3:

                    System.out.println("A quantidade de mulheres é: " + qtdM);
                    System.out.println("A quantidade de homens é: " + qtdH);
                    System.out.println("Maior altura do Grupo: " + maiorAlt);
                    System.out.println("Menor altura do Grupo: " + menorAlt);
                    System.out.println("A média de altura dos homens é: " + mediaAlt);

                    break;

                default:
                    System.out.println("\nPrograma Finalizado\n\n");
            }

        }while (op!=0);
    }
}
