package bankingsystemfinal;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class PlayMusic {

    public PlayMusic() {
        
try {
    File yourFile = new File("Relaxation.wav");
    AudioInputStream stream;
    AudioFormat format;
    DataLine.Info info;
    Clip clip;

    stream = AudioSystem.getAudioInputStream(yourFile);
    format = stream.getFormat();
    info = new DataLine.Info(Clip.class, format);
    clip = (Clip) AudioSystem.getLine(info);
    clip.open(stream);
    clip.start();
}
catch (Exception e) {
    //whatevers
}
    }

}