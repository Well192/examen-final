package GUI;

import auxClasses.Cliente;
import auxClasses.Verificador;

import javax.swing.*;
import java.awt.event.*;

public class HotelDescription extends JDialog {
    private JPanel contentPane;
    private JPanel panelHotel;
    private JTextArea textAreaOpiniones;
    private JLabel labelDireccion;
    private JLabel labelFoto;
    private JButton siguienteButton;
    private JButton opinarButton;
    private JLabel labelDescription;
    private JCheckBox estacionamientoCheckBox;
    private JTextPane textPane1;
    private JCheckBox restauranteCheckBox;
    private JCheckBox habitacionesCheckBox;
    private JTextField ingreseNombreDelClienteTextField;
    private JTextField ingreseApellidoDelClienteTextField;
    private JTextField ingreseDNIDelClienteTextField;
    Cliente cliente = null;

    public HotelDescription() {
        setContentPane(contentPane);
        setModal(true);
        siguienteButton.addActionListener(e -> {
            if(!(estacionamientoCheckBox.isSelected() || restauranteCheckBox.isSelected() || habitacionesCheckBox.isSelected())){
                JOptionPane.showMessageDialog(null,"Seleccione un servicio");
                return;
            }

            if (Verificador.esPalabra(ingreseNombreDelClienteTextField.getText()) &&
                    Verificador.esPalabra(ingreseApellidoDelClienteTextField.getText())) {
                if (Verificador.esNumero(ingreseDNIDelClienteTextField.getText())){
                    cliente = new Cliente(ingreseNombreDelClienteTextField.getText(),
                            ingreseApellidoDelClienteTextField.getText(),
                            ingreseDNIDelClienteTextField.getText());
                }else {
                    JOptionPane.showMessageDialog(null,"el DNI tiene que ser numero");
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(null,"ingrese sus datos");
                return;
            }

            if(habitacionesCheckBox.isSelected()){
                ReservaHabitacionesGUI habitacionesGUI = new ReservaHabitacionesGUI(estacionamientoCheckBox.isSelected(), restauranteCheckBox.isSelected(), cliente);
                habitacionesGUI.setVisible(true);
            }else if(estacionamientoCheckBox.isSelected()){
                ReservarEstacionamiento estacionamiento = new ReservarEstacionamiento(restauranteCheckBox.isSelected(), cliente);
                estacionamiento.setVisible(true);
            }else if(restauranteCheckBox.isSelected()){
                ReservarMesaGUI mesaGUI = new ReservarMesaGUI(cliente);
                mesaGUI.setVisible(true);
            }

            dispose();
        });
        ingreseNombreDelClienteTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ingreseNombreDelClienteTextField.setText("");
            }
        });
        ingreseApellidoDelClienteTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ingreseApellidoDelClienteTextField.setText("");
            }
        });

        ingreseDNIDelClienteTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ingreseDNIDelClienteTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        HotelDescription dialog = new HotelDescription();
        dialog.pack();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


}
