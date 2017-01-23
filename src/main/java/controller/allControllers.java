package controller;

import org.omg.CORBA.portable.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by jbuzimkic on 15.11.2016..
 */

@Controller
public class allControllers {

  @RequestMapping("/")
  public String defHandler(){
    return "welcome";
  }

  @RequestMapping("/index.html")
  public String defHandlerIn(){
    return "welcome";
  }

  @RequestMapping("/data.html")
  public String dataHandler() throws Exception{

    File path = new File("C:\\data\\1484908479615.cer");

    System.out.println("We got a file: " + path);
    System.out.println("Does it exists? " + path.exists());
    System.out.println("Wat? " + path.isDirectory());

/*    String content ="Hello world";
    OutputStream outputStream = new FileOutputStream(path);

    outputStream.write(content.getBytes());
    outputStream.close();*/
/*
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
    String firstLine = reader.readLine();
    System.out.println(firstLine);*/

/*    URL url = new URL("http://www.gutenberg.org/cache/epub/2265/pg2265.txt");
    InputStream stream = url.openStream();

    BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    String line = reader.readLine();

    while(line != null){
      System.out.println(line);
      line = reader.readLine();
    }

    System.out.println("Done");*/

    String OUTPUT_FILE = "C:\\data\\data.txt";
    String content = "Hello Java Code Geeks";

    byte[] bytes = content.getBytes();
    OutputStream out = new FileOutputStream(OUTPUT_FILE);


    try{
      out.write(bytes);
      out.write(bytes[0]);
      out.write(bytes, 4,10);
    }catch(Exception e){
      System.out.println(e);
    }


    return "data";
  }
}
