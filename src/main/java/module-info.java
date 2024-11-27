module com.example.employeemanagment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.employeemanagment to javafx.fxml;
    exports com.example.employeemanagment;
}