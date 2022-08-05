package GUI;

import auxClasses.Cliente;
import auxClasses.FachadaReservar;

import javax.swing.*;

public class ReservarEstacionamiento extends JFrame{

    private JPanel contentPanel;
    private JRadioButton espacioNormalRadioButton;
    private JRadioButton espacioGrandeRadioButton;
    private JButton siguienteButton;
    FachadaReservar fachada = new FachadaReservar();
    Cliente cliente;

    boolean restaurante;

    public ReservarEstacionamiento(boolean restaurante, Cliente cliente){
        setContentPane(contentPanel);
        setSize(600,400);
        this.restaurante = restaurante;
        this.cliente = cliente;
    }

    public static void main(String[] args) {
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        ReservarEstacionamiento dialog = new ReservarEstacionamiento(false, uno);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
