module org.example.controle_emprestimos_laboratorio {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controle_emprestimos_laboratorio to javafx.fxml;
    exports org.example.controle_emprestimos_laboratorio;
    exports org.example.controle_emprestimos_laboratorio.ui;
    opens org.example.controle_emprestimos_laboratorio.ui to javafx.fxml;
}