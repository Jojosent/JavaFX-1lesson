module com.example.javafxhello_world {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxhello_world to javafx.fxml;
    exports com.example.javafxhello_world;
}