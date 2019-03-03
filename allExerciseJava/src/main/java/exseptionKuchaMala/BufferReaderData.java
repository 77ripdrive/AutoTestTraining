package exseptionKuchaMala;

import java.io.*;

public class BufferReaderData {

        static char c;
        static String str;

        public static void readBufferChar() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Type symbol, q - for exit");
            do {
                c = (char) br.read();
                System.out.print(c);
            }
            while (c != 'q');
            System.out.print("   Exit");


        }

        public static String readBufferLine() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Type string of symbols, Stop - for exit");
            do {
                str = br.readLine();
                System.out.print(str);
            }
            while (!str.equals("Stop"));
            System.out.println(" Everything is correct.");
            return str;
        }

            public static void readFile(String fileName) throws java.lang.OutOfMemoryError, IOException  {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String string;
                while (( string = reader.readLine()) != null) {
                    System.out.println("String in file --->"+string);
                }
            }

       public  void saveToFile() throws IOException {
           FileWriter file = new FileWriter("exeptionOperExsample.txt");
           Writer output = new BufferedWriter(file);
            output.write(readBufferLine());
            output.close();
       }

}









