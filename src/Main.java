import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_LICZBA = 21/2;
        int los = (int)(Math.random() * MAX_LICZBA + 1);
        int odp = 0;
        int liczbProb=0;
        do {
            System.out.format("Podaj liczbe od 1 do %d (0 - konczy gre):", MAX_LICZBA);
            odp = sc.nextInt();
            if( 0 == odp ) break;
            ++liczbProb;
        } while ( odp != los );
        if( odp == los ) System.out.println( "Szukana liczba 6to " + los + ". Bylo " + liczbProb + " prob" );
        else System.out.println( "Koniec gry" );
    }
}
