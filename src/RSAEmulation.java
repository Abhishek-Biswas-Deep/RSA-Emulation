import java.util.*;

public class RSAEmulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the prime numbers, p and q: ");
        int p = in.nextInt();
        int q = in.nextInt();
        int n = p*q;
        System.out.println("Calculating RSA value ...");

        int newNumber = (p-1)*(q-1);
        int e = chooseE(newNumber);

        int d = chooseD(e, newNumber);

        System.out.println("Public RSA key is (" + e + ", " + n + ")");
        System.out.println("Private RSA key is (" + d + ", " + n + ")");

        System.out.print("Enter the plaintext message m (an integer): ");
        int m = in.nextInt();
        int c = encrypt(m, e, n);
        System.out.println("Encrypting m...");
        System.out.println("The ciphertext c is " + c);

        int primeValues = decrypt(c, d, n);
        System.out.println("Decrypting c ...");
        System.out.println("The plaintext m is " + primeValues);

    }

    private static int chooseE(int newNumber) {
        int e = 2;
        while(gcd(e, newNumber) != 1) {
            e++;
        }
        return e;
    }

    private static int chooseD(int e, int newNumber) {
        int d = 1;
        while((d*e)%newNumber != 1) {
            d++;
        }
        return d;
    }

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    private static int encrypt(int m, int e, int n) {
        return modPower(m, e, n);
    }

    private static int decrypt(int c, int d, int n) {
        return modPower(c, d, n);
    }

    private static int modPower(int a, int b, int n) {
        int result = 1;
        while(b > 0) {
            if(b%2 == 1) {
                result = (result * a) % n;
            }
            a = (a*a)%n;
            b = b/2;
        }
        return result;
    }
}
