package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        if(args.length != 0) {
            /*String name = "";
            for(int i=0;i<args.length;i++){
                name+=args[i];
            }*/
            System.out.println("Hello "+String.join(", ",args));
        }else{
            System.out.println( "Hello World!" );
        }

    }
}
