package CodingBat;

public class makeChocolate {

    public int makeChocolate(int small, int big, int goal) {
        int rest;
        if (goal >= (5*big))
            rest = goal-(5*big);
        else
            rest = goal % 5;
        if (rest <= small)
            return rest;
        return -1;
    }

}
