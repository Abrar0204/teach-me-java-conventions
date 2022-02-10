package powerpackage;

public class Power {
    public static int of(int base, int exp) {
        int res = 1;
        while(exp > 0){
            res *= base;
            exp--;
        }
        return res;
    }
}
