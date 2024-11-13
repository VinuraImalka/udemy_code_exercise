module udemy.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens udemy.demo to javafx.fxml;
    exports udemy.demo;
}