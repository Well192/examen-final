package GUI;

import ServicioEstacionamiento.PrototypeRegistryEstacionamiento;
import auxClasses.Cliente;
import auxClasses.FachadaReservar;
import auxClasses.Servicio;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class ReservarEstacionamiento extends JFrame{

    private JPanel contentPanel;
    private JRadioButton espacioPequenoRadioButton;
    private JRadioButton espacioGrandeRadioButton;
    private JButton siguienteButton;
    private JButton reservarBoton;
    private JTextField ingreseElTiempoTextField;
    FachadaReservar fachada = new FachadaReservar();
    PrototypeRegistryEstacionamiento estacionamiento = new PrototypeRegistryEstacionamiento();
    Cliente cliente;
    Date fechaActual = new Date();

    boolean restaurante;

    public ReservarEstacionamiento(boolean restaurante, Cliente cliente){
        setContentPane(contentPanel);
        setSize(600,400);
        this.restaurante = restaurante;
        this.cliente = cliente;
        reservarBoton.addActionListener(e -> {

            if(espacioGrandeRadioButton.isSelected()){
                if(Verificador.esDecimal(ingreseElTiempoTextField.getText())){
                    fachada.hacerReserva(cliente, fechaActual,
                            Float.parseFloat(ingreseElTiempoTextField.getText()), (Servicio) estacionamiento.get("grande"));
                }else{
                    JOptionPane.showMessageDialog(null,"el tiempo tiene que ser un numero");
                }
            }else{
                if(espacioPequenoRadioButton.isSelected()){
                    if(Verificador.esDecimal(ingreseElTiempoTextField.getText())){
                        fachada.hacerReserva(cliente, fechaActual,
                                Float.parseFloat(ingreseElTiempoTextField.getText()), (Servicio) estacionamiento.get("pequeno"));
                    }else{
                        JOptionPane.showMessageDialog(null,"el tiempo tiene que ser un numero");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"ingrese una opcion");
                }
            }

        });
        espacioGrandeRadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                espacioPequenoRadioButton.setSelected(false);
            }
        });

        espacioPequenoRadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                espacioGrandeRadioButton.setSelected(false);
            }
        });
        ingreseElTiempoTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ingreseElTiempoTextField.setText("");
            }
        });
        siguienteButton.addActionListener(e -> {
            if(restaurante){
                ReservarMesaGUI reservarMesaGUI = new ReservarMesaGUI(cliente);
                reservarMesaGUI.setVisible(true);
            }else{
                HotelDescription hotelDescription = new HotelDescription();
                hotelDescription.setVisible(true);
            }
            dispose();
        });
    }

    public static void main(String[] args) {
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        ReservarEstacionamiento dialog = new ReservarEstacionamiento(false, uno);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
