
package kata4.view;

import java.util.List;


public class MailHistogramBuilder {
     public static Histogram<String> build(List<Mail> correos){

        Histogram<String> histogram = new Histogram<>();
        for(Mail correo: correos){
            histogram.increment(correo.getDomain());
        }
        return histogram;
    }
}
