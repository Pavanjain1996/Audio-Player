
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class CodeClass {
    Clip clip;
    AudioInputStream song;
    static int status=0;
    public CodeClass(String path){
        try {
            song=AudioSystem.getAudioInputStream(new File(path));
            clip=AudioSystem.getClip();
            clip.open(song);
        } catch (UnsupportedAudioFileException | LineUnavailableException| IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void play(){
        if(status==0){
            status=1;
            clip.start();
        }
    }
    public void pause(){
        if(status==1){
            status=0;
            clip.stop();
        }
    }
}
