package U5.drones;

public class Mision {
    private Dron dron;
    private boolean realizadoConExito;
    private float latitudDestino, longitudDestino;
    private static double latitudOrigen = -34.573195, longitudOrigen =-58.504111;
    private double distancia;

    public Mision(Dron dron, boolean realizadoConExito, float latitudDestino, float longitudDestino, double distancia) {
        this.dron = dron;
        this.realizadoConExito = realizadoConExito;
        this.latitudDestino = latitudDestino;
        this.longitudDestino = longitudDestino;
        this.distancia = distancia;
        this.distancia = calcularDistancia();
    }

    public Dron getDron() {
        return dron;
    }

    public void setDron(Dron dron) {
        this.dron = dron;
    }

    public boolean isRealizadoConExito() {
        return realizadoConExito;
    }

    public void setRealizadoConExito(boolean realizadoConExito) {
        this.realizadoConExito = realizadoConExito;
    }

    public float getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(float latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public float getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(float longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public static double getLatitudOrigen() {
        return latitudOrigen;
    }

    public static double getLongitudOrigen() {
        return longitudOrigen;
    }

    public double getDistancia() {
        return distancia;
    }

    public double calcularDistancia(){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }

    public void realizarViaje(){
        switch (this.dron.getClass().getName().toString()){
            case "DronCarga":
                if (this.distancia <= 30){
                    if (this.dron.getNivelCarga() > 52){
                        DronCarga dronEj = (DronCarga) this.dron;
                        dronEj.descargarBateria(52);
                        this.dron = dronEj;
                        this.realizadoConExito = true;
                    } else {
                        this.realizadoConExito = false;
                    }
                } else {
                    this.realizadoConExito = false;
                }
                break;
            case "DronVigilancia":
                DronVigilancia dronEj = (DronVigilancia) this.dron;
                double memoriaAusar = distancia/2 * 12;
                if (dronEj.getmemoriaSDlibre() > memoriaAusar){
                    this.realizadoConExito = true;
                } else {
                    this.realizadoConExito = false;
                }
                break;
        }
    }

}
