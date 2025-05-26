package ejercicios_curso_java;

public class Customer {
    private String name, size;

    public Customer(String name, int medida) {
        this.name = name;
        setSize(medida);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() { return this.size; }

    public void setSize(String size) { this.size = size;}

    public void setSize(int size){
        switch (size) {
            case 1, 2, 3:
                this.size = ("S");
                break;
            case 4, 5, 6:
                this.size = "M";
                break;
            case 7, 8, 9:
                this.size = "L";
                break;
            default:
                this.size = "XL";
                break;
        }
    }
}