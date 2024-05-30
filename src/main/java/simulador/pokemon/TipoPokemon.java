package simulador.pokemon;

public enum TipoPokemon{

    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA;
    
    public static double obtenerMultiplicadorDeDanio(TipoPokemon atacante, TipoPokemon defensor){
        switch (atacante) {
            case FUEGO -> {
                switch (defensor) {
                    case PLANTA, BICHO, HIELO -> {
                        return 2.0;
                    }
                    case AGUA, ROCA, ACERO -> {
                        return 0.5;
                    }
                }
            }

            case AGUA -> {
                switch (defensor) {
                    case FUEGO, ROCA -> {
                        return 2.0;
                    }
                    case PLANTA -> {
                        return 0.5;
                    }
                }
            }

            case PLANTA -> {
                switch (defensor) {
                    case AGUA, ROCA, TIERRA -> {
                        return 2.0;
                }
                    case FUEGO, VENENO, ACERO, BICHO -> {
                        return 0.5;
                }
                }
            }
            case VENENO -> {
                switch (defensor) {
                    case PLANTA, HADA -> {
                        return 2.0;
                }
                    case FANTASMA, ROCA -> {
                        return 0.5;
                }
                }
            }
            case ELECTRICO -> {
                switch (defensor) {
                    case AGUA, VOLADOR -> {
                        return 2.0;
                }
                    case PLANTA -> {
                        return 0.5;
                }
                    case TIERRA -> {
                        return 0.0;
                }
                }
            }
            case PSIQUICO -> {
                switch (defensor) {
                    case VENENO, LUCHA -> {
                        return 2.0;
                }
                }
            }
            case ROCA -> {
                switch (defensor) {
                    case FUEGO, VOLADOR, ACERO, BICHO, HIELO -> {
                        return 2.0;
                }
                    case LUCHA -> {
                        return 0.5;
                }
                }
            }
            case TIERRA -> {
                switch (defensor) {
                    case FUEGO, VENENO, ROCA, ACERO -> {
                        return 2.0;
                }
                    case VOLADOR -> {
                        return 0.5;
                }
                    case ELECTRICO -> {
                        return 0.0;
                }
                }
            }
            case NORMAL -> {
                switch (defensor) {
                    case FANTASMA -> {
                        return 0.0;
                }
                }
            }
            case VOLADOR -> {
                switch (defensor) {
                    case PLANTA, ELECTRICO, BICHO -> {
                        return 2.0;
                }
                    case ROCA -> {
                        return 0.5;
                }
                }
            }
            case HADA -> {
                switch (defensor) {
                    case PSIQUICO -> {
                        return 2.0;
                }
                }
            }
            case LUCHA -> {
                switch (defensor) {
                    case ROCA, NORMAL, HIELO -> {
                        return 2.0;
                }
                    case PSIQUICO, HADA, FANTASMA -> {
                        return 0.5;
                }
                }
            }
            case ACERO -> {
                switch (defensor) {
                    case FUEGO, ROCA, HADA, LUCHA -> {
                        return 2.0;
                }
                    case PSIQUICO -> {
                        return 0.5;
                }
                }
            }
            case BICHO -> {
                switch (defensor) {
                    case PLANTA, VOLADOR -> {
                        return 2.0;
                }
                    case FANTASMA, ACERO -> {
                        return 0.5;
                }
                }
            }
            case HIELO -> {
                switch (defensor) {
                    case PLANTA, TIERRA -> {
                        return 2.0;
                }
                }
            }
            case FANTASMA -> {
                switch (defensor) {
                    case FANTASMA -> {
                        return 2.0;
                }
                    case VENENO -> {
                        return 0.5;
                }
                    case NORMAL -> {
                        return 0.0;
                }
                }
            }           
        }
        return 1.0;
    }    
}
