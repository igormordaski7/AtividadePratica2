import java.util.Scanner;

public class Console {
    
    static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        String txt = leitor.nextLine();
        return txt;
    }

    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

}
