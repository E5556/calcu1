public class Calculadora {
    public int multiplicarUsandoSumas(int a, int b) {
        if (b == 0) {
            return 0; // Caso base: cualquier número multiplicado por 0 es 0
        } else if (b > 0) {
            return a + multiplicarUsandoSumas(a, b - 1); // Llamada recursiva con suma
        } else {
            return -multiplicarUsandoSumas(a, -b); // Manejo para b negativo
        }
    }
}