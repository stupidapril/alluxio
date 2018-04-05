/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

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
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class GetConfigurationTResponse implements org.apache.thrift.TBase<GetConfigurationTResponse, GetConfigurationTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetConfigurationTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetConfigurationTResponse");

  private static final org.apache.thrift.protocol.TField CONFIG_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("configList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetConfigurationTResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetConfigurationTResponseTupleSchemeFactory());
  }

  private List<ConfigProperty> configList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONFIG_LIST((short)1, "configList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONFIG_LIST
          return CONFIG_LIST;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONFIG_LIST, new org.apache.thrift.meta_data.FieldMetaData("configList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigProperty.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetConfigurationTResponse.class, metaDataMap);
  }

  public GetConfigurationTResponse() {
  }

  public GetConfigurationTResponse(
    List<ConfigProperty> configList)
  {
    this();
    this.configList = configList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetConfigurationTResponse(GetConfigurationTResponse other) {
    if (other.isSetConfigList()) {
      List<ConfigProperty> __this__configList = new ArrayList<ConfigProperty>(other.configList.size());
      for (ConfigProperty other_element : other.configList) {
        __this__configList.add(new ConfigProperty(other_element));
      }
      this.configList = __this__configList;
    }
  }

  public GetConfigurationTResponse deepCopy() {
    return new GetConfigurationTResponse(this);
  }

  @Override
  public void clear() {
    this.configList = null;
  }

  public int getConfigListSize() {
    return (this.configList == null) ? 0 : this.configList.size();
  }

  public java.util.Iterator<ConfigProperty> getConfigListIterator() {
    return (this.configList == null) ? null : this.configList.iterator();
  }

  public void addToConfigList(ConfigProperty elem) {
    if (this.configList == null) {
      this.configList = new ArrayList<ConfigProperty>();
    }
    this.configList.add(elem);
  }

  public List<ConfigProperty> getConfigList() {
    return this.configList;
  }

  public GetConfigurationTResponse setConfigList(List<ConfigProperty> configList) {
    this.configList = configList;
    return this;
  }

  public void unsetConfigList() {
    this.configList = null;
  }

  /** Returns true if field configList is set (has been assigned a value) and false otherwise */
  public boolean isSetConfigList() {
    return this.configList != null;
  }

  public void setConfigListIsSet(boolean value) {
    if (!value) {
      this.configList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONFIG_LIST:
      if (value == null) {
        unsetConfigList();
      } else {
        setConfigList((List<ConfigProperty>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIG_LIST:
      return getConfigList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONFIG_LIST:
      return isSetConfigList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetConfigurationTResponse)
      return this.equals((GetConfigurationTResponse)that);
    return false;
  }

  public boolean equals(GetConfigurationTResponse that) {
    if (that == null)
      return false;

    boolean this_present_configList = true && this.isSetConfigList();
    boolean that_present_configList = true && that.isSetConfigList();
    if (this_present_configList || that_present_configList) {
      if (!(this_present_configList && that_present_configList))
        return false;
      if (!this.configList.equals(that.configList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_configList = true && (isSetConfigList());
    list.add(present_configList);
    if (present_configList)
      list.add(configList);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetConfigurationTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConfigList()).compareTo(other.isSetConfigList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfigList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configList, other.configList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetConfigurationTResponse(");
    boolean first = true;

    sb.append("configList:");
    if (this.configList == null) {
      sb.append("null");
    } else {
      sb.append(this.configList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetConfigurationTResponseStandardSchemeFactory implements SchemeFactory {
    public GetConfigurationTResponseStandardScheme getScheme() {
      return new GetConfigurationTResponseStandardScheme();
    }
  }

  private static class GetConfigurationTResponseStandardScheme extends StandardScheme<GetConfigurationTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetConfigurationTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIG_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.configList = new ArrayList<ConfigProperty>(_list0.size);
                ConfigProperty _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ConfigProperty();
                  _elem1.read(iprot);
                  struct.configList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setConfigListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetConfigurationTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.configList != null) {
        oprot.writeFieldBegin(CONFIG_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.configList.size()));
          for (ConfigProperty _iter3 : struct.configList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetConfigurationTResponseTupleSchemeFactory implements SchemeFactory {
    public GetConfigurationTResponseTupleScheme getScheme() {
      return new GetConfigurationTResponseTupleScheme();
    }
  }

  private static class GetConfigurationTResponseTupleScheme extends TupleScheme<GetConfigurationTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetConfigurationTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConfigList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetConfigList()) {
        {
          oprot.writeI32(struct.configList.size());
          for (ConfigProperty _iter4 : struct.configList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetConfigurationTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.configList = new ArrayList<ConfigProperty>(_list5.size);
          ConfigProperty _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ConfigProperty();
            _elem6.read(iprot);
            struct.configList.add(_elem6);
          }
        }
        struct.setConfigListIsSet(true);
      }
    }
  }

}

