package net.codejava.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {

    @WebMethod
    public String greeting(String name){
        return "Greeting" + name;

    }

}
