package Java2Labs.Lab_04As4;

import java.io.*;

public class Lab_04Ch17Q17 {
    public static void main(String[] args) throws IOException {
        BitOutputStream bit = new BitOutputStream(new File("Exercise17_17.dat"));
        bit.writeBit("00001000101");
        bit.close();
    }

    static class BitOutputStream {
        private File file;
        private byte aByte = 0;
        private OutputStream outputStream;
        private byte counter = 0;
        public BitOutputStream(File file) throws FileNotFoundException {
            this.file = file;
            outputStream = new FileOutputStream(file);
        }

        public void writeBit(char bit) throws IOException {
            if (counter >= 8) {
                writeToOutputStream(aByte);
                aByte = 0;
                counter = 0;
            }
            counter++;
            aByte = (byte) (aByte << 1);
            aByte = (byte) (aByte | bit-'0');
        }

        public void writeBit(String bit) throws IOException {
            for (int i = 0; i < bit.length(); i++) {
                writeBit(bit.charAt(i));
            }
        }

        private void writeToOutputStream(byte aByte) throws IOException {
            outputStream.write(aByte);
        }

        public void close() throws IOException {
            if(aByte > 0) writeToOutputStream(aByte);
            outputStream.close();
        }
    }
}
