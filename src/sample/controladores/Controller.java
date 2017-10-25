package sample.controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.modelos.Persona;

public class Controller {

    public Button btnComparar;
    public TextField txtExistencia;
    public TextField txtCompra;

    public void realizarComparacion(ActionEvent actionEvent) {
        Persona.buscarPorNombre();

    }
}
