package org.java.versions.java07.binary_integer_literals;

class Main {

    // binary literal prefix with '0b' or '0B'
    int anInt1 = 0b01010000101000101101000010100010;
    
    // break digits with underscore for readability
    int anInt2 = 0b0101_0000_1010_0010_1101_0000_1010_0010;
    
    // break the digits with underscore
    int anInt3 = 2_123_456;
    
    // '0b' for int(32-bit), need to cast to byte(8-bit)/short(16-bit)
    byte aByte = (byte) 0b0110_1101;
    short aShort = (short) 0b0111_0101_0000_0101;
    long aLong = 0b1000_0101_0001_0110_1000_0101_0000_1010_0010_1101_0100_0101_1010_0001_0100_0101L;  // long(64-bit) with suffix 'L'

    // You can also use underscore on fractional part for readability
    double aDouble = 3.1415_9265; 
    float aFloat = 3.14_15_92_65f;
}
