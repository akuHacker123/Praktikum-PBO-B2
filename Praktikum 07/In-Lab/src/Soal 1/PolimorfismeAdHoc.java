public class PolimorfismeAdHoc {
    public static void main(String[] args) {
        int nilai = 65;

        System.out.println("=== a. Konversi dasar ===");
        System.out.println("Integer: " + nilai);

        char karakter = (char) nilai;
        System.out.println("Char: " + karakter);

        double real = nilai;
        System.out.println("Double: " + real);

        String str = "123";
        int angkaInt = Integer.parseInt(str);
        double angkaDouble = Double.parseDouble(str);

        System.out.println("String ke int: " + angkaInt);
        System.out.println("String ke double: " + angkaDouble);

        String hasil = String.valueOf(nilai);
        System.out.println("Int ke String: " + hasil);


        // soal b
        int a = 10;
        double b = a;
        int c = (int) b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);


        // soal c
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (jumlah): " + Z);


        // soal d
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (concat): " + R);
        System.out.println("D (jumlah): " + D);


        // soal e
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);


        // soal f
        String T = A.toString();
        System.out.println("T: " + T);
    }
}