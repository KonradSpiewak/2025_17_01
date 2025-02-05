public class Main {
    public static void main(String[] args) {

        Gryffin gryffin1 = new Gryffin("E4DCU", 5.6, 160, 310, 79, 208);
        Gryffin gryffin2 = new Gryffin("E4DCP", 5.6, 200, 310, 79, 208);
        Gryffin gryffin3 = new Gryffin("E4ACU", 5.6, 160, 310, 84, 208);
        Gryffin gryffin4 = new Gryffin("E4ACP", 5.6, 200, 310, 84, 208);
        Gryffin gryffin5 = new Gryffin("E4MSU", 5.6, 160, 310, 88, 220);
        Gryffin gryffin6 = new Gryffin("E4MSP", 5.6, 200, 310, 88, 220);
        Gryffin gryffin7 = new Gryffin("D4MSU", 2.3, 160, 248, 79, 196);
        Gryffin gryffin8 = new Gryffin("E4DCU", 5.6, 160, 310, 79, 208);
        Dragon dragon = new Dragon("E6ACTa", 5.0, 120, 450, 119, 196);



        System.out.println("gryffin1.equals(null): " + gryffin1.equals(null));
        System.out.println("gryffin1.equals(1): " + gryffin1.equals(1));
        System.out.println("gryffin1.equals(gryffin1): " + gryffin1.equals(gryffin1));
        System.out.println( "gryffin1.equals(Example Text: " + gryffin1.equals("Example Text"));
        System.out.println("gryffin1.equals(gryffin2): " + gryffin1.equals(gryffin2));
        System.out.println("gryffin1.equals(dragon): " + gryffin1.equals(dragon));
        System.out.println("gryffin1.equals(gryffin2): " + gryffin1.equals(gryffin2));
        System.out.println("gryffin1.equals(gryffin8): " + gryffin1.equals(gryffin8));


    }
}