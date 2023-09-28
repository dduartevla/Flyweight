import java.util.HashMap;
import java.util.Map;

public class Ataquefactory {

    private static Map<String, Ataque> ataques = new HashMap<>();

    public static Ataque getAtaque(String arma, int dano){
        Ataque ataque = ataques.get(arma);
        if(ataque == null){
            ataque = new Ataque(arma,dano);
            ataques.put(arma, ataque);
        }
        return ataque;
    }

    public static int getTotalAtaques(){
        return ataques.size();
    }

}
