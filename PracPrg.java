
//WAP to check max of 4 num using conditonal operator.
package ConditionalOp;

public class PracPrg {
    public static void main(String[] args) {
        //4 numbers/int
        int a=10;
        int b=9;
        int c=14;
        int d=10;

        //conditon to check max no
        int res = a>b ? a:b; //value will is stored in res
        int res1 = res>c ? res:c; //value will is stored in res1
        int res2 = res1>d ? res1:d;//value will be stroed in res2
        System.out.println("a>b: " + res);
        System.out.println("res>c: " + res1);
        System.out.println("res2>d: " + res2);
                                
    }
}
