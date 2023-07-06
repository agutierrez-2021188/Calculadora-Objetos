package org.alessandrogutierrez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    double dato1, dato2, result=0;
    char signo;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnMas;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMenos;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMulti;
    @FXML private Button btnUnoX;
    @FXML private Button btnAlCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnDivi;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla; 
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if (event.getSource()== btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource () == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText (txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText () + "0");
        else if (event.getSource() == btnPunto)
            
            if (txtPantalla.getText().length() == 0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            } else {
                txtPantalla.setText(txtPantalla.getText() + ".");
                btnPunto.setDisable(true);
            }
        
        else if (event.getSource() == btnCE)
            txtPantalla.clear();
        else if (event.getSource() == btnC) {
            txtPantalla.clear();
            dato1 = 0;
            dato2 = 0;
            result = 0;
        }else if (event.getSource() == btnAlCuadrado){
            dato1 = Double.parseDouble (txtPantalla.getText());
            result = (dato1*dato1);
            txtPantalla.setText(String.valueOf (result));   
        }else if (event.getSource() == btnPorcentaje){
            double vPantalla, vPorcentaje;
            vPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            vPorcentaje = dato1 * vPantalla / 100;
            txtPantalla.setText(String.valueOf(vPorcentaje));   
        }else if (event.getSource() == btnRaiz){
            dato1 = Double.parseDouble (txtPantalla.getText());
            result = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf (result));
        }else if (event.getSource() == btnUnoX) {   
            dato1 = Double.parseDouble (txtPantalla.getText());
            result = (1/dato1);
            txtPantalla.setText(String.valueOf (result));
        }else if(event.getSource() == btnMasMenos){
            dato1=Double.parseDouble( txtPantalla.getText() );
            dato1 = (dato1*-1);
            txtPantalla.setText(String.valueOf(dato1)); 
        }else if (event.getSource () == btnMas){
            btnPunto.setDisable(false);
            if(signo == '+'){
                dato1 = (dato1 + Double.parseDouble(txtPantalla.getText ()) );
                txtPantalla.clear();
                
            }else {
                dato1 = Double.parseDouble(txtPantalla.getText()) ;
                txtPantalla.clear ();      
                signo = '+';
            }     
            
        }else if (event.getSource () == btnMenos){
            btnPunto.setDisable(false);
            if (signo == '-'){
               dato1 = dato1 - Double.parseDouble(txtPantalla.getText ());
               txtPantalla.clear();
               btnPunto.setDisable(false);
            } else {
            dato1 = Double.parseDouble (txtPantalla.getText());
            txtPantalla.clear();
            signo = '-';
            }
            
        }else if (event.getSource () == btnMulti) {
            dato1 = Double.parseDouble (txtPantalla.getText());
            txtPantalla.clear();
            signo = '*';
            btnPunto.setDisable(false);
        }else if (event.getSource () == btnDivi) {
            dato1 = Double.parseDouble (txtPantalla.getText());
            txtPantalla.clear();
            signo = '/';
            btnPunto.setDisable(false);
        }else if (event.getSource () == btnIgual ) {
            dato2 = Double.parseDouble (txtPantalla.getText());
            txtPantalla.clear();
            btnPunto.setDisable(false);
            switch (signo){
                case '+':
                    result = dato1 + dato2;
                    txtPantalla.setText(String.valueOf (result));
                    break;
                    
                case '-':
                    result = dato1 - dato2;
                    txtPantalla.setText(String.valueOf (result));
                    break;
                    
                case '*':
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf (result));  
                    break;
                    
                case '/':
                    
                    if (dato2 != 0){
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf (result));
                    } else {
                      txtPantalla.setText("No se puede dividir entre 0");
                    }
                    break;
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
