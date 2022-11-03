package ConditionalOp;
// Condition operator is to check the true or false conditon with two or more values at a time
//syntax : conditon ? task1(true):task2(false)
//WAP to check wether the value is -ve or +ve
public class TernaryOP {
public static void main(String[] args) {
    int a = -2;
    int b = 1;
    int c = a >= 0? a:b;
    System.out.println(c);
}
    
}