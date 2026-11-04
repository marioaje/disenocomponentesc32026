package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrodeUsuarios {
    private JPanel panelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField txtUsuario;
    private JLabel lblUsuario;

    public RegistrodeUsuarios() {
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("Saludos");
           //     String var =  txtUsuario.getText();
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}
