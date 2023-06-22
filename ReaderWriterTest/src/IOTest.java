
import io.ByteArrayReader;
import io.ByteArrayReader;
import io.ByteArrayWriter;
import static io.IOMethods.*;
import io.IReadable;
import io.IWritable;
import io.RandomReaderWriter;
import io.Reader;
import io.Writer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Edward Jenkins
 */
public class IOTest {

    // values to write
    private static boolean endianess = LITTLE_ENDIAN;
    private static String string1 = "This is a string";
    private static byte byteValueOne = 127;
    private static byte byteValueTwo = -1;
    private static byte byteValueThree = -64;
    private static byte byteValueFour = 67;
    private static int uShort1 = 2544;
    private static int uShort2 = 32769;
    private static int threeByteInt = 8000000;
    private static long fortyEightBitValue = 233474976711655l;
    private static byte oneBitValue = 1;
    private static byte twoBitValueOne = 3;
    private static byte twoBitValueTwo = 2;
    private static byte threeBitValue = 5;
    private static byte nybbleOne = 9;
    private static byte fiveBitValue = 17;
    private static byte fiveBitValueTwo = -16;
    private static byte sixBitValue = 33;
    private static byte sevenBitValueOne = 65;
    private static byte sevenBitValueTwo = -64;
    private static short nineBitValue = 257;
    private static short tenBitValue = 513;
    private static short twelveBitValueOne = 4095;
    private static short twelveBitValueTwo = 4000;
    private static short thirteenBitValue = 4097;
    private static short fifteenBitValueOne = 16385;
    private static short fifteenBitValueTwo = 32000;
    private static short fifteenBitValueThree = 16000;
    private static short fifteenBitValueFour = -16000;
    private static int twentyBitValue = 524289;
    private static int twentyThreeBitValue = 4194305;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        write();
        read();
    }

    public static void write() {

        try {

            // write
            IWritable writer = new ByteArrayWriter("bits.dat", endianess);

            writer.writeUTF8String(string1);
            writer.writeShort((short) uShort1);
            writer.writeIntAsTwentyFourBit(threeByteInt);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(byteValueOne, (byte) 8);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(byteValueTwo, (byte) 8);
            writer.writeArbitraryBitValue(twelveBitValueOne, (byte) 12);
            writer.writeArbitraryBitValue(twelveBitValueTwo, (byte) 12);
            writer.writeByte(byteValueThree);
            writer.writeArbitraryBitValue(fifteenBitValueOne, (byte) 15);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeByte(byteValueFour);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(twoBitValueTwo, (byte) 2);
            writer.byteAlign();
            writer.writeArbitraryBitValue(fortyEightBitValue, (byte) 48);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(tenBitValue, (byte) 10);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(twelveBitValueOne, (byte) 12);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(thirteenBitValue, (byte) 13);
            writer.writeArbitraryBitValue(fifteenBitValueTwo, (byte) 15);
            writer.writeArbitraryBitValue(nybbleOne, (byte) 4);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(fifteenBitValueTwo, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueThree, (byte) 15);
            writer.writeArbitraryBitValue(twentyThreeBitValue, (byte) 23);
            writer.writeArbitraryBitValue(twentyThreeBitValue, (byte) 23);
            writer.byteAlign();
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(oneBitValue, (byte) 1);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(threeBitValue, (byte) 3);
            writer.writeArbitraryBitValue(nybbleOne, (byte) 4);
            writer.writeArbitraryBitValue(nybbleOne, (byte) 4);
            writer.writeArbitraryBitValue(nybbleOne, (byte) 4);
            writer.writeArbitraryBitValue(nybbleOne, (byte) 4);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(fiveBitValue, (byte) 5);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(sevenBitValueOne, (byte) 7);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(nineBitValue, (byte) 9);
            writer.writeArbitraryBitValue(fifteenBitValueFour, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueOne, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueTwo, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueThree, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueFour, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueOne, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueTwo, (byte) 15);
            writer.writeArbitraryBitValue(fifteenBitValueThree, (byte) 15);
            writer.writeArbitraryBitValue(tenBitValue, (byte) 10);
            writer.writeArbitraryBitValue(twelveBitValueOne, (byte) 12);
            writer.writeArbitraryBitValue(twoBitValueOne, (byte) 2);
            writer.writeArbitraryBitValue(fiveBitValueTwo, (byte) 5);
            writer.writeArbitraryBitValue(uShort2, (byte)16);
            writer.writeArbitraryBitValue(sevenBitValueTwo, (byte) 7);

            //writer.byteAlign();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try {
            // read method variabes
            IReadable reader = new ByteArrayReader("bits.dat", endianess);
            String readString;
            long readValue;
            int readInt;
            int readShort;

            readString = reader.getUTF8String();
            if (!readString.equals(string1)) {
                System.out.println("Error, " + readString + " is not equal to :"
                        + string1 + ". ");
            } else {
                System.out.println(readString);
            }
            readShort = reader.getUShortAsInt();
            if (readShort != uShort1) {
                System.out.println("Error, " + readShort + " is not equal to :"
                        + uShort1 + ". ");
            } else {
                System.out.println(readShort);
            }
            readInt = reader.get24BitInt();
            if (readInt != threeByteInt) {
                System.out.println("Error, " + readInt + " is not equal to :"
                        + threeByteInt + ". ");
            } else {
                System.out.println(threeByteInt);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 8, false);
            if (readValue != byteValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + byteValueOne + ". ");
            } else {
                System.out.println(byteValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 8, true);
            if (readValue != byteValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + byteValueTwo + ". ");
            } else {
                System.out.println(byteValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValueOne + ". ");
            } else {
                System.out.println(twelveBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValueTwo + ". ");
            } else {
                System.out.println(twelveBitValueTwo);
            }
            readValue = reader.getByte();
            if (readValue != byteValueThree) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + byteValueThree + ". ");
            } else {
                System.out.println(byteValueThree);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueOne + ". ");
            } else {
                System.out.println(fifteenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getByte();
            if (readValue != byteValueFour) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + byteValueFour + ". ");
            } else {
                System.out.println(byteValueFour);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueTwo + ". ");
            } else {
                System.out.println(twoBitValueTwo);
            }
            reader.byteAlign();
            readValue = reader.getArbitraryBitValue((byte) 48, false);
            if (readValue != fortyEightBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fortyEightBitValue + ". ");
            } else {
                System.out.println(fortyEightBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 10, false);
            if (readValue != tenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + tenBitValue + ". ");
            } else {
                System.out.println(tenBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValueOne + ". ");
            } else {
                System.out.println(twelveBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 13, false);
            if (readValue != thirteenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + thirteenBitValue + ". ");
            } else {
                System.out.println(thirteenBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueTwo + ". ");
            } else {
                System.out.println(fifteenBitValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 4, false);
            if (readValue != nybbleOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nybbleOne + ". ");
            } else {
                System.out.println(nybbleOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueTwo + ". ");
            } else {
                System.out.println(fifteenBitValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueThree) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueThree + ". ");
            } else {
                System.out.println(fifteenBitValueThree);
            }
            readValue = reader.getArbitraryBitValue((byte) 23, false);
            if (readValue != twentyThreeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twentyThreeBitValue + ". ");
            } else {
                System.out.println(twentyThreeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 23, false);
            if (readValue != twentyThreeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twentyThreeBitValue + ". ");
            } else {
                System.out.println(twentyThreeBitValue);
            }
            reader.byteAlign();
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 1, false);
            if (readValue != oneBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + oneBitValue + ". ");
            } else {
                System.out.println(oneBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 3, false);
            if (readValue != threeBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + threeBitValue + ". ");
            } else {
                System.out.println(threeBitValue);
            }

            readValue = reader.getArbitraryBitValue((byte) 4, false);
            if (readValue != nybbleOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nybbleOne + ". ");
            } else {
                System.out.println(nybbleOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 4, false);
            if (readValue != nybbleOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nybbleOne + ". ");
            } else {
                System.out.println(nybbleOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 4, false);
            if (readValue != nybbleOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nybbleOne + ". ");
            } else {
                System.out.println(nybbleOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 4, false);
            if (readValue != nybbleOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nybbleOne + ". ");
            } else {
                System.out.println(nybbleOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, false);
            if (readValue != fiveBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValue + ". ");
            } else {
                System.out.println(fiveBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, false);
            if (readValue != sevenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueOne + ". ");
            } else {
                System.out.println(sevenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 9, false);
            if (readValue != nineBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + nineBitValue + ". ");
            } else {
                System.out.println(nineBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValueFour) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueFour + ". ");
            } else {
                System.out.println(fifteenBitValueFour);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueOne + ". ");
            } else {
                System.out.println(fifteenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueTwo + ". ");
            } else {
                System.out.println(fifteenBitValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValueThree) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueThree + ". ");
            } else {
                System.out.println(fifteenBitValueThree);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValueFour) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueFour + ". ");
            } else {
                System.out.println(fifteenBitValueFour);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueOne + ". ");
            } else {
                System.out.println(fifteenBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, false);
            if (readValue != fifteenBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueTwo + ". ");
            } else {
                System.out.println(fifteenBitValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 15, true);
            if (readValue != fifteenBitValueThree) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fifteenBitValueThree + ". ");
            } else {
                System.out.println(fifteenBitValueThree);
            }
            readValue = reader.getArbitraryBitValue((byte) 10, false);
            if (readValue != tenBitValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + tenBitValue + ". ");
            } else {
                System.out.println(tenBitValue);
            }
            readValue = reader.getArbitraryBitValue((byte) 12, false);
            if (readValue != twelveBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twelveBitValueOne + ". ");
            } else {
                System.out.println(twelveBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 2, false);
            if (readValue != twoBitValueOne) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + twoBitValueOne + ". ");
            } else {
                System.out.println(twoBitValueOne);
            }
            readValue = reader.getArbitraryBitValue((byte) 5, true);
            if (readValue != fiveBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + fiveBitValueTwo + ". ");
            } else {
                System.out.println(fiveBitValueTwo);
            }
            readValue = reader.getArbitraryBitValue((byte) 16, false);
            if (readValue != uShort2) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + uShort2 + ". ");
            } else {
                System.out.println(uShort2);
            }
            readValue = reader.getArbitraryBitValue((byte) 7, true);
            if (readValue != sevenBitValueTwo) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + sevenBitValueTwo + ". ");
            } else {
                System.out.println(sevenBitValueTwo);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testWrite() throws IOException {
        Writer writer = new Writer("bits.dat");

        writer.writeArbitraryBitValue(2, (byte) 2);
        writer.writeArbitraryBitValue(3, (byte) 4);
        writer.writeArbitraryBitValue(-1, (byte) 2);
        writer.byteAlign();
        writer.close();
    }

    public static void testRead() throws IOException {
        Reader reader = new Reader("bits.dat");

        System.out.println(reader.getArbitraryBitValue((byte) 2, false));
        System.out.println(reader.getArbitraryBitValue((byte) 4, false));
        System.out.println(reader.getArbitraryBitValue((byte) 2, true));
        reader.byteAlign();
        reader.close();
    }
}
