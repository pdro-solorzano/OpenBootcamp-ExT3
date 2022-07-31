public class Main {
    public static void main(String[] args) {
        int result = 0;
        // Call function
        result = sumar(15, 10, 36);
        System.out.println("Result: " + result);

        // Class coche
        Coche miCoche = new Coche();
        miCoche.addDoor();
        System.out.println(miCoche.doors);
    }

    public static int sumar (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

