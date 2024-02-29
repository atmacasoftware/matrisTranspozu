import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Defining variable
        int k, n, sayi;

        //import scanner class
        Scanner input = new Scanner(System.in);

        //Getting matrix values from the user
        System.out.println("Transpozu alınacak matris KxN şeklinde tanımlanacaktır.");
        System.out.print("K değerini giriniz : ");
        k = input.nextInt();
        System.out.print("N değerini giriniz : ");
        n = input.nextInt();

        //Incorrect value check
        if(k <= 0  || n <= 0){
            System.out.println("Hatalı değer girdiniz");
        }else{
            //Definition of matrices
            int[][] matris = new int[k][n];
            int[][] transpose = new int[n][k];

            //Using while loop to get matrix values from the user
            while (true){
                for (int i = 0; i < matris.length; i++) {
                    for (int j = 0; j < matris[i].length; j++) {
                        System.out.print("["+i+"]"+"["+j+"] sayısını giriniz : ");
                        sayi = input.nextInt();
                        matris[i][j] = sayi;
                    }
                }

                break;
            }

            //Print to matris
            System.out.println("Matris : ");

            for(int[] i : matris){
                for (int j: i){
                    System.out.print(" " + j + " ");
                }
                System.out.println();
            }

            //Transpose process
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    transpose[i][j] = matris[j][i];
                }
            }

            //Print to transpose
            for(int[] i : transpose){
                for (int j: i){
                    System.out.print(" " + j + " ");
                }
                System.out.println();
            }

        }

    }
}