public class Reserva {
    private String nombreCliente;
    private int diasEstadia;
    private String tipoHabitacion; // Puede ser "individual", "doble" o "suite"
    private boolean estado; // true = confirmada, false = cancelada

    // Constructor
    public Reserva(String nombreCliente, int diasEstadia, String tipoHabitacion) {
        this.nombreCliente = nombreCliente;
        this.diasEstadia = diasEstadia;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = true; // Confirmada por defecto
    }

    // Mostrar información de la reserva
    public void mostrarInfo() {
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Días de Estadia: " + diasEstadia);
        System.out.println("Tipo de Habitación: " + tipoHabitacion);
        System.out.println("Estado: " + (estado ? "Confirmada" : "Cancelada"));
    }

    // Confirmar la reserva
    public void confirmar() {
        if (!estado) {
            estado = true;
            System.out.println("La reserva ha sido confirmada.");
        } else {
            System.out.println("La reserva ya está confirmada.");
        }
    }

    // Cancelar la reserva
    public void cancelar() {
        if (estado) {
            estado = false;
            System.out.println("La reserva ha sido cancelada.");
        } else {
            System.out.println("La reserva ya está cancelada.");
        }
    }

    public static void main(String[] args) {
        // Creación de la reserva
        Reserva reserva = new Reserva("Juan Pérez", 5, "suite");
        reserva.mostrarInfo();

        // Cancelar la reserva
        reserva.cancelar();
        reserva.mostrarInfo();

        // Confirmar la reserva nuevamente
        reserva.confirmar();
        reserva.mostrarInfo();
    }
}
