package co.poli.edu.aplicacion.controlador;

import co.poli.edu.aplicacion.modelo.Equipo;
import co.poli.edu.aplicacion.modelo.Estudiante;
import co.poli.edu.aplicacion.modelo.Prestamo;
import co.poli.edu.aplicacion.servicio.ImpleOperacion;
import co.poli.edu.aplicacion.servicio.ImpleOperacionArchivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class controllador {

    Alert a = new Alert(AlertType.INFORMATION);
    ImpleOperacionArchivo imple = new ImpleOperacionArchivo();
    ImpleOperacion obj = new ImpleOperacion();

    @FXML
    private TextField texdescripcionEquipo;

    @FXML
    private Button textConfirmar;

    @FXML
    private Button btton_cargar;

    @FXML
    private Button textConfirmar1;

    @FXML
    private Button textConfirmar2;

    @FXML
    private TextField text_numeroId2;

    @FXML
    private TextField textapellidos;

    @FXML
    private TextField textclaseEquipo;

    @FXML
    private TextField textcorreoElectronico;

    @FXML
    private TextField textnombreEquipo;

    @FXML
    private TextField textnombres;

    @FXML
    private TextField textnumeroEquipo;

    @FXML
    private TextField textnumeroId1;

    @FXML
    private TextField textnumeroSerie;

    @FXML
    private TextField textnumeroid;

    @FXML
    private TextField textprogramaAcademico;

    @FXML
    private Button textregistrar;

    @FXML
    private Button textregistrarEquipo;

    @FXML
    private TextField textvalorEquipo;

    @FXML
    private TextArea text_area_prestamo;
    @FXML
    private TextArea text_area_historial;

    /**
     * Maneja el evento de confirmar el préstamo de un equipo.
     * @param event El evento de acción.
     */
    @FXML
    void oprimir_confirmar(ActionEvent event) {
        try {
            int num = Integer.parseInt(textnumeroEquipo.getText());
            Equipo[] equi = obj.getArregloequipo();
            if (obj.getEstudiante() != null) {
                Prestamo pr = new Prestamo(obj.getEstudiante(), equi[num - 1]);
                equi[num - 1].setEstado_equipo("Prestado");
                String b = obj.create(pr);
                a.setContentText(b);
                a.setWidth(700);
                a.showAndWait();
            }
        } catch (NumberFormatException e) {
            mostrarAlerta("Error Numero invalido ", "Error Numero invalido, ingrese solo numeros " + e.getMessage());
        } catch (NullPointerException e) {
            mostrarAlerta("Error Prestamo invalido ", "Error no se pudo realizar prestamo " + e.getMessage());
        }
    }

    /**
     * Maneja el evento de confirmar la devolución de un préstamo.
     * @param event El evento de acción.
     */
    @FXML
    void oprimir_confirmar1(ActionEvent event) {
        try {
            obj.delete(textnumeroId1.getText());
            a.setContentText("Se ha devuelto el prestamo correctamente");
            a.setWidth(700);
            a.showAndWait();
        } catch (NullPointerException e) {
            mostrarAlerta("Error Numero de Identificacion invalido ", "Error Numero de Identificacion invalido " + e.getMessage());
        }
    }

    /**
     * Maneja el evento de confirmar la consulta del historial de préstamos.
     * @param event El evento de acción.
     */
    @FXML
    void oprimir_confirmar2(ActionEvent event) {
        try {
            Prestamo[] pr = obj.read(text_numeroId2.getText());
            text_area_historial.appendText("Sus Datos Son:\n");
            for (int i = 0; i < pr.length; i++) {
                if (pr[i] != null) {
                    text_area_historial.appendText("->" + pr[i]);
                }
            }
        } catch (NullPointerException e) {
            mostrarAlerta("Error Numero de Identificacion invalido ", "Error Numero de Identificacion invalido " + e.getMessage());
        }
    }

    /**
     * Maneja el evento de registrar un nuevo estudiante.
     * @param event El evento de acción.
     */
    @FXML
    void oprimir_registrar(ActionEvent event) {
        try {
            if (textnombres.getText().equals("")) {
                textnombres.setText(null);
            } else if (textapellidos.getText().equals("")) {
                textapellidos.setText(null);
            } else if (textnumeroid.getText().equals("")) {
                textnumeroid.setText(null);
            } else if (textprogramaAcademico.getText().equals("")) {
                textprogramaAcademico.setText(null);
            } else if (textcorreoElectronico.getText().equals("")) {
                textcorreoElectronico.setText(null);
            } else {
                Estudiante estu = new Estudiante(textnombres.getText(), textapellidos.getText(), textnumeroid.getText(), textprogramaAcademico.getText(), textcorreoElectronico.getText());
                String b = obj.create_usua(estu);
                a.setContentText(b);
                a.setWidth(700);
                a.showAndWait();
            }
        } catch (NullPointerException e) {
            mostrarAlerta("Error De Espacios en blanco ", "Complete los espacios en blanco. \n" + e.getMessage());
        }
    }

    /**
     * Maneja el evento de registrar un nuevo equipo.
     * @param event El evento de acción.
     */
    @FXML
    void oprimir_registrarEquipo(ActionEvent event) {
        try {
            if (textnombreEquipo.getText().equals("")) {
                textnombreEquipo.setText(null);
            } else if (textclaseEquipo.getText().equals("")) {
                textclaseEquipo.setText(null);
            } else if (texdescripcionEquipo.getText().equals("")) {
                texdescripcionEquipo.setText(null);
            } else if (textnumeroSerie.getText().equals("")) {
                textnumeroSerie.setText(null);
            } else if (textclaseEquipo.getText().equals("")) {
                textclaseEquipo.setText(null);
            } else {
                Equipo equi = new Equipo(textnombreEquipo.getText(), textclaseEquipo.getText(), texdescripcionEquipo.getText(), textnumeroSerie.getText(), Integer.parseInt(textvalorEquipo.getText()), "Disponible");
                String b = obj.create_equi(equi);
                a.setContentText(b);
                a.setWidth(700);
                a.showAndWait();
            }
        } catch (NumberFormatException e) {
            mostrarAlerta("Error Numeros", "Seleccione numeros no letras " + e.getMessage());
        } catch (NullPointerException e) {
            mostrarAlerta("Error De Espacios en Blanco", "Complete los espacios en blanco. \n" + e.getMessage());
        }
    }

    /**
     * Muestra una alerta con el mensaje especificado.
     * @param titulo El título de la alerta.
     * @param contenido El contenido de la alerta.
     */
    private void mostrarAlerta(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    /**
     * Maneja el evento de cargar los equipos disponibles.
     * @param event El evento de acción.
     */
    @FXML
    void press_cargar_equipo(ActionEvent event) {
        Equipo[] arr = obj.getArregloequipo();
        int contador = 0;
        text_area_prestamo.appendText("Equipos Disponibles:\n");
        for (int i = 0; i < arr.length; i++) {
            contador++;
            text_area_prestamo.appendText(contador + "." + arr[i] + "\n");
        }
    }
}