package GUI;

import ServicioRestaurante.PrototypeRegistryMesa;
import auxClasses.Cliente;
import auxClasses.FachadaReservar;
import auxClasses.Servicio;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class ReservarMesaGUI extends JFrame{
    private JPanel contentPanel;
    private JRadioButton mesaGrandeSimple;
    private JRadioButton mesaPequenaSimple;
    private JButton reservarSimpleButton;
    private JTextField nroDePersonasSimple;
    private JButton siguienteButton;
    private JRadioButton mesaGrandeVIP;
    private JRadioButton mesaPequenaVIP;
    private JTextField nroDePersonasVIP;
    private JButton reservarVIPButton;
    Date fechaActual = new Date();
    FachadaReservar fachada = new FachadaReservar();
    PrototypeRegistryMesa mesa = new PrototypeRegistryMesa();
    Cliente cliente;

    public ReservarMesaGUI(Cliente cliente){
        setContentPane(contentPanel);
        setSize(600,400);
        this.cliente = cliente;
        nroDePersonasSimple.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDePersonasSimple.setText("");
            }
        });
        mesaGrandeSimple.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mesaPequenaSimple.setSelected(false);
            }
        });

        mesaPequenaSimple.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mesaGrandeSimple.setSelected(false);
            }
        });

        mesaGrandeVIP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mesaPequenaVIP.setSelected(false);
            }
        });

        mesaPequenaVIP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mesaGrandeVIP.setSelected(false);
            }
        });
        nroDePersonasVIP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nroDePersonasVIP.setText("");
            }
        });
        reservarSimpleButton.addActionListener(e -> {
            if(mesaGrandeSimple.isSelected()){
                if(Verificador.esNumero(nroDePersonasSimple.getText())){
                    fachada.hacerReserva(cliente, fechaActual,  Float.parseFloat(nroDePersonasSimple.getText()),(Servicio) mesa.get("grande"));
                }else{
                    JOptionPane.showMessageDialog(null,"el Numero de personas debe ser un numero entero");
                }
            }else{
                if(mesaPequenaSimple.isSelected()){
                    if(Verificador.esNumero(nroDePersonasSimple.getText())){
                        fachada.hacerReserva(cliente, fechaActual,  Float.parseFloat(nroDePersonasSimple.getText()),(Servicio) mesa.get("pequeno"));
                    }else{
                        JOptionPane.showMessageDialog(null,"el Numero de personas debe ser un numero entero");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"tiene que seleccionar una Opcion");
                }
            }
        });
        reservarVIPButton.addActionListener(e -> {
            if(mesaGrandeVIP.isSelected()){
                if(Verificador.esNumero(nroDePersonasVIP.getText())){
                    fachada.hacerReserva(cliente, fechaActual,  Float.parseFloat(nroDePersonasVIP.getText()),(Servicio) mesa.get("vipGrande"));
                }else{
                    JOptionPane.showMessageDialog(null,"el Numero de personas debe ser un numero entero");
                }
            }else{
                if(mesaPequenaVIP.isSelected()){
                    if(Verificador.esNumero(nroDePersonasVIP.getText())){
                        fachada.hacerReserva(cliente, fechaActual,  Float.parseFloat(nroDePersonasVIP.getText()),(Servicio) mesa.get("vipPequeno"));
                    }else{
                        JOptionPane.showMessageDialog(null,"el Numero de personas debe ser un numero entero");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"tiene que seleccionar una Opcion");
                }
            }
        });

        siguienteButton.addActionListener(e -> {
            HotelDescription hotelDescription = new HotelDescription();
            hotelDescription.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        ReservarMesaGUI dialog = new ReservarMesaGUI(uno);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
