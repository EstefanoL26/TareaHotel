public class Main {
    public static void main(String[] args) {
        // Creación de la reserva
        Reserva reserva = new Reserva("Estéfano López", 5, "suite");
        reserva.mostrarInfo();

        // Cancelar la reserva
        reserva.cancelar();
        reserva.mostrarInfo();

        // Confirmar la reserva nuevamente
        reserva.confirmar();
        reserva.mostrarInfo();
    }
}

