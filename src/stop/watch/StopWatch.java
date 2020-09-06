package stop.watch;
// Importing Packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class StopWatch extends Application {
    // Creating 4 stop watches from newStopWatch Class
    newStopWatch timer1 = new newStopWatch("1");
    newStopWatch timer2 = new newStopWatch("2");
    newStopWatch timer3 = new newStopWatch("3");
    newStopWatch timer4 = new newStopWatch("4");
    VBox vbox = new VBox(30);  // Create a VBox to add elements
    @Override
    public void start(Stage primaryStage) {
        // Add stop watches to the VBox
        vbox.getChildren().addAll(timer1.getWatch(),timer2.getWatch()
                ,timer3.getWatch(),timer4.getWatch());
        vbox.setPadding(new Insets(20,20,20,20));   // Set vbox positions
        Scene scene = new Scene(vbox, 540, 290);    // Create scene
        primaryStage.setTitle("Stop Watch");        // Primary stage title
        primaryStage.setScene(scene);               // Add scene to stage
        primaryStage.show();                        // Display scene
        primaryStage.setResizable(false);           // Make stage unresizeable
    }
    public static void main(String[] args) {
        launch(args);
    }}