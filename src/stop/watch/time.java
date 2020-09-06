package stop.watch;
// Importing packages
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.util.Duration;
public class time {
    Label timer = new Label("0"); // Create time label
    Font fontSize = new Font(30);   // Create a new fontsize
    Timeline changeTime;    // Create a timeline to change time label text
    int i=1;    // Counter to change time
    // A constructor for labels that has 2 arguments
    // First argument represents if it is first digit to make the maximum value = 9
    // second argument represents the duration
    public time( boolean first , double time){
        timer.setStyle("-fx-font-weight: bold");    // Font style
        timer.setFont(fontSize);    // Font size
        changeTime = new Timeline(new KeyFrame(Duration.seconds(time),E->{  // Time line to change label text every
                if (first){ // If it's first digit
                    if(i!=10){  // if i smaller than 10
                    timer.setText(String.valueOf(i));   // set label text to i
                    i++;}   // add 1
                    else{   // if i = 10
                        i=0;    // reset i
                        timer.setText(String.valueOf(i));   // set label text to 0
                        i++;}   // add 1
                }
                else{   // if it is second digit
                    if(i!=6){   // if i smaller than 6
                    timer.setText(String.valueOf(i));   // set label text to i
                    i++;}   // add 1
                    else{   // if i = 6
                        i=0;    // reset i
                        timer.setText(String.valueOf(i));   // set label text to i
                        i++;}   // add 1
        }}));
        changeTime.setCycleCount(Timeline.INDEFINITE);  // set cycle count to indefinite
        }
    // Add a method to return the time label
    public Label getLabel(){
        return timer;
    }
    // Add a method to return the timeline
    public Timeline getTime(){
        return changeTime ;
    }
    // Add a method to reset i
    public void resetI(){
        i=1;
    }}