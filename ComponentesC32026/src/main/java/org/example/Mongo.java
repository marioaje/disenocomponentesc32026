package org.example;

import java.net.URI;
import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Mongo {
    public static void main(String[] args) {

    try{
//Crean un modelo, y luego lo convierten en n json strng
        String  datos = """            
                        {
                          "coleccion":"profeMario",
                          "datos":{
                            "fecha":"2026-10-01 20:30:00",
                            "modulo":"Usuarios",
                            "mensaje":"Error al insertar usuario",
                            "detalle":"Llave primaria duplicada",
                            "usuario":"mario",
                            "utc":"2068651516651",
                            "proyecto":"Proyecto Java"
                          }
                        }
        """;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://paginas-web-cr.com/Api/apis/mongodb.php"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(datos))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());

    }catch (Exception e){
        e.printStackTrace();
    }



//
//        1. Registrar Errores
//
//        Al producirse un error, el componente deberá enviar la información al siguiente API mediante método POST:
//
//        Endpoint
//
//
//        https://paginas-web-cr.com/Api/apis/mongodb.php
//
//
//        Ejemplo de envío
//
//
//        {
//            "coleccion":"erroresNombreApellidoEstudiante",
//                "datos":{
//            "fecha":"2026-10-01 20:30:00",
//                    "modulo":"Usuarios",
//                    "mensaje":"Error al insertar usuario",
//                    "detalle":"Llave primaria duplicada",
//                    "usuario":"mario"
//        }
//        }
//


    }
}
