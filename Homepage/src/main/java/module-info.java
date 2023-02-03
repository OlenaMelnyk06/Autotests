module com.example.homepage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homepage to javafx.fxml;
    exports com.example.homepage;
}