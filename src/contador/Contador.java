package contador;

public class Contador {

    private int cuenta;

    public void incrementar (int numero){
        cuenta+=numero;

    }

    public void decrementar (int numero){
        cuenta-=numero;

    }

    public void setCuenta (int numero){
        cuenta= numero;
    }

    public int getcuenta (){
        return cuenta;

    }
        

}
