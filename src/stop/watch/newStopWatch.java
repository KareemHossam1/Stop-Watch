package stop.watch;
// Importing packages
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
public class newStopWatch {
    Button start = new Button("Start");  // Create start button   
    Button stop = new Button("Stop");  // Create stop button   
    Button reset = new Button("Reset");  // Create reset button   
    Label timer = new Label();  // Create a label
    Label dot1 = new Label(":");    // Create a label
    Label dot2 = new Label(":");    // Create a label
    HBox hbox1 = new HBox(20);  // Create HBox to put elements
    HBox hboxMinutes = new HBox();  // Create HBox to add minutes labels
    HBox hboxSeconds = new HBox();  // Create HBox to add seconds labels
    HBox hboxMillis = new HBox();   // Create HBox to add millis labels
    // Create milli labels
    time milli1 = new time(true,0.01); 
    time milli2 = new time(true,0.1);
    // Create seconds labels
    time second1 = new time(true,1);
    time second2 = new time(false,10);
    // Create minutes labels
    time minute1 = new time(true,60);
    time minute2 = new time(false,600);
    Font fontSize = new Font(30);   // Create a font size
    // A constructor for the stop watch
    public newStopWatch(String num){    // Timer number as an argument
        timer.setText("Timer "+ num + " :");    // Timer text
        dot1.setStyle("-fx-font-weight: bold"); // dot style
        dot2.setStyle("-fx-font-weight: bold"); // dot style
        dot1.setFont(fontSize); // dot font size
        dot2.setFont(fontSize); // dot font size
        // Order time labels
        hboxMinutes.getChildren().addAll(minute2.getLabel(),minute1.getLabel());
        hboxSeconds.getChildren().addAll(second2.getLabel(),second1.getLabel());
        hboxMillis.getChildren().addAll(milli2.getLabel(),milli1.getLabel());
        hbox1.getChildren().addAll(timer,start,stop,reset,hboxMinutes,dot2,hboxSeconds,dot1,hboxMillis);  // Order elements
        // Start button event handler
        start.setOnAction(e->{
            // play timeline ant start the timer
            milli1.getTime().play();
            milli2.getTime().play();
            second1.getTime().play();
            second2.getTime().play();
            minute1.getTime().play();
            minute2.getTime().play();
        });
        // Stop button event handler
        stop.setOnAction(e->{
            // Stop timeline
            milli1.getTime().stop();
            milli2.getTime().stop();
            second1.getTime().stop();
            second2.getTime().stop();
            minute1.getTime().stop();
            minute2.getTime().stop();
        });
        reset.setOnAction(e->{
            // Stop timeline
            milli1.getTime().stop();
            milli2.getTime().stop();
            second1.getTime().stop();
            second2.getTime().stop();
            minute1.getTime().stop();
            minute2.getTime().stop();
            // set labels text to 0 to start time from 0
            milli1.getLabel().setText("0");
            milli2.getLabel().setText("0");
            second1.getLabel().setText("0");
            second2.getLabel().setText("0");
            minute1.getLabel().setText("0");
            minute2.getLabel().setText("0");
            // reset i to start time from 0
            milli1.resetI();
            milli2.resetI();
            second1.resetI();
            second2.resetI();
            minute1.resetI();
            minute2.resetI();
        });
    }
    // A method returning the HBox containing
    // the elements to order them on the main scene
    public HBox getWatch(){
        return hbox1;
    }}