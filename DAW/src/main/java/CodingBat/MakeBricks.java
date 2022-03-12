package CodingBat;

public class MakeBricks {
    // Solo copia el metodo, la clase no hace falta
    public boolean makeBricks(int small, int big, int goal) {
        int rest;
        if(goal >= (5*big))
            rest = goal-(5*big);
        else
            rest = goal % 5;
        if(small >= rest)
            return true;
        return false;
    }
}
