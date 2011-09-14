package rssi_graph.messages;

/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'MultiPingResponseTinyReportMsg'
 * message type.
 */

public class MultiPingResponseTinyReportMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 8;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 17;

    /** Create a new MultiPingResponseTinyReportMsg of size 8. */
    public MultiPingResponseTinyReportMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new MultiPingResponseTinyReportMsg of the given data_length. */
    public MultiPingResponseTinyReportMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg with the given data_length
     * and base offset.
     */
    public MultiPingResponseTinyReportMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg using the given byte array
     * as backing store.
     */
    public MultiPingResponseTinyReportMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public MultiPingResponseTinyReportMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public MultiPingResponseTinyReportMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg embedded in the given message
     * at the given base offset.
     */
    public MultiPingResponseTinyReportMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingResponseTinyReportMsg embedded in the given message
     * at the given base offset and length.
     */
    public MultiPingResponseTinyReportMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <MultiPingResponseTinyReportMsg> \n";
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nodeid=0x"+Long.toHexString(get_nodeid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nodecounter=0x"+Long.toHexString(get_nodecounter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rssi=0x"+Long.toHexString(get_rssi())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, signed
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (true).
     */
    public static boolean isSigned_counter() {
        return true;
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
    // Accessor methods for field: nodeid
    //   Field type: int, signed
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeid' is signed (true).
     */
    public static boolean isSigned_nodeid() {
        return true;
    }

    /**
     * Return whether the field 'nodeid' is an array (false).
     */
    public static boolean isArray_nodeid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeid'
     */
    public static int offset_nodeid() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeid'
     */
    public static int offsetBits_nodeid() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'nodeid'
     */
    public int get_nodeid() {
        return (int)getUIntBEElement(offsetBits_nodeid(), 16);
    }

    /**
     * Set the value of the field 'nodeid'
     */
    public void set_nodeid(int value) {
        setUIntBEElement(offsetBits_nodeid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeid'
     */
    public static int size_nodeid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeid'
     */
    public static int sizeBits_nodeid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodecounter
    //   Field type: int, signed
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodecounter' is signed (true).
     */
    public static boolean isSigned_nodecounter() {
        return true;
    }

    /**
     * Return whether the field 'nodecounter' is an array (false).
     */
    public static boolean isArray_nodecounter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodecounter'
     */
    public static int offset_nodecounter() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodecounter'
     */
    public static int offsetBits_nodecounter() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'nodecounter'
     */
    public int get_nodecounter() {
        return (int)getUIntBEElement(offsetBits_nodecounter(), 16);
    }

    /**
     * Set the value of the field 'nodecounter'
     */
    public void set_nodecounter(int value) {
        setUIntBEElement(offsetBits_nodecounter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodecounter'
     */
    public static int size_nodecounter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodecounter'
     */
    public static int sizeBits_nodecounter() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rssi
    //   Field type: short, signed
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rssi' is signed (true).
     */
    public static boolean isSigned_rssi() {
        return true;
    }

    /**
     * Return whether the field 'rssi' is an array (false).
     */
    public static boolean isArray_rssi() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rssi'
     */
    public static int offset_rssi() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rssi'
     */
    public static int offsetBits_rssi() {
        return 48;
    }

    /**
     * Return the value (as a short) of the field 'rssi'
     */
    public short get_rssi() {
        return (short)getSIntBEElement(offsetBits_rssi(), 16);
    }

    /**
     * Set the value of the field 'rssi'
     */
    public void set_rssi(short value) {
        setSIntBEElement(offsetBits_rssi(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'rssi'
     */
    public static int size_rssi() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rssi'
     */
    public static int sizeBits_rssi() {
        return 16;
    }

}
