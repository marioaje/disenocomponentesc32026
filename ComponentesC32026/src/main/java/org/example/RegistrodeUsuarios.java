package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrodeUsuarios extends JFrame {
    private JButton registrarButton;
    private JButton button2;
    private JButton button3;

    public RegistrodeUsuarios() {

        setContentPane(new JPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setSize(400,400);
        setLocationRelativeTo(null);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
