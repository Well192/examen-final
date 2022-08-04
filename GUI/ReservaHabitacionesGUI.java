package GUI;

import javax.swing.*;

public class ReservaHabitacionesGUI extends JFrame {

    private JPanel contentPane;
    private JPanel panelHabNormal;
    private JPanel panelHabEconomica;
    private JButton botonSiguiente;
    private JButton reservarButton;
    private JTextField inserteNumeroDeDiasTextField;

    public ReservaHabitacionesGUI(){
        setContentPane(contentPane);
        setSize(600,610);
    }

    public static void main(String[] args) {
        ReservaHabitacionesGUI dialog = new ReservaHabitacionesGUI();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
