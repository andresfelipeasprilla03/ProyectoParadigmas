module Proyec_paradigmas {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.base;
	
	
	opens co.poli.edu.aplicacion.controlador.vista to javafx.graphics, javafx.fxml;
	opens co.poli.edu.aplicacion.controlador to javafx.graphics, javafx.fxml;

}
