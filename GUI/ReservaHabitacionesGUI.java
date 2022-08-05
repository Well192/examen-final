package GUI;

import ServicioHabitaciones.PrototypeRegistryHabitacion;
import auxClasses.Cliente;
import auxClasses.FachadaReservar;
import auxClasses.Servicio;
import auxClasses.Verificador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class ReservaHabitacionesGUI extends JFrame {

    boolean restaurante;
    boolean estacionamiento;

    FachadaReservar fachada = new FachadaReservar();
    Cliente cliente;

    private JPanel contentPane;
    private JPanel panelHabNormal;
    private JPanel panelHabEconomica;
    private JButton botonSiguiente;
    private JTextField nroDiasNormal;
    private JTextField nroDiasEconomico;
    private JTextField nroDiasPremiun;
    private JTextField nroDiasFamiliar;
    private JButton reservar1;
    private JButton reservar2;
    private JButton reservar4;
    private JButton reservar3;
    PrototypeRegistryHabitacion habitacion = new PrototypeRegistryHabitacion();
    Date fechaActual = new Date();

    public ReservaHabitacionesGUI(boolean estacionamiento, boolean restaurante, Cliente cliente){
        setContentPane(contentPane);
        setSize(600,610);
        nroDiasNormal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDiasNormal.setText("");
            }
        });
        nroDiasEconomico.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDiasEconomico.setText("");
            }
        });
        nroDiasFamiliar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDiasFamiliar.setText("");
            }
        });
        nroDiasPremiun.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDiasPremiun.setText("");
            }
        });
        this.restaurante = restaurante;
        this.estacionamiento = estacionamiento;
        this.cliente = cliente;
        reservar1.addActionListener(e -> {
            if(Verificador.esNumero(nroDiasNormal.getText())){
                fachada.hacerReserva(cliente , fechaActual, Float.parseFloat(nroDiasNormal.getText()), (Servicio) habitacion.get("Normal"));
            }else{
                JOptionPane.showMessageDialog(null,"los dias tienen que estar en digitos");
                return;
            }
        });

        reservar2.addActionListener(e -> {
            if(Verificador.esNumero(nroDiasEconomico.getText())){
                fachada.hacerReserva(cliente , fechaActual, Float.parseFloat(nroDiasEconomico.getText()), (Servicio) habitacion.get("Economica"));
            }else{
                JOptionPane.showMessageDialog(null,"los dias tienen que estar en digitos");
                return;
            }
        });

        reservar3.addActionListener(e -> {
            if(Verificador.esNumero(nroDiasFamiliar.getText())){
                fachada.hacerReserva(cliente , fechaActual, Float.parseFloat(nroDiasFamiliar.getText()), (Servicio) habitacion.get("Familiar"));
            }else{
                JOptionPane.showMessageDialog(null,"los dias tienen que estar en digitos");
                return;
            }
        });

        reservar4.addActionListener(e -> {
            if(Verificador.esNumero(nroDiasPremiun.getText())){
                fachada.hacerReserva(cliente , fechaActual, Float.parseFloat(nroDiasPremiun.getText()), (Servicio) habitacion.get("Premium"));
            }else{
                JOptionPane.showMessageDialog(null,"los dias tienen que estar en digitos");
                return;
            }
        });
    }

    public static void main(String[] args) {
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        ReservaHabitacionesGUI dialog = new ReservaHabitacionesGUI(false, false, uno);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
