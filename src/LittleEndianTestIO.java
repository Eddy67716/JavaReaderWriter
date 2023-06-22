
import static io.IOMethods.LITTLE_ENDIAN;
import io.Reader;
import io.Writer;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Edward Jenkins
 */
public class LittleEndianTestIO {
    
    // values
    private static short nineBitValue = 257;
    private static short sevenBitValue = 65;
    private static short twelveBitValue = 2049;
    private static short fifteenBitValue = -16383;
    private static byte twoBitValue = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        write();
        read();
    }
    
    public static void write() {
        
        try {
            Writer w = new Writer("LSB_Bits.dat", LITTLE_ENDIAN);
            
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(sevenBitValue, (byte)7);
            w.writeArbitraryBitValue(twelveBitValue, (byte)12);
            w.writeArbitraryBitValue(twelveBitValue, (byte)12);
            w.writeArbitraryBitValue(fifteenBitValue, (byte)15);
            w.writeArbitraryBitValue(fifteenBitValue, (byte)15);
            w.writeArbitraryBitValue(fifteenBitValue, (byte)15);
            w.writeArbitraryBitValue(twoBitValue, (byte)2);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            w.writeArbitraryBitValue(nineBitValue, (byte)9);
            
            w.byteAlign();
            w.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void read() {
        
        try {
            Reader r = new Reader("LSB_Bits.dat", LITTLE_ENDIAN);
            long readValue;
            
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValue + ". ");
            } else {
                System.out.println(sevenBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValue + ". ");
            } else {
                System.out.println(twelveBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValue + ". ");
            } else {
                System.out.println(twelveBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValue + ". ");
            } else {
                System.out.println(fifteenBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValue + ". ");
            } else {
                System.out.println(fifteenBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValue + ". ");
            } else {
                System.out.println(fifteenBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValue + ". ");
            } else {
                System.out.println(twoBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = r.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            r.byteAlign();
            r.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
