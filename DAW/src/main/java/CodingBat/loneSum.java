package CodingBat;

public class loneSum {

    public int loneSum(int a, int b, int c) {
        int suma = 0;
        if(a != b && a != c)
            suma += a;
        if(b != a && b != c)
            suma += b;
        if(c != a && c != b)
            suma += c;
        return suma;
    }

}
