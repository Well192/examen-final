package GUI;

import javax.swing.*;

public class ReservarEstacionamiento extends JFrame{

    private JPanel contentPanel;
    private JRadioButton espacioNormalRadioButton;
    private JRadioButton espacioGrandeRadioButton;
    private JButton siguienteButton;

    public ReservarEstacionamiento(){
        setContentPane(contentPanel);
        setSize(600,400);
    }

    public static void main(String[] args) {
        ReservarEstacionamiento dialog = new ReservarEstacionamiento();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
