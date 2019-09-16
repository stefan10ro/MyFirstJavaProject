public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        // Sume
        String nume = "Stefan";
        System.out.println(nume);
        int numarul1 = 5;
        int numarul2 = 15;
        int sum = numarul1 + numarul2;

        System.out.println("Suma a doua numere 5+15:"+sum);

        int nr1 = 10;
        int nr2 = 2;
        int div = nr1/nr2;
        System.out.println("impartirea a doua numere 10/2:"+div);

        int no1 = -5;
        int no2 = 8;
        int no3 = 6;
        int total= no1+no2*no3;

        System.out.println("-5+8*6="+total);

        int a = 55;
        int b = 9;
        int c = 9;
        int total1 = (a+b) % c;

        System.out.println("(55+9) % 9= " + total1);

        int a1 = 20;
        int b1 = -3;
        int c1 = 5;
        int d1 = 8;
        int total2 = a1+b1*c1/d1;

        System.out.println("20+ -3*5/8="+total2);

        int a2 = 5;
        int b2 = 15;
        int c2 = 3;
        int d2 = 2;
        int e2 = 8;
        int f2 = 3;
        int total3 = a2+b2/c2*d2-e2%f2;

        System.out.println("5+15/3*2-8%3="+total3);
    }
}