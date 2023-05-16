package ch20.Sample;

public class Main {
    public static void main(String[] args) {
        BigChar b = new BigChar('1'); // big1.txt
        b.print();

        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
