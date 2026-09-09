import org.example.Mensaje;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Mensaje mensajes = new Mensaje();

        String resuladoMensaje = mensajes.mostrarMensaje("Clase Martes 2026");

        System.out.println(resuladoMensaje);
//
//
//package org.example;
//
//        public class Mensaje {
//            public String mostrarMensaje(String mensajePersonalizado){
//                String mensaje = "Hola," + mensajePersonalizado;
//                return mensaje;
//            }
//        }

    }
}