module com.example.demo6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.mail;
    opens com.example.demo6 to javafx.fxml;
    exports com.example.demo6;
}