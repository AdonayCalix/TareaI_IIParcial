package sample.Controladores;

import com.sun.org.apache.regexp.internal.RE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sample.Modelos.Persona;

public class Controller {

    public TextField txtNombre;
    public Text txtMensaje;
    public Label txtInformacion;
    public Button btnComparar;


    public void realizarComparacion(ActionEvent actionEvent) {
        Persona persona = Persona.buscarPorNombre(txtNombre.getText());
        if ( persona != null){
            txtMensaje.setText("Se ha encontrado una coincidencia!!!");
            txtInformacion.setText(persona.nombre + " " + persona.apellido + " , " + persona.edad);
        } else {
            txtMensaje.setText("No se encontraron coincidencias!!!");
            txtInformacion.setText("");
        }

    }
}
