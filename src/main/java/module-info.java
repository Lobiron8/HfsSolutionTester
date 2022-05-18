module de.tudortmund.hfssolutiontester {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.tudortmund.hfssolutiontester to javafx.fxml;
    exports de.tudortmund.hfssolutiontester;
}