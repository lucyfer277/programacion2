public class tanque del combustible B  {
    
}
public class TanqueCombustibleTest {

    public static void main(String[] args) {

        pruebaLlenarPorEncimaDeLaCapacidad();
        pruebaConsumirSinCombustibleSuficiente();

        System.out.println("Todas las pruebas propias pasaron correctamente.");
    }

    /**
     * Comprueba que llenar por encima de la capacidad
     * deja el tanque exactamente lleno y devuelve el sobrante.
     */
    public static void pruebaLlenarPorEncimaDeLaCapacidad() {

        TanqueCombustible tanque = new TanqueCombustible(50.0);

        double sobrante = tanque.llenar(70.0);

        assert tanque.nivel() == 50.0;
        assert sobrante == 20.0;
        assert tanque.porcentaje() == 100.0;
    }

    /**
     * Comprueba que intentar consumir más combustible
     * del disponible no modifica el nivel.
     */
    public static void pruebaConsumirSinCombustibleSuficiente() {

        TanqueCombustible tanque = new TanqueCombustible(100.0);

        tanque.llenar(30.0);

        boolean resultado = tanque.consumir(50.0);

        assert !resultado;
        assert tanque.nivel() == 30.0;
    }
}