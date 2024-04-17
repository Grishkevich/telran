package org.telran;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CustomListWriter extends Writer {

    private String path;

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        Path p = Paths.get(path);
        for (char c : cbuf) {
            System.out.println(String.valueOf(c));
            Files.writeString(p, String.valueOf(c), StandardOpenOption.APPEND);
        }
    }

    public CustomListWriter(String path) {
        this.path = path;
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

/*    public void write(String str) throws IOException {
        Path p = Paths.get(path);
        if (!Files.exists(p)) {
            Files.createFile(p);
        }
        try {
            Files.writeString(p, str, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("aaaa\n");
        s.add("wwww\n");
        s.add("dddd\n");

        Writer writer= new CustomListWriter("test1");
        s.forEach(e -> {
            try {
                writer.write(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
