package ch.hftm.algds.turtle;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class rekVieleck extends Application {
    public static void start(String[] args) {
        launch(args);
    }

    private void drawWithTurtle(GraphicsContext gc) {
        // Turtle-Objekt erzeugen
        Turtle turtle = new Turtle(gc, 180, 300, 0.1);

        // Turtle bewegen
        turtle.setHome();

        final double length = 50;
        double maxdegree = 360;

    }

    void vieleck(Turtle t, int n,
            int eckenzahl, double seitenlaenge) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

    }

}
