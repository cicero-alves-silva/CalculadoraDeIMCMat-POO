module com.example.calculadoradeimcmat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoradeimcmat to javafx.fxml;
    exports com.example.calculadoradeimcmat;
}