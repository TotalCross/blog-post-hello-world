package hello;

import hello.HelloWorld;
import totalcross.TotalCrossApplication;

public class HelloWorldApplication {
    public static void main(String[] args) {
	TotalCrossApplication.run(HelloWorld.class, "/scr", "android", "/fontsize", "20", "/fingertouch");
    }
}
