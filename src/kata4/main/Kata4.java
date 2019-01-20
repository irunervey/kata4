package kata4.main;

import java.util.List;
import kata4.view.*;
import kata4.model.*;


public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        execute();
    }
     private static void execute(){
        input();
        process();
        output();
    }

    private static void input(){
        mailList = MailListReader.read("src/file/email.txt");
    }

    private static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output(){
        HistogramDisplay histo = new HistogramDisplay(histogram);

        histo.execute();
    
    }    
}
