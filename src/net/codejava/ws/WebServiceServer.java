package net.codejava.ws;


import javax.xml.ws.Endpoint;

public class WebServiceServer {

    public static void main(String[] args) {

        /**
         * Starts a simple server to deploy the web service.
         */
        String bindingURI = "http://localhost:9898/md5WebService";
        Hello helloService = new Hello();

        Endpoint.publish(bindingURI, helloService); //Конечная точка Веб-сервиса
        System.out.println("Server started at: " + bindingURI);
            

        }
    }


        

