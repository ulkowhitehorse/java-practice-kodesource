public class QuadraticEquations {
    double a;
    double b;
    double c;
    double x1; // root 1
    double x2; // root 2
    double D; // discriminant

    public void calculateRoots(double a, double b, double c){
        // ax^2 + bx + c = 0
        this.a = a;
        this.b = b;
        this.c = c;

        // D = b^2 -4ac
        D = Math.pow(b,2) - 4*a*c;

        // 1. D < 0 - no roots
        // 2. D = 0 - one root
        // 3. D > 0 - two roots
        if (D < 0){
            System.out.println("Нет корней, дискриминант меньше нуля");
            x1 = x2 = 0;
        } else if (D == 0){
            x1 = (-b + Math.sqrt(D))/2*a;
            x2 = x1;
            System.out.println("Дискриминант равен нулю, один корень, равный " + x1);
        } else {
            x1 = (-b + Math.sqrt(D))/2*a;
            x2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("Дискриминант больше нуля, два корня квадратного уравнения");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
