class PokretanjePrikazZ01NaIzlazniToki {

    public static void main(String[] komandnaLinija) {
        double x = zbir(40, 2.0);
        System.out.print(x);
        System.out.println();
        System.out.println(x);
        System.out.printf("%6.0f\n", x);
        System.out.printf("%6.2f\n", x);

        System.out.println("Suma je " + x + "!");
        System.out.printf("Suma je %8.0f!\n", x);
        System.out.printf("Suma je %8.0f -- %8.4f!\n", x, x + 1);

    }

    static double zbir(int x, double y) {

        return x + y;
    }
}
