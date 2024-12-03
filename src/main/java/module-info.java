module com.example.virtualstudygroup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.virtualstudygroup to javafx.fxml;
    exports com.example.virtualstudygroup;
}