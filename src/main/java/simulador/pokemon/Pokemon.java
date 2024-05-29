package simulador.pokemon;

import java.io.Serializable;

public abstract class Pokemon implements Serializable {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private Estado estado;

    public Pokemon(String nombre, int salud, int pubtosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = pubtosDeAtaque;
        this.tipo = tipo;
        this.estado = Estado.NORMAL;
    }
    
    public void atacar(Pokemon oponente){
        int danio=(int)(this.puntosDeAtaque*TipoPokemon.obtenerMultiplicadorDeDanio(this.tipo, oponente.getTipoPokemon()));
        oponente.recibirDanio(danio);
    }
    
    public void recibirDanio(int danio){
        this.salud-=danio;
    }
    
    public void entrenar(){
        this.puntosDeAtaque+=5;
        this.salud+=10;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getSalud(){
        return this.salud;
    }
     
    public int getPuntosDeAtaque(){
        return this.puntosDeAtaque;
    }
    
    public TipoPokemon getTipoPokemon(){
        return this.tipo;
    }
    
    public Estado getEstado(){
        return this.estado;
    }
    
    public void setNombre(){
        this.nombre= nombre;
    }
    
    public void setSalud(){
        this.salud= salud;
    }
     
    public void setPuntosDeAtaque(){
        this.puntosDeAtaque= puntosDeAtaque;
    }
    
    public void setTipoPokemon(){
        this.tipo= tipo;
    }
    
    public void setEstado(){
        this.estado= estado;
    }
}
