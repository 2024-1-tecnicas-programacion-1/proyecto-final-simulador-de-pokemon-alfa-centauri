package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int pubtosDeAtaque;
    private String tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int pubtosDeAtaque, String tipo, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.pubtosDeAtaque = pubtosDeAtaque;
        this.tipo = tipo;
        this.estado = estado;
    }
    public abstract void atacar();
    
    public abstract int recibirDanio(int danio);
    
    public abstract void entrenar();
    
}
