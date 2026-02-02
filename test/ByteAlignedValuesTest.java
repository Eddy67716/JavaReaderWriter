
import io.ByteArrayReader;
import io.ByteArrayWriter;
import static io.IOMethods.BIG_ENDIAN;
import static io.IOMethods.LITTLE_ENDIAN;
import io.IReadable;
import io.IWritable;
import io.RandomReaderWriter;
import io.Reader;
import io.Writer;
import java.io.IOException;

/*
 * Copyright (C) 2026 eddy6
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 * @author eddy6
 */
public class ByteAlignedValuesTest {

    // values to write
    private static boolean endianess = LITTLE_ENDIAN;
    private static long longValue = 1000000000l;
    private static double doubleValue = Math.PI;
    private static long uIntValue = 0xffffffffl;
    private static int intValue = 1000000;
    private static float floatValue = 1.0594f;
    private static int uMediumValue = 0xffffff;
    private static int mediumValue = -8388608;
    private static int uShortValue = 65535;
    private static short shortValue = 4096;
    private static short uByteValue = 255;
    private static byte byteValue = 110;

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
            IWritable writer = new Writer("bytes.dat", endianess);

            writer.writeLong(longValue);
            writer.writeDouble(doubleValue);
            writer.writeInt((int) uIntValue);
            writer.writeInt(intValue);
            writer.writeFloat(floatValue);
            writer.writeIntAsTwentyFourBit(uMediumValue);
            writer.writeIntAsTwentyFourBit(mediumValue);
            writer.writeShort((short) uShortValue);
            writer.writeShort(shortValue);
            writer.writeByte((byte) uByteValue);
            writer.writeByte(byteValue);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try {
            IReadable r = new Reader("bytes.dat", endianess);
            long readValue;
            double floatReadValue;
            
            readValue = r.getLong();
            if (readValue != longValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + longValue + ". ");
            } else {
                System.out.println(longValue);
            }
            
            floatReadValue = r.getDouble();
            if (floatReadValue != doubleValue) {
                System.out.println("Error, " + floatReadValue + " is not equal to :"
                        + doubleValue + ". ");
            } else {
                System.out.println(doubleValue);
            }
            
            readValue = r.getUIntAsLong();
            if (readValue != uIntValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + uIntValue + ". ");
            } else {
                System.out.println(uIntValue);
            }
            
            readValue = r.getInt();
            if (readValue != intValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + intValue + ". ");
            } else {
                System.out.println(intValue);
            }
            
            floatReadValue = r.getFloat();
            if (floatReadValue != floatValue) {
                System.out.println("Error, " + floatReadValue + " is not equal to :"
                        + floatValue + ". ");
            } else {
                System.out.println(floatValue);
            }
            
            readValue = r.getU24BitInt();
            if (readValue != uMediumValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + uMediumValue + ". ");
            } else {
                System.out.println(uMediumValue);
            }
            
            readValue = r.get24BitInt();
            if (readValue != mediumValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + mediumValue + ". ");
            } else {
                System.out.println(mediumValue);
            }
            
            readValue = r.getUShortAsInt();
            if (readValue != uShortValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + uShortValue + ". ");
            } else {
                System.out.println(uShortValue);
            }
            
            readValue = r.getShort();
            if (readValue != shortValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + shortValue + ". ");
            } else {
                System.out.println(shortValue);
            }
            
            readValue = r.getUByteAsShort();
            if (readValue != uByteValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + uByteValue + ". ");
            } else {
                System.out.println(uByteValue);
            }
            
            readValue = r.getByte();
            if (readValue != byteValue) {
                System.out.println("Error, " + readValue + " is not equal to :"
                        + byteValue + ". ");
            } else {
                System.out.println(byteValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
