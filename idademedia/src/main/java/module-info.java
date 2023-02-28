module com.idade.idademedia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.idade.idademedia to javafx.fxml;
    exports com.idade.idademedia;
}