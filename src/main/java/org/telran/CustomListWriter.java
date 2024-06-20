package org.telran;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CustomListWriter  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
           while (!Thread.currentThread().isInterrupted()) {
//               try {
//                   TimeUnit.SECONDS.sleep(1);
                   System.out.println("1111");
//               } catch (InterruptedException e) {
//                   throw new RuntimeException(e);
//               }
           }
        });

        thread.start();
        Thread.sleep(4000);
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());

    }

}
