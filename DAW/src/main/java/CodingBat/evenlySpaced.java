package CodingBat;

public class evenlySpaced {
    // copia desde la 5 a la 27
    public boolean evenlySpaced(int a, int b, int c) {
        int aux;
        if(a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if(b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        if(a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if(b-a == c-b)
            return true;
        return false;
    }
}
