module com.example.chatchit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatapp to javafx.fxml;
    exports com.example.chatapp;
}