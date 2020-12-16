//1

//Marcus Schumann

package assignment2;

import java.io.*;
import java.util.*;
import java.nio.channels.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/channels/FileChannel.html
import java.nio.file.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/file/StandardOpenOption.html
import java.nio.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/MappedByteBuffer.html
import java.nio.channels.FileChannel.*; // https://docs.oracle.com/javase/7/docs/api/java/nio/channels/FileChannel.MapMode.html

public class Producer {

    public static final String shared_name = "OS";
    public static final int SIZE = 512; 
    public static char[] message = "Hello World!\n\0".toCharArray();
    
    public static void main( String[] args ) throws java.io.IOException {
    	
    	//new file created in defualt location: this folder
        File shmem = new File(shared_name);
        
        //if file not there create it
        shmem.createNewFile();
        
      
        // You need to write the code to map the shared memory 
        // and produce the message defined above for the consumer process.
        
         /** The steps are:
           (1) Open a FileChannel object and set the proper options via StandardOpenOption
           (2) Obtain a MappedByteBuffer by calling the map() method on a FileChannel object using 
           the correct parameters (similar to POSIX example from lecture).
           (3) Use a CharBuf object to write to the shared buffer.
         */ 
        
        //first instantiate channel function to read in 
        FileChannel channel = FileChannel.open( shmem.toPath(),StandardOpenOption.READ, StandardOpenOption.WRITE );

        //channel.map(type, position, size)
        MappedByteBuffer mapper = channel.map( MapMode.READ_WRITE,0,SIZE );
        
        //Charbuffer basically allows it to receive Characters
        CharBuffer characterBuffer = mapper.asCharBuffer();

        characterBuffer.put(message);

        System.out.println( "First we run Producer, and then the Consumer....." );
        
        
        channel.close();
        
       
    }
}
