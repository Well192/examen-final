package GUI;

import javax.swing.*;

public class ReservaHabitacionesGUI extends JFrame {

    private JPanel contentPane;
    private JPanel panelHabNormal;
    private JPanel panelHabEconomica;

    public ReservaHabitacionesGUI(){
        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        ReservaHabitacionesGUI dialog = new ReservaHabitacionesGUI();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
