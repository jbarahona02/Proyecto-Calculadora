/*
Programador:
    Javier Alejandro Barahona Pasan
Creación:
    24 de Abril de 2019
*/
package org.javierbarahona.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    float dato1,dato2,resultado,temporal;
    int op = 0;
    boolean punto,operacion;
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnRaiz;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnSuma;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnResta;
    @FXML Button btnPotencia;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMultiplicacion;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnUnoX;
    @FXML Button btnDivision;
    @FXML Button btnPorcentaje;
    @FXML TextField txtValores;
    
    
   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("1");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "1");
        }else if (event.getSource() == btnDos){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("2");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "2");
        }else if (event.getSource() == btnTres){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("3");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "3");
        }else if (event.getSource() == btnCuatro){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("4");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "4");
        }else if (event.getSource() == btnCinco){
            if (txtValores.getText().equals("Dato no válido")|| operacion == true){
                txtValores.setText("5");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "5");
        }else if (event.getSource() == btnSeis){
            if (txtValores.getText().equals("Dato no válido")|| operacion == true){
                txtValores.setText("6");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "6");
        }else if (event.getSource() == btnSiete){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("7");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "7");
        }else if (event.getSource() == btnOcho){
            if (txtValores.getText().equals("Dato no válido")|| operacion == true){
                txtValores.setText("8");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "8");
        }else if (event.getSource() == btnNueve){
            if (txtValores.getText().equals("Dato no válido") || operacion == true){
                txtValores.setText("9");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "9");
        }else if (event.getSource() == btnCero){
            if (txtValores.getText().equals("Dato no válido")|| operacion == true){
                txtValores.setText("0");
                operacion = false;
                punto = false;
                dato1 = 0;
                dato2 = 0;
            }else    
                txtValores.setText(txtValores.getText() + "0");
        
        //Operaciones aritméticas
        }else if (event.getSource() == btnSuma && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            dato1 = dato1 + Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;        
            punto = false;
            operacion = false;
        }else if (event.getSource() == btnResta && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            if (dato1 == 0)
                dato1 = Float.parseFloat(txtValores.getText());
            else
                dato1 = dato1 - Float.parseFloat(txtValores.getText());
            
            txtValores.setText("");
            op = 2;
            punto = false;
            operacion = false;
        }else if (event.getSource() == btnMultiplicacion && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 3;
            punto = false;
            operacion = false;
        }else if (event.getSource() == btnDivision && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            dato1 = Float.parseFloat(txtValores.getText());    
            txtValores.setText("");
            op = 4;
            punto = false;
            operacion = false;
        }else if (event.getSource() == btnPorcentaje && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            temporal = Float.parseFloat(txtValores.getText());
            temporal = temporal/100;
            txtValores.setText(String.valueOf(temporal));
            operacion = true;
            punto = true;
        }else if (event.getSource() == btnPotencia && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            resultado = Float.parseFloat(txtValores.getText());
            resultado = resultado * resultado;
            txtValores.setText(String.valueOf(resultado));
            operacion = true;
            punto = true;
        }else if (event.getSource() == btnRaiz && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            resultado = Float.parseFloat(txtValores.getText());
            punto = true;
                if (resultado >= 0){
                    resultado = (float) Math.sqrt(resultado);
                    txtValores.setText(String.valueOf(resultado)); 
                    operacion = true;
                }else
                    txtValores.setText("Dato no válido");                 
        }else if (event.getSource() == btnUnoX && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
            punto = true;
            if(txtValores.getText().equals("0"))
                txtValores.setText("Dato no válido");
            else{
                resultado = Float.parseFloat(txtValores.getText());
                resultado = 1/resultado;
                txtValores.setText(String.valueOf(resultado));
                operacion = true;
            }
        }else if (event.getSource() == btnMasMenos && !txtValores.getText().equals("") && !txtValores.getText().equals("Dato no válido")){
                temporal = Float.parseFloat(txtValores.getText());
                temporal = temporal * -1;
                txtValores.setText(String.valueOf(temporal));
                punto = true;
        }else if (event.getSource() == btnPunto && !txtValores.getText().equals("Dato no válido")){
                if(punto == false){
                    if (txtValores.getText().equals("")){
                        txtValores.setText("0" + ".");
                        punto = true;
                    }else{
                        txtValores.setText(txtValores.getText() + ".");
                        punto = true;
                    }
                }
        }else if (event.getSource() == btnCE){
            if (txtValores.getText().equals("Dato no válido")){
                op = 0;
                dato1 = 0;
            }
            txtValores.setText("");
            punto = false;
        }else if (event.getSource() == btnC){
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            txtValores.setText("");
            punto = false;
        }else if (event.getSource() == btnIgual && !txtValores.getText().equals("")){
            if(!txtValores.getText().equals("Dato no válido")){
                dato2 = Float.parseFloat(txtValores.getText());
                txtValores.setText("");
                
                switch(op){
                    case 1:
                        resultado = dato1 + dato2;
                        txtValores.setText(String.valueOf(resultado));
                        operacion = true;
                        dato1 = 0;
                    break;
                
                    case 2:
                        resultado = dato1 - dato2;
                        txtValores.setText(String.valueOf(resultado));
                        operacion = true;
                        dato1 = 0;
                        op = 0;
                    break;
                
                    case 3:
                        resultado = dato1 * dato2;
                        txtValores.setText(String.valueOf(resultado));
                        operacion = true;
                    break;
                
                    case 4:
                        if (dato2 > 0){
                            resultado = dato1 / dato2;
                            txtValores.setText(String.valueOf(resultado));
                            operacion = true;
                        }else
                            txtValores.setText("Dato no válido");
                    break;
                    
                    default :
                        txtValores.setText(String.valueOf(dato2));
                        operacion = true;
                    break;
                }
            }else{
                txtValores.setText(""); 
                punto = false;
            }
        }
            
            
     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
