module eus.ehu.bum1_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires okhttp3;

    opens eus.ehu.bum1_fx.Presentation to javafx.fxml;

    exports eus.ehu.bum1_fx.Business_logic;
    exports eus.ehu.bum1_fx.Presentation;
}
