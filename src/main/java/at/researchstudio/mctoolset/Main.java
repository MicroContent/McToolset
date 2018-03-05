package at.researchstudio.mctoolset;

import fi.iki.elonen.SimpleWebServer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by bgoeschlberger on 02.03.2018.
 */
public class Main {
    public static void main(String[] args){
        int port1 = 8080;
        int port2 = 8090;
        TestHostServer testHostServer = new TestHostServer(port1);
        SimpleWebServer devServer = new SimpleWebServer("0.0.0.0", port2, new File("."), true, "*");
        try {
            testHostServer.start();
            devServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
