package br.com.edumelo.education.primer.java_education_primer_wsimport;

import br.com.edumelo.primer.ws.client.HelloWorldService;
import br.com.edumelo.primer.ws.client.HelloWorldService_Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloWorldService_Service service = new HelloWorldService_Service();
        HelloWorldService hll = service.getHelloWorld();
        
        String s = hll.sayHelloToName("Eduardo");
        
        System.out.println(s);
    }
}
