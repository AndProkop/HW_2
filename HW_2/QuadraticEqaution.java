package HW_2;

public class QuadraticEqaution {
    private float a;
    private float b;
    private float c;

    public QuadraticEqaution (float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        QuadraticEqaution quadraticEqaution = new QuadraticEqaution(2, 9, 4);
        quadraticEqaution.getSolution();
    }

    public void getSolution() {
        if (discriminant(a, b, c) < 0) {
            System.out.println("Уравнение не имеет корней!");
        } else if (discriminant(a, b, c) == 0) {
            findOneRoot(a, b, c);
        } else {
            findTwoRoots(a, b, c);
        }

    }

    public float discriminant (float a, float b, float c){
        float discriminant = b * b - 4 * a * c;
        return discriminant;
    }

    public void findOneRoot(float a, float b, float c) {
        float x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    private void findTwoRoots(float a, float b, float c) {
        float x1 = (-b + (float) Math.sqrt(discriminant(a, b, c))) / (2 * a);
        float x2 = (-b - (float) Math.sqrt(discriminant(a, b, c))) / (2 * a);
        System.out.println("x1 = " + x1 + "\nx2 = " + x2);
    }
}
