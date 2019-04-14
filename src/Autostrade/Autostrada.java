/**
 * Questa classe si occupa del mantenimento dei caselli e comunica con la
 * classe pedaggio per ricevere il prezzo basato sulla classe del veicolo e
 * sulle tassa interne all'autostrada 
 *    Patrizia Villani
 */

package src.Autostrade;

import java.util.*;

public class Autostrada{
    private String nome;            //nome autostrada
    private boolean tipo;           // Variabile dell'autostrada: montagna (TRUE) o di pianura(FALSE)
    private ArrayList<Casello> caselli;     // Caselli presenti su una autostrada.
    private HashMap<String,Double> tassa; // Composta dalla classe del veicolo e maggiorazione per relativa classe.
    
    public Autostrada(String nome, boolean tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.tassa = new HashMap<String,Double>();
        this.caselli = new ArrayList<Casello>();
    }

    public Autostrada(String nome, HashMap<String,Double> tassa, ArrayList<Casello> caselli, boolean tipo){
        this.nome = nome;
        this.tassa = tassa;
        this.caselli = caselli;
        this.tipo = tipo;
    }
    

    public double pedaggio(int km, Veicolo veicolo){    
        String classe = Normativa.getClasseVeicolo(veicolo);
        double tariffa = this.tassa.get(classe);
        return Pedaggio.calcola(veicolo, tariffa, km, tipo);
    }


    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    public HashMap<String,Double> getTariffe(){ return this.tassa; }
    public void setTariffe(HashMap<String,Double> tassa){ this.tassa = tassa; }

    public ArrayList<Casello> getCaselli(){ return this.caselli; }
    public void setCaselli(ArrayList<Casello> caselli){ this.caselli = caselli; }

    public boolean gettipo(){ return this.tipo; }
    public void settipo(boolean tipo){ this.tipo = tipo; }
}