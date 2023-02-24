module com.example.ootpisp_crud {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.ootpisp_crud to javafx.fxml;
    exports com.example.ootpisp_crud;
}