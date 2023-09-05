package Tama;

public class Tamagotchi {

    private String nombre;

    // TODO: Modificar estado a un ENUM
    private String estado;

    private Integer nivel;

    // TODO: Modificar lógica de tiempo de aburrimiento del tamagotchi
    private final Integer TIEMPO_ABURRIMIENTO_EN_MINUTOS = 90;

    public Tamagotchi(){
        nivel = 0;
        estado = "hambriento";
    }

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        nivel = 0;
        estado = "hambriento";
    }

    public String getNombre(){
        return nombre;
    }

    public Integer getNivel(){
        return nivel;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public Boolean comer(){
        if (estado.equals("hambrienta")){
            estado = "contenta";
        } else if (estado.equals("contenta")){
            nivel++;
        } else if (estado.equals("aburrida")){
            if (TIEMPO_ABURRIMIENTO_EN_MINUTOS > 80){
                estado = "contenta";
            }
        }
        return true;
    }

    public void jugar(){
        if (estado.equals("contenta")){
            nivel += 2;
        } else if (estado.equals("aburrida")){
            estado = "contenta";
        }
    }
}
