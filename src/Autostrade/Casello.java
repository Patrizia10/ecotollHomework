/**
 * Questa classe si occupa dell'uscita del veicolo dall'autostrada
 * calcolando la distanza percorsa dal veicolo e comunicando il tutto
 * all'autostrada di numero che restituisce il costo finale
 * della tratta 
 *    Patrizia Villani
 */

package src.Autostrade;

public class Casello{
    
    private Autostrada numero;  // Autostrada alla quale appartiene il casello
    private String nome;        // Nome autostrada
    private int km;

    public Casello(Autostrada numero, String nome, int km){
        this.numero = numero;
        this.nome = nome;
        this.km = km;
    }

    /**
     * Calcola i km percorsi dal veicolo e passa le informazioni 
     * sul veicolo all'autostrada 
     */
    public double costoUscita(Casello entrata, Veicolo veicolo){
        int km = this.distanza(entrata);
        return this.numero.pedaggio(km, veicolo);
    }

    /**
     * Distanza tra i caselli
     */
    private int distanza(Casello b){
        return Math.abs(this.km - b.getKm()); 
    }

    public Autostrada getnumero(){ return this.numero; }
    public void setnumero(Autostrada numero){ this.numero = numero; }

    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    public int getKm(){ return this.km; }
    public void setKm(int km){ this.km = km; }
}