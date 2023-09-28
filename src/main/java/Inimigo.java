public class Inimigo {

    private String nome;
    private Ataque ataque;

    public Inimigo(String nome, Ataque ataque){
        this.nome = nome;
        this.ataque = ataque;
    }

    public String getInimigo(){
        return "Inimigo: " +this.nome+"\nArma: " +this.ataque.getArma()+"\nDano: " +this.ataque.getDano();
    }


}
