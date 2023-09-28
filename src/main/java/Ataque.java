public class Ataque {

    private String arma;
    private int  dano;

    public Ataque(String arma, int dano){
        this.arma = arma;
        this.dano = dano;
    }

    public String getArma() {
        return arma;
    }

    public int getDano() {
        return dano;
    }
}
