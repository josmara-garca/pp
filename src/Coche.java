public class Coche {

    //atributos de la clase normalmente privados
    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;

    public void arrancar(){
        System.out.println("Estoy arrancando...");
    }

    public void acelerar (){
        System.out.println("Estoy acelerandoooo");
    }

    public void frenar (){
        System.out.println("Frenandop...");
    }

    public  void parar(){
        System.out.println("Apagando motor..");
        System.out.println("Motor parado...");
    }

    public void setPotencia(int potenciaDada) {
        if (potenciaDada > 0) {
            potencia = potenciaDada;
        }
    }
}


