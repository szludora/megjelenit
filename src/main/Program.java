package main;

import nezet.CUI_Megjelenito;
import nezet.JOP_Megjelenito;
import nezet.Megjelenito;

public class Program {

    public static void main(String[] args) {
        Megjelenito[] megj = {new CUI_Megjelenito(), new JOP_Megjelenito()};
        for (Megjelenito m : megj){
            m.inicializalas();
            m.feladat();
        }
    }

}
