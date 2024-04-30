public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda moneda = new ConsultaMoneda();
		Moneda conversion = moneda.monedaAConvertir("USD");
		System.out.println(conversion);
        
    } 
}