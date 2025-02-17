package recursiva_soma_naturais;

public class SomaNumerosNaturais {

	public static int somar(int a, int b) {
        // Condição de parada quando b for 0, retorna a pois não mais numeros a serem adicionados
        if (b == 0) {
            return a;
        }
        
        // incrementa a reduzindo b até b ser 0
        return somar(a + 1, b - 1);
    }
}
