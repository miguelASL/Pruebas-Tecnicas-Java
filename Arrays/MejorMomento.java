package Pruebas.Arrays;

/*
Se le proporciona una matriz de números enteros pricesdonde prices[i]está el precio de una acción determinada en el
día.ith Cada día, usted puede decidir comprar y/o vender las acciones. Sólo puede poseer como máximo una acción a la
vez. Sin embargo, puedes comprarlo y venderlo inmediatamente el mismo día .
Encuentre y devuelva el máximo beneficio que pueda lograr .

Entrada: precios = [7,1,5,3,6,4]
 Salida: 7
 Explicación: Compre el día 2 (precio = 1) y venda el día 3 (precio = 5), ganancia = 5-1 = 4.
Luego compre el día 4 (precio = 3) y venda el día 5 (precio = 6), ganancia = 6-3 = 3.
La ganancia total es 4 + 3 = 7.
 */
public class MejorMomento {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Inicializar un array para almacenar los beneficios hasta el día i
        int[] profits = new int[prices.length];

        // Iterar desde el segundo día hasta el final
        for (int i = 1; i < prices.length; i++) {
            // Calcular el beneficio si vendemos en el día i
            int sellToday = prices[i] - prices[i-1] + profits[i-1];

            // Calcular el beneficio si no hacemos ninguna transacción en el día i
            int noTransactionToday = Math.max(profits[i-1], 0);

            // Actualizar el beneficio máximo hasta el día i
            profits[i] = Math.max(sellToday, noTransactionToday);
        }

        // El beneficio máximo estará en profits[profits.length - 1]
        return profits[profits.length - 1];
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = sol.maxProfit(prices);
        System.out.println(result);  // Salida esperada: 7
    }*/
}
