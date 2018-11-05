package commandPattern3;

public class StereoSetCDCommand implements Command{
    Stereo stereo;
    int VOLUME_DEFAULT = 10;
    int TRACK_DEFAULT = 1;
     
    public StereoSetCDCommand(Stereo stereo) 
    { 
        this.stereo = stereo; 
    } 
    
    @Override
    public void execute() 
    { 
       stereo.setCD();
       stereo.setCDTrack(TRACK_DEFAULT);
       stereo.setVolume(VOLUME_DEFAULT);
    }
}
