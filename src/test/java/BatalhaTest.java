import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BatalhaTest {

    @Test
    void deveRetornarInimigos(){
        Batalha batalha = new Batalha();
        batalha.adicionarInimigo("Ogro","Martelo", 300);
        batalha.adicionarInimigo("Orc", "Espada", 150);
        batalha.adicionarInimigo("Goblin","Arco", 100);
        batalha.adicionarInimigo("Morto-Vivo","Mordida",160);

        List<String> saida = Arrays.asList(
                "Inimigo: Ogro" + "\nArma: Martelo" + "\nDano: 300",
                "Inimigo: Orc" + "\nArma: Espada" + "\nDano: 150",
                "Inimigo: Goblin" + "\nArma: Arco" + "\nDano: 100",
                "Inimigo: Morto-Vivo" + "\nArma: Mordida" + "\nDano: 160"
        );

        assertEquals(saida,batalha.obterInimigos());
    }

    @Test
    void deveRetornarTotalInimigos(){
        Batalha batalha = new Batalha();
        batalha.adicionarInimigo("Ogro","Martelo", 300);
        batalha.adicionarInimigo("Orc", "Martelo", 300);
        batalha.adicionarInimigo("Goblin","Arco", 100);
        batalha.adicionarInimigo("Morto-Vivo","Arco",100);

        assertEquals(2,Ataquefactory.getTotalAtaques());
    }
}