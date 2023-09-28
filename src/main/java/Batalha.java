import java.util.ArrayList;
import java.util.List;

public class Batalha {

    List<Inimigo> inimigos = new ArrayList<>();

    public void adicionarInimigo(String inimigoNome, String arma, int dano){
        Ataque ataque = Ataquefactory.getAtaque(arma,dano);
        Inimigo inimigo = new Inimigo(inimigoNome,ataque);
        inimigos.add(inimigo);
    }

    public List<String> obterInimigos(){
        List<String> saida = new ArrayList<String>();
        for(Inimigo inimigo : this.inimigos){
            saida.add(inimigo.getInimigo());
        }
        return saida;
    }
}
