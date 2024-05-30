package simulador.batalla;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;
import simulador.pokemon.Estado;

public class Batalla extends Pokemon{
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Batalla(Pokemon pokemon1, Pokemon pokemon2, String nombre, int salud, int pubtosDeAtaque, TipoPokemon tipo) {
        super(nombre, salud, pubtosDeAtaque, tipo);
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }
   
public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2){
    
    do{
    while(pokemon1.getEstado() == Estado.NORMAL && pokemon2.getEstado() == Estado.NORMAL && pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0){
        System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre());
    pokemon1.atacar(pokemon2);
    if(pokemon2.getEstado() != Estado.NORMAL){
        System.out.println(pokemon2.getNombre() + " ha sido debilitado. Los puntos de vida del pokemon son " + pokemon2.getSalud() + ".");
    }
        System.out.println(pokemon2.getNombre() + " contraataca a " + pokemon1.getNombre());
        pokemon2.atacar(pokemon1);
        
    if(pokemon1.getEstado() != Estado.NORMAL){
        System.out.println(pokemon1.getNombre() + " ha sido debilitado. Los puntos de vida del pokemon son " + pokemon1.getSalud() + ".");
    }
    }
    }while(pokemon1.getSalud() <= 0 || pokemon2.getSalud() <= 0);
    
    if(pokemon1.getSalud() <= 0 && pokemon2.getSalud() > 0){
        System.out.println("Ha ganado " + pokemon2.getNombre() + ".");
    } else if(pokemon2.getSalud() <= 0 && pokemon1.getSalud() > 0){
        System.out.println("Ha ganado " + pokemon1.getNombre() + ".");
    } else if(pokemon1.getSalud() == pokemon2.getSalud()){
        System.out.println("Empate, no hay perdedores ni ganadores.");
    }
}
}
