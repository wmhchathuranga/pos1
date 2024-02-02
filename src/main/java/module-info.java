module com.example.posui1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.posui1 to javafx.fxml;
    exports com.example.posui1;
}