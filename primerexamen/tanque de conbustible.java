public class tanque de conbustible {
    
}
/**
 * Representa un tanque de combustible.
 *
 * El nivel siempre debe estar entre 0 y la capacidad.
 */
public class TanqueCombustible {

    private final double capacidad;
    private double nivel;

    /**
     * Crea un tanque vacío.
     *
     * @param capacidad capacidad máxima del tanque
     * @throws IllegalArgumentException si la capacidad no es mayor que cero
     */
    public TanqueCombustible(double capacidad) {
        if (!(capacidad > 0)) {
            throw new IllegalArgumentException();
        }

        this.capacidad = capacidad;
        this.nivel = 0.0;
    }

    /**
     * Devuelve la capacidad máxima del tanque.
     *
     * @return capacidad
     */
    public double capacidad() {
        return capacidad;
    }

    /**
     * Devuelve el nivel actual de combustible.
     *
     * @return nivel actual
     */
    public double nivel() {
        return nivel;
    }

    /**
     * Devuelve el nivel como porcentaje de la capacidad.
     *
     * @return porcentaje entre 0 y 100
     */
    public double porcentaje() {
        return (nivel / capacidad) * 100.0;
    }

    /**
     * Añade combustible sin superar la capacidad.
     *
     * @param cantidad cantidad de combustible a añadir
     * @return cantidad que no cupo
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public double llenar(double cantidad) {
        if (!(cantidad >= 0)) {
            throw new IllegalArgumentException();
        }

        double espacioDisponible = capacidad - nivel;

        if (cantidad <= espacioDisponible) {
            nivel += cantidad;
            return 0.0;
        }

        nivel = capacidad;
        return cantidad - espacioDisponible;
    }

    /**
     * Consume combustible solamente si existe suficiente.
     *
     * @param cantidad cantidad que se desea consumir
     * @return true si se consumió; false si no había suficiente
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public boolean consumir(double cantidad) {
        if (!(cantidad >= 0)) {
            throw new IllegalArgumentException();
        }

        if (cantidad > nivel) {
            return false;
        }

        nivel -= cantidad;
        return true;
    }
}
