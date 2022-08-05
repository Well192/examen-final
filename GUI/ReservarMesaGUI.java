package GUI;

import auxClasses.Cliente;
import auxClasses.FachadaReservar;

import javax.swing.*;

public class ReservarMesaGUI extends JFrame{
    private JPanel contentPanel;
    private JPanel panelMesaSim;
    private JRadioButton mesaGrandeRadioButton;
    private JRadioButton mesaPequeñaRadioButton;
    private JButton reservarButton;
    private JTextField nroDePersonasTextField;
    private JButton siguienteButton;
    FachadaReservar fachada = new FachadaReservar();
    Cliente cliente;

    public ReservarMesaGUI(Cliente cliente){
        setContentPane(contentPanel);
        setSize(600,400);
        this.cliente = cliente;
    }

    public static void main(String[] args) {
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        ReservarMesaGUI dialog = new ReservarMesaGUI(uno);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
