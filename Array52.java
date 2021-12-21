package array52;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Array52 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        int indice = 0;
        do {
            System.out.print("Mete un numero entero: ");
            numero = Integer.parseInt(s.nextLine());
        } while (numero < 1 && numero > 100);
        String[] array = new String[numero];
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        do {
            System.out.print("\nMete un índice: ");
            indice = Integer.parseInt(s.nextLine());
        } while (indice < 0 && indice > array.length - 1);
        System.out.print("Introduzca un elemento String para el índice seleccionado: ");
        array[indice] = s.nextLine();

        int divisor = 0;
        for (String array2 : array) {
            if ((divisor + 1) % 5 == 0) {
                System.out.print(array[divisor] + "\n");
            } else {
                System.out.print(array[divisor] + " ");
            }
            divisor++;
        }

    }

}
