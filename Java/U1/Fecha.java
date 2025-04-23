package U1;

public class Fecha {
    private int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int diasMes(int mes){
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[mes-1];
    }

    public void valida(){
        if (this.mes < 1){
            this.mes = 1;
        } else if (this.mes > 12){
            this.mes = 12;
        }
        if (this.dia < 1){
            this.dia = 1;
        } else if (this.dia > diasMes(this.mes)){
            this.dia = diasMes(this.mes);
        }
    }

    public void corta(){
        System.out.println(dia + "-" + mes + "-" + anio);
    }

    public void larga(){
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Nobiembre"};
        System.out.println(this.dia + " de " + meses[this.mes-1] + " de " + this.anio);
    }

    public void siguiente(){
        if ((this.dia + 1) > diasMes(this.mes)){
            if((this.mes + 1) > 12){
                this.anio++;
                this.mes = 1;
                this.dia = 1;
            } else {
                this.mes++;
                this.dia = 1;
            }
        } else {
            this.dia++;
        }
    }

    public void anterior(){
        if ((this.dia - 1) < 1){
            if((this.mes - 1) < 1){
                this.anio--;
                this.mes = 12;
                this.dia = diasMes(this.mes);
            } else {
                this.mes--;
                this.dia = diasMes(this.mes);
            }
        } else {
            this.dia--;
        }
    }

    public String igualQue(Fecha fechaComparar){
        if(fechaComparar.getDia() == this.dia && fechaComparar.getMes() == this.mes && fechaComparar.getAnio() == this.anio){
            return "Es igual";
        } else {
            return "No es igual";
        }
    }

    public String menorQue(Fecha fechaComparar){
        // Mucho codigo para esta funcion
        return "Mucho codigo";
    }

    public String mayorQue(Fecha fechaComparar){
        // Mucho codigo para esta funcion
        return "Mucho codigo";
    }
}
