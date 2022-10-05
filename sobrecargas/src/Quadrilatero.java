public class Quadrilatero {
    
    public static void area(int base, int altura){

        System.out.println("A área do retangulo é: " + base * altura);
    }
    
    public static void area(int base){

        System.out.println("A área do quadrado é: " + base * base);
    }

    public static void area(int baseMaior, int baseMenor, int altura){

        System.out.println("A área do trapezio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2){

        System.out.println("A área do losando é: " + (diagonal1 * diagonal2) / 2);
    }

    }

