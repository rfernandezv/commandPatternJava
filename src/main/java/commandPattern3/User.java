package commandPattern3;

public class User {

    public static void main(String[] args) {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        
        remoteControl.buttonPressed(new StereoOnCommand(stereo));
        remoteControl.buttonPressed(new StereoSetCDCommand(stereo));
        remoteControl.buttonPressed(new StereoOffCommand(stereo));
    }
    
}
