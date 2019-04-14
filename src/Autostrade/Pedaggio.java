/**
 * Classe che si occupa del calcolo effettivo del pedaggio
 * che il veicolo deve pagare
 *  Patrizia Villani
 */
package src.Autostrade;

public class Pedaggio{

    /**
     * Il calcolo viene effettuato sulla tariffa associata alla 
     * classe del veicolo con una maggiorazione del 15% per km se
     * l'autostrada e' di tipo montana, inoltre viene applicata 
     * (in previsione di future implementazioni) una differenziazione
     * basata sul veicolo.
     * Infine al prezzo viene aggiunta l'iva e arrotondato
     */
    public static double calcola(Veicolo veicolo, double tariffa, int km, boolean tipo){
        double prezzo = ((tariffa)*(tipo ? 1.15 : 1))*km + Normativa.differenziazione(veicolo);
        prezzo = prezzo + prezzo*Normativa.IVA;
        prezzo = Math.round(prezzo*10)/10;
        return prezzo;
    }
}
