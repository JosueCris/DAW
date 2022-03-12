package CodingBat;

public class closeFar {
    // Copia los tres metodos desde la 5 a la 21
    public boolean closeFar(int a, int b, int c) {
        if ((close(a, b) && far(a, b, c)) || (close(a, c) && far(a, c, b)))
            return true;
        return false;
    }

    public boolean close(int a, int b) {
        if (Math.abs(a-b) <= 1)
            return true;
        return false;
    }

    public boolean far(int a, int b, int c) {
        if ((Math.abs(a-c)>=2)  &&  (Math.abs(b-c)>=2))
            return true;
        return false;
    }
}
