package ch.hftm.algds.turtle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RekursivesVieleck extends Application {

	// Konstanten
	private static final double THREESIXTY = 360.0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Stage einrichten
		primaryStage.setTitle("TUUUUUURTLE");
		Group root = new Group();

		// Zeichnungsumgebung einrichten
		Canvas canvas = new Canvas(280, 230);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setStroke(Color.BLUE);
		gc.setLineWidth(2);

		// Applikation starten
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

		drawWithTurtle(gc);
	}

	private void drawWithTurtle(GraphicsContext gc) {
		Turtle turtle = new Turtle(gc, 108, 210, 0.5);
		int sides = 8;
		int length = 60;

		// Zeichnen
		vieleck(turtle, 1, sides, length);

		turtle.setHome();
		turtle.startJourney();

	}

	/**
	 * 
	 * @param t            Turtel
	 * @param n            Rekursionstiefe
	 * @param eckenzahl
	 * @param seitenlaenge
	 */
	private void vieleck(Turtle t, int n, int eckenzahl, double seitenlaenge) {

		if (n > eckenzahl)
			return;
		else {
			t.forward(seitenlaenge);
			t.left(THREESIXTY / eckenzahl);
			vieleck(t, n + 1, eckenzahl, seitenlaenge);
		}

	}

}