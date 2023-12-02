import java.util.Scanner;

public class Main {
    private static final String TABLE_OF_CONTANT = "Please select the program you want to use:\n" +
            "1 - Random Number Selector\n" +
            "0 - exit program";
    private static final Scanner _reader = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to MakeAChoice!");
        System.out.println(TABLE_OF_CONTANT);
        int channel = _reader.nextInt();
        while (channel != 0){
            if(channel == 1){
                int result = useRandomNumberSelector();
                System.out.println(result);
            }
            System.out.println(TABLE_OF_CONTANT);
            channel = _reader.nextInt();
        }

        _reader.close();
    }

    public static int useRandomNumberSelector(){
        RandomNumberSelector randomNumberSelector = new RandomNumberSelector();
        //in the futrue: make this necessary (while loop)
        System.out.println("Enter an upper bound:");
        //in the future: check of 2^32
        int upper = _reader.nextInt();
        System.out.println("Enter a lower bound (optional, default is 0):");
        int lower = _reader.nextInt();
        System.out.println("Enter number of random numbers you want (optional, default is 1):");
        int n = _reader.nextInt();
        return randomNumberSelector.selectRandomNumber(lower, upper);
    }
}
