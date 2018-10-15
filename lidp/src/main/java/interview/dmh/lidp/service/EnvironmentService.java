package interview.dmh.lidp.service;

import java.time.LocalDate;

//TODO need an annotation
public class EnvironmentService {

    private static final String APP_NAME = "LIDP UI Challenge - Harland Version";
    
    //TODO need an annotation
    public /*Response*/ String get() {
        LocalDate date = LocalDate.now();
        
        //TODO: replace temp code w/ json builder
        StringBuilder b = new StringBuilder("{\"what\": \"");
        b.append(APP_NAME);
        b.append("\", \"when\": \"").append(date);
        b.append("\"}");
        
        return b.toString();
    }
    
    /*/
    public static void main(String... args) throws Exception {
        System.out.println(new EnvironmentService().get());
    }
    //*/
}
