//2

//Marcus Schumann

package assignment2;

import java.io.*;
import java.util.*;
import java.nio.channels.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/channels/FileChannel.html
import java.nio.file.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/file/StandardOpenOption.html
import java.nio.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/MappedByteBuffer.html
import java.nio.channels.FileChannel.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/channels/FileChannel.MapMode.html

public class Consumer {

    public static final String shared_name = "OS";
    public static final int SIZE = 512;

    public static void main( String[] args ) throws java.io.IOException {
        File shmem = new File( shared_name );
        
        // You need to write the code to map the shared memory and consume the producer's output here.
        
        /** The steps are:
           (1) Open a FileChannel object and set the proper options via StandardOpenOption
           (2) Obtain a MappedByteBuffer by calling the map() method on a FileChannel object using 
           the correct parameters (similar to POSIX example from lecture).
           (3) Use a CharBuf object to read from the shared buffer. 
        */ 
       
        
        FileChannel channel = FileChannel.open( shmem.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE );

        MappedByteBuffer mapper = channel.map( MapMode.READ_WRITE,0,SIZE );
        CharBuffer charBuf = mapper.asCharBuffer();
        
        //we have pur file now
        //it is a char array so we have to print it this way
        //it receive a char array from another file!
        char c;
        while((c = charBuf.get()) != 0 ) {
        	System.out.print(c);
        }
        System.out.println();
        
        channel.close();
       
       
    }
}
