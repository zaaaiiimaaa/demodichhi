module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demo6 to javafx.fxml;
    exports com.example.demo6;
}