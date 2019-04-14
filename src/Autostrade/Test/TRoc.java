/**
 * Classe creata per semplificare il testing del software
 * 
 * @package  Autostrade.Test
 * @class    TRoc
 * @author   Patrizia Villani
 */

package src.Autostrade.Test;
import src.Autostrade.Veicolo;

public class TRoc extends Veicolo{
    public TRoc(String targa, int anno){
        super(
            "T-Roc",
            "Volkswagen", 
            targa, 
            1500, 
            75, 
            anno,
            2,
            115, 
            1890, 
            1.573
        );
    }
}