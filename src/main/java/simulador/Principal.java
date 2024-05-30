package simulador;
import java.util.*;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Abra;
import simulador.pokemon.Bellsprout;
import simulador.pokemon.Doduo;
import simulador.pokemon.Ekans;
import simulador.pokemon.Machop;
import simulador.pokemon.Magnemite;
import simulador.pokemon.Meowth;
import simulador.pokemon.Onix;
import simulador.pokemon.Pokemon;
import simulador.pokemon.Ponyta;
import simulador.pokemon.Staryu;
import simulador.pokemon.TipoPokemon;

public class Principal {
    static LinkedList <Entrenador> entrenadores = new LinkedList <>();
    static int elElegido;
    static int opcion;
    static Scanner pc = new Scanner(System.in);
    static LinkedList <Pokemon> pokemonesSiete = new LinkedList <>();
    public static void main(String[] args) {
        
        //Creación de pokemones
        Pokemon Ponyta = new Ponyta("Ponyta", 50, 85, TipoPokemon.FUEGO);
        pokemonesSiete.add(Ponyta);
        Pokemon Staryu = new Staryu("Staryu", 30, 45, TipoPokemon.AGUA);
        pokemonesSiete.add(Staryu);
        Pokemon Bellsprout = new Bellsprout("Bellsprout", 50, 75, TipoPokemon.PLANTA.VENENO);
        pokemonesSiete.add(Bellsprout);
        Pokemon Magnemite = new Magnemite("Magnemite", 25, 35, TipoPokemon.ELECTRICO.ACERO);
        pokemonesSiete.add(Magnemite);
        Pokemon Abra = new Abra("Abra", 25, 20, TipoPokemon.PSIQUICO);
        pokemonesSiete.add(Abra);
        Pokemon Onix = new Onix("Onix", 35, 45, TipoPokemon.ROCA.TIERRA);
        pokemonesSiete.add(Onix);
        Pokemon Doduo = new Doduo("Doduo", 35, 85, TipoPokemon.NORMAL.VOLADOR);
        pokemonesSiete.add(Doduo);
        Pokemon Meowth = new Meowth("Meowth", 40, 45, TipoPokemon.NORMAL);
        pokemonesSiete.add(Meowth);
        Pokemon Machop = new Machop("Machop", 70, 80, TipoPokemon.LUCHA);
        pokemonesSiete.add(Machop);
        Pokemon Ekans = new Ekans("Ekans", 35, 60, TipoPokemon.VENENO);
        pokemonesSiete.add(Ekans);
        //*/
        
        
        System.out.println("A continuación, seleccione algunas de las opciones para probar el simulador de las batallas de pokemon:");
        System.out.println("1. Gestionar Entrenadores\n2. Gestionar Pokémones\n3. Iniciar Batalla\n4. Salir");
        
        opcion = pc.nextInt();
        
        do{
           switch (opcion) {
               case 1 -> {
                   System.out.println("Gestionar Entrenadores.\n1. Registrar nuevo entrenador\n2. Ver lista de entrenadores\n3. Seleccionar un entrenador\n4. Volver al menú principal");
                   opcion = pc.nextInt();
                   switch(opcion){
                       case 1 -> {
                           String ed = pc.nextLine();
                           entrenadores.add(new Entrenador(ed));
                           break;
                    }
                       case 2 -> {
                           System.out.println("Lista de entrenadores:\n");
                           for(int i=0; i < entrenadores.size(); i++){
                           String en = entrenadores.get(i).getNombre();  
                               System.out.println((i+1) + " " + en);
                           }                          
                    }
                       case 3 -> {
                           System.out.println("Lista de entrenadores:\n");
                           for(int i=0; i < entrenadores.size(); i++){
                           String en = entrenadores.get(i).getNombre();  
                               System.out.println((i+1) + " " + en);
                           }
                           elElegido = pc.nextInt()-1;
                           System.out.println("1. Ver equipo de Pokémones\n2. Agregar Pokémon al equipo\n3. Entrenar Pokémon\n4. Volver a Gestionar Entrenadores");
                           opcion = pc.nextInt();
                           do{
                                switch(opcion){
                                    case 1 ->
                                        Entrenador.mostrarPokemones();
                                    case 2 -> {
                                        Entrenador.mostrarPokemones();
                                        entrenadores.get(elElegido).agregarPokemon(equipoSiete(elElegido));
                                        }
                                    case 3 -> {
                                         Entrenador.mostrarPokemones();
                                         entrenadores.get(elElegido).entrenarPokemon(equipoSiete(elElegido));
                                        }
                                    case 4 -> {
                                        System.out.println("Volverás a la gestión de entrenadores.");
                                        }
                                }
                           }while(opcion != 4);
                        }
                        case 4 -> {
                        System.out.println("¡Hasta luego!");
                        }
        }while(opcion != 4);
                        }
               case 2 -> {
               System.out.println("\n1. Ver todos los pokemones registrados.\n2. Registrar nuevo pokemon.\n3Volver al menú principal.");
                   opcion = pc.nextInt();
                   switch(opcion){
                       case 1:
                           for(int i = 0; i < )
                           break;
                       case 2:
                           break;
                       case 3:
                           break;
                   }
               }
        }
        public static Pokemon equipoSiete (int op){
            switch(op){
                case 1 -> {
                    Pokemon Ponyta = new Ponyta("Ponyta", 50, 85, TipoPokemon.FUEGO);
                    return Ponyta;
            }
                case 2 -> {
                    Pokemon Staryu = new Staryu("Staryu", 30, 45, TipoPokemon.AGUA);
                    return Staryu;
            }
                case 3 -> {
                    Pokemon Bellsprout = new Bellsprout("Bellsprout", 50, 75, TipoPokemon.PLANTA.VENENO);
                    return Bellsprout;
            }
                case 4 -> {
                    Pokemon Magnemite = new Magnemite("Magnemite", 25, 35, TipoPokemon.ELECTRICO.ACERO);
                    return Magnemite;
            }
                case 5 -> {
                    Pokemon Abra = new Abra("Abra", 25, 20, TipoPokemon.PSIQUICO);
                    return Abra;
            }
                case 6 -> {
                    Pokemon Onix = new Onix("Onix", 35, 45, TipoPokemon.ROCA.TIERRA);
                    return Onix;
            }
                case 7 -> {
                    Pokemon Doduo = new Doduo("Doduo", 35, 85, TipoPokemon.NORMAL.VOLADOR);
                    return Doduo;
            }
                case 8 -> {
                    Pokemon Meowth = new Meowth("Meowth", 40, 45, TipoPokemon.NORMAL);
                    return Meowth;
            }
                case 9 -> {
                    Pokemon Machop = new Machop("Machop", 70, 80, TipoPokemon.LUCHA);
                    return Machop;
            }
                case 10 -> {
                    Pokemon Ekans = new Ekans("Ekans", 35, 60, TipoPokemon.VENENO);
                    return Ekans;
            }
            }
        return null;
        }
}
    
