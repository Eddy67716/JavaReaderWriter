# JavaReaderWriter
A binary writer and reader that adds support for many binay file I/O abilities
With the options to work on a Java Data input stream, data output stream, a java Random access stream or even byte arrays, this project allows you to write file that require more
complex commands than what java's streams allow.
You can
1, Read unsigned values,
2, Read and write 24-bit values
3, Alter the endieness of the file in case you need to write in little endian
4, Read and write non-byte aligned bit values up to 64 bits long.
