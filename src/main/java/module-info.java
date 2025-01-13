module cz.gresak.keyboardeditor {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires org.apache.commons.exec;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires com.google.gson;

    requires java.desktop;
    requires java.prefs;

    opens cz.gresak.keyboardeditor to com.google.gson,javafx.controls,javafx.fxml,javafx.graphics;
    opens cz.gresak.keyboardeditor.component to javafx.fxml;
    opens cz.gresak.keyboardeditor.model to com.google.gson;
    exports cz.gresak.keyboardeditor;
}