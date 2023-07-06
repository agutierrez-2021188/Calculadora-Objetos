/*
    Nombre: Alessandro Emanuel Gutiérrez Boc
    Código Técnico: IN5AV
    Carné: 2021-188
    Fecha de Creación: 23/03/2022
    Fecha de Modificación: 30/03/2022
 */
package org.alessandrogutierrez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override // Hace la parte de la sobrecarga de metodos, si existe en memoria, lo sobreescribe para cambiar su comportamiento
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        // Load - Obtiene el recurso de la maquina donde esta e; archivo 
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
