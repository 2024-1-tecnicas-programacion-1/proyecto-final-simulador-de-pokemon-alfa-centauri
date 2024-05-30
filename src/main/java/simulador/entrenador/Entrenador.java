package simulador.entrenador;

import java.util.LinkedList;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

public class Entrenador {
    private String nombre;
    private static LinkedList<Pokemon> pokemones;
    
    public Entrenador(String nombre){
        this.nombre=nombre;
        pokemones= new LinkedList<>();
    }
    
    public void agregarPokemon(Pokemon pokemon){
        pokemones.add(pokemon);
    }
    
    public void entrenarPokemon(Pokemon pokemon){
        pokemon.entrenar();
    }
    
    public static void mostrarPokemones(){
        for (int i = 0; i <pokemones.size(); i++) {
            String nombre = pokemones.get(i).getNombre();
            double salud = pokemones.get(i).getSalud();
            double ataque = pokemones.get(i).getPuntosDeAtaque();
            TipoPokemon tipo = pokemones.get(i).getTipoPokemon();
            System.out.println((i+1) + " " + nombre + " Salud: " + salud + " Ataque: " + ataque + " Tipo: " + tipo);
        }
    }
    
    public void prepararBatalla(){
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
