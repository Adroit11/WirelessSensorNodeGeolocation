package rssi_graph.messages;

/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'MultiPingMsg'
 * message type.
 */

public class MultiPingMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 8;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 12;

    /** Create a new MultiPingMsg of size 8. */
    public MultiPingMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new MultiPingMsg of the given data_length. */
    public MultiPingMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg with the given data_length
     * and base offset.
     */
    public MultiPingMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store.
     */
    public MultiPingMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public MultiPingMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public MultiPingMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg embedded in the given message
     * at the given base offset.
     */
    public MultiPingMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg embedded in the given message
     * at the given base offset and length.
     */
    public MultiPingMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <MultiPingMsg> \n";
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [txpower=0x"+Long.toHexString(get_txpower())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [channel=0x"+Long.toHexString(get_channel())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [packets=0x"+Long.toHexString(get_packets())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [delay=0x"+Long.toHexString(get_delay())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'counter'
     */
    public int get_counter() {
        return (int)getUIntBEElement(offsetBits_counter(), 16);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(int value) {
        setUIntBEElement(offsetBits_counter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: txpower
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'txpower' is signed (false).
     */
    public static boolean isSigned_txpower() {
        return false;
    }

    /**
     * Return whether the field 'txpower' is an array (false).
     */
    public static boolean isArray_txpower() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'txpower'
     */
    public static int offset_txpower() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'txpower'
     */
    public static int offsetBits_txpower() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'txpower'
     */
    public short get_txpower() {
        return (short)getUIntBEElement(offsetBits_txpower(), 8);
    }

    /**
     * Set the value of the field 'txpower'
     */
    public void set_txpower(short value) {
        setUIntBEElement(offsetBits_txpower(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'txpower'
     */
    public static int size_txpower() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'txpower'
     */
    public static int sizeBits_txpower() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: channel
    //   Field type: short, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'channel' is signed (false).
     */
    public static boolean isSigned_channel() {
        return false;
    }

    /**
     * Return whether the field 'channel' is an array (false).
     */
    public static boolean isArray_channel() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'channel'
     */
    public static int offset_channel() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'channel'
     */
    public static int offsetBits_channel() {
        return 24;
    }

    /**
     * Return the value (as a short) of the field 'channel'
     */
    public short get_channel() {
        return (short)getUIntBEElement(offsetBits_channel(), 8);
    }

    /**
     * Set the value of the field 'channel'
     */
    public void set_channel(short value) {
        setUIntBEElement(offsetBits_channel(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'channel'
     */
    public static int size_channel() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'channel'
     */
    public static int sizeBits_channel() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: packets
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'packets' is signed (false).
     */
    public static boolean isSigned_packets() {
        return false;
    }

    /**
     * Return whether the field 'packets' is an array (false).
     */
    public static boolean isArray_packets() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'packets'
     */
    public static int offset_packets() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'packets'
     */
    public static int offsetBits_packets() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'packets'
     */
    public int get_packets() {
        return (int)getUIntBEElement(offsetBits_packets(), 16);
    }

    /**
     * Set the value of the field 'packets'
     */
    public void set_packets(int value) {
        setUIntBEElement(offsetBits_packets(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'packets'
     */
    public static int size_packets() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'packets'
     */
    public static int sizeBits_packets() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: delay
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'delay' is signed (false).
     */
    public static boolean isSigned_delay() {
        return false;
    }

    /**
     * Return whether the field 'delay' is an array (false).
     */
    public static boolean isArray_delay() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'delay'
     */
    public static int offset_delay() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'delay'
     */
    public static int offsetBits_delay() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'delay'
     */
    public int get_delay() {
        return (int)getUIntBEElement(offsetBits_delay(), 16);
    }

    /**
     * Set the value of the field 'delay'
     */
    public void set_delay(int value) {
        setUIntBEElement(offsetBits_delay(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'delay'
     */
    public static int size_delay() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'delay'
     */
    public static int sizeBits_delay() {
        return 16;
    }

}
