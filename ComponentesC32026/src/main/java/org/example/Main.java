package org.example;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {


            //Ejecute el formulario

        SwingUtilities.invokeLater(()->
        {
            RegistrodeUsuarios ventanaregistro = new RegistrodeUsuarios();
            ventanaregistro.setVisible(true);

        });

    }
}
