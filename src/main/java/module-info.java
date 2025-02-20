module edu.farmingdale.csc311_module3week4lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc311_module3week4lab to javafx.fxml;
    exports edu.farmingdale.csc311_module3week4lab;
}