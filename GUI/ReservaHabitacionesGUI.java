package GUI;

import auxClasses.FachadaReservar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReservaHabitacionesGUI extends JFrame {

    FachadaReservar fachada = new FachadaReservar();

    private JPanel contentPane;
    private JPanel panelHabNormal;
    private JPanel panelHabEconomica;
    private JButton botonSiguiente;
    private JButton reservar1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton reservar2;
    private JButton reservar4;
    private JButton reservar3;

    public ReservaHabitacionesGUI(){
        setContentPane(contentPane);
        setSize(600,610);
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText("");
            }
        });
        textField2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField2.setText("");
            }
        });
        textField3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField3.setText("");
            }
        });
        textField4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField4.setText("");
            }
        });
        reservar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        reservar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        reservar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        reservar4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        ReservaHabitacionesGUI dialog = new ReservaHabitacionesGUI();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
