import java.util.*;
import edu.duke.*;
/**
 * Write a description of Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester {
    public void testGetFollows(){
        MarkovOne markov = new MarkovOne();
        markov.setTraining("this i a test yes this is a test");
        ArrayList<String> follow = markov.getFollows("es");
        System.out.println(follow);
        
    }
    
    public void testGetFollowsWithFile(){
        FileResource fr = new FileResource();
        String content = fr.asString();
        MarkovOne markov = new MarkovOne();
        markov.setTraining(content);
        ArrayList<String> follow = markov.getFollows("he");
        System.out.println(follow.size());
    }
}
