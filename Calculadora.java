public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int multiplicarUsandoSumas(int a, int b) {
        if (b == 0) {
            return 0; 

        } else if (b > 0) 
            return a + multiplicarUsandoSumas(a, b - 1);

        } else {
            return -multiplicarUsandoSumas(a, -b); 
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}