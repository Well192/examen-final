package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton buttonOK;

    public HotelDescription() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int continua = 0;

                if(!(estacionamientoCheckBox.isSelected() || restauranteCheckBox.isSelected() || habitacionesCheckBox.isSelected())){
                    JOptionPane.showMessageDialog(null,"Seleccione un servicio");
                    return;
                }

                if(habitacionesCheckBox.isSelected()){
                    ReservaHabitacionesGUI habitacionesGUI = new ReservaHabitacionesGUI();
                    habitacionesGUI.setVisible(true);
                }

                if(estacionamientoCheckBox.isSelected()){
                    ReservarEstacionamiento estacionamiento = new ReservarEstacionamiento();
                    estacionamiento.setVisible(true);
                }

                if(restauranteCheckBox.isSelected()){
                    ReservarMesaGUI mesaGUI = new ReservarMesaGUI();
                    mesaGUI.setVisible(true);
                }

                dispose();

            }
        });
        opinarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
