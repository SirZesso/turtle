package ch.hftm.algds.turtle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Turtle2 extends Application {

	public static void start(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Stage einrichten
		primaryStage.setTitle("Illustrationsbeispiel");
		Group root = new Group();

		// Zeichnungsumgebung einrichten
		Canvas canvas = new Canvas(400, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// Applikation starten
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

		drawWithTurtle(gc);
	}

	private void drawPolygon(Turtle turtle, int sides, double length) {
		for (int i = 0; i < sides; i++) {
			turtle.forward(length);
			turtle.left(360 / sides);
		}
	}

	private void drawWithTurtle(GraphicsContext gc) {
		// Turtle-Objekt erzeugen
		Turtle turtle = new Turtle(gc, 180, 300, 0.1);

		// Turtle bewegen
		turtle.setHome();

		final double length = 50;

		// for (int a = 0; a < 10; a++) {
		// drawPolygon(turtle, sides, length);
		// sides++;
		// }

		double maxdegree = 360;
		int counter = 30;
		int shape = 4;

		double sequence = maxdegree / counter;

		for (int i = 0; i < counter; i++) {
			drawPolygon(turtle, shape, length);
			turtle.right(sequence);
		}

		// Ablauf darstellen
		turtle.startJourney();
	}

}
