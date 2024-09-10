/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.echandens.kafka.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Contact extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -854927365961967656L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Contact\",\"namespace\":\"com.echandens.kafka.model\",\"fields\":[{\"name\":\"emailId\",\"type\":\"string\"},{\"name\":\"mobile\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Contact> ENCODER =
      new BinaryMessageEncoder<Contact>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Contact> DECODER =
      new BinaryMessageDecoder<Contact>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Contact> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Contact> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Contact>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Contact to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Contact from a ByteBuffer. */
  public static Contact fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence emailId;
  @Deprecated public java.lang.CharSequence mobile;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Contact() {}

  /**
   * All-args constructor.
   * @param emailId The new value for emailId
   * @param mobile The new value for mobile
   */
  public Contact(java.lang.CharSequence emailId, java.lang.CharSequence mobile) {
    this.emailId = emailId;
    this.mobile = mobile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return emailId;
    case 1: return mobile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: emailId = (java.lang.CharSequence)value$; break;
    case 1: mobile = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'emailId' field.
   * @return The value of the 'emailId' field.
   */
  public java.lang.CharSequence getEmailId() {
    return emailId;
  }

  /**
   * Sets the value of the 'emailId' field.
   * @param value the value to set.
   */
  public void setEmailId(java.lang.CharSequence value) {
    this.emailId = value;
  }

  /**
   * Gets the value of the 'mobile' field.
   * @return The value of the 'mobile' field.
   */
  public java.lang.CharSequence getMobile() {
    return mobile;
  }

  /**
   * Sets the value of the 'mobile' field.
   * @param value the value to set.
   */
  public void setMobile(java.lang.CharSequence value) {
    this.mobile = value;
  }

  /**
   * Creates a new Contact RecordBuilder.
   * @return A new Contact RecordBuilder
   */
  public static com.echandens.kafka.model.Contact.Builder newBuilder() {
    return new com.echandens.kafka.model.Contact.Builder();
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Contact RecordBuilder
   */
  public static com.echandens.kafka.model.Contact.Builder newBuilder(com.echandens.kafka.model.Contact.Builder other) {
    return new com.echandens.kafka.model.Contact.Builder(other);
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Contact instance.
   * @param other The existing instance to copy.
   * @return A new Contact RecordBuilder
   */
  public static com.echandens.kafka.model.Contact.Builder newBuilder(com.echandens.kafka.model.Contact other) {
    return new com.echandens.kafka.model.Contact.Builder(other);
  }

  /**
   * RecordBuilder for Contact instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Contact>
    implements org.apache.avro.data.RecordBuilder<Contact> {

    private java.lang.CharSequence emailId;
    private java.lang.CharSequence mobile;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.echandens.kafka.model.Contact.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.emailId)) {
        this.emailId = data().deepCopy(fields()[0].schema(), other.emailId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobile)) {
        this.mobile = data().deepCopy(fields()[1].schema(), other.mobile);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Contact instance
     * @param other The existing instance to copy.
     */
    private Builder(com.echandens.kafka.model.Contact other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.emailId)) {
        this.emailId = data().deepCopy(fields()[0].schema(), other.emailId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobile)) {
        this.mobile = data().deepCopy(fields()[1].schema(), other.mobile);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'emailId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmailId() {
      return emailId;
    }

    /**
      * Sets the value of the 'emailId' field.
      * @param value The value of 'emailId'.
      * @return This builder.
      */
    public com.echandens.kafka.model.Contact.Builder setEmailId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.emailId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'emailId' field has been set.
      * @return True if the 'emailId' field has been set, false otherwise.
      */
    public boolean hasEmailId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'emailId' field.
      * @return This builder.
      */
    public com.echandens.kafka.model.Contact.Builder clearEmailId() {
      emailId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'mobile' field.
      * @return The value.
      */
    public java.lang.CharSequence getMobile() {
      return mobile;
    }

    /**
      * Sets the value of the 'mobile' field.
      * @param value The value of 'mobile'.
      * @return This builder.
      */
    public com.echandens.kafka.model.Contact.Builder setMobile(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.mobile = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'mobile' field has been set.
      * @return True if the 'mobile' field has been set, false otherwise.
      */
    public boolean hasMobile() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'mobile' field.
      * @return This builder.
      */
    public com.echandens.kafka.model.Contact.Builder clearMobile() {
      mobile = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Contact build() {
      try {
        Contact record = new Contact();
        record.emailId = fieldSetFlags()[0] ? this.emailId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.mobile = fieldSetFlags()[1] ? this.mobile : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Contact>
    WRITER$ = (org.apache.avro.io.DatumWriter<Contact>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Contact>
    READER$ = (org.apache.avro.io.DatumReader<Contact>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
