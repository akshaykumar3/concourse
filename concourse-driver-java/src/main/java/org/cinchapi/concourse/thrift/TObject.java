/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * @generated
 */
package org.cinchapi.concourse.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import org.cinchapi.concourse.util.ByteBuffers;
import org.cinchapi.concourse.util.Convert;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import javax.annotation.Generated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * A lightweight wrapper for a typed Object that has been encoded
 * as binary data.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-22")
public class TObject implements
        org.apache.thrift.TBase<TObject, TObject._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TObject> {

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    /**
     * Represents a null object that can be passed across the wire.
     */
    public static final TObject NULL = new TObject();

    private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "data", org.apache.thrift.protocol.TType.STRING, (short) 1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
            "TObject");

    private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "type", org.apache.thrift.protocol.TType.I32, (short) 2);
    /**
     * The byte for UTF-8 whitespace.
     */
    private static byte WHITESPACE = " ".getBytes(StandardCharsets.UTF_8)[0];

    static {
        NULL.setType(Type.NULL);
        NULL.setData(ByteBuffer.allocate(1));
    }
    static {
        schemes.put(StandardScheme.class, new TObjectStandardSchemeFactory());
        schemes.put(TupleScheme.class, new TObjectTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
                _Fields.class);
        tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData(
                "data", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                        org.apache.thrift.protocol.TType.STRING, true)));
        tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData(
                "type", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.EnumMetaData(
                        org.apache.thrift.protocol.TType.ENUM, Type.class)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
                TObject.class, metaDataMap);
    }

    public ByteBuffer data; // required

    /**
     * 
     * @see Type
     */
    public Type type; // required

    public TObject() {
        this.type = Type.STRING;

    }

    public TObject(ByteBuffer data, Type type) {
        this.data = data;
        this.type = type;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public TObject(TObject other) {
        if(other.isSetData()) {
            this.data = org.apache.thrift.TBaseHelper.copyBinary(other.data);
        }
        if(other.isSetType()) {
            this.type = other.type;
        }
    }

    public ByteBuffer bufferForData() {
        return ByteBuffers.asReadOnlyBuffer(data);
    }

    @Override
    public void clear() {
        this.data = null;
        this.type = Type.STRING;

    }

    @Override
    public int compareTo(TObject other) {
        if(!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetData()).compareTo(
                other.isSetData());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetData()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data,
                    other.data);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetType()).compareTo(
                other.isSetType());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetType()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type,
                    other.type);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public TObject deepCopy() {
        return new TObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TObject) {
            TObject other = (TObject) obj;
            return bufferForData().equals(other.bufferForData())
                    && getInternalType() == other.getInternalType();
        }
        return false;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public byte[] getData() {
        setData(org.apache.thrift.TBaseHelper.rightSize(data));
        return data == null ? null : data.array();
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
        case DATA:
            return getData();

        case TYPE:
            return getType();

        }
        throw new IllegalStateException();
    }

    /**
     * 
     * @see Type
     */
    public Type getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new int[] { data.hashCode(),
                getInternalType().ordinal() });
    }

    /**
     * Check to see if this TObject represents a "blank" value (e.g. empty
     * string, null, etc). This method is efficient because it only looks at the
     * TObject's binary data as opposed to converting the object to a Java
     * representation beforehand.
     * 
     * @return {@code true} if this TObject is "blank"
     */
    public boolean isBlank() {
        if(this == NULL) {
            return true;
        }
        else if(data.capacity() == 0) {
            return true;
        }
        else if(type == Type.STRING || type == Type.TAG) {
            byte[] bytes = ByteBuffers.toByteArray(data);
            for (int i = 0; i < bytes.length; ++i) {
                if(bytes[i] != WHITESPACE) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if(field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
        case DATA:
            return isSetData();
        case TYPE:
            return isSetType();
        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field data is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetData() {
        return this.data != null;
    }

    /**
     * Returns true if field type is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetType() {
        return this.type != null;
    }

    /**
     * Return {@code true} if this TObject and {@code other} have the same
     * {@code type} and are equal.
     * 
     * @param other
     * @return {@code true} if this matches {@code other}.
     */
    public boolean matches(TObject other) {
        return type == other.type && equals(other);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot)
            throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TObject setData(byte[] data) {
        setData(data == null ? (ByteBuffer) null : ByteBuffer.wrap(data));
        return this;
    }

    public TObject setData(ByteBuffer data) {
        this.data = data;
        return this;
    }

    public void setDataIsSet(boolean value) {
        if(!value) {
            this.data = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
        case DATA:
            if(value == null) {
                unsetData();
            }
            else {
                setData((ByteBuffer) value);
            }
            break;

        case TYPE:
            if(value == null) {
                unsetType();
            }
            else {
                setType((Type) value);
            }
            break;

        }
    }

    /**
     * 
     * @see Type
     */
    public TObject setType(Type type) {
        this.type = type;
        return this;
    }

    public void setTypeIsSet(boolean value) {
        if(!value) {
            this.type = null;
        }
    }

    @Override
    public String toString() {
        return Convert.thriftToJava(this).toString();
    }

    public void unsetData() {
        this.data = null;
    }

    public void unsetType() {
        this.type = null;
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if(data == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'data' was not present! Struct: "
                            + toString());
        }
        if(type == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'type' was not present! Struct: "
                            + toString());
        }
        // check for sub-struct validity
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot)
            throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    /**
     * Return the {@link Type} that is used for internal operations.
     * 
     * @return the internal type
     */
    protected Type getInternalType() { // visible for testing
        if(type == Type.TAG) {
            return Type.STRING;
        }
        else {
            return getType();
        }
    }

    private void readObject(java.io.ObjectInputStream in)
            throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(in)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(out)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        DATA((short) 1, "data"),
        /**
         * 
         * @see Type
         */
        TYPE((short) 2, "type");

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
            case 1: // DATA
                return DATA;
            case 2: // TYPE
                return TYPE;
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if(fields == null)
                throw new IllegalArgumentException("Field " + fieldId
                        + " doesn't exist!");
            return fields;
        }

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final String _fieldName;
        private final short _thriftId;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public String getFieldName() {
            return _fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }
    }

    private static class TObjectStandardScheme extends StandardScheme<TObject> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TObject struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // DATA
                    if(schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        struct.data = iprot.readBinary();
                        struct.setDataIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                case 2: // TYPE
                    if(schemeField.type == org.apache.thrift.protocol.TType.I32) {
                        struct.type = Type.findByValue(iprot.readI32());
                        struct.setTypeIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot,
                TObject struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if(struct.data != null) {
                oprot.writeFieldBegin(DATA_FIELD_DESC);
                oprot.writeBinary(struct.data);
                oprot.writeFieldEnd();
            }
            if(struct.type != null) {
                oprot.writeFieldBegin(TYPE_FIELD_DESC);
                oprot.writeI32(struct.type.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class TObjectStandardSchemeFactory implements SchemeFactory {
        public TObjectStandardScheme getScheme() {
            return new TObjectStandardScheme();
        }
    }

    private static class TObjectTupleScheme extends TupleScheme<TObject> {

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot,
                TObject struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            struct.data = iprot.readBinary();
            struct.setDataIsSet(true);
            struct.type = Type.findByValue(iprot.readI32());
            struct.setTypeIsSet(true);
        }

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot,
                TObject struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            oprot.writeBinary(struct.data);
            oprot.writeI32(struct.type.getValue());
        }
    }

    private static class TObjectTupleSchemeFactory implements SchemeFactory {
        public TObjectTupleScheme getScheme() {
            return new TObjectTupleScheme();
        }
    }

}
