package com.example.chris.testappforinfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;

public class foobar3 {
    
    public static void foo () throws IOException {
        
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        
        fos.write(9);   //DOH! What if exception?
        fos.close();
    }
}