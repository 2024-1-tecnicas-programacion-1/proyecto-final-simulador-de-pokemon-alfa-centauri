package simulador.entrenador;

import java.util.LinkedList;
import simulador.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private LinkedList<Pokemon> pokemones;
    
    public Entrenador(){
        this.nombre=nombre;
        pokemones= new LinkedList<>();
    }
    
    public void agregarPokemon(Pokemon pokemon){
        this.pokemones.add(pokemon);
    }
    
    public void entrenarPokemon(Pokemon pokemon){
        pokemon.entrenar();
    }
    
    public void mostrarPokemones(){
        for (Pokemon pokemones : pokemones) {
            System.out.println(pokemones);
        }
    }
    
    public void prepararBatalla(){
    }
}
