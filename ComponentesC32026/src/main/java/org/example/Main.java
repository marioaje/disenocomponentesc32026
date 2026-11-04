package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {


            //Ejecute el formulario

        SwingUtilities.invokeLater(()->
        {

            JFrame frameVentana = new JFrame("El nombre del usuario o titulo");
            RegistrodeUsuarios formularioRegistrodeUsuarios = new RegistrodeUsuarios();
            frameVentana.setContentPane(formularioRegistrodeUsuarios.getPanelPrincipal());
            frameVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frameVentana.pack();
            frameVentana.setSize(800,600);
            frameVentana.setLocationRelativeTo(null);
            frameVentana.setVisible(true);


        });

    }
}
