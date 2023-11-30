package nezet;

import javax.swing.JOptionPane;
import modell.Teglalap;

public class JOP_Megjelenito extends Megjelenito {

    private Teglalap tegla;

    public JOP_Megjelenito() {
        int icoTipus = JOptionPane.WARNING_MESSAGE;
    }

    @Override
    public void inicializalas() {
        String u = JOptionPane.showInputDialog("\'A\' oldal: ");
        int a = Integer.parseInt(u);

        u = JOptionPane.showInputDialog("\'B\' oldal: ");
        int b = Integer.parseInt(u);
        tegla = new Teglalap(a, b);
    }

    @Override
    public void feladat() {

        String s = "A téglalap területe, kerülete: ";
        s += String.format("\tT: %.3f\n", tegla.terulet());
        s += String.format("\tT: %.3f\n", tegla.terulet());
        JOptionPane.showMessageDialog(null, s);
    }
}
