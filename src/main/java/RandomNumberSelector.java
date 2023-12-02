import java.util.Random;

public class RandomNumberSelector {
    private final Random _random;
    //constructs a new RNS object
    public RandomNumberSelector(){
        _random = new Random();
    }

    //upperbound inclusive
    public int selectRandomNumber(int lower, int upper){
        return _random.nextInt(lower, upper + 1);
    }

    //lower is 0 by default
    public int selectRandomNumber(int upper){
        return _random.nextInt(upper + 1);
    }
}
