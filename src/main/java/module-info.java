module com.example.ootpisp_crud {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires lombok;

    opens com.example.ootpisp_crud to javafx.fxml;
    exports com.example.ootpisp_crud;
}