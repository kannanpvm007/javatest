package com.kgisl.qs1.map;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Sream
 */
public class SreamTest {

    public static void main(String[] args) throws IOException {
    String file = "D:\\Kannan\\test1\\src\\main\\java\\com\\kgisl\\qs1\\map\\demo.txt";
   FileReader reader = new FileReader(file);
    StreamTokenizer tokenizer = new StreamTokenizer(reader);
 
    // token 1
    tokenizer.nextToken();
    // assertEquals(StreamTokenizer.TT_WORD, tokenizer.ttype, 0);
    // assertEquals("Hello", tokenizer.sval);
 
    // // token 2    
    // tokenizer.nextToken();
    // // assertEquals(StreamTokenizer.TT_NUMBER, tokenizer.ttype, 0);
    // // assertEquals(1, tokenizer.nval, 0.0000001);
 
    // // token 3
    // tokenizer.nextToken();
    // assertEquals(StreamTokenizer.TT_EOF, tokenizer.ttype, 0);
    reader.close();
}

}