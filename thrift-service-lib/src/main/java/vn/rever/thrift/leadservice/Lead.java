/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vn.rever.thrift.leadservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Lead implements org.apache.thrift.TBase<Lead, Lead._Fields>, java.io.Serializable, Cloneable, Comparable<Lead> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Lead");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PHONE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("phoneNumber", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField USER_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("userStatus", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CREATED_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("createdDate", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField UPDATED_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedDate", org.apache.thrift.protocol.TType.I64, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LeadStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LeadTupleSchemeFactory();

  public long id; // required
  public java.lang.String firstName; // required
  public java.lang.String lastName; // required
  public java.lang.String email; // required
  public java.lang.String phoneNumber; // required
  /**
   * 
   * @see Status
   */
  public Status userStatus; // required
  public java.lang.String source; // required
  public long createdDate; // required
  public long updatedDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    FIRST_NAME((short)2, "firstName"),
    LAST_NAME((short)3, "lastName"),
    EMAIL((short)4, "email"),
    PHONE_NUMBER((short)5, "phoneNumber"),
    /**
     * 
     * @see Status
     */
    USER_STATUS((short)6, "userStatus"),
    SOURCE((short)7, "source"),
    CREATED_DATE((short)8, "createdDate"),
    UPDATED_DATE((short)9, "updatedDate");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // FIRST_NAME
          return FIRST_NAME;
        case 3: // LAST_NAME
          return LAST_NAME;
        case 4: // EMAIL
          return EMAIL;
        case 5: // PHONE_NUMBER
          return PHONE_NUMBER;
        case 6: // USER_STATUS
          return USER_STATUS;
        case 7: // SOURCE
          return SOURCE;
        case 8: // CREATED_DATE
          return CREATED_DATE;
        case 9: // UPDATED_DATE
          return UPDATED_DATE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __CREATEDDATE_ISSET_ID = 1;
  private static final int __UPDATEDDATE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "UserId")));
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("lastName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("phoneNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_STATUS, new org.apache.thrift.meta_data.FieldMetaData("userStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Status.class)));
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_DATE, new org.apache.thrift.meta_data.FieldMetaData("createdDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_DATE, new org.apache.thrift.meta_data.FieldMetaData("updatedDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Lead.class, metaDataMap);
  }

  public Lead() {
  }

  public Lead(
    long id,
    java.lang.String firstName,
    java.lang.String lastName,
    java.lang.String email,
    java.lang.String phoneNumber,
    Status userStatus,
    java.lang.String source,
    long createdDate,
    long updatedDate)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.userStatus = userStatus;
    this.source = source;
    this.createdDate = createdDate;
    setCreatedDateIsSet(true);
    this.updatedDate = updatedDate;
    setUpdatedDateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Lead(Lead other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetFirstName()) {
      this.firstName = other.firstName;
    }
    if (other.isSetLastName()) {
      this.lastName = other.lastName;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetPhoneNumber()) {
      this.phoneNumber = other.phoneNumber;
    }
    if (other.isSetUserStatus()) {
      this.userStatus = other.userStatus;
    }
    if (other.isSetSource()) {
      this.source = other.source;
    }
    this.createdDate = other.createdDate;
    this.updatedDate = other.updatedDate;
  }

  public Lead deepCopy() {
    return new Lead(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.firstName = null;
    this.lastName = null;
    this.email = null;
    this.phoneNumber = null;
    this.userStatus = null;
    this.source = null;
    setCreatedDateIsSet(false);
    this.createdDate = 0;
    setUpdatedDateIsSet(false);
    this.updatedDate = 0;
  }

  public long getId() {
    return this.id;
  }

  public Lead setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public java.lang.String getFirstName() {
    return this.firstName;
  }

  public Lead setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    return this;
  }

  public void unsetFirstName() {
    this.firstName = null;
  }

  /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstName() {
    return this.firstName != null;
  }

  public void setFirstNameIsSet(boolean value) {
    if (!value) {
      this.firstName = null;
    }
  }

  public java.lang.String getLastName() {
    return this.lastName;
  }

  public Lead setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    return this;
  }

  public void unsetLastName() {
    this.lastName = null;
  }

  /** Returns true if field lastName is set (has been assigned a value) and false otherwise */
  public boolean isSetLastName() {
    return this.lastName != null;
  }

  public void setLastNameIsSet(boolean value) {
    if (!value) {
      this.lastName = null;
    }
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public Lead setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public java.lang.String getPhoneNumber() {
    return this.phoneNumber;
  }

  public Lead setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public void unsetPhoneNumber() {
    this.phoneNumber = null;
  }

  /** Returns true if field phoneNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPhoneNumber() {
    return this.phoneNumber != null;
  }

  public void setPhoneNumberIsSet(boolean value) {
    if (!value) {
      this.phoneNumber = null;
    }
  }

  /**
   * 
   * @see Status
   */
  public Status getUserStatus() {
    return this.userStatus;
  }

  /**
   * 
   * @see Status
   */
  public Lead setUserStatus(Status userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  public void unsetUserStatus() {
    this.userStatus = null;
  }

  /** Returns true if field userStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetUserStatus() {
    return this.userStatus != null;
  }

  public void setUserStatusIsSet(boolean value) {
    if (!value) {
      this.userStatus = null;
    }
  }

  public java.lang.String getSource() {
    return this.source;
  }

  public Lead setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public long getCreatedDate() {
    return this.createdDate;
  }

  public Lead setCreatedDate(long createdDate) {
    this.createdDate = createdDate;
    setCreatedDateIsSet(true);
    return this;
  }

  public void unsetCreatedDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDDATE_ISSET_ID);
  }

  /** Returns true if field createdDate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDDATE_ISSET_ID);
  }

  public void setCreatedDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDDATE_ISSET_ID, value);
  }

  public long getUpdatedDate() {
    return this.updatedDate;
  }

  public Lead setUpdatedDate(long updatedDate) {
    this.updatedDate = updatedDate;
    setUpdatedDateIsSet(true);
    return this;
  }

  public void unsetUpdatedDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UPDATEDDATE_ISSET_ID);
  }

  /** Returns true if field updatedDate is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UPDATEDDATE_ISSET_ID);
  }

  public void setUpdatedDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UPDATEDDATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case FIRST_NAME:
      if (value == null) {
        unsetFirstName();
      } else {
        setFirstName((java.lang.String)value);
      }
      break;

    case LAST_NAME:
      if (value == null) {
        unsetLastName();
      } else {
        setLastName((java.lang.String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.String)value);
      }
      break;

    case PHONE_NUMBER:
      if (value == null) {
        unsetPhoneNumber();
      } else {
        setPhoneNumber((java.lang.String)value);
      }
      break;

    case USER_STATUS:
      if (value == null) {
        unsetUserStatus();
      } else {
        setUserStatus((Status)value);
      }
      break;

    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((java.lang.String)value);
      }
      break;

    case CREATED_DATE:
      if (value == null) {
        unsetCreatedDate();
      } else {
        setCreatedDate((java.lang.Long)value);
      }
      break;

    case UPDATED_DATE:
      if (value == null) {
        unsetUpdatedDate();
      } else {
        setUpdatedDate((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case FIRST_NAME:
      return getFirstName();

    case LAST_NAME:
      return getLastName();

    case EMAIL:
      return getEmail();

    case PHONE_NUMBER:
      return getPhoneNumber();

    case USER_STATUS:
      return getUserStatus();

    case SOURCE:
      return getSource();

    case CREATED_DATE:
      return getCreatedDate();

    case UPDATED_DATE:
      return getUpdatedDate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case FIRST_NAME:
      return isSetFirstName();
    case LAST_NAME:
      return isSetLastName();
    case EMAIL:
      return isSetEmail();
    case PHONE_NUMBER:
      return isSetPhoneNumber();
    case USER_STATUS:
      return isSetUserStatus();
    case SOURCE:
      return isSetSource();
    case CREATED_DATE:
      return isSetCreatedDate();
    case UPDATED_DATE:
      return isSetUpdatedDate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Lead)
      return this.equals((Lead)that);
    return false;
  }

  public boolean equals(Lead that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_firstName = true && this.isSetFirstName();
    boolean that_present_firstName = true && that.isSetFirstName();
    if (this_present_firstName || that_present_firstName) {
      if (!(this_present_firstName && that_present_firstName))
        return false;
      if (!this.firstName.equals(that.firstName))
        return false;
    }

    boolean this_present_lastName = true && this.isSetLastName();
    boolean that_present_lastName = true && that.isSetLastName();
    if (this_present_lastName || that_present_lastName) {
      if (!(this_present_lastName && that_present_lastName))
        return false;
      if (!this.lastName.equals(that.lastName))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_phoneNumber = true && this.isSetPhoneNumber();
    boolean that_present_phoneNumber = true && that.isSetPhoneNumber();
    if (this_present_phoneNumber || that_present_phoneNumber) {
      if (!(this_present_phoneNumber && that_present_phoneNumber))
        return false;
      if (!this.phoneNumber.equals(that.phoneNumber))
        return false;
    }

    boolean this_present_userStatus = true && this.isSetUserStatus();
    boolean that_present_userStatus = true && that.isSetUserStatus();
    if (this_present_userStatus || that_present_userStatus) {
      if (!(this_present_userStatus && that_present_userStatus))
        return false;
      if (!this.userStatus.equals(that.userStatus))
        return false;
    }

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_createdDate = true;
    boolean that_present_createdDate = true;
    if (this_present_createdDate || that_present_createdDate) {
      if (!(this_present_createdDate && that_present_createdDate))
        return false;
      if (this.createdDate != that.createdDate)
        return false;
    }

    boolean this_present_updatedDate = true;
    boolean that_present_updatedDate = true;
    if (this_present_updatedDate || that_present_updatedDate) {
      if (!(this_present_updatedDate && that_present_updatedDate))
        return false;
      if (this.updatedDate != that.updatedDate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetFirstName()) ? 131071 : 524287);
    if (isSetFirstName())
      hashCode = hashCode * 8191 + firstName.hashCode();

    hashCode = hashCode * 8191 + ((isSetLastName()) ? 131071 : 524287);
    if (isSetLastName())
      hashCode = hashCode * 8191 + lastName.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + email.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhoneNumber()) ? 131071 : 524287);
    if (isSetPhoneNumber())
      hashCode = hashCode * 8191 + phoneNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserStatus()) ? 131071 : 524287);
    if (isSetUserStatus())
      hashCode = hashCode * 8191 + userStatus.getValue();

    hashCode = hashCode * 8191 + ((isSetSource()) ? 131071 : 524287);
    if (isSetSource())
      hashCode = hashCode * 8191 + source.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdDate);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(updatedDate);

    return hashCode;
  }

  @Override
  public int compareTo(Lead other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFirstName()).compareTo(other.isSetFirstName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, other.firstName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastName()).compareTo(other.isSetLastName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastName, other.lastName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPhoneNumber()).compareTo(other.isSetPhoneNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhoneNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phoneNumber, other.phoneNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserStatus()).compareTo(other.isSetUserStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userStatus, other.userStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSource()).compareTo(other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedDate()).compareTo(other.isSetCreatedDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdDate, other.createdDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedDate()).compareTo(other.isSetUpdatedDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedDate, other.updatedDate);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Lead(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("firstName:");
    if (this.firstName == null) {
      sb.append("null");
    } else {
      sb.append(this.firstName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastName:");
    if (this.lastName == null) {
      sb.append("null");
    } else {
      sb.append(this.lastName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phoneNumber:");
    if (this.phoneNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.phoneNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userStatus:");
    if (this.userStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.userStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdDate:");
    sb.append(this.createdDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedDate:");
    sb.append(this.updatedDate);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LeadStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LeadStandardScheme getScheme() {
      return new LeadStandardScheme();
    }
  }

  private static class LeadStandardScheme extends org.apache.thrift.scheme.StandardScheme<Lead> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Lead struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstName = iprot.readString();
              struct.setFirstNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastName = iprot.readString();
              struct.setLastNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PHONE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phoneNumber = iprot.readString();
              struct.setPhoneNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USER_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userStatus = vn.rever.thrift.leadservice.Status.findByValue(iprot.readI32());
              struct.setUserStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.source = iprot.readString();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CREATED_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdDate = iprot.readI64();
              struct.setCreatedDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // UPDATED_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedDate = iprot.readI64();
              struct.setUpdatedDateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Lead struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.firstName != null) {
        oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
        oprot.writeString(struct.firstName);
        oprot.writeFieldEnd();
      }
      if (struct.lastName != null) {
        oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
        oprot.writeString(struct.lastName);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.phoneNumber != null) {
        oprot.writeFieldBegin(PHONE_NUMBER_FIELD_DESC);
        oprot.writeString(struct.phoneNumber);
        oprot.writeFieldEnd();
      }
      if (struct.userStatus != null) {
        oprot.writeFieldBegin(USER_STATUS_FIELD_DESC);
        oprot.writeI32(struct.userStatus.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(struct.source);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_DATE_FIELD_DESC);
      oprot.writeI64(struct.createdDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_DATE_FIELD_DESC);
      oprot.writeI64(struct.updatedDate);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LeadTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LeadTupleScheme getScheme() {
      return new LeadTupleScheme();
    }
  }

  private static class LeadTupleScheme extends org.apache.thrift.scheme.TupleScheme<Lead> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Lead struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetFirstName()) {
        optionals.set(1);
      }
      if (struct.isSetLastName()) {
        optionals.set(2);
      }
      if (struct.isSetEmail()) {
        optionals.set(3);
      }
      if (struct.isSetPhoneNumber()) {
        optionals.set(4);
      }
      if (struct.isSetUserStatus()) {
        optionals.set(5);
      }
      if (struct.isSetSource()) {
        optionals.set(6);
      }
      if (struct.isSetCreatedDate()) {
        optionals.set(7);
      }
      if (struct.isSetUpdatedDate()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetFirstName()) {
        oprot.writeString(struct.firstName);
      }
      if (struct.isSetLastName()) {
        oprot.writeString(struct.lastName);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetPhoneNumber()) {
        oprot.writeString(struct.phoneNumber);
      }
      if (struct.isSetUserStatus()) {
        oprot.writeI32(struct.userStatus.getValue());
      }
      if (struct.isSetSource()) {
        oprot.writeString(struct.source);
      }
      if (struct.isSetCreatedDate()) {
        oprot.writeI64(struct.createdDate);
      }
      if (struct.isSetUpdatedDate()) {
        oprot.writeI64(struct.updatedDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Lead struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.firstName = iprot.readString();
        struct.setFirstNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastName = iprot.readString();
        struct.setLastNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(4)) {
        struct.phoneNumber = iprot.readString();
        struct.setPhoneNumberIsSet(true);
      }
      if (incoming.get(5)) {
        struct.userStatus = vn.rever.thrift.leadservice.Status.findByValue(iprot.readI32());
        struct.setUserStatusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.source = iprot.readString();
        struct.setSourceIsSet(true);
      }
      if (incoming.get(7)) {
        struct.createdDate = iprot.readI64();
        struct.setCreatedDateIsSet(true);
      }
      if (incoming.get(8)) {
        struct.updatedDate = iprot.readI64();
        struct.setUpdatedDateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
