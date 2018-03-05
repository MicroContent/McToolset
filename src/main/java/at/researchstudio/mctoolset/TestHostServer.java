package at.researchstudio.mctoolset;

import fi.iki.elonen.NanoHTTPD;
import sun.misc.ClassLoaderUtil;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by bgoeschlberger on 02.03.2018.
 */
public class TestHostServer extends NanoHTTPD {
    public TestHostServer(int port) {
        super(port);
    }

    @Override
    public Response serve(IHTTPSession session) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("MicroContentTestHost.html");
        String s = new Scanner(is).useDelimiter("\\Z").next();
        return newFixedLengthResponse(s);
    }
}
