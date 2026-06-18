package main;

import view.PanenForm;
import javax.swing.SwingUtilities;

public class MainApplication {
    public static void main(String[] args) {
        // Menjalankan UI Swing di thread yang aman (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            PanenForm form = new PanenForm();
            form.setVisible(true);
        });
    }
}