package com.android.server.os;

import com.google.protobuf.Internal;

public final class TombstoneProtos {
  private TombstoneProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Architecture}
   */
  public enum Architecture
	  implements com.google.protobuf.ProtocolMessageEnum, Internal.EnumLite {
    /**
     * <code>ARM32 = 0;</code>
     */
    ARM32(0),
    /**
     * <code>ARM64 = 1;</code>
     */
    ARM64(1),
    /**
     * <code>X86 = 2;</code>
     */
    X86(2),
    /**
     * <code>X86_64 = 3;</code>
     */
    X86_64(3),
    /**
     * <code>RISCV64 = 4;</code>
     */
    RISCV64(4),
    /**
     * <code>NONE = 5;</code>
     */
    NONE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ARM32 = 0;</code>
     */
    public static final int ARM32_VALUE = 0;
    /**
     * <code>ARM64 = 1;</code>
     */
    public static final int ARM64_VALUE = 1;
    /**
     * <code>X86 = 2;</code>
     */
    public static final int X86_VALUE = 2;
    /**
     * <code>X86_64 = 3;</code>
     */
    public static final int X86_64_VALUE = 3;
    /**
     * <code>RISCV64 = 4;</code>
     */
    public static final int RISCV64_VALUE = 4;
    /**
     * <code>NONE = 5;</code>
     */
    public static final int NONE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Architecture valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Architecture forNumber(int value) {
      switch (value) {
        case 0: return ARM32;
        case 1: return ARM64;
        case 2: return X86;
        case 3: return X86_64;
        case 4: return RISCV64;
        case 5: return NONE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Architecture>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Architecture> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Architecture>() {
            public Architecture findValueByNumber(int number) {
              return Architecture.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final Architecture[] VALUES = values();

    public static Architecture valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Architecture(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Architecture)
  }

  public interface CrashDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrashDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes name = 1;</code>
     * @return The name.
     */
    com.google.protobuf.ByteString getName();

    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * <pre>
   * NOTE TO OEMS:
   * If you add custom fields to this proto, do not use numbers in the reserved range.
   * NOTE TO CONSUMERS:
   * With proto3 -- unlike proto2 -- HasValue is unreliable for any field
   * where the default value for that type is also a valid value for the field.
   * This means, for example, that a boolean that is false or an integer that
   * is zero will appear to be missing --- but because they're not actually
   * marked as `optional` in this schema, consumers should just use values
   * without first checking whether or not they're "present".
   * https://protobuf.dev/programming-guides/proto3/#default
   * </pre>
   *
   * Protobuf type {@code CrashDetail}
   */
  public static final class CrashDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrashDetail)
      CrashDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrashDetail.newBuilder() to construct.
    private CrashDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrashDetail() {
      name_ = com.google.protobuf.ByteString.EMPTY;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrashDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_CrashDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_CrashDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.CrashDetail.class, com.android.server.os.TombstoneProtos.CrashDetail.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString name_;
    /**
     * <code>bytes name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getName() {
      return name_;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!name_.isEmpty()) {
        output.writeBytes(1, name_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(2, data_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, name_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, data_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.CrashDetail)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.CrashDetail other = (com.android.server.os.TombstoneProtos.CrashDetail) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.CrashDetail parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.CrashDetail prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * NOTE TO OEMS:
     * If you add custom fields to this proto, do not use numbers in the reserved range.
     * NOTE TO CONSUMERS:
     * With proto3 -- unlike proto2 -- HasValue is unreliable for any field
     * where the default value for that type is also a valid value for the field.
     * This means, for example, that a boolean that is false or an integer that
     * is zero will appear to be missing --- but because they're not actually
     * marked as `optional` in this schema, consumers should just use values
     * without first checking whether or not they're "present".
     * https://protobuf.dev/programming-guides/proto3/#default
     * </pre>
     *
     * Protobuf type {@code CrashDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrashDetail)
        com.android.server.os.TombstoneProtos.CrashDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_CrashDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_CrashDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.CrashDetail.class, com.android.server.os.TombstoneProtos.CrashDetail.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.CrashDetail.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = com.google.protobuf.ByteString.EMPTY;

        data_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_CrashDetail_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.CrashDetail getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.CrashDetail.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.CrashDetail build() {
        com.android.server.os.TombstoneProtos.CrashDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.CrashDetail buildPartial() {
        com.android.server.os.TombstoneProtos.CrashDetail result = new com.android.server.os.TombstoneProtos.CrashDetail(this);
        result.name_ = name_;
        result.data_ = data_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.CrashDetail) {
          return mergeFrom((com.android.server.os.TombstoneProtos.CrashDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.CrashDetail other) {
        if (other == com.android.server.os.TombstoneProtos.CrashDetail.getDefaultInstance()) return this;
        if (other.getName() != com.google.protobuf.ByteString.EMPTY) {
          setName(other.getName());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();

                break;
              } // case 10
              case 18: {
                data_ = input.readBytes();

                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes name = 1;</code>
       * @return The name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getName() {
        return name_;
      }
      /**
       * <code>bytes name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 2;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 2;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {

        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CrashDetail)
    }

    // @@protoc_insertion_point(class_scope:CrashDetail)
    private static final com.android.server.os.TombstoneProtos.CrashDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.CrashDetail();
    }

    public static com.android.server.os.TombstoneProtos.CrashDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrashDetail>
        PARSER = new com.google.protobuf.AbstractParser<CrashDetail>() {
      @java.lang.Override
      public CrashDetail parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<CrashDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrashDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.CrashDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StackHistoryBufferEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StackHistoryBufferEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BacktraceFrame addr = 1;</code>
     * @return Whether the addr field is set.
     */
    boolean hasAddr();
    /**
     * <code>.BacktraceFrame addr = 1;</code>
     * @return The addr.
     */
    com.android.server.os.TombstoneProtos.BacktraceFrame getAddr();
    /**
     * <code>.BacktraceFrame addr = 1;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAddrOrBuilder();

    /**
     * <code>uint64 fp = 2;</code>
     * @return The fp.
     */
    long getFp();

    /**
     * <code>uint64 tag = 3;</code>
     * @return The tag.
     */
    long getTag();
  }
  /**
   * Protobuf type {@code StackHistoryBufferEntry}
   */
  public static final class StackHistoryBufferEntry extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StackHistoryBufferEntry)
      StackHistoryBufferEntryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StackHistoryBufferEntry.newBuilder() to construct.
    private StackHistoryBufferEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StackHistoryBufferEntry() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StackHistoryBufferEntry();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBufferEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBufferEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.class, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder.class);
    }

    public static final int ADDR_FIELD_NUMBER = 1;
    private com.android.server.os.TombstoneProtos.BacktraceFrame addr_;
    /**
     * <code>.BacktraceFrame addr = 1;</code>
     * @return Whether the addr field is set.
     */
    @java.lang.Override
    public boolean hasAddr() {
      return addr_ != null;
    }
    /**
     * <code>.BacktraceFrame addr = 1;</code>
     * @return The addr.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrame getAddr() {
      return addr_ == null ? com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance() : addr_;
    }
    /**
     * <code>.BacktraceFrame addr = 1;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAddrOrBuilder() {
      return getAddr();
    }

    public static final int FP_FIELD_NUMBER = 2;
    private long fp_;
    /**
     * <code>uint64 fp = 2;</code>
     * @return The fp.
     */
    @java.lang.Override
    public long getFp() {
      return fp_;
    }

    public static final int TAG_FIELD_NUMBER = 3;
    private long tag_;
    /**
     * <code>uint64 tag = 3;</code>
     * @return The tag.
     */
    @java.lang.Override
    public long getTag() {
      return tag_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (addr_ != null) {
        output.writeMessage(1, getAddr());
      }
      if (fp_ != 0L) {
        output.writeUInt64(2, fp_);
      }
      if (tag_ != 0L) {
        output.writeUInt64(3, tag_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (addr_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getAddr());
      }
      if (fp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, fp_);
      }
      if (tag_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, tag_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.StackHistoryBufferEntry)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.StackHistoryBufferEntry other = (com.android.server.os.TombstoneProtos.StackHistoryBufferEntry) obj;

      if (hasAddr() != other.hasAddr()) return false;
      if (hasAddr()) {
        if (!getAddr()
            .equals(other.getAddr())) return false;
      }
      if (getFp()
          != other.getFp()) return false;
      if (getTag()
          != other.getTag()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAddr()) {
        hash = (37 * hash) + ADDR_FIELD_NUMBER;
        hash = (53 * hash) + getAddr().hashCode();
      }
      hash = (37 * hash) + FP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFp());
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTag());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.StackHistoryBufferEntry prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code StackHistoryBufferEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StackHistoryBufferEntry)
        com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBufferEntry_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBufferEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.class, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (addrBuilder_ == null) {
          addr_ = null;
        } else {
          addr_ = null;
          addrBuilder_ = null;
        }
        fp_ = 0L;

        tag_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBufferEntry_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry build() {
        com.android.server.os.TombstoneProtos.StackHistoryBufferEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry buildPartial() {
        com.android.server.os.TombstoneProtos.StackHistoryBufferEntry result = new com.android.server.os.TombstoneProtos.StackHistoryBufferEntry(this);
        if (addrBuilder_ == null) {
          result.addr_ = addr_;
        } else {
          result.addr_ = addrBuilder_.build();
        }
        result.fp_ = fp_;
        result.tag_ = tag_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.StackHistoryBufferEntry) {
          return mergeFrom((com.android.server.os.TombstoneProtos.StackHistoryBufferEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.StackHistoryBufferEntry other) {
        if (other == com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.getDefaultInstance()) return this;
        if (other.hasAddr()) {
          mergeAddr(other.getAddr());
        }
        if (other.getFp() != 0L) {
          setFp(other.getFp());
        }
        if (other.getTag() != 0L) {
          setTag(other.getTag());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getAddrFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 16: {
                fp_ = input.readUInt64();

                break;
              } // case 16
              case 24: {
                tag_ = input.readUInt64();

                break;
              } // case 24
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private com.android.server.os.TombstoneProtos.BacktraceFrame addr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder> addrBuilder_;
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       * @return Whether the addr field is set.
       */
      public boolean hasAddr() {
        return addrBuilder_ != null || addr_ != null;
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       * @return The addr.
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame getAddr() {
        if (addrBuilder_ == null) {
          return addr_ == null ? com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance() : addr_;
        } else {
          return addrBuilder_.getMessage();
        }
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public Builder setAddr(com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (addrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          addr_ = value;
          onChanged();
        } else {
          addrBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public Builder setAddr(
          com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (addrBuilder_ == null) {
          addr_ = builderForValue.build();
          onChanged();
        } else {
          addrBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public Builder mergeAddr(com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (addrBuilder_ == null) {
          if (addr_ != null) {
            addr_ =
              com.android.server.os.TombstoneProtos.BacktraceFrame.newBuilder(addr_).mergeFrom(value).buildPartial();
          } else {
            addr_ = value;
          }
          onChanged();
        } else {
          addrBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public Builder clearAddr() {
        if (addrBuilder_ == null) {
          addr_ = null;
          onChanged();
        } else {
          addr_ = null;
          addrBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder getAddrBuilder() {

        onChanged();
        return getAddrFieldBuilder().getBuilder();
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAddrOrBuilder() {
        if (addrBuilder_ != null) {
          return addrBuilder_.getMessageOrBuilder();
        } else {
          return addr_ == null ?
              com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance() : addr_;
        }
      }
      /**
       * <code>.BacktraceFrame addr = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
          getAddrFieldBuilder() {
        if (addrBuilder_ == null) {
          addrBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>(
                  getAddr(),
                  getParentForChildren(),
                  isClean());
          addr_ = null;
        }
        return addrBuilder_;
      }

      private long fp_ ;
      /**
       * <code>uint64 fp = 2;</code>
       * @return The fp.
       */
      @java.lang.Override
      public long getFp() {
        return fp_;
      }
      /**
       * <code>uint64 fp = 2;</code>
       * @param value The fp to set.
       * @return This builder for chaining.
       */
      public Builder setFp(long value) {

        fp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 fp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFp() {

        fp_ = 0L;
        onChanged();
        return this;
      }

      private long tag_ ;
      /**
       * <code>uint64 tag = 3;</code>
       * @return The tag.
       */
      @java.lang.Override
      public long getTag() {
        return tag_;
      }
      /**
       * <code>uint64 tag = 3;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(long value) {

        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 tag = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {

        tag_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:StackHistoryBufferEntry)
    }

    // @@protoc_insertion_point(class_scope:StackHistoryBufferEntry)
    private static final com.android.server.os.TombstoneProtos.StackHistoryBufferEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.StackHistoryBufferEntry();
    }

    public static com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StackHistoryBufferEntry>
        PARSER = new com.google.protobuf.AbstractParser<StackHistoryBufferEntry>() {
      @java.lang.Override
      public StackHistoryBufferEntry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<StackHistoryBufferEntry> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StackHistoryBufferEntry> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StackHistoryBufferOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StackHistoryBuffer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 tid = 1;</code>
     * @return The tid.
     */
    long getTid();

    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry>
        getEntriesList();
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getEntries(int index);
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    int getEntriesCount();
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder>
        getEntriesOrBuilderList();
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code StackHistoryBuffer}
   */
  public static final class StackHistoryBuffer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StackHistoryBuffer)
      StackHistoryBufferOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StackHistoryBuffer.newBuilder() to construct.
    private StackHistoryBuffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StackHistoryBuffer() {
      entries_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StackHistoryBuffer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBuffer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBuffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.StackHistoryBuffer.class, com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder.class);
    }

    public static final int TID_FIELD_NUMBER = 1;
    private long tid_;
    /**
     * <code>uint64 tid = 1;</code>
     * @return The tid.
     */
    @java.lang.Override
    public long getTid() {
      return tid_;
    }

    public static final int ENTRIES_FIELD_NUMBER = 2;
    private java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry> entries_;
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry> getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder>
        getEntriesOrBuilderList() {
      return entries_;
    }
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    @java.lang.Override
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(
        int index) {
      return entries_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (tid_ != 0L) {
        output.writeUInt64(1, tid_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(2, entries_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, tid_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, entries_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.StackHistoryBuffer)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.StackHistoryBuffer other = (com.android.server.os.TombstoneProtos.StackHistoryBuffer) obj;

      if (getTid()
          != other.getTid()) return false;
      if (!getEntriesList()
          .equals(other.getEntriesList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTid());
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.StackHistoryBuffer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code StackHistoryBuffer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StackHistoryBuffer)
        com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBuffer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBuffer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.StackHistoryBuffer.class, com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.StackHistoryBuffer.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tid_ = 0L;

        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
        } else {
          entries_ = null;
          entriesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_StackHistoryBuffer_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBuffer getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.StackHistoryBuffer.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBuffer build() {
        com.android.server.os.TombstoneProtos.StackHistoryBuffer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.StackHistoryBuffer buildPartial() {
        com.android.server.os.TombstoneProtos.StackHistoryBuffer result = new com.android.server.os.TombstoneProtos.StackHistoryBuffer(this);
        int from_bitField0_ = bitField0_;
        result.tid_ = tid_;
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.StackHistoryBuffer) {
          return mergeFrom((com.android.server.os.TombstoneProtos.StackHistoryBuffer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.StackHistoryBuffer other) {
        if (other == com.android.server.os.TombstoneProtos.StackHistoryBuffer.getDefaultInstance()) return this;
        if (other.getTid() != 0L) {
          setTid(other.getTid());
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntriesIsMutable();
              entries_.addAll(other.entries_);
            }
            onChanged();
          }
        } else {
          if (!other.entries_.isEmpty()) {
            if (entriesBuilder_.isEmpty()) {
              entriesBuilder_.dispose();
              entriesBuilder_ = null;
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntriesFieldBuilder() : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                tid_ = input.readUInt64();

                break;
              } // case 8
              case 18: {
                com.android.server.os.TombstoneProtos.StackHistoryBufferEntry m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.parser(),
                        extensionRegistry);
                if (entriesBuilder_ == null) {
                  ensureEntriesIsMutable();
                  entries_.add(m);
                } else {
                  entriesBuilder_.addMessage(m);
                }
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long tid_ ;
      /**
       * <code>uint64 tid = 1;</code>
       * @return The tid.
       */
      @java.lang.Override
      public long getTid() {
        return tid_;
      }
      /**
       * <code>uint64 tid = 1;</code>
       * @param value The tid to set.
       * @return This builder for chaining.
       */
      public Builder setTid(long value) {

        tid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 tid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTid() {

        tid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry> entries_ =
        java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entries_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry>(entries_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.StackHistoryBufferEntry, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder setEntries(
          int index, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.set(index, value);
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder setEntries(
          int index, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.set(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder addEntries(com.android.server.os.TombstoneProtos.StackHistoryBufferEntry value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder addEntries(
          int index, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(index, value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder addEntries(
          com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder addEntries(
          int index, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder addAllEntries(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.StackHistoryBufferEntry> values) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entries_);
          onChanged();
        } else {
          entriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public Builder removeEntries(int index) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.remove(index);
          onChanged();
        } else {
          entriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder getEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder getEntriesOrBuilder(
          int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);  } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder>
           getEntriesOrBuilderList() {
        if (entriesBuilder_ != null) {
          return entriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entries_);
        }
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder addEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .StackHistoryBufferEntry entries = 2;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder>
           getEntriesBuilderList() {
        return getEntriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.StackHistoryBufferEntry, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder>
          getEntriesFieldBuilder() {
        if (entriesBuilder_ == null) {
          entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.StackHistoryBufferEntry, com.android.server.os.TombstoneProtos.StackHistoryBufferEntry.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferEntryOrBuilder>(
                  entries_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entries_ = null;
        }
        return entriesBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:StackHistoryBuffer)
    }

    // @@protoc_insertion_point(class_scope:StackHistoryBuffer)
    private static final com.android.server.os.TombstoneProtos.StackHistoryBuffer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.StackHistoryBuffer();
    }

    public static com.android.server.os.TombstoneProtos.StackHistoryBuffer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StackHistoryBuffer>
        PARSER = new com.google.protobuf.AbstractParser<StackHistoryBuffer>() {
      @java.lang.Override
      public StackHistoryBuffer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<StackHistoryBuffer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StackHistoryBuffer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBuffer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TombstoneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Tombstone)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Architecture arch = 1;</code>
     * @return The enum numeric value on the wire for arch.
     */
    int getArchValue();
    /**
     * <code>.Architecture arch = 1;</code>
     * @return The arch.
     */
    com.android.server.os.TombstoneProtos.Architecture getArch();

    /**
     * <code>.Architecture guest_arch = 24;</code>
     * @return The enum numeric value on the wire for guestArch.
     */
    int getGuestArchValue();
    /**
     * <code>.Architecture guest_arch = 24;</code>
     * @return The guestArch.
     */
    com.android.server.os.TombstoneProtos.Architecture getGuestArch();

    /**
     * <code>string build_fingerprint = 2;</code>
     * @return The buildFingerprint.
     */
    java.lang.String getBuildFingerprint();
    /**
     * <code>string build_fingerprint = 2;</code>
     * @return The bytes for buildFingerprint.
     */
    com.google.protobuf.ByteString
        getBuildFingerprintBytes();

    /**
     * <code>string revision = 3;</code>
     * @return The revision.
     */
    java.lang.String getRevision();
    /**
     * <code>string revision = 3;</code>
     * @return The bytes for revision.
     */
    com.google.protobuf.ByteString
        getRevisionBytes();

    /**
     * <code>string timestamp = 4;</code>
     * @return The timestamp.
     */
    java.lang.String getTimestamp();
    /**
     * <code>string timestamp = 4;</code>
     * @return The bytes for timestamp.
     */
    com.google.protobuf.ByteString
        getTimestampBytes();

    /**
     * <code>uint32 pid = 5;</code>
     * @return The pid.
     */
    int getPid();

    /**
     * <code>uint32 tid = 6;</code>
     * @return The tid.
     */
    int getTid();

    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string selinux_label = 8;</code>
     * @return The selinuxLabel.
     */
    java.lang.String getSelinuxLabel();
    /**
     * <code>string selinux_label = 8;</code>
     * @return The bytes for selinuxLabel.
     */
    com.google.protobuf.ByteString
        getSelinuxLabelBytes();

    /**
     * <code>repeated string command_line = 9;</code>
     * @return A list containing the commandLine.
     */
    java.util.List<java.lang.String>
        getCommandLineList();
    /**
     * <code>repeated string command_line = 9;</code>
     * @return The count of commandLine.
     */
    int getCommandLineCount();
    /**
     * <code>repeated string command_line = 9;</code>
     * @param index The index of the element to return.
     * @return The commandLine at the given index.
     */
    java.lang.String getCommandLine(int index);
    /**
     * <code>repeated string command_line = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the commandLine at the given index.
     */
    com.google.protobuf.ByteString
        getCommandLineBytes(int index);

    /**
     * <pre>
     * Process uptime in seconds.
     * </pre>
     *
     * <code>uint32 process_uptime = 20;</code>
     * @return The processUptime.
     */
    int getProcessUptime();

    /**
     * <code>.Signal signal_info = 10;</code>
     * @return Whether the signalInfo field is set.
     */
    boolean hasSignalInfo();
    /**
     * <code>.Signal signal_info = 10;</code>
     * @return The signalInfo.
     */
    com.android.server.os.TombstoneProtos.Signal getSignalInfo();
    /**
     * <code>.Signal signal_info = 10;</code>
     */
    com.android.server.os.TombstoneProtos.SignalOrBuilder getSignalInfoOrBuilder();

    /**
     * <code>string abort_message = 14;</code>
     * @return The abortMessage.
     */
    java.lang.String getAbortMessage();
    /**
     * <code>string abort_message = 14;</code>
     * @return The bytes for abortMessage.
     */
    com.google.protobuf.ByteString
        getAbortMessageBytes();

    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.CrashDetail>
        getCrashDetailsList();
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    com.android.server.os.TombstoneProtos.CrashDetail getCrashDetails(int index);
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    int getCrashDetailsCount();
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.CrashDetailOrBuilder>
        getCrashDetailsOrBuilderList();
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    com.android.server.os.TombstoneProtos.CrashDetailOrBuilder getCrashDetailsOrBuilder(
        int index);

    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.Cause>
        getCausesList();
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    com.android.server.os.TombstoneProtos.Cause getCauses(int index);
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    int getCausesCount();
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.CauseOrBuilder>
        getCausesOrBuilderList();
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    com.android.server.os.TombstoneProtos.CauseOrBuilder getCausesOrBuilder(
        int index);

    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    int getThreadsCount();
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    boolean containsThreads(
        int key);
    /**
     * Use {@link #getThreadsMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    getThreads();
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    getThreadsMap();
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */

    com.android.server.os.TombstoneProtos.Thread getThreadsOrDefault(
        int key,
        com.android.server.os.TombstoneProtos.Thread defaultValue);
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */

    com.android.server.os.TombstoneProtos.Thread getThreadsOrThrow(
        int key);

    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    int getGuestThreadsCount();
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    boolean containsGuestThreads(
        int key);
    /**
     * Use {@link #getGuestThreadsMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    getGuestThreads();
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    getGuestThreadsMap();
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */

    com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrDefault(
        int key,
        com.android.server.os.TombstoneProtos.Thread defaultValue);
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */

    com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrThrow(
        int key);

    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping>
        getMemoryMappingsList();
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryMapping getMemoryMappings(int index);
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    int getMemoryMappingsCount();
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder>
        getMemoryMappingsOrBuilderList();
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder getMemoryMappingsOrBuilder(
        int index);

    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.LogBuffer>
        getLogBuffersList();
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    com.android.server.os.TombstoneProtos.LogBuffer getLogBuffers(int index);
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    int getLogBuffersCount();
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.LogBufferOrBuilder>
        getLogBuffersOrBuilderList();
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    com.android.server.os.TombstoneProtos.LogBufferOrBuilder getLogBuffersOrBuilder(
        int index);

    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.FD>
        getOpenFdsList();
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    com.android.server.os.TombstoneProtos.FD getOpenFds(int index);
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    int getOpenFdsCount();
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.FDOrBuilder>
        getOpenFdsOrBuilderList();
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    com.android.server.os.TombstoneProtos.FDOrBuilder getOpenFdsOrBuilder(
        int index);

    /**
     * <code>uint32 page_size = 22;</code>
     * @return The pageSize.
     */
    int getPageSize();

    /**
     * <code>bool has_been_16kb_mode = 23;</code>
     * @return The hasBeen16kbMode.
     */
    boolean getHasBeen16KbMode();

    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     * @return Whether the stackHistoryBuffer field is set.
     */
    boolean hasStackHistoryBuffer();
    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     * @return The stackHistoryBuffer.
     */
    com.android.server.os.TombstoneProtos.StackHistoryBuffer getStackHistoryBuffer();
    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     */
    com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder getStackHistoryBufferOrBuilder();
  }
  /**
   * Protobuf type {@code Tombstone}
   */
  public static final class Tombstone extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Tombstone)
      TombstoneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Tombstone.newBuilder() to construct.
    private Tombstone(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Tombstone() {
      arch_ = 0;
      guestArch_ = 0;
      buildFingerprint_ = "";
      revision_ = "";
      timestamp_ = "";
      selinuxLabel_ = "";
      commandLine_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      abortMessage_ = "";
      crashDetails_ = java.util.Collections.emptyList();
      causes_ = java.util.Collections.emptyList();
      memoryMappings_ = java.util.Collections.emptyList();
      logBuffers_ = java.util.Collections.emptyList();
      openFds_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Tombstone();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_Tombstone_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 16:
          return internalGetThreads();
        case 25:
          return internalGetGuestThreads();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_Tombstone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.Tombstone.class, com.android.server.os.TombstoneProtos.Tombstone.Builder.class);
    }

    public static final int ARCH_FIELD_NUMBER = 1;
    private int arch_;
    /**
     * <code>.Architecture arch = 1;</code>
     * @return The enum numeric value on the wire for arch.
     */
    @java.lang.Override public int getArchValue() {
      return arch_;
    }
    /**
     * <code>.Architecture arch = 1;</code>
     * @return The arch.
     */
    @java.lang.Override public com.android.server.os.TombstoneProtos.Architecture getArch() {
      @SuppressWarnings("deprecation")
      com.android.server.os.TombstoneProtos.Architecture result = com.android.server.os.TombstoneProtos.Architecture.valueOf(arch_);
      return result == null ? com.android.server.os.TombstoneProtos.Architecture.UNRECOGNIZED : result;
    }

    public static final int GUEST_ARCH_FIELD_NUMBER = 24;
    private int guestArch_;
    /**
     * <code>.Architecture guest_arch = 24;</code>
     * @return The enum numeric value on the wire for guestArch.
     */
    @java.lang.Override public int getGuestArchValue() {
      return guestArch_;
    }
    /**
     * <code>.Architecture guest_arch = 24;</code>
     * @return The guestArch.
     */
    @java.lang.Override public com.android.server.os.TombstoneProtos.Architecture getGuestArch() {
      @SuppressWarnings("deprecation")
      com.android.server.os.TombstoneProtos.Architecture result = com.android.server.os.TombstoneProtos.Architecture.valueOf(guestArch_);
      return result == null ? com.android.server.os.TombstoneProtos.Architecture.UNRECOGNIZED : result;
    }

    public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
    private volatile java.lang.Object buildFingerprint_;
    /**
     * <code>string build_fingerprint = 2;</code>
     * @return The buildFingerprint.
     */
    @java.lang.Override
    public java.lang.String getBuildFingerprint() {
      java.lang.Object ref = buildFingerprint_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildFingerprint_ = s;
        return s;
      }
    }
    /**
     * <code>string build_fingerprint = 2;</code>
     * @return The bytes for buildFingerprint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBuildFingerprintBytes() {
      java.lang.Object ref = buildFingerprint_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildFingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REVISION_FIELD_NUMBER = 3;
    private volatile java.lang.Object revision_;
    /**
     * <code>string revision = 3;</code>
     * @return The revision.
     */
    @java.lang.Override
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      }
    }
    /**
     * <code>string revision = 3;</code>
     * @return The bytes for revision.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private volatile java.lang.Object timestamp_;
    /**
     * <code>string timestamp = 4;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      }
    }
    /**
     * <code>string timestamp = 4;</code>
     * @return The bytes for timestamp.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PID_FIELD_NUMBER = 5;
    private int pid_;
    /**
     * <code>uint32 pid = 5;</code>
     * @return The pid.
     */
    @java.lang.Override
    public int getPid() {
      return pid_;
    }

    public static final int TID_FIELD_NUMBER = 6;
    private int tid_;
    /**
     * <code>uint32 tid = 6;</code>
     * @return The tid.
     */
    @java.lang.Override
    public int getTid() {
      return tid_;
    }

    public static final int UID_FIELD_NUMBER = 7;
    private int uid_;
    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
    private volatile java.lang.Object selinuxLabel_;
    /**
     * <code>string selinux_label = 8;</code>
     * @return The selinuxLabel.
     */
    @java.lang.Override
    public java.lang.String getSelinuxLabel() {
      java.lang.Object ref = selinuxLabel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selinuxLabel_ = s;
        return s;
      }
    }
    /**
     * <code>string selinux_label = 8;</code>
     * @return The bytes for selinuxLabel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSelinuxLabelBytes() {
      java.lang.Object ref = selinuxLabel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selinuxLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMMAND_LINE_FIELD_NUMBER = 9;
    private com.google.protobuf.LazyStringList commandLine_;
    /**
     * <code>repeated string command_line = 9;</code>
     * @return A list containing the commandLine.
     */
    public com.google.protobuf.ProtocolStringList
        getCommandLineList() {
      return commandLine_;
    }
    /**
     * <code>repeated string command_line = 9;</code>
     * @return The count of commandLine.
     */
    public int getCommandLineCount() {
      return commandLine_.size();
    }
    /**
     * <code>repeated string command_line = 9;</code>
     * @param index The index of the element to return.
     * @return The commandLine at the given index.
     */
    public java.lang.String getCommandLine(int index) {
      return commandLine_.get(index);
    }
    /**
     * <code>repeated string command_line = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the commandLine at the given index.
     */
    public com.google.protobuf.ByteString
        getCommandLineBytes(int index) {
      return commandLine_.getByteString(index);
    }

    public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
    private int processUptime_;
    /**
     * <pre>
     * Process uptime in seconds.
     * </pre>
     *
     * <code>uint32 process_uptime = 20;</code>
     * @return The processUptime.
     */
    @java.lang.Override
    public int getProcessUptime() {
      return processUptime_;
    }

    public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
    private com.android.server.os.TombstoneProtos.Signal signalInfo_;
    /**
     * <code>.Signal signal_info = 10;</code>
     * @return Whether the signalInfo field is set.
     */
    @java.lang.Override
    public boolean hasSignalInfo() {
      return signalInfo_ != null;
    }
    /**
     * <code>.Signal signal_info = 10;</code>
     * @return The signalInfo.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Signal getSignalInfo() {
      return signalInfo_ == null ? com.android.server.os.TombstoneProtos.Signal.getDefaultInstance() : signalInfo_;
    }
    /**
     * <code>.Signal signal_info = 10;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.SignalOrBuilder getSignalInfoOrBuilder() {
      return getSignalInfo();
    }

    public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
    private volatile java.lang.Object abortMessage_;
    /**
     * <code>string abort_message = 14;</code>
     * @return The abortMessage.
     */
    @java.lang.Override
    public java.lang.String getAbortMessage() {
      java.lang.Object ref = abortMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        abortMessage_ = s;
        return s;
      }
    }
    /**
     * <code>string abort_message = 14;</code>
     * @return The bytes for abortMessage.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAbortMessageBytes() {
      java.lang.Object ref = abortMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        abortMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CRASH_DETAILS_FIELD_NUMBER = 21;
    private java.util.List<com.android.server.os.TombstoneProtos.CrashDetail> crashDetails_;
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.CrashDetail> getCrashDetailsList() {
      return crashDetails_;
    }
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.CrashDetailOrBuilder>
        getCrashDetailsOrBuilderList() {
      return crashDetails_;
    }
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    @java.lang.Override
    public int getCrashDetailsCount() {
      return crashDetails_.size();
    }
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.CrashDetail getCrashDetails(int index) {
      return crashDetails_.get(index);
    }
    /**
     * <code>repeated .CrashDetail crash_details = 21;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.CrashDetailOrBuilder getCrashDetailsOrBuilder(
        int index) {
      return crashDetails_.get(index);
    }

    public static final int CAUSES_FIELD_NUMBER = 15;
    private java.util.List<com.android.server.os.TombstoneProtos.Cause> causes_;
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.Cause> getCausesList() {
      return causes_;
    }
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.CauseOrBuilder>
        getCausesOrBuilderList() {
      return causes_;
    }
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    @java.lang.Override
    public int getCausesCount() {
      return causes_.size();
    }
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Cause getCauses(int index) {
      return causes_.get(index);
    }
    /**
     * <code>repeated .Cause causes = 15;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.CauseOrBuilder getCausesOrBuilder(
        int index) {
      return causes_.get(index);
    }

    public static final int THREADS_FIELD_NUMBER = 16;
    private static final class ThreadsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>newDefaultInstance(
                  com.android.server.os.TombstoneProtos.internal_static_Tombstone_ThreadsEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  com.android.server.os.TombstoneProtos.Thread.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> threads_;
    private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    internalGetThreads() {
      if (threads_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ThreadsDefaultEntryHolder.defaultEntry);
      }
      return threads_;
    }

    public int getThreadsCount() {
      return internalGetThreads().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */

    @java.lang.Override
    public boolean containsThreads(
        int key) {

      return internalGetThreads().getMap().containsKey(key);
    }
    /**
     * Use {@link #getThreadsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getThreads() {
      return getThreadsMap();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getThreadsMap() {
      return internalGetThreads().getMap();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    @java.lang.Override

    public com.android.server.os.TombstoneProtos.Thread getThreadsOrDefault(
        int key,
        com.android.server.os.TombstoneProtos.Thread defaultValue) {

      java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
          internalGetThreads().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
     */
    @java.lang.Override

    public com.android.server.os.TombstoneProtos.Thread getThreadsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
          internalGetThreads().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int GUEST_THREADS_FIELD_NUMBER = 25;
    private static final class GuestThreadsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>newDefaultInstance(
                  com.android.server.os.TombstoneProtos.internal_static_Tombstone_GuestThreadsEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  com.android.server.os.TombstoneProtos.Thread.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> guestThreads_;
    private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
    internalGetGuestThreads() {
      if (guestThreads_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GuestThreadsDefaultEntryHolder.defaultEntry);
      }
      return guestThreads_;
    }

    public int getGuestThreadsCount() {
      return internalGetGuestThreads().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */

    @java.lang.Override
    public boolean containsGuestThreads(
        int key) {

      return internalGetGuestThreads().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGuestThreadsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getGuestThreads() {
      return getGuestThreadsMap();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getGuestThreadsMap() {
      return internalGetGuestThreads().getMap();
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    @java.lang.Override

    public com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrDefault(
        int key,
        com.android.server.os.TombstoneProtos.Thread defaultValue) {

      java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
          internalGetGuestThreads().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
     */
    @java.lang.Override

    public com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
          internalGetGuestThreads().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
    private java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping> memoryMappings_;
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping> getMemoryMappingsList() {
      return memoryMappings_;
    }
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder>
        getMemoryMappingsOrBuilderList() {
      return memoryMappings_;
    }
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    @java.lang.Override
    public int getMemoryMappingsCount() {
      return memoryMappings_.size();
    }
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryMapping getMemoryMappings(int index) {
      return memoryMappings_.get(index);
    }
    /**
     * <code>repeated .MemoryMapping memory_mappings = 17;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder getMemoryMappingsOrBuilder(
        int index) {
      return memoryMappings_.get(index);
    }

    public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
    private java.util.List<com.android.server.os.TombstoneProtos.LogBuffer> logBuffers_;
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.LogBuffer> getLogBuffersList() {
      return logBuffers_;
    }
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.LogBufferOrBuilder>
        getLogBuffersOrBuilderList() {
      return logBuffers_;
    }
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    @java.lang.Override
    public int getLogBuffersCount() {
      return logBuffers_.size();
    }
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogBuffer getLogBuffers(int index) {
      return logBuffers_.get(index);
    }
    /**
     * <code>repeated .LogBuffer log_buffers = 18;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogBufferOrBuilder getLogBuffersOrBuilder(
        int index) {
      return logBuffers_.get(index);
    }

    public static final int OPEN_FDS_FIELD_NUMBER = 19;
    private java.util.List<com.android.server.os.TombstoneProtos.FD> openFds_;
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.FD> getOpenFdsList() {
      return openFds_;
    }
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.FDOrBuilder>
        getOpenFdsOrBuilderList() {
      return openFds_;
    }
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    @java.lang.Override
    public int getOpenFdsCount() {
      return openFds_.size();
    }
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.FD getOpenFds(int index) {
      return openFds_.get(index);
    }
    /**
     * <code>repeated .FD open_fds = 19;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.FDOrBuilder getOpenFdsOrBuilder(
        int index) {
      return openFds_.get(index);
    }

    public static final int PAGE_SIZE_FIELD_NUMBER = 22;
    private int pageSize_;
    /**
     * <code>uint32 page_size = 22;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }

    public static final int HAS_BEEN_16KB_MODE_FIELD_NUMBER = 23;
    private boolean hasBeen16KbMode_;
    /**
     * <code>bool has_been_16kb_mode = 23;</code>
     * @return The hasBeen16kbMode.
     */
    @java.lang.Override
    public boolean getHasBeen16KbMode() {
      return hasBeen16KbMode_;
    }

    public static final int STACK_HISTORY_BUFFER_FIELD_NUMBER = 26;
    private com.android.server.os.TombstoneProtos.StackHistoryBuffer stackHistoryBuffer_;
    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     * @return Whether the stackHistoryBuffer field is set.
     */
    @java.lang.Override
    public boolean hasStackHistoryBuffer() {
      return stackHistoryBuffer_ != null;
    }
    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     * @return The stackHistoryBuffer.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBuffer getStackHistoryBuffer() {
      return stackHistoryBuffer_ == null ? com.android.server.os.TombstoneProtos.StackHistoryBuffer.getDefaultInstance() : stackHistoryBuffer_;
    }
    /**
     * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder getStackHistoryBufferOrBuilder() {
      return getStackHistoryBuffer();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (arch_ != com.android.server.os.TombstoneProtos.Architecture.ARM32.getNumber()) {
        output.writeEnum(1, arch_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildFingerprint_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, buildFingerprint_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, timestamp_);
      }
      if (pid_ != 0) {
        output.writeUInt32(5, pid_);
      }
      if (tid_ != 0) {
        output.writeUInt32(6, tid_);
      }
      if (uid_ != 0) {
        output.writeUInt32(7, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selinuxLabel_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, selinuxLabel_);
      }
      for (int i = 0; i < commandLine_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, commandLine_.getRaw(i));
      }
      if (signalInfo_ != null) {
        output.writeMessage(10, getSignalInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(abortMessage_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, abortMessage_);
      }
      for (int i = 0; i < causes_.size(); i++) {
        output.writeMessage(15, causes_.get(i));
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetThreads(),
          ThreadsDefaultEntryHolder.defaultEntry,
          16);
      for (int i = 0; i < memoryMappings_.size(); i++) {
        output.writeMessage(17, memoryMappings_.get(i));
      }
      for (int i = 0; i < logBuffers_.size(); i++) {
        output.writeMessage(18, logBuffers_.get(i));
      }
      for (int i = 0; i < openFds_.size(); i++) {
        output.writeMessage(19, openFds_.get(i));
      }
      if (processUptime_ != 0) {
        output.writeUInt32(20, processUptime_);
      }
      for (int i = 0; i < crashDetails_.size(); i++) {
        output.writeMessage(21, crashDetails_.get(i));
      }
      if (pageSize_ != 0) {
        output.writeUInt32(22, pageSize_);
      }
      if (hasBeen16KbMode_ != false) {
        output.writeBool(23, hasBeen16KbMode_);
      }
      if (guestArch_ != com.android.server.os.TombstoneProtos.Architecture.ARM32.getNumber()) {
        output.writeEnum(24, guestArch_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGuestThreads(),
          GuestThreadsDefaultEntryHolder.defaultEntry,
          25);
      if (stackHistoryBuffer_ != null) {
        output.writeMessage(26, getStackHistoryBuffer());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (arch_ != com.android.server.os.TombstoneProtos.Architecture.ARM32.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, arch_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildFingerprint_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, buildFingerprint_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, timestamp_);
      }
      if (pid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pid_);
      }
      if (tid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, tid_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selinuxLabel_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, selinuxLabel_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < commandLine_.size(); i++) {
          dataSize += computeStringSizeNoTag(commandLine_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getCommandLineList().size();
      }
      if (signalInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getSignalInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(abortMessage_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, abortMessage_);
      }
      for (int i = 0; i < causes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, causes_.get(i));
      }
      for (java.util.Map.Entry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> entry
           : internalGetThreads().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
        threads__ = ThreadsDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(16, threads__);
      }
      for (int i = 0; i < memoryMappings_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(17, memoryMappings_.get(i));
      }
      for (int i = 0; i < logBuffers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(18, logBuffers_.get(i));
      }
      for (int i = 0; i < openFds_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(19, openFds_.get(i));
      }
      if (processUptime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(20, processUptime_);
      }
      for (int i = 0; i < crashDetails_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(21, crashDetails_.get(i));
      }
      if (pageSize_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(22, pageSize_);
      }
      if (hasBeen16KbMode_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(23, hasBeen16KbMode_);
      }
      if (guestArch_ != com.android.server.os.TombstoneProtos.Architecture.ARM32.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(24, guestArch_);
      }
      for (java.util.Map.Entry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> entry
           : internalGetGuestThreads().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
        guestThreads__ = GuestThreadsDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(25, guestThreads__);
      }
      if (stackHistoryBuffer_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(26, getStackHistoryBuffer());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.Tombstone)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.Tombstone other = (com.android.server.os.TombstoneProtos.Tombstone) obj;

      if (arch_ != other.arch_) return false;
      if (guestArch_ != other.guestArch_) return false;
      if (!getBuildFingerprint()
          .equals(other.getBuildFingerprint())) return false;
      if (!getRevision()
          .equals(other.getRevision())) return false;
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
      if (getPid()
          != other.getPid()) return false;
      if (getTid()
          != other.getTid()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!getSelinuxLabel()
          .equals(other.getSelinuxLabel())) return false;
      if (!getCommandLineList()
          .equals(other.getCommandLineList())) return false;
      if (getProcessUptime()
          != other.getProcessUptime()) return false;
      if (hasSignalInfo() != other.hasSignalInfo()) return false;
      if (hasSignalInfo()) {
        if (!getSignalInfo()
            .equals(other.getSignalInfo())) return false;
      }
      if (!getAbortMessage()
          .equals(other.getAbortMessage())) return false;
      if (!getCrashDetailsList()
          .equals(other.getCrashDetailsList())) return false;
      if (!getCausesList()
          .equals(other.getCausesList())) return false;
      if (!internalGetThreads().equals(
          other.internalGetThreads())) return false;
      if (!internalGetGuestThreads().equals(
          other.internalGetGuestThreads())) return false;
      if (!getMemoryMappingsList()
          .equals(other.getMemoryMappingsList())) return false;
      if (!getLogBuffersList()
          .equals(other.getLogBuffersList())) return false;
      if (!getOpenFdsList()
          .equals(other.getOpenFdsList())) return false;
      if (getPageSize()
          != other.getPageSize()) return false;
      if (getHasBeen16KbMode()
          != other.getHasBeen16KbMode()) return false;
      if (hasStackHistoryBuffer() != other.hasStackHistoryBuffer()) return false;
      if (hasStackHistoryBuffer()) {
        if (!getStackHistoryBuffer()
            .equals(other.getStackHistoryBuffer())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ARCH_FIELD_NUMBER;
      hash = (53 * hash) + arch_;
      hash = (37 * hash) + GUEST_ARCH_FIELD_NUMBER;
      hash = (53 * hash) + guestArch_;
      hash = (37 * hash) + BUILD_FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getBuildFingerprint().hashCode();
      hash = (37 * hash) + REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getRevision().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
      hash = (37 * hash) + PID_FIELD_NUMBER;
      hash = (53 * hash) + getPid();
      hash = (37 * hash) + TID_FIELD_NUMBER;
      hash = (53 * hash) + getTid();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SELINUX_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getSelinuxLabel().hashCode();
      if (getCommandLineCount() > 0) {
        hash = (37 * hash) + COMMAND_LINE_FIELD_NUMBER;
        hash = (53 * hash) + getCommandLineList().hashCode();
      }
      hash = (37 * hash) + PROCESS_UPTIME_FIELD_NUMBER;
      hash = (53 * hash) + getProcessUptime();
      if (hasSignalInfo()) {
        hash = (37 * hash) + SIGNAL_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSignalInfo().hashCode();
      }
      hash = (37 * hash) + ABORT_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getAbortMessage().hashCode();
      if (getCrashDetailsCount() > 0) {
        hash = (37 * hash) + CRASH_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getCrashDetailsList().hashCode();
      }
      if (getCausesCount() > 0) {
        hash = (37 * hash) + CAUSES_FIELD_NUMBER;
        hash = (53 * hash) + getCausesList().hashCode();
      }
      if (!internalGetThreads().getMap().isEmpty()) {
        hash = (37 * hash) + THREADS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetThreads().hashCode();
      }
      if (!internalGetGuestThreads().getMap().isEmpty()) {
        hash = (37 * hash) + GUEST_THREADS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGuestThreads().hashCode();
      }
      if (getMemoryMappingsCount() > 0) {
        hash = (37 * hash) + MEMORY_MAPPINGS_FIELD_NUMBER;
        hash = (53 * hash) + getMemoryMappingsList().hashCode();
      }
      if (getLogBuffersCount() > 0) {
        hash = (37 * hash) + LOG_BUFFERS_FIELD_NUMBER;
        hash = (53 * hash) + getLogBuffersList().hashCode();
      }
      if (getOpenFdsCount() > 0) {
        hash = (37 * hash) + OPEN_FDS_FIELD_NUMBER;
        hash = (53 * hash) + getOpenFdsList().hashCode();
      }
      hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPageSize();
      hash = (37 * hash) + HAS_BEEN_16KB_MODE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasBeen16KbMode());
      if (hasStackHistoryBuffer()) {
        hash = (37 * hash) + STACK_HISTORY_BUFFER_FIELD_NUMBER;
        hash = (53 * hash) + getStackHistoryBuffer().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Tombstone parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.Tombstone prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Tombstone}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Tombstone)
        com.android.server.os.TombstoneProtos.TombstoneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_Tombstone_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 16:
            return internalGetThreads();
          case 25:
            return internalGetGuestThreads();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 16:
            return internalGetMutableThreads();
          case 25:
            return internalGetMutableGuestThreads();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_Tombstone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.Tombstone.class, com.android.server.os.TombstoneProtos.Tombstone.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.Tombstone.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        arch_ = 0;

        guestArch_ = 0;

        buildFingerprint_ = "";

        revision_ = "";

        timestamp_ = "";

        pid_ = 0;

        tid_ = 0;

        uid_ = 0;

        selinuxLabel_ = "";

        commandLine_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        processUptime_ = 0;

        if (signalInfoBuilder_ == null) {
          signalInfo_ = null;
        } else {
          signalInfo_ = null;
          signalInfoBuilder_ = null;
        }
        abortMessage_ = "";

        if (crashDetailsBuilder_ == null) {
          crashDetails_ = java.util.Collections.emptyList();
        } else {
          crashDetails_ = null;
          crashDetailsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (causesBuilder_ == null) {
          causes_ = java.util.Collections.emptyList();
        } else {
          causes_ = null;
          causesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        internalGetMutableThreads().clear();
        internalGetMutableGuestThreads().clear();
        if (memoryMappingsBuilder_ == null) {
          memoryMappings_ = java.util.Collections.emptyList();
        } else {
          memoryMappings_ = null;
          memoryMappingsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (logBuffersBuilder_ == null) {
          logBuffers_ = java.util.Collections.emptyList();
        } else {
          logBuffers_ = null;
          logBuffersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        if (openFdsBuilder_ == null) {
          openFds_ = java.util.Collections.emptyList();
        } else {
          openFds_ = null;
          openFdsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        pageSize_ = 0;

        hasBeen16KbMode_ = false;

        if (stackHistoryBufferBuilder_ == null) {
          stackHistoryBuffer_ = null;
        } else {
          stackHistoryBuffer_ = null;
          stackHistoryBufferBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_Tombstone_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Tombstone getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.Tombstone.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Tombstone build() {
        com.android.server.os.TombstoneProtos.Tombstone result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Tombstone buildPartial() {
        com.android.server.os.TombstoneProtos.Tombstone result = new com.android.server.os.TombstoneProtos.Tombstone(this);
        int from_bitField0_ = bitField0_;
        result.arch_ = arch_;
        result.guestArch_ = guestArch_;
        result.buildFingerprint_ = buildFingerprint_;
        result.revision_ = revision_;
        result.timestamp_ = timestamp_;
        result.pid_ = pid_;
        result.tid_ = tid_;
        result.uid_ = uid_;
        result.selinuxLabel_ = selinuxLabel_;
        if (((bitField0_ & 0x00000001) != 0)) {
          commandLine_ = commandLine_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.commandLine_ = commandLine_;
        result.processUptime_ = processUptime_;
        if (signalInfoBuilder_ == null) {
          result.signalInfo_ = signalInfo_;
        } else {
          result.signalInfo_ = signalInfoBuilder_.build();
        }
        result.abortMessage_ = abortMessage_;
        if (crashDetailsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            crashDetails_ = java.util.Collections.unmodifiableList(crashDetails_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.crashDetails_ = crashDetails_;
        } else {
          result.crashDetails_ = crashDetailsBuilder_.build();
        }
        if (causesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            causes_ = java.util.Collections.unmodifiableList(causes_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.causes_ = causes_;
        } else {
          result.causes_ = causesBuilder_.build();
        }
        result.threads_ = internalGetThreads();
        result.threads_.makeImmutable();
        result.guestThreads_ = internalGetGuestThreads();
        result.guestThreads_.makeImmutable();
        if (memoryMappingsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            memoryMappings_ = java.util.Collections.unmodifiableList(memoryMappings_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.memoryMappings_ = memoryMappings_;
        } else {
          result.memoryMappings_ = memoryMappingsBuilder_.build();
        }
        if (logBuffersBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0)) {
            logBuffers_ = java.util.Collections.unmodifiableList(logBuffers_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.logBuffers_ = logBuffers_;
        } else {
          result.logBuffers_ = logBuffersBuilder_.build();
        }
        if (openFdsBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0)) {
            openFds_ = java.util.Collections.unmodifiableList(openFds_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.openFds_ = openFds_;
        } else {
          result.openFds_ = openFdsBuilder_.build();
        }
        result.pageSize_ = pageSize_;
        result.hasBeen16KbMode_ = hasBeen16KbMode_;
        if (stackHistoryBufferBuilder_ == null) {
          result.stackHistoryBuffer_ = stackHistoryBuffer_;
        } else {
          result.stackHistoryBuffer_ = stackHistoryBufferBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.Tombstone) {
          return mergeFrom((com.android.server.os.TombstoneProtos.Tombstone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.Tombstone other) {
        if (other == com.android.server.os.TombstoneProtos.Tombstone.getDefaultInstance()) return this;
        if (other.arch_ != 0) {
          setArchValue(other.getArchValue());
        }
        if (other.guestArch_ != 0) {
          setGuestArchValue(other.getGuestArchValue());
        }
        if (!other.getBuildFingerprint().isEmpty()) {
          buildFingerprint_ = other.buildFingerprint_;
          onChanged();
        }
        if (!other.getRevision().isEmpty()) {
          revision_ = other.revision_;
          onChanged();
        }
        if (!other.getTimestamp().isEmpty()) {
          timestamp_ = other.timestamp_;
          onChanged();
        }
        if (other.getPid() != 0) {
          setPid(other.getPid());
        }
        if (other.getTid() != 0) {
          setTid(other.getTid());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getSelinuxLabel().isEmpty()) {
          selinuxLabel_ = other.selinuxLabel_;
          onChanged();
        }
        if (!other.commandLine_.isEmpty()) {
          if (commandLine_.isEmpty()) {
            commandLine_ = other.commandLine_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommandLineIsMutable();
            commandLine_.addAll(other.commandLine_);
          }
          onChanged();
        }
        if (other.getProcessUptime() != 0) {
          setProcessUptime(other.getProcessUptime());
        }
        if (other.hasSignalInfo()) {
          mergeSignalInfo(other.getSignalInfo());
        }
        if (!other.getAbortMessage().isEmpty()) {
          abortMessage_ = other.abortMessage_;
          onChanged();
        }
        if (crashDetailsBuilder_ == null) {
          if (!other.crashDetails_.isEmpty()) {
            if (crashDetails_.isEmpty()) {
              crashDetails_ = other.crashDetails_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureCrashDetailsIsMutable();
              crashDetails_.addAll(other.crashDetails_);
            }
            onChanged();
          }
        } else {
          if (!other.crashDetails_.isEmpty()) {
            if (crashDetailsBuilder_.isEmpty()) {
              crashDetailsBuilder_.dispose();
              crashDetailsBuilder_ = null;
              crashDetails_ = other.crashDetails_;
              bitField0_ = (bitField0_ & ~0x00000002);
              crashDetailsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCrashDetailsFieldBuilder() : null;
            } else {
              crashDetailsBuilder_.addAllMessages(other.crashDetails_);
            }
          }
        }
        if (causesBuilder_ == null) {
          if (!other.causes_.isEmpty()) {
            if (causes_.isEmpty()) {
              causes_ = other.causes_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureCausesIsMutable();
              causes_.addAll(other.causes_);
            }
            onChanged();
          }
        } else {
          if (!other.causes_.isEmpty()) {
            if (causesBuilder_.isEmpty()) {
              causesBuilder_.dispose();
              causesBuilder_ = null;
              causes_ = other.causes_;
              bitField0_ = (bitField0_ & ~0x00000004);
              causesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCausesFieldBuilder() : null;
            } else {
              causesBuilder_.addAllMessages(other.causes_);
            }
          }
        }
        internalGetMutableThreads().mergeFrom(
            other.internalGetThreads());
        internalGetMutableGuestThreads().mergeFrom(
            other.internalGetGuestThreads());
        if (memoryMappingsBuilder_ == null) {
          if (!other.memoryMappings_.isEmpty()) {
            if (memoryMappings_.isEmpty()) {
              memoryMappings_ = other.memoryMappings_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureMemoryMappingsIsMutable();
              memoryMappings_.addAll(other.memoryMappings_);
            }
            onChanged();
          }
        } else {
          if (!other.memoryMappings_.isEmpty()) {
            if (memoryMappingsBuilder_.isEmpty()) {
              memoryMappingsBuilder_.dispose();
              memoryMappingsBuilder_ = null;
              memoryMappings_ = other.memoryMappings_;
              bitField0_ = (bitField0_ & ~0x00000020);
              memoryMappingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMemoryMappingsFieldBuilder() : null;
            } else {
              memoryMappingsBuilder_.addAllMessages(other.memoryMappings_);
            }
          }
        }
        if (logBuffersBuilder_ == null) {
          if (!other.logBuffers_.isEmpty()) {
            if (logBuffers_.isEmpty()) {
              logBuffers_ = other.logBuffers_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureLogBuffersIsMutable();
              logBuffers_.addAll(other.logBuffers_);
            }
            onChanged();
          }
        } else {
          if (!other.logBuffers_.isEmpty()) {
            if (logBuffersBuilder_.isEmpty()) {
              logBuffersBuilder_.dispose();
              logBuffersBuilder_ = null;
              logBuffers_ = other.logBuffers_;
              bitField0_ = (bitField0_ & ~0x00000040);
              logBuffersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLogBuffersFieldBuilder() : null;
            } else {
              logBuffersBuilder_.addAllMessages(other.logBuffers_);
            }
          }
        }
        if (openFdsBuilder_ == null) {
          if (!other.openFds_.isEmpty()) {
            if (openFds_.isEmpty()) {
              openFds_ = other.openFds_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureOpenFdsIsMutable();
              openFds_.addAll(other.openFds_);
            }
            onChanged();
          }
        } else {
          if (!other.openFds_.isEmpty()) {
            if (openFdsBuilder_.isEmpty()) {
              openFdsBuilder_.dispose();
              openFdsBuilder_ = null;
              openFds_ = other.openFds_;
              bitField0_ = (bitField0_ & ~0x00000080);
              openFdsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOpenFdsFieldBuilder() : null;
            } else {
              openFdsBuilder_.addAllMessages(other.openFds_);
            }
          }
        }
        if (other.getPageSize() != 0) {
          setPageSize(other.getPageSize());
        }
        if (other.getHasBeen16KbMode() != false) {
          setHasBeen16KbMode(other.getHasBeen16KbMode());
        }
        if (other.hasStackHistoryBuffer()) {
          mergeStackHistoryBuffer(other.getStackHistoryBuffer());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                arch_ = input.readEnum();

                break;
              } // case 8
              case 18: {
                buildFingerprint_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 26: {
                revision_ = input.readStringRequireUtf8();

                break;
              } // case 26
              case 34: {
                timestamp_ = input.readStringRequireUtf8();

                break;
              } // case 34
              case 40: {
                pid_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                tid_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                uid_ = input.readUInt32();

                break;
              } // case 56
              case 66: {
                selinuxLabel_ = input.readStringRequireUtf8();

                break;
              } // case 66
              case 74: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureCommandLineIsMutable();
                commandLine_.add(s);
                break;
              } // case 74
              case 82: {
                input.readMessage(
                    getSignalInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
              case 114: {
                abortMessage_ = input.readStringRequireUtf8();

                break;
              } // case 114
              case 122: {
                com.android.server.os.TombstoneProtos.Cause m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.Cause.parser(),
                        extensionRegistry);
                if (causesBuilder_ == null) {
                  ensureCausesIsMutable();
                  causes_.add(m);
                } else {
                  causesBuilder_.addMessage(m);
                }
                break;
              } // case 122
              case 130: {
                com.google.protobuf.MapEntry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
                threads__ = input.readMessage(
                    ThreadsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableThreads().getMutableMap().put(
                    threads__.getKey(), threads__.getValue());
                break;
              } // case 130
              case 138: {
                com.android.server.os.TombstoneProtos.MemoryMapping m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.MemoryMapping.parser(),
                        extensionRegistry);
                if (memoryMappingsBuilder_ == null) {
                  ensureMemoryMappingsIsMutable();
                  memoryMappings_.add(m);
                } else {
                  memoryMappingsBuilder_.addMessage(m);
                }
                break;
              } // case 138
              case 146: {
                com.android.server.os.TombstoneProtos.LogBuffer m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.LogBuffer.parser(),
                        extensionRegistry);
                if (logBuffersBuilder_ == null) {
                  ensureLogBuffersIsMutable();
                  logBuffers_.add(m);
                } else {
                  logBuffersBuilder_.addMessage(m);
                }
                break;
              } // case 146
              case 154: {
                com.android.server.os.TombstoneProtos.FD m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.FD.parser(),
                        extensionRegistry);
                if (openFdsBuilder_ == null) {
                  ensureOpenFdsIsMutable();
                  openFds_.add(m);
                } else {
                  openFdsBuilder_.addMessage(m);
                }
                break;
              } // case 154
              case 160: {
                processUptime_ = input.readUInt32();

                break;
              } // case 160
              case 170: {
                com.android.server.os.TombstoneProtos.CrashDetail m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.CrashDetail.parser(),
                        extensionRegistry);
                if (crashDetailsBuilder_ == null) {
                  ensureCrashDetailsIsMutable();
                  crashDetails_.add(m);
                } else {
                  crashDetailsBuilder_.addMessage(m);
                }
                break;
              } // case 170
              case 176: {
                pageSize_ = input.readUInt32();

                break;
              } // case 176
              case 184: {
                hasBeen16KbMode_ = input.readBool();

                break;
              } // case 184
              case 192: {
                guestArch_ = input.readEnum();

                break;
              } // case 192
              case 202: {
                com.google.protobuf.MapEntry<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
                guestThreads__ = input.readMessage(
                    GuestThreadsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableGuestThreads().getMutableMap().put(
                    guestThreads__.getKey(), guestThreads__.getValue());
                break;
              } // case 202
              case 210: {
                input.readMessage(
                    getStackHistoryBufferFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 210
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int arch_ = 0;
      /**
       * <code>.Architecture arch = 1;</code>
       * @return The enum numeric value on the wire for arch.
       */
      @java.lang.Override public int getArchValue() {
        return arch_;
      }
      /**
       * <code>.Architecture arch = 1;</code>
       * @param value The enum numeric value on the wire for arch to set.
       * @return This builder for chaining.
       */
      public Builder setArchValue(int value) {

        arch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Architecture arch = 1;</code>
       * @return The arch.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Architecture getArch() {
        @SuppressWarnings("deprecation")
        com.android.server.os.TombstoneProtos.Architecture result = com.android.server.os.TombstoneProtos.Architecture.valueOf(arch_);
        return result == null ? com.android.server.os.TombstoneProtos.Architecture.UNRECOGNIZED : result;
      }
      /**
       * <code>.Architecture arch = 1;</code>
       * @param value The arch to set.
       * @return This builder for chaining.
       */
      public Builder setArch(com.android.server.os.TombstoneProtos.Architecture value) {
        if (value == null) {
          throw new NullPointerException();
        }

        arch_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Architecture arch = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArch() {

        arch_ = 0;
        onChanged();
        return this;
      }

      private int guestArch_ = 0;
      /**
       * <code>.Architecture guest_arch = 24;</code>
       * @return The enum numeric value on the wire for guestArch.
       */
      @java.lang.Override public int getGuestArchValue() {
        return guestArch_;
      }
      /**
       * <code>.Architecture guest_arch = 24;</code>
       * @param value The enum numeric value on the wire for guestArch to set.
       * @return This builder for chaining.
       */
      public Builder setGuestArchValue(int value) {

        guestArch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Architecture guest_arch = 24;</code>
       * @return The guestArch.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Architecture getGuestArch() {
        @SuppressWarnings("deprecation")
        com.android.server.os.TombstoneProtos.Architecture result = com.android.server.os.TombstoneProtos.Architecture.valueOf(guestArch_);
        return result == null ? com.android.server.os.TombstoneProtos.Architecture.UNRECOGNIZED : result;
      }
      /**
       * <code>.Architecture guest_arch = 24;</code>
       * @param value The guestArch to set.
       * @return This builder for chaining.
       */
      public Builder setGuestArch(com.android.server.os.TombstoneProtos.Architecture value) {
        if (value == null) {
          throw new NullPointerException();
        }

        guestArch_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Architecture guest_arch = 24;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuestArch() {

        guestArch_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object buildFingerprint_ = "";
      /**
       * <code>string build_fingerprint = 2;</code>
       * @return The buildFingerprint.
       */
      public java.lang.String getBuildFingerprint() {
        java.lang.Object ref = buildFingerprint_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildFingerprint_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string build_fingerprint = 2;</code>
       * @return The bytes for buildFingerprint.
       */
      public com.google.protobuf.ByteString
          getBuildFingerprintBytes() {
        java.lang.Object ref = buildFingerprint_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildFingerprint_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string build_fingerprint = 2;</code>
       * @param value The buildFingerprint to set.
       * @return This builder for chaining.
       */
      public Builder setBuildFingerprint(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        buildFingerprint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string build_fingerprint = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildFingerprint() {

        buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        onChanged();
        return this;
      }
      /**
       * <code>string build_fingerprint = 2;</code>
       * @param value The bytes for buildFingerprint to set.
       * @return This builder for chaining.
       */
      public Builder setBuildFingerprintBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        buildFingerprint_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object revision_ = "";
      /**
       * <code>string revision = 3;</code>
       * @return The revision.
       */
      public java.lang.String getRevision() {
        java.lang.Object ref = revision_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          revision_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string revision = 3;</code>
       * @return The bytes for revision.
       */
      public com.google.protobuf.ByteString
          getRevisionBytes() {
        java.lang.Object ref = revision_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          revision_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string revision = 3;</code>
       * @param value The revision to set.
       * @return This builder for chaining.
       */
      public Builder setRevision(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        revision_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string revision = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRevision() {

        revision_ = getDefaultInstance().getRevision();
        onChanged();
        return this;
      }
      /**
       * <code>string revision = 3;</code>
       * @param value The bytes for revision to set.
       * @return This builder for chaining.
       */
      public Builder setRevisionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        revision_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object timestamp_ = "";
      /**
       * <code>string timestamp = 4;</code>
       * @return The timestamp.
       */
      public java.lang.String getTimestamp() {
        java.lang.Object ref = timestamp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          timestamp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string timestamp = 4;</code>
       * @return The bytes for timestamp.
       */
      public com.google.protobuf.ByteString
          getTimestampBytes() {
        java.lang.Object ref = timestamp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timestamp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string timestamp = 4;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {

        timestamp_ = getDefaultInstance().getTimestamp();
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 4;</code>
       * @param value The bytes for timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestampBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        timestamp_ = value;
        onChanged();
        return this;
      }

      private int pid_ ;
      /**
       * <code>uint32 pid = 5;</code>
       * @return The pid.
       */
      @java.lang.Override
      public int getPid() {
        return pid_;
      }
      /**
       * <code>uint32 pid = 5;</code>
       * @param value The pid to set.
       * @return This builder for chaining.
       */
      public Builder setPid(int value) {

        pid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPid() {

        pid_ = 0;
        onChanged();
        return this;
      }

      private int tid_ ;
      /**
       * <code>uint32 tid = 6;</code>
       * @return The tid.
       */
      @java.lang.Override
      public int getTid() {
        return tid_;
      }
      /**
       * <code>uint32 tid = 6;</code>
       * @param value The tid to set.
       * @return This builder for chaining.
       */
      public Builder setTid(int value) {

        tid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTid() {

        tid_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 7;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {

        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object selinuxLabel_ = "";
      /**
       * <code>string selinux_label = 8;</code>
       * @return The selinuxLabel.
       */
      public java.lang.String getSelinuxLabel() {
        java.lang.Object ref = selinuxLabel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          selinuxLabel_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string selinux_label = 8;</code>
       * @return The bytes for selinuxLabel.
       */
      public com.google.protobuf.ByteString
          getSelinuxLabelBytes() {
        java.lang.Object ref = selinuxLabel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          selinuxLabel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string selinux_label = 8;</code>
       * @param value The selinuxLabel to set.
       * @return This builder for chaining.
       */
      public Builder setSelinuxLabel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        selinuxLabel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string selinux_label = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelinuxLabel() {

        selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
        onChanged();
        return this;
      }
      /**
       * <code>string selinux_label = 8;</code>
       * @param value The bytes for selinuxLabel to set.
       * @return This builder for chaining.
       */
      public Builder setSelinuxLabelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        selinuxLabel_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList commandLine_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureCommandLineIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          commandLine_ = new com.google.protobuf.LazyStringArrayList(commandLine_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @return A list containing the commandLine.
       */
      public com.google.protobuf.ProtocolStringList
          getCommandLineList() {
        return commandLine_.getUnmodifiableView();
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @return The count of commandLine.
       */
      public int getCommandLineCount() {
        return commandLine_.size();
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param index The index of the element to return.
       * @return The commandLine at the given index.
       */
      public java.lang.String getCommandLine(int index) {
        return commandLine_.get(index);
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param index The index of the value to return.
       * @return The bytes of the commandLine at the given index.
       */
      public com.google.protobuf.ByteString
          getCommandLineBytes(int index) {
        return commandLine_.getByteString(index);
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param index The index to set the value at.
       * @param value The commandLine to set.
       * @return This builder for chaining.
       */
      public Builder setCommandLine(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCommandLineIsMutable();
        commandLine_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param value The commandLine to add.
       * @return This builder for chaining.
       */
      public Builder addCommandLine(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCommandLineIsMutable();
        commandLine_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param values The commandLine to add.
       * @return This builder for chaining.
       */
      public Builder addAllCommandLine(
          java.lang.Iterable<java.lang.String> values) {
        ensureCommandLineIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commandLine_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCommandLine() {
        commandLine_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string command_line = 9;</code>
       * @param value The bytes of the commandLine to add.
       * @return This builder for chaining.
       */
      public Builder addCommandLineBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureCommandLineIsMutable();
        commandLine_.add(value);
        onChanged();
        return this;
      }

      private int processUptime_ ;
      /**
       * <pre>
       * Process uptime in seconds.
       * </pre>
       *
       * <code>uint32 process_uptime = 20;</code>
       * @return The processUptime.
       */
      @java.lang.Override
      public int getProcessUptime() {
        return processUptime_;
      }
      /**
       * <pre>
       * Process uptime in seconds.
       * </pre>
       *
       * <code>uint32 process_uptime = 20;</code>
       * @param value The processUptime to set.
       * @return This builder for chaining.
       */
      public Builder setProcessUptime(int value) {

        processUptime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Process uptime in seconds.
       * </pre>
       *
       * <code>uint32 process_uptime = 20;</code>
       * @return This builder for chaining.
       */
      public Builder clearProcessUptime() {

        processUptime_ = 0;
        onChanged();
        return this;
      }

      private com.android.server.os.TombstoneProtos.Signal signalInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Signal, com.android.server.os.TombstoneProtos.Signal.Builder, com.android.server.os.TombstoneProtos.SignalOrBuilder> signalInfoBuilder_;
      /**
       * <code>.Signal signal_info = 10;</code>
       * @return Whether the signalInfo field is set.
       */
      public boolean hasSignalInfo() {
        return signalInfoBuilder_ != null || signalInfo_ != null;
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       * @return The signalInfo.
       */
      public com.android.server.os.TombstoneProtos.Signal getSignalInfo() {
        if (signalInfoBuilder_ == null) {
          return signalInfo_ == null ? com.android.server.os.TombstoneProtos.Signal.getDefaultInstance() : signalInfo_;
        } else {
          return signalInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public Builder setSignalInfo(com.android.server.os.TombstoneProtos.Signal value) {
        if (signalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signalInfo_ = value;
          onChanged();
        } else {
          signalInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public Builder setSignalInfo(
          com.android.server.os.TombstoneProtos.Signal.Builder builderForValue) {
        if (signalInfoBuilder_ == null) {
          signalInfo_ = builderForValue.build();
          onChanged();
        } else {
          signalInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public Builder mergeSignalInfo(com.android.server.os.TombstoneProtos.Signal value) {
        if (signalInfoBuilder_ == null) {
          if (signalInfo_ != null) {
            signalInfo_ =
              com.android.server.os.TombstoneProtos.Signal.newBuilder(signalInfo_).mergeFrom(value).buildPartial();
          } else {
            signalInfo_ = value;
          }
          onChanged();
        } else {
          signalInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public Builder clearSignalInfo() {
        if (signalInfoBuilder_ == null) {
          signalInfo_ = null;
          onChanged();
        } else {
          signalInfo_ = null;
          signalInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public com.android.server.os.TombstoneProtos.Signal.Builder getSignalInfoBuilder() {

        onChanged();
        return getSignalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      public com.android.server.os.TombstoneProtos.SignalOrBuilder getSignalInfoOrBuilder() {
        if (signalInfoBuilder_ != null) {
          return signalInfoBuilder_.getMessageOrBuilder();
        } else {
          return signalInfo_ == null ?
              com.android.server.os.TombstoneProtos.Signal.getDefaultInstance() : signalInfo_;
        }
      }
      /**
       * <code>.Signal signal_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Signal, com.android.server.os.TombstoneProtos.Signal.Builder, com.android.server.os.TombstoneProtos.SignalOrBuilder>
          getSignalInfoFieldBuilder() {
        if (signalInfoBuilder_ == null) {
          signalInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.Signal, com.android.server.os.TombstoneProtos.Signal.Builder, com.android.server.os.TombstoneProtos.SignalOrBuilder>(
                  getSignalInfo(),
                  getParentForChildren(),
                  isClean());
          signalInfo_ = null;
        }
        return signalInfoBuilder_;
      }

      private java.lang.Object abortMessage_ = "";
      /**
       * <code>string abort_message = 14;</code>
       * @return The abortMessage.
       */
      public java.lang.String getAbortMessage() {
        java.lang.Object ref = abortMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          abortMessage_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string abort_message = 14;</code>
       * @return The bytes for abortMessage.
       */
      public com.google.protobuf.ByteString
          getAbortMessageBytes() {
        java.lang.Object ref = abortMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          abortMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string abort_message = 14;</code>
       * @param value The abortMessage to set.
       * @return This builder for chaining.
       */
      public Builder setAbortMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        abortMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string abort_message = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbortMessage() {

        abortMessage_ = getDefaultInstance().getAbortMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string abort_message = 14;</code>
       * @param value The bytes for abortMessage to set.
       * @return This builder for chaining.
       */
      public Builder setAbortMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        abortMessage_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.CrashDetail> crashDetails_ =
        java.util.Collections.emptyList();
      private void ensureCrashDetailsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          crashDetails_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.CrashDetail>(crashDetails_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.CrashDetail, com.android.server.os.TombstoneProtos.CrashDetail.Builder, com.android.server.os.TombstoneProtos.CrashDetailOrBuilder> crashDetailsBuilder_;

      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.CrashDetail> getCrashDetailsList() {
        if (crashDetailsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(crashDetails_);
        } else {
          return crashDetailsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public int getCrashDetailsCount() {
        if (crashDetailsBuilder_ == null) {
          return crashDetails_.size();
        } else {
          return crashDetailsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public com.android.server.os.TombstoneProtos.CrashDetail getCrashDetails(int index) {
        if (crashDetailsBuilder_ == null) {
          return crashDetails_.get(index);
        } else {
          return crashDetailsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder setCrashDetails(
          int index, com.android.server.os.TombstoneProtos.CrashDetail value) {
        if (crashDetailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCrashDetailsIsMutable();
          crashDetails_.set(index, value);
          onChanged();
        } else {
          crashDetailsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder setCrashDetails(
          int index, com.android.server.os.TombstoneProtos.CrashDetail.Builder builderForValue) {
        if (crashDetailsBuilder_ == null) {
          ensureCrashDetailsIsMutable();
          crashDetails_.set(index, builderForValue.build());
          onChanged();
        } else {
          crashDetailsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder addCrashDetails(com.android.server.os.TombstoneProtos.CrashDetail value) {
        if (crashDetailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCrashDetailsIsMutable();
          crashDetails_.add(value);
          onChanged();
        } else {
          crashDetailsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder addCrashDetails(
          int index, com.android.server.os.TombstoneProtos.CrashDetail value) {
        if (crashDetailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCrashDetailsIsMutable();
          crashDetails_.add(index, value);
          onChanged();
        } else {
          crashDetailsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder addCrashDetails(
          com.android.server.os.TombstoneProtos.CrashDetail.Builder builderForValue) {
        if (crashDetailsBuilder_ == null) {
          ensureCrashDetailsIsMutable();
          crashDetails_.add(builderForValue.build());
          onChanged();
        } else {
          crashDetailsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder addCrashDetails(
          int index, com.android.server.os.TombstoneProtos.CrashDetail.Builder builderForValue) {
        if (crashDetailsBuilder_ == null) {
          ensureCrashDetailsIsMutable();
          crashDetails_.add(index, builderForValue.build());
          onChanged();
        } else {
          crashDetailsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder addAllCrashDetails(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.CrashDetail> values) {
        if (crashDetailsBuilder_ == null) {
          ensureCrashDetailsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, crashDetails_);
          onChanged();
        } else {
          crashDetailsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder clearCrashDetails() {
        if (crashDetailsBuilder_ == null) {
          crashDetails_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          crashDetailsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public Builder removeCrashDetails(int index) {
        if (crashDetailsBuilder_ == null) {
          ensureCrashDetailsIsMutable();
          crashDetails_.remove(index);
          onChanged();
        } else {
          crashDetailsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public com.android.server.os.TombstoneProtos.CrashDetail.Builder getCrashDetailsBuilder(
          int index) {
        return getCrashDetailsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public com.android.server.os.TombstoneProtos.CrashDetailOrBuilder getCrashDetailsOrBuilder(
          int index) {
        if (crashDetailsBuilder_ == null) {
          return crashDetails_.get(index);  } else {
          return crashDetailsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.CrashDetailOrBuilder>
           getCrashDetailsOrBuilderList() {
        if (crashDetailsBuilder_ != null) {
          return crashDetailsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(crashDetails_);
        }
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public com.android.server.os.TombstoneProtos.CrashDetail.Builder addCrashDetailsBuilder() {
        return getCrashDetailsFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.CrashDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public com.android.server.os.TombstoneProtos.CrashDetail.Builder addCrashDetailsBuilder(
          int index) {
        return getCrashDetailsFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.CrashDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .CrashDetail crash_details = 21;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.CrashDetail.Builder>
           getCrashDetailsBuilderList() {
        return getCrashDetailsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.CrashDetail, com.android.server.os.TombstoneProtos.CrashDetail.Builder, com.android.server.os.TombstoneProtos.CrashDetailOrBuilder>
          getCrashDetailsFieldBuilder() {
        if (crashDetailsBuilder_ == null) {
          crashDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.CrashDetail, com.android.server.os.TombstoneProtos.CrashDetail.Builder, com.android.server.os.TombstoneProtos.CrashDetailOrBuilder>(
                  crashDetails_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          crashDetails_ = null;
        }
        return crashDetailsBuilder_;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.Cause> causes_ =
        java.util.Collections.emptyList();
      private void ensureCausesIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          causes_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.Cause>(causes_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Cause, com.android.server.os.TombstoneProtos.Cause.Builder, com.android.server.os.TombstoneProtos.CauseOrBuilder> causesBuilder_;

      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.Cause> getCausesList() {
        if (causesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(causes_);
        } else {
          return causesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public int getCausesCount() {
        if (causesBuilder_ == null) {
          return causes_.size();
        } else {
          return causesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public com.android.server.os.TombstoneProtos.Cause getCauses(int index) {
        if (causesBuilder_ == null) {
          return causes_.get(index);
        } else {
          return causesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder setCauses(
          int index, com.android.server.os.TombstoneProtos.Cause value) {
        if (causesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCausesIsMutable();
          causes_.set(index, value);
          onChanged();
        } else {
          causesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder setCauses(
          int index, com.android.server.os.TombstoneProtos.Cause.Builder builderForValue) {
        if (causesBuilder_ == null) {
          ensureCausesIsMutable();
          causes_.set(index, builderForValue.build());
          onChanged();
        } else {
          causesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder addCauses(com.android.server.os.TombstoneProtos.Cause value) {
        if (causesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCausesIsMutable();
          causes_.add(value);
          onChanged();
        } else {
          causesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder addCauses(
          int index, com.android.server.os.TombstoneProtos.Cause value) {
        if (causesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCausesIsMutable();
          causes_.add(index, value);
          onChanged();
        } else {
          causesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder addCauses(
          com.android.server.os.TombstoneProtos.Cause.Builder builderForValue) {
        if (causesBuilder_ == null) {
          ensureCausesIsMutable();
          causes_.add(builderForValue.build());
          onChanged();
        } else {
          causesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder addCauses(
          int index, com.android.server.os.TombstoneProtos.Cause.Builder builderForValue) {
        if (causesBuilder_ == null) {
          ensureCausesIsMutable();
          causes_.add(index, builderForValue.build());
          onChanged();
        } else {
          causesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder addAllCauses(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.Cause> values) {
        if (causesBuilder_ == null) {
          ensureCausesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, causes_);
          onChanged();
        } else {
          causesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder clearCauses() {
        if (causesBuilder_ == null) {
          causes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          causesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public Builder removeCauses(int index) {
        if (causesBuilder_ == null) {
          ensureCausesIsMutable();
          causes_.remove(index);
          onChanged();
        } else {
          causesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public com.android.server.os.TombstoneProtos.Cause.Builder getCausesBuilder(
          int index) {
        return getCausesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public com.android.server.os.TombstoneProtos.CauseOrBuilder getCausesOrBuilder(
          int index) {
        if (causesBuilder_ == null) {
          return causes_.get(index);  } else {
          return causesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.CauseOrBuilder>
           getCausesOrBuilderList() {
        if (causesBuilder_ != null) {
          return causesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(causes_);
        }
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public com.android.server.os.TombstoneProtos.Cause.Builder addCausesBuilder() {
        return getCausesFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.Cause.getDefaultInstance());
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public com.android.server.os.TombstoneProtos.Cause.Builder addCausesBuilder(
          int index) {
        return getCausesFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.Cause.getDefaultInstance());
      }
      /**
       * <code>repeated .Cause causes = 15;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.Cause.Builder>
           getCausesBuilderList() {
        return getCausesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Cause, com.android.server.os.TombstoneProtos.Cause.Builder, com.android.server.os.TombstoneProtos.CauseOrBuilder>
          getCausesFieldBuilder() {
        if (causesBuilder_ == null) {
          causesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.Cause, com.android.server.os.TombstoneProtos.Cause.Builder, com.android.server.os.TombstoneProtos.CauseOrBuilder>(
                  causes_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          causes_ = null;
        }
        return causesBuilder_;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> threads_;
      private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      internalGetThreads() {
        if (threads_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ThreadsDefaultEntryHolder.defaultEntry);
        }
        return threads_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      internalGetMutableThreads() {
        onChanged();;
        if (threads_ == null) {
          threads_ = com.google.protobuf.MapField.newMapField(
              ThreadsDefaultEntryHolder.defaultEntry);
        }
        if (!threads_.isMutable()) {
          threads_ = threads_.copy();
        }
        return threads_;
      }

      public int getThreadsCount() {
        return internalGetThreads().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */

      @java.lang.Override
      public boolean containsThreads(
          int key) {

        return internalGetThreads().getMap().containsKey(key);
      }
      /**
       * Use {@link #getThreadsMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getThreads() {
        return getThreadsMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getThreadsMap() {
        return internalGetThreads().getMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */
      @java.lang.Override

      public com.android.server.os.TombstoneProtos.Thread getThreadsOrDefault(
          int key,
          com.android.server.os.TombstoneProtos.Thread defaultValue) {

        java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
            internalGetThreads().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */
      @java.lang.Override

      public com.android.server.os.TombstoneProtos.Thread getThreadsOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
            internalGetThreads().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearThreads() {
        internalGetMutableThreads().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */

      public Builder removeThreads(
          int key) {

        internalGetMutableThreads().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      getMutableThreads() {
        return internalGetMutableThreads().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */
      public Builder putThreads(
          int key,
          com.android.server.os.TombstoneProtos.Thread value) {

        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutableThreads().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; threads = 16;</code>
       */

      public Builder putAllThreads(
          java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> values) {
        internalGetMutableThreads().getMutableMap()
            .putAll(values);
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> guestThreads_;
      private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      internalGetGuestThreads() {
        if (guestThreads_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GuestThreadsDefaultEntryHolder.defaultEntry);
        }
        return guestThreads_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      internalGetMutableGuestThreads() {
        onChanged();;
        if (guestThreads_ == null) {
          guestThreads_ = com.google.protobuf.MapField.newMapField(
              GuestThreadsDefaultEntryHolder.defaultEntry);
        }
        if (!guestThreads_.isMutable()) {
          guestThreads_ = guestThreads_.copy();
        }
        return guestThreads_;
      }

      public int getGuestThreadsCount() {
        return internalGetGuestThreads().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */

      @java.lang.Override
      public boolean containsGuestThreads(
          int key) {

        return internalGetGuestThreads().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGuestThreadsMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getGuestThreads() {
        return getGuestThreadsMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> getGuestThreadsMap() {
        return internalGetGuestThreads().getMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */
      @java.lang.Override

      public com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrDefault(
          int key,
          com.android.server.os.TombstoneProtos.Thread defaultValue) {

        java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
            internalGetGuestThreads().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */
      @java.lang.Override

      public com.android.server.os.TombstoneProtos.Thread getGuestThreadsOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> map =
            internalGetGuestThreads().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGuestThreads() {
        internalGetMutableGuestThreads().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */

      public Builder removeGuestThreads(
          int key) {

        internalGetMutableGuestThreads().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread>
      getMutableGuestThreads() {
        return internalGetMutableGuestThreads().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */
      public Builder putGuestThreads(
          int key,
          com.android.server.os.TombstoneProtos.Thread value) {

        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutableGuestThreads().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .Thread&gt; guest_threads = 25;</code>
       */

      public Builder putAllGuestThreads(
          java.util.Map<java.lang.Integer, com.android.server.os.TombstoneProtos.Thread> values) {
        internalGetMutableGuestThreads().getMutableMap()
            .putAll(values);
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping> memoryMappings_ =
        java.util.Collections.emptyList();
      private void ensureMemoryMappingsIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          memoryMappings_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.MemoryMapping>(memoryMappings_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryMapping, com.android.server.os.TombstoneProtos.MemoryMapping.Builder, com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder> memoryMappingsBuilder_;

      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping> getMemoryMappingsList() {
        if (memoryMappingsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(memoryMappings_);
        } else {
          return memoryMappingsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public int getMemoryMappingsCount() {
        if (memoryMappingsBuilder_ == null) {
          return memoryMappings_.size();
        } else {
          return memoryMappingsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryMapping getMemoryMappings(int index) {
        if (memoryMappingsBuilder_ == null) {
          return memoryMappings_.get(index);
        } else {
          return memoryMappingsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder setMemoryMappings(
          int index, com.android.server.os.TombstoneProtos.MemoryMapping value) {
        if (memoryMappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryMappingsIsMutable();
          memoryMappings_.set(index, value);
          onChanged();
        } else {
          memoryMappingsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder setMemoryMappings(
          int index, com.android.server.os.TombstoneProtos.MemoryMapping.Builder builderForValue) {
        if (memoryMappingsBuilder_ == null) {
          ensureMemoryMappingsIsMutable();
          memoryMappings_.set(index, builderForValue.build());
          onChanged();
        } else {
          memoryMappingsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder addMemoryMappings(com.android.server.os.TombstoneProtos.MemoryMapping value) {
        if (memoryMappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryMappingsIsMutable();
          memoryMappings_.add(value);
          onChanged();
        } else {
          memoryMappingsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder addMemoryMappings(
          int index, com.android.server.os.TombstoneProtos.MemoryMapping value) {
        if (memoryMappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryMappingsIsMutable();
          memoryMappings_.add(index, value);
          onChanged();
        } else {
          memoryMappingsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder addMemoryMappings(
          com.android.server.os.TombstoneProtos.MemoryMapping.Builder builderForValue) {
        if (memoryMappingsBuilder_ == null) {
          ensureMemoryMappingsIsMutable();
          memoryMappings_.add(builderForValue.build());
          onChanged();
        } else {
          memoryMappingsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder addMemoryMappings(
          int index, com.android.server.os.TombstoneProtos.MemoryMapping.Builder builderForValue) {
        if (memoryMappingsBuilder_ == null) {
          ensureMemoryMappingsIsMutable();
          memoryMappings_.add(index, builderForValue.build());
          onChanged();
        } else {
          memoryMappingsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder addAllMemoryMappings(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.MemoryMapping> values) {
        if (memoryMappingsBuilder_ == null) {
          ensureMemoryMappingsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, memoryMappings_);
          onChanged();
        } else {
          memoryMappingsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder clearMemoryMappings() {
        if (memoryMappingsBuilder_ == null) {
          memoryMappings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          memoryMappingsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public Builder removeMemoryMappings(int index) {
        if (memoryMappingsBuilder_ == null) {
          ensureMemoryMappingsIsMutable();
          memoryMappings_.remove(index);
          onChanged();
        } else {
          memoryMappingsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryMapping.Builder getMemoryMappingsBuilder(
          int index) {
        return getMemoryMappingsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder getMemoryMappingsOrBuilder(
          int index) {
        if (memoryMappingsBuilder_ == null) {
          return memoryMappings_.get(index);  } else {
          return memoryMappingsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder>
           getMemoryMappingsOrBuilderList() {
        if (memoryMappingsBuilder_ != null) {
          return memoryMappingsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(memoryMappings_);
        }
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryMapping.Builder addMemoryMappingsBuilder() {
        return getMemoryMappingsFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.MemoryMapping.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryMapping.Builder addMemoryMappingsBuilder(
          int index) {
        return getMemoryMappingsFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.MemoryMapping.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryMapping memory_mappings = 17;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.MemoryMapping.Builder>
           getMemoryMappingsBuilderList() {
        return getMemoryMappingsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryMapping, com.android.server.os.TombstoneProtos.MemoryMapping.Builder, com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder>
          getMemoryMappingsFieldBuilder() {
        if (memoryMappingsBuilder_ == null) {
          memoryMappingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.MemoryMapping, com.android.server.os.TombstoneProtos.MemoryMapping.Builder, com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder>(
                  memoryMappings_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          memoryMappings_ = null;
        }
        return memoryMappingsBuilder_;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.LogBuffer> logBuffers_ =
        java.util.Collections.emptyList();
      private void ensureLogBuffersIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          logBuffers_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.LogBuffer>(logBuffers_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.LogBuffer, com.android.server.os.TombstoneProtos.LogBuffer.Builder, com.android.server.os.TombstoneProtos.LogBufferOrBuilder> logBuffersBuilder_;

      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.LogBuffer> getLogBuffersList() {
        if (logBuffersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(logBuffers_);
        } else {
          return logBuffersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public int getLogBuffersCount() {
        if (logBuffersBuilder_ == null) {
          return logBuffers_.size();
        } else {
          return logBuffersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public com.android.server.os.TombstoneProtos.LogBuffer getLogBuffers(int index) {
        if (logBuffersBuilder_ == null) {
          return logBuffers_.get(index);
        } else {
          return logBuffersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder setLogBuffers(
          int index, com.android.server.os.TombstoneProtos.LogBuffer value) {
        if (logBuffersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogBuffersIsMutable();
          logBuffers_.set(index, value);
          onChanged();
        } else {
          logBuffersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder setLogBuffers(
          int index, com.android.server.os.TombstoneProtos.LogBuffer.Builder builderForValue) {
        if (logBuffersBuilder_ == null) {
          ensureLogBuffersIsMutable();
          logBuffers_.set(index, builderForValue.build());
          onChanged();
        } else {
          logBuffersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder addLogBuffers(com.android.server.os.TombstoneProtos.LogBuffer value) {
        if (logBuffersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogBuffersIsMutable();
          logBuffers_.add(value);
          onChanged();
        } else {
          logBuffersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder addLogBuffers(
          int index, com.android.server.os.TombstoneProtos.LogBuffer value) {
        if (logBuffersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogBuffersIsMutable();
          logBuffers_.add(index, value);
          onChanged();
        } else {
          logBuffersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder addLogBuffers(
          com.android.server.os.TombstoneProtos.LogBuffer.Builder builderForValue) {
        if (logBuffersBuilder_ == null) {
          ensureLogBuffersIsMutable();
          logBuffers_.add(builderForValue.build());
          onChanged();
        } else {
          logBuffersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder addLogBuffers(
          int index, com.android.server.os.TombstoneProtos.LogBuffer.Builder builderForValue) {
        if (logBuffersBuilder_ == null) {
          ensureLogBuffersIsMutable();
          logBuffers_.add(index, builderForValue.build());
          onChanged();
        } else {
          logBuffersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder addAllLogBuffers(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.LogBuffer> values) {
        if (logBuffersBuilder_ == null) {
          ensureLogBuffersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, logBuffers_);
          onChanged();
        } else {
          logBuffersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder clearLogBuffers() {
        if (logBuffersBuilder_ == null) {
          logBuffers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          logBuffersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public Builder removeLogBuffers(int index) {
        if (logBuffersBuilder_ == null) {
          ensureLogBuffersIsMutable();
          logBuffers_.remove(index);
          onChanged();
        } else {
          logBuffersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public com.android.server.os.TombstoneProtos.LogBuffer.Builder getLogBuffersBuilder(
          int index) {
        return getLogBuffersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public com.android.server.os.TombstoneProtos.LogBufferOrBuilder getLogBuffersOrBuilder(
          int index) {
        if (logBuffersBuilder_ == null) {
          return logBuffers_.get(index);  } else {
          return logBuffersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.LogBufferOrBuilder>
           getLogBuffersOrBuilderList() {
        if (logBuffersBuilder_ != null) {
          return logBuffersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(logBuffers_);
        }
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public com.android.server.os.TombstoneProtos.LogBuffer.Builder addLogBuffersBuilder() {
        return getLogBuffersFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.LogBuffer.getDefaultInstance());
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public com.android.server.os.TombstoneProtos.LogBuffer.Builder addLogBuffersBuilder(
          int index) {
        return getLogBuffersFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.LogBuffer.getDefaultInstance());
      }
      /**
       * <code>repeated .LogBuffer log_buffers = 18;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.LogBuffer.Builder>
           getLogBuffersBuilderList() {
        return getLogBuffersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.LogBuffer, com.android.server.os.TombstoneProtos.LogBuffer.Builder, com.android.server.os.TombstoneProtos.LogBufferOrBuilder>
          getLogBuffersFieldBuilder() {
        if (logBuffersBuilder_ == null) {
          logBuffersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.LogBuffer, com.android.server.os.TombstoneProtos.LogBuffer.Builder, com.android.server.os.TombstoneProtos.LogBufferOrBuilder>(
                  logBuffers_,
                  ((bitField0_ & 0x00000040) != 0),
                  getParentForChildren(),
                  isClean());
          logBuffers_ = null;
        }
        return logBuffersBuilder_;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.FD> openFds_ =
        java.util.Collections.emptyList();
      private void ensureOpenFdsIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          openFds_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.FD>(openFds_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.FD, com.android.server.os.TombstoneProtos.FD.Builder, com.android.server.os.TombstoneProtos.FDOrBuilder> openFdsBuilder_;

      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.FD> getOpenFdsList() {
        if (openFdsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(openFds_);
        } else {
          return openFdsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public int getOpenFdsCount() {
        if (openFdsBuilder_ == null) {
          return openFds_.size();
        } else {
          return openFdsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public com.android.server.os.TombstoneProtos.FD getOpenFds(int index) {
        if (openFdsBuilder_ == null) {
          return openFds_.get(index);
        } else {
          return openFdsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder setOpenFds(
          int index, com.android.server.os.TombstoneProtos.FD value) {
        if (openFdsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpenFdsIsMutable();
          openFds_.set(index, value);
          onChanged();
        } else {
          openFdsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder setOpenFds(
          int index, com.android.server.os.TombstoneProtos.FD.Builder builderForValue) {
        if (openFdsBuilder_ == null) {
          ensureOpenFdsIsMutable();
          openFds_.set(index, builderForValue.build());
          onChanged();
        } else {
          openFdsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder addOpenFds(com.android.server.os.TombstoneProtos.FD value) {
        if (openFdsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpenFdsIsMutable();
          openFds_.add(value);
          onChanged();
        } else {
          openFdsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder addOpenFds(
          int index, com.android.server.os.TombstoneProtos.FD value) {
        if (openFdsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpenFdsIsMutable();
          openFds_.add(index, value);
          onChanged();
        } else {
          openFdsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder addOpenFds(
          com.android.server.os.TombstoneProtos.FD.Builder builderForValue) {
        if (openFdsBuilder_ == null) {
          ensureOpenFdsIsMutable();
          openFds_.add(builderForValue.build());
          onChanged();
        } else {
          openFdsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder addOpenFds(
          int index, com.android.server.os.TombstoneProtos.FD.Builder builderForValue) {
        if (openFdsBuilder_ == null) {
          ensureOpenFdsIsMutable();
          openFds_.add(index, builderForValue.build());
          onChanged();
        } else {
          openFdsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder addAllOpenFds(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.FD> values) {
        if (openFdsBuilder_ == null) {
          ensureOpenFdsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, openFds_);
          onChanged();
        } else {
          openFdsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder clearOpenFds() {
        if (openFdsBuilder_ == null) {
          openFds_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          openFdsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public Builder removeOpenFds(int index) {
        if (openFdsBuilder_ == null) {
          ensureOpenFdsIsMutable();
          openFds_.remove(index);
          onChanged();
        } else {
          openFdsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public com.android.server.os.TombstoneProtos.FD.Builder getOpenFdsBuilder(
          int index) {
        return getOpenFdsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public com.android.server.os.TombstoneProtos.FDOrBuilder getOpenFdsOrBuilder(
          int index) {
        if (openFdsBuilder_ == null) {
          return openFds_.get(index);  } else {
          return openFdsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.FDOrBuilder>
           getOpenFdsOrBuilderList() {
        if (openFdsBuilder_ != null) {
          return openFdsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(openFds_);
        }
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public com.android.server.os.TombstoneProtos.FD.Builder addOpenFdsBuilder() {
        return getOpenFdsFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.FD.getDefaultInstance());
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public com.android.server.os.TombstoneProtos.FD.Builder addOpenFdsBuilder(
          int index) {
        return getOpenFdsFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.FD.getDefaultInstance());
      }
      /**
       * <code>repeated .FD open_fds = 19;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.FD.Builder>
           getOpenFdsBuilderList() {
        return getOpenFdsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.FD, com.android.server.os.TombstoneProtos.FD.Builder, com.android.server.os.TombstoneProtos.FDOrBuilder>
          getOpenFdsFieldBuilder() {
        if (openFdsBuilder_ == null) {
          openFdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.FD, com.android.server.os.TombstoneProtos.FD.Builder, com.android.server.os.TombstoneProtos.FDOrBuilder>(
                  openFds_,
                  ((bitField0_ & 0x00000080) != 0),
                  getParentForChildren(),
                  isClean());
          openFds_ = null;
        }
        return openFdsBuilder_;
      }

      private int pageSize_ ;
      /**
       * <code>uint32 page_size = 22;</code>
       * @return The pageSize.
       */
      @java.lang.Override
      public int getPageSize() {
        return pageSize_;
      }
      /**
       * <code>uint32 page_size = 22;</code>
       * @param value The pageSize to set.
       * @return This builder for chaining.
       */
      public Builder setPageSize(int value) {

        pageSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 page_size = 22;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageSize() {

        pageSize_ = 0;
        onChanged();
        return this;
      }

      private boolean hasBeen16KbMode_ ;
      /**
       * <code>bool has_been_16kb_mode = 23;</code>
       * @return The hasBeen16kbMode.
       */
      @java.lang.Override
      public boolean getHasBeen16KbMode() {
        return hasBeen16KbMode_;
      }
      /**
       * <code>bool has_been_16kb_mode = 23;</code>
       * @param value The hasBeen16kbMode to set.
       * @return This builder for chaining.
       */
      public Builder setHasBeen16KbMode(boolean value) {

        hasBeen16KbMode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool has_been_16kb_mode = 23;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasBeen16KbMode() {

        hasBeen16KbMode_ = false;
        onChanged();
        return this;
      }

      private com.android.server.os.TombstoneProtos.StackHistoryBuffer stackHistoryBuffer_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.StackHistoryBuffer, com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder> stackHistoryBufferBuilder_;
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       * @return Whether the stackHistoryBuffer field is set.
       */
      public boolean hasStackHistoryBuffer() {
        return stackHistoryBufferBuilder_ != null || stackHistoryBuffer_ != null;
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       * @return The stackHistoryBuffer.
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBuffer getStackHistoryBuffer() {
        if (stackHistoryBufferBuilder_ == null) {
          return stackHistoryBuffer_ == null ? com.android.server.os.TombstoneProtos.StackHistoryBuffer.getDefaultInstance() : stackHistoryBuffer_;
        } else {
          return stackHistoryBufferBuilder_.getMessage();
        }
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public Builder setStackHistoryBuffer(com.android.server.os.TombstoneProtos.StackHistoryBuffer value) {
        if (stackHistoryBufferBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stackHistoryBuffer_ = value;
          onChanged();
        } else {
          stackHistoryBufferBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public Builder setStackHistoryBuffer(
          com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder builderForValue) {
        if (stackHistoryBufferBuilder_ == null) {
          stackHistoryBuffer_ = builderForValue.build();
          onChanged();
        } else {
          stackHistoryBufferBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public Builder mergeStackHistoryBuffer(com.android.server.os.TombstoneProtos.StackHistoryBuffer value) {
        if (stackHistoryBufferBuilder_ == null) {
          if (stackHistoryBuffer_ != null) {
            stackHistoryBuffer_ =
              com.android.server.os.TombstoneProtos.StackHistoryBuffer.newBuilder(stackHistoryBuffer_).mergeFrom(value).buildPartial();
          } else {
            stackHistoryBuffer_ = value;
          }
          onChanged();
        } else {
          stackHistoryBufferBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public Builder clearStackHistoryBuffer() {
        if (stackHistoryBufferBuilder_ == null) {
          stackHistoryBuffer_ = null;
          onChanged();
        } else {
          stackHistoryBuffer_ = null;
          stackHistoryBufferBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder getStackHistoryBufferBuilder() {

        onChanged();
        return getStackHistoryBufferFieldBuilder().getBuilder();
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      public com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder getStackHistoryBufferOrBuilder() {
        if (stackHistoryBufferBuilder_ != null) {
          return stackHistoryBufferBuilder_.getMessageOrBuilder();
        } else {
          return stackHistoryBuffer_ == null ?
              com.android.server.os.TombstoneProtos.StackHistoryBuffer.getDefaultInstance() : stackHistoryBuffer_;
        }
      }
      /**
       * <code>.StackHistoryBuffer stack_history_buffer = 26;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.StackHistoryBuffer, com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder>
          getStackHistoryBufferFieldBuilder() {
        if (stackHistoryBufferBuilder_ == null) {
          stackHistoryBufferBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.StackHistoryBuffer, com.android.server.os.TombstoneProtos.StackHistoryBuffer.Builder, com.android.server.os.TombstoneProtos.StackHistoryBufferOrBuilder>(
                  getStackHistoryBuffer(),
                  getParentForChildren(),
                  isClean());
          stackHistoryBuffer_ = null;
        }
        return stackHistoryBufferBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Tombstone)
    }

    // @@protoc_insertion_point(class_scope:Tombstone)
    private static final com.android.server.os.TombstoneProtos.Tombstone DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.Tombstone();
    }

    public static com.android.server.os.TombstoneProtos.Tombstone getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Tombstone>
        PARSER = new com.google.protobuf.AbstractParser<Tombstone>() {
      @java.lang.Override
      public Tombstone parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Tombstone> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Tombstone> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Tombstone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SignalOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Signal)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 number = 1;</code>
     * @return The number.
     */
    int getNumber();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 code = 3;</code>
     * @return The code.
     */
    int getCode();

    /**
     * <code>string code_name = 4;</code>
     * @return The codeName.
     */
    java.lang.String getCodeName();
    /**
     * <code>string code_name = 4;</code>
     * @return The bytes for codeName.
     */
    com.google.protobuf.ByteString
        getCodeNameBytes();

    /**
     * <code>bool has_sender = 5;</code>
     * @return The hasSender.
     */
    boolean getHasSender();

    /**
     * <code>int32 sender_uid = 6;</code>
     * @return The senderUid.
     */
    int getSenderUid();

    /**
     * <code>int32 sender_pid = 7;</code>
     * @return The senderPid.
     */
    int getSenderPid();

    /**
     * <code>bool has_fault_address = 8;</code>
     * @return The hasFaultAddress.
     */
    boolean getHasFaultAddress();

    /**
     * <code>uint64 fault_address = 9;</code>
     * @return The faultAddress.
     */
    long getFaultAddress();

    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     * @return Whether the faultAdjacentMetadata field is set.
     */
    boolean hasFaultAdjacentMetadata();
    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     * @return The faultAdjacentMetadata.
     */
    com.android.server.os.TombstoneProtos.MemoryDump getFaultAdjacentMetadata();
    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getFaultAdjacentMetadataOrBuilder();
  }
  /**
   * Protobuf type {@code Signal}
   */
  public static final class Signal extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Signal)
      SignalOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Signal.newBuilder() to construct.
    private Signal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Signal() {
      name_ = "";
      codeName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Signal();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_Signal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_Signal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.Signal.class, com.android.server.os.TombstoneProtos.Signal.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private int number_;
    /**
     * <code>int32 number = 1;</code>
     * @return The number.
     */
    @java.lang.Override
    public int getNumber() {
      return number_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CODE_FIELD_NUMBER = 3;
    private int code_;
    /**
     * <code>int32 code = 3;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }

    public static final int CODE_NAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object codeName_;
    /**
     * <code>string code_name = 4;</code>
     * @return The codeName.
     */
    @java.lang.Override
    public java.lang.String getCodeName() {
      java.lang.Object ref = codeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codeName_ = s;
        return s;
      }
    }
    /**
     * <code>string code_name = 4;</code>
     * @return The bytes for codeName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeNameBytes() {
      java.lang.Object ref = codeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HAS_SENDER_FIELD_NUMBER = 5;
    private boolean hasSender_;
    /**
     * <code>bool has_sender = 5;</code>
     * @return The hasSender.
     */
    @java.lang.Override
    public boolean getHasSender() {
      return hasSender_;
    }

    public static final int SENDER_UID_FIELD_NUMBER = 6;
    private int senderUid_;
    /**
     * <code>int32 sender_uid = 6;</code>
     * @return The senderUid.
     */
    @java.lang.Override
    public int getSenderUid() {
      return senderUid_;
    }

    public static final int SENDER_PID_FIELD_NUMBER = 7;
    private int senderPid_;
    /**
     * <code>int32 sender_pid = 7;</code>
     * @return The senderPid.
     */
    @java.lang.Override
    public int getSenderPid() {
      return senderPid_;
    }

    public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
    private boolean hasFaultAddress_;
    /**
     * <code>bool has_fault_address = 8;</code>
     * @return The hasFaultAddress.
     */
    @java.lang.Override
    public boolean getHasFaultAddress() {
      return hasFaultAddress_;
    }

    public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
    private long faultAddress_;
    /**
     * <code>uint64 fault_address = 9;</code>
     * @return The faultAddress.
     */
    @java.lang.Override
    public long getFaultAddress() {
      return faultAddress_;
    }

    public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
    private com.android.server.os.TombstoneProtos.MemoryDump faultAdjacentMetadata_;
    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     * @return Whether the faultAdjacentMetadata field is set.
     */
    @java.lang.Override
    public boolean hasFaultAdjacentMetadata() {
      return faultAdjacentMetadata_ != null;
    }
    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     * @return The faultAdjacentMetadata.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryDump getFaultAdjacentMetadata() {
      return faultAdjacentMetadata_ == null ? com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance() : faultAdjacentMetadata_;
    }
    /**
     * <pre>
     * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
     * only include metadata, and not the contents.
     * </pre>
     *
     * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getFaultAdjacentMetadataOrBuilder() {
      return getFaultAdjacentMetadata();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (number_ != 0) {
        output.writeInt32(1, number_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (code_ != 0) {
        output.writeInt32(3, code_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, codeName_);
      }
      if (hasSender_ != false) {
        output.writeBool(5, hasSender_);
      }
      if (senderUid_ != 0) {
        output.writeInt32(6, senderUid_);
      }
      if (senderPid_ != 0) {
        output.writeInt32(7, senderPid_);
      }
      if (hasFaultAddress_ != false) {
        output.writeBool(8, hasFaultAddress_);
      }
      if (faultAddress_ != 0L) {
        output.writeUInt64(9, faultAddress_);
      }
      if (faultAdjacentMetadata_ != null) {
        output.writeMessage(10, getFaultAdjacentMetadata());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (number_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, number_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, code_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, codeName_);
      }
      if (hasSender_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, hasSender_);
      }
      if (senderUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, senderUid_);
      }
      if (senderPid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, senderPid_);
      }
      if (hasFaultAddress_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, hasFaultAddress_);
      }
      if (faultAddress_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, faultAddress_);
      }
      if (faultAdjacentMetadata_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getFaultAdjacentMetadata());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.Signal)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.Signal other = (com.android.server.os.TombstoneProtos.Signal) obj;

      if (getNumber()
          != other.getNumber()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (getCode()
          != other.getCode()) return false;
      if (!getCodeName()
          .equals(other.getCodeName())) return false;
      if (getHasSender()
          != other.getHasSender()) return false;
      if (getSenderUid()
          != other.getSenderUid()) return false;
      if (getSenderPid()
          != other.getSenderPid()) return false;
      if (getHasFaultAddress()
          != other.getHasFaultAddress()) return false;
      if (getFaultAddress()
          != other.getFaultAddress()) return false;
      if (hasFaultAdjacentMetadata() != other.hasFaultAdjacentMetadata()) return false;
      if (hasFaultAdjacentMetadata()) {
        if (!getFaultAdjacentMetadata()
            .equals(other.getFaultAdjacentMetadata())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getNumber();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
      hash = (37 * hash) + CODE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getCodeName().hashCode();
      hash = (37 * hash) + HAS_SENDER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasSender());
      hash = (37 * hash) + SENDER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderUid();
      hash = (37 * hash) + SENDER_PID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderPid();
      hash = (37 * hash) + HAS_FAULT_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasFaultAddress());
      hash = (37 * hash) + FAULT_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFaultAddress());
      if (hasFaultAdjacentMetadata()) {
        hash = (37 * hash) + FAULT_ADJACENT_METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getFaultAdjacentMetadata().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Signal parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.Signal prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Signal}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Signal)
        com.android.server.os.TombstoneProtos.SignalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_Signal_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_Signal_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.Signal.class, com.android.server.os.TombstoneProtos.Signal.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.Signal.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        number_ = 0;

        name_ = "";

        code_ = 0;

        codeName_ = "";

        hasSender_ = false;

        senderUid_ = 0;

        senderPid_ = 0;

        hasFaultAddress_ = false;

        faultAddress_ = 0L;

        if (faultAdjacentMetadataBuilder_ == null) {
          faultAdjacentMetadata_ = null;
        } else {
          faultAdjacentMetadata_ = null;
          faultAdjacentMetadataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_Signal_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Signal getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.Signal.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Signal build() {
        com.android.server.os.TombstoneProtos.Signal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Signal buildPartial() {
        com.android.server.os.TombstoneProtos.Signal result = new com.android.server.os.TombstoneProtos.Signal(this);
        result.number_ = number_;
        result.name_ = name_;
        result.code_ = code_;
        result.codeName_ = codeName_;
        result.hasSender_ = hasSender_;
        result.senderUid_ = senderUid_;
        result.senderPid_ = senderPid_;
        result.hasFaultAddress_ = hasFaultAddress_;
        result.faultAddress_ = faultAddress_;
        if (faultAdjacentMetadataBuilder_ == null) {
          result.faultAdjacentMetadata_ = faultAdjacentMetadata_;
        } else {
          result.faultAdjacentMetadata_ = faultAdjacentMetadataBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.Signal) {
          return mergeFrom((com.android.server.os.TombstoneProtos.Signal)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.Signal other) {
        if (other == com.android.server.os.TombstoneProtos.Signal.getDefaultInstance()) return this;
        if (other.getNumber() != 0) {
          setNumber(other.getNumber());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (!other.getCodeName().isEmpty()) {
          codeName_ = other.codeName_;
          onChanged();
        }
        if (other.getHasSender() != false) {
          setHasSender(other.getHasSender());
        }
        if (other.getSenderUid() != 0) {
          setSenderUid(other.getSenderUid());
        }
        if (other.getSenderPid() != 0) {
          setSenderPid(other.getSenderPid());
        }
        if (other.getHasFaultAddress() != false) {
          setHasFaultAddress(other.getHasFaultAddress());
        }
        if (other.getFaultAddress() != 0L) {
          setFaultAddress(other.getFaultAddress());
        }
        if (other.hasFaultAdjacentMetadata()) {
          mergeFaultAdjacentMetadata(other.getFaultAdjacentMetadata());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                number_ = input.readInt32();

                break;
              } // case 8
              case 18: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 24: {
                code_ = input.readInt32();

                break;
              } // case 24
              case 34: {
                codeName_ = input.readStringRequireUtf8();

                break;
              } // case 34
              case 40: {
                hasSender_ = input.readBool();

                break;
              } // case 40
              case 48: {
                senderUid_ = input.readInt32();

                break;
              } // case 48
              case 56: {
                senderPid_ = input.readInt32();

                break;
              } // case 56
              case 64: {
                hasFaultAddress_ = input.readBool();

                break;
              } // case 64
              case 72: {
                faultAddress_ = input.readUInt64();

                break;
              } // case 72
              case 82: {
                input.readMessage(
                    getFaultAdjacentMetadataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int number_ ;
      /**
       * <code>int32 number = 1;</code>
       * @return The number.
       */
      @java.lang.Override
      public int getNumber() {
        return number_;
      }
      /**
       * <code>int32 number = 1;</code>
       * @param value The number to set.
       * @return This builder for chaining.
       */
      public Builder setNumber(int value) {

        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 number = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber() {

        number_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>int32 code = 3;</code>
       * @return The code.
       */
      @java.lang.Override
      public int getCode() {
        return code_;
      }
      /**
       * <code>int32 code = 3;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(int value) {

        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 code = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {

        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object codeName_ = "";
      /**
       * <code>string code_name = 4;</code>
       * @return The codeName.
       */
      public java.lang.String getCodeName() {
        java.lang.Object ref = codeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          codeName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string code_name = 4;</code>
       * @return The bytes for codeName.
       */
      public com.google.protobuf.ByteString
          getCodeNameBytes() {
        java.lang.Object ref = codeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          codeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string code_name = 4;</code>
       * @param value The codeName to set.
       * @return This builder for chaining.
       */
      public Builder setCodeName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        codeName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string code_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodeName() {

        codeName_ = getDefaultInstance().getCodeName();
        onChanged();
        return this;
      }
      /**
       * <code>string code_name = 4;</code>
       * @param value The bytes for codeName to set.
       * @return This builder for chaining.
       */
      public Builder setCodeNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        codeName_ = value;
        onChanged();
        return this;
      }

      private boolean hasSender_ ;
      /**
       * <code>bool has_sender = 5;</code>
       * @return The hasSender.
       */
      @java.lang.Override
      public boolean getHasSender() {
        return hasSender_;
      }
      /**
       * <code>bool has_sender = 5;</code>
       * @param value The hasSender to set.
       * @return This builder for chaining.
       */
      public Builder setHasSender(boolean value) {

        hasSender_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool has_sender = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasSender() {

        hasSender_ = false;
        onChanged();
        return this;
      }

      private int senderUid_ ;
      /**
       * <code>int32 sender_uid = 6;</code>
       * @return The senderUid.
       */
      @java.lang.Override
      public int getSenderUid() {
        return senderUid_;
      }
      /**
       * <code>int32 sender_uid = 6;</code>
       * @param value The senderUid to set.
       * @return This builder for chaining.
       */
      public Builder setSenderUid(int value) {

        senderUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sender_uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSenderUid() {

        senderUid_ = 0;
        onChanged();
        return this;
      }

      private int senderPid_ ;
      /**
       * <code>int32 sender_pid = 7;</code>
       * @return The senderPid.
       */
      @java.lang.Override
      public int getSenderPid() {
        return senderPid_;
      }
      /**
       * <code>int32 sender_pid = 7;</code>
       * @param value The senderPid to set.
       * @return This builder for chaining.
       */
      public Builder setSenderPid(int value) {

        senderPid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sender_pid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSenderPid() {

        senderPid_ = 0;
        onChanged();
        return this;
      }

      private boolean hasFaultAddress_ ;
      /**
       * <code>bool has_fault_address = 8;</code>
       * @return The hasFaultAddress.
       */
      @java.lang.Override
      public boolean getHasFaultAddress() {
        return hasFaultAddress_;
      }
      /**
       * <code>bool has_fault_address = 8;</code>
       * @param value The hasFaultAddress to set.
       * @return This builder for chaining.
       */
      public Builder setHasFaultAddress(boolean value) {

        hasFaultAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool has_fault_address = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasFaultAddress() {

        hasFaultAddress_ = false;
        onChanged();
        return this;
      }

      private long faultAddress_ ;
      /**
       * <code>uint64 fault_address = 9;</code>
       * @return The faultAddress.
       */
      @java.lang.Override
      public long getFaultAddress() {
        return faultAddress_;
      }
      /**
       * <code>uint64 fault_address = 9;</code>
       * @param value The faultAddress to set.
       * @return This builder for chaining.
       */
      public Builder setFaultAddress(long value) {

        faultAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 fault_address = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaultAddress() {

        faultAddress_ = 0L;
        onChanged();
        return this;
      }

      private com.android.server.os.TombstoneProtos.MemoryDump faultAdjacentMetadata_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder> faultAdjacentMetadataBuilder_;
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       * @return Whether the faultAdjacentMetadata field is set.
       */
      public boolean hasFaultAdjacentMetadata() {
        return faultAdjacentMetadataBuilder_ != null || faultAdjacentMetadata_ != null;
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       * @return The faultAdjacentMetadata.
       */
      public com.android.server.os.TombstoneProtos.MemoryDump getFaultAdjacentMetadata() {
        if (faultAdjacentMetadataBuilder_ == null) {
          return faultAdjacentMetadata_ == null ? com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance() : faultAdjacentMetadata_;
        } else {
          return faultAdjacentMetadataBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public Builder setFaultAdjacentMetadata(com.android.server.os.TombstoneProtos.MemoryDump value) {
        if (faultAdjacentMetadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          faultAdjacentMetadata_ = value;
          onChanged();
        } else {
          faultAdjacentMetadataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public Builder setFaultAdjacentMetadata(
          com.android.server.os.TombstoneProtos.MemoryDump.Builder builderForValue) {
        if (faultAdjacentMetadataBuilder_ == null) {
          faultAdjacentMetadata_ = builderForValue.build();
          onChanged();
        } else {
          faultAdjacentMetadataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public Builder mergeFaultAdjacentMetadata(com.android.server.os.TombstoneProtos.MemoryDump value) {
        if (faultAdjacentMetadataBuilder_ == null) {
          if (faultAdjacentMetadata_ != null) {
            faultAdjacentMetadata_ =
              com.android.server.os.TombstoneProtos.MemoryDump.newBuilder(faultAdjacentMetadata_).mergeFrom(value).buildPartial();
          } else {
            faultAdjacentMetadata_ = value;
          }
          onChanged();
        } else {
          faultAdjacentMetadataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public Builder clearFaultAdjacentMetadata() {
        if (faultAdjacentMetadataBuilder_ == null) {
          faultAdjacentMetadata_ = null;
          onChanged();
        } else {
          faultAdjacentMetadata_ = null;
          faultAdjacentMetadataBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDump.Builder getFaultAdjacentMetadataBuilder() {

        onChanged();
        return getFaultAdjacentMetadataFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getFaultAdjacentMetadataOrBuilder() {
        if (faultAdjacentMetadataBuilder_ != null) {
          return faultAdjacentMetadataBuilder_.getMessageOrBuilder();
        } else {
          return faultAdjacentMetadata_ == null ?
              com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance() : faultAdjacentMetadata_;
        }
      }
      /**
       * <pre>
       * Note, may or may not contain the dump of the actual memory contents. Currently, on arm64, we
       * only include metadata, and not the contents.
       * </pre>
       *
       * <code>.MemoryDump fault_adjacent_metadata = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>
          getFaultAdjacentMetadataFieldBuilder() {
        if (faultAdjacentMetadataBuilder_ == null) {
          faultAdjacentMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>(
                  getFaultAdjacentMetadata(),
                  getParentForChildren(),
                  isClean());
          faultAdjacentMetadata_ = null;
        }
        return faultAdjacentMetadataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Signal)
    }

    // @@protoc_insertion_point(class_scope:Signal)
    private static final com.android.server.os.TombstoneProtos.Signal DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.Signal();
    }

    public static com.android.server.os.TombstoneProtos.Signal getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Signal>
        PARSER = new com.google.protobuf.AbstractParser<Signal>() {
      @java.lang.Override
      public Signal parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Signal> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Signal> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Signal getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HeapObjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeapObject)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 address = 1;</code>
     * @return The address.
     */
    long getAddress();

    /**
     * <code>uint64 size = 2;</code>
     * @return The size.
     */
    long getSize();

    /**
     * <code>uint64 allocation_tid = 3;</code>
     * @return The allocationTid.
     */
    long getAllocationTid();

    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame>
        getAllocationBacktraceList();
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrame getAllocationBacktrace(int index);
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    int getAllocationBacktraceCount();
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getAllocationBacktraceOrBuilderList();
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(
        int index);

    /**
     * <code>uint64 deallocation_tid = 5;</code>
     * @return The deallocationTid.
     */
    long getDeallocationTid();

    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame>
        getDeallocationBacktraceList();
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrame getDeallocationBacktrace(int index);
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    int getDeallocationBacktraceCount();
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getDeallocationBacktraceOrBuilderList();
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HeapObject}
   */
  public static final class HeapObject extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HeapObject)
      HeapObjectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HeapObject.newBuilder() to construct.
    private HeapObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HeapObject() {
      allocationBacktrace_ = java.util.Collections.emptyList();
      deallocationBacktrace_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HeapObject();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_HeapObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_HeapObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.HeapObject.class, com.android.server.os.TombstoneProtos.HeapObject.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private long address_;
    /**
     * <code>uint64 address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public long getAddress() {
      return address_;
    }

    public static final int SIZE_FIELD_NUMBER = 2;
    private long size_;
    /**
     * <code>uint64 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }

    public static final int ALLOCATION_TID_FIELD_NUMBER = 3;
    private long allocationTid_;
    /**
     * <code>uint64 allocation_tid = 3;</code>
     * @return The allocationTid.
     */
    @java.lang.Override
    public long getAllocationTid() {
      return allocationTid_;
    }

    public static final int ALLOCATION_BACKTRACE_FIELD_NUMBER = 4;
    private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> allocationBacktrace_;
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getAllocationBacktraceList() {
      return allocationBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getAllocationBacktraceOrBuilderList() {
      return allocationBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    @java.lang.Override
    public int getAllocationBacktraceCount() {
      return allocationBacktrace_.size();
    }
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrame getAllocationBacktrace(int index) {
      return allocationBacktrace_.get(index);
    }
    /**
     * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(
        int index) {
      return allocationBacktrace_.get(index);
    }

    public static final int DEALLOCATION_TID_FIELD_NUMBER = 5;
    private long deallocationTid_;
    /**
     * <code>uint64 deallocation_tid = 5;</code>
     * @return The deallocationTid.
     */
    @java.lang.Override
    public long getDeallocationTid() {
      return deallocationTid_;
    }

    public static final int DEALLOCATION_BACKTRACE_FIELD_NUMBER = 6;
    private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> deallocationBacktrace_;
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getDeallocationBacktraceList() {
      return deallocationBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getDeallocationBacktraceOrBuilderList() {
      return deallocationBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    @java.lang.Override
    public int getDeallocationBacktraceCount() {
      return deallocationBacktrace_.size();
    }
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrame getDeallocationBacktrace(int index) {
      return deallocationBacktrace_.get(index);
    }
    /**
     * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(
        int index) {
      return deallocationBacktrace_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (address_ != 0L) {
        output.writeUInt64(1, address_);
      }
      if (size_ != 0L) {
        output.writeUInt64(2, size_);
      }
      if (allocationTid_ != 0L) {
        output.writeUInt64(3, allocationTid_);
      }
      for (int i = 0; i < allocationBacktrace_.size(); i++) {
        output.writeMessage(4, allocationBacktrace_.get(i));
      }
      if (deallocationTid_ != 0L) {
        output.writeUInt64(5, deallocationTid_);
      }
      for (int i = 0; i < deallocationBacktrace_.size(); i++) {
        output.writeMessage(6, deallocationBacktrace_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (address_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, address_);
      }
      if (size_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, size_);
      }
      if (allocationTid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, allocationTid_);
      }
      for (int i = 0; i < allocationBacktrace_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, allocationBacktrace_.get(i));
      }
      if (deallocationTid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, deallocationTid_);
      }
      for (int i = 0; i < deallocationBacktrace_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, deallocationBacktrace_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.HeapObject)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.HeapObject other = (com.android.server.os.TombstoneProtos.HeapObject) obj;

      if (getAddress()
          != other.getAddress()) return false;
      if (getSize()
          != other.getSize()) return false;
      if (getAllocationTid()
          != other.getAllocationTid()) return false;
      if (!getAllocationBacktraceList()
          .equals(other.getAllocationBacktraceList())) return false;
      if (getDeallocationTid()
          != other.getDeallocationTid()) return false;
      if (!getDeallocationBacktraceList()
          .equals(other.getDeallocationBacktraceList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAddress());
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSize());
      hash = (37 * hash) + ALLOCATION_TID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAllocationTid());
      if (getAllocationBacktraceCount() > 0) {
        hash = (37 * hash) + ALLOCATION_BACKTRACE_FIELD_NUMBER;
        hash = (53 * hash) + getAllocationBacktraceList().hashCode();
      }
      hash = (37 * hash) + DEALLOCATION_TID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDeallocationTid());
      if (getDeallocationBacktraceCount() > 0) {
        hash = (37 * hash) + DEALLOCATION_BACKTRACE_FIELD_NUMBER;
        hash = (53 * hash) + getDeallocationBacktraceList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.HeapObject parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.HeapObject prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HeapObject}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HeapObject)
        com.android.server.os.TombstoneProtos.HeapObjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_HeapObject_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_HeapObject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.HeapObject.class, com.android.server.os.TombstoneProtos.HeapObject.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.HeapObject.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        address_ = 0L;

        size_ = 0L;

        allocationTid_ = 0L;

        if (allocationBacktraceBuilder_ == null) {
          allocationBacktrace_ = java.util.Collections.emptyList();
        } else {
          allocationBacktrace_ = null;
          allocationBacktraceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        deallocationTid_ = 0L;

        if (deallocationBacktraceBuilder_ == null) {
          deallocationBacktrace_ = java.util.Collections.emptyList();
        } else {
          deallocationBacktrace_ = null;
          deallocationBacktraceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_HeapObject_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.HeapObject getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.HeapObject build() {
        com.android.server.os.TombstoneProtos.HeapObject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.HeapObject buildPartial() {
        com.android.server.os.TombstoneProtos.HeapObject result = new com.android.server.os.TombstoneProtos.HeapObject(this);
        int from_bitField0_ = bitField0_;
        result.address_ = address_;
        result.size_ = size_;
        result.allocationTid_ = allocationTid_;
        if (allocationBacktraceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            allocationBacktrace_ = java.util.Collections.unmodifiableList(allocationBacktrace_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.allocationBacktrace_ = allocationBacktrace_;
        } else {
          result.allocationBacktrace_ = allocationBacktraceBuilder_.build();
        }
        result.deallocationTid_ = deallocationTid_;
        if (deallocationBacktraceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            deallocationBacktrace_ = java.util.Collections.unmodifiableList(deallocationBacktrace_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.deallocationBacktrace_ = deallocationBacktrace_;
        } else {
          result.deallocationBacktrace_ = deallocationBacktraceBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.HeapObject) {
          return mergeFrom((com.android.server.os.TombstoneProtos.HeapObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.HeapObject other) {
        if (other == com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance()) return this;
        if (other.getAddress() != 0L) {
          setAddress(other.getAddress());
        }
        if (other.getSize() != 0L) {
          setSize(other.getSize());
        }
        if (other.getAllocationTid() != 0L) {
          setAllocationTid(other.getAllocationTid());
        }
        if (allocationBacktraceBuilder_ == null) {
          if (!other.allocationBacktrace_.isEmpty()) {
            if (allocationBacktrace_.isEmpty()) {
              allocationBacktrace_ = other.allocationBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAllocationBacktraceIsMutable();
              allocationBacktrace_.addAll(other.allocationBacktrace_);
            }
            onChanged();
          }
        } else {
          if (!other.allocationBacktrace_.isEmpty()) {
            if (allocationBacktraceBuilder_.isEmpty()) {
              allocationBacktraceBuilder_.dispose();
              allocationBacktraceBuilder_ = null;
              allocationBacktrace_ = other.allocationBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000001);
              allocationBacktraceBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAllocationBacktraceFieldBuilder() : null;
            } else {
              allocationBacktraceBuilder_.addAllMessages(other.allocationBacktrace_);
            }
          }
        }
        if (other.getDeallocationTid() != 0L) {
          setDeallocationTid(other.getDeallocationTid());
        }
        if (deallocationBacktraceBuilder_ == null) {
          if (!other.deallocationBacktrace_.isEmpty()) {
            if (deallocationBacktrace_.isEmpty()) {
              deallocationBacktrace_ = other.deallocationBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDeallocationBacktraceIsMutable();
              deallocationBacktrace_.addAll(other.deallocationBacktrace_);
            }
            onChanged();
          }
        } else {
          if (!other.deallocationBacktrace_.isEmpty()) {
            if (deallocationBacktraceBuilder_.isEmpty()) {
              deallocationBacktraceBuilder_.dispose();
              deallocationBacktraceBuilder_ = null;
              deallocationBacktrace_ = other.deallocationBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000002);
              deallocationBacktraceBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeallocationBacktraceFieldBuilder() : null;
            } else {
              deallocationBacktraceBuilder_.addAllMessages(other.deallocationBacktrace_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                address_ = input.readUInt64();

                break;
              } // case 8
              case 16: {
                size_ = input.readUInt64();

                break;
              } // case 16
              case 24: {
                allocationTid_ = input.readUInt64();

                break;
              } // case 24
              case 34: {
                com.android.server.os.TombstoneProtos.BacktraceFrame m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.BacktraceFrame.parser(),
                        extensionRegistry);
                if (allocationBacktraceBuilder_ == null) {
                  ensureAllocationBacktraceIsMutable();
                  allocationBacktrace_.add(m);
                } else {
                  allocationBacktraceBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 40: {
                deallocationTid_ = input.readUInt64();

                break;
              } // case 40
              case 50: {
                com.android.server.os.TombstoneProtos.BacktraceFrame m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.BacktraceFrame.parser(),
                        extensionRegistry);
                if (deallocationBacktraceBuilder_ == null) {
                  ensureDeallocationBacktraceIsMutable();
                  deallocationBacktrace_.add(m);
                } else {
                  deallocationBacktraceBuilder_.addMessage(m);
                }
                break;
              } // case 50
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long address_ ;
      /**
       * <code>uint64 address = 1;</code>
       * @return The address.
       */
      @java.lang.Override
      public long getAddress() {
        return address_;
      }
      /**
       * <code>uint64 address = 1;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(long value) {

        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 address = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {

        address_ = 0L;
        onChanged();
        return this;
      }

      private long size_ ;
      /**
       * <code>uint64 size = 2;</code>
       * @return The size.
       */
      @java.lang.Override
      public long getSize() {
        return size_;
      }
      /**
       * <code>uint64 size = 2;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(long value) {

        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 size = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {

        size_ = 0L;
        onChanged();
        return this;
      }

      private long allocationTid_ ;
      /**
       * <code>uint64 allocation_tid = 3;</code>
       * @return The allocationTid.
       */
      @java.lang.Override
      public long getAllocationTid() {
        return allocationTid_;
      }
      /**
       * <code>uint64 allocation_tid = 3;</code>
       * @param value The allocationTid to set.
       * @return This builder for chaining.
       */
      public Builder setAllocationTid(long value) {

        allocationTid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 allocation_tid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocationTid() {

        allocationTid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> allocationBacktrace_ =
        java.util.Collections.emptyList();
      private void ensureAllocationBacktraceIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          allocationBacktrace_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.BacktraceFrame>(allocationBacktrace_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder> allocationBacktraceBuilder_;

      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getAllocationBacktraceList() {
        if (allocationBacktraceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allocationBacktrace_);
        } else {
          return allocationBacktraceBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public int getAllocationBacktraceCount() {
        if (allocationBacktraceBuilder_ == null) {
          return allocationBacktrace_.size();
        } else {
          return allocationBacktraceBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame getAllocationBacktrace(int index) {
        if (allocationBacktraceBuilder_ == null) {
          return allocationBacktrace_.get(index);
        } else {
          return allocationBacktraceBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder setAllocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (allocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.set(index, value);
          onChanged();
        } else {
          allocationBacktraceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder setAllocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (allocationBacktraceBuilder_ == null) {
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.set(index, builderForValue.build());
          onChanged();
        } else {
          allocationBacktraceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder addAllocationBacktrace(com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (allocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.add(value);
          onChanged();
        } else {
          allocationBacktraceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder addAllocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (allocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.add(index, value);
          onChanged();
        } else {
          allocationBacktraceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder addAllocationBacktrace(
          com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (allocationBacktraceBuilder_ == null) {
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.add(builderForValue.build());
          onChanged();
        } else {
          allocationBacktraceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder addAllocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (allocationBacktraceBuilder_ == null) {
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.add(index, builderForValue.build());
          onChanged();
        } else {
          allocationBacktraceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder addAllAllocationBacktrace(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.BacktraceFrame> values) {
        if (allocationBacktraceBuilder_ == null) {
          ensureAllocationBacktraceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, allocationBacktrace_);
          onChanged();
        } else {
          allocationBacktraceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder clearAllocationBacktrace() {
        if (allocationBacktraceBuilder_ == null) {
          allocationBacktrace_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          allocationBacktraceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public Builder removeAllocationBacktrace(int index) {
        if (allocationBacktraceBuilder_ == null) {
          ensureAllocationBacktraceIsMutable();
          allocationBacktrace_.remove(index);
          onChanged();
        } else {
          allocationBacktraceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder getAllocationBacktraceBuilder(
          int index) {
        return getAllocationBacktraceFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(
          int index) {
        if (allocationBacktraceBuilder_ == null) {
          return allocationBacktrace_.get(index);  } else {
          return allocationBacktraceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
           getAllocationBacktraceOrBuilderList() {
        if (allocationBacktraceBuilder_ != null) {
          return allocationBacktraceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allocationBacktrace_);
        }
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addAllocationBacktraceBuilder() {
        return getAllocationBacktraceFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addAllocationBacktraceBuilder(
          int index) {
        return getAllocationBacktraceFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame allocation_backtrace = 4;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame.Builder>
           getAllocationBacktraceBuilderList() {
        return getAllocationBacktraceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
          getAllocationBacktraceFieldBuilder() {
        if (allocationBacktraceBuilder_ == null) {
          allocationBacktraceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>(
                  allocationBacktrace_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          allocationBacktrace_ = null;
        }
        return allocationBacktraceBuilder_;
      }

      private long deallocationTid_ ;
      /**
       * <code>uint64 deallocation_tid = 5;</code>
       * @return The deallocationTid.
       */
      @java.lang.Override
      public long getDeallocationTid() {
        return deallocationTid_;
      }
      /**
       * <code>uint64 deallocation_tid = 5;</code>
       * @param value The deallocationTid to set.
       * @return This builder for chaining.
       */
      public Builder setDeallocationTid(long value) {

        deallocationTid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 deallocation_tid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeallocationTid() {

        deallocationTid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> deallocationBacktrace_ =
        java.util.Collections.emptyList();
      private void ensureDeallocationBacktraceIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          deallocationBacktrace_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.BacktraceFrame>(deallocationBacktrace_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder> deallocationBacktraceBuilder_;

      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getDeallocationBacktraceList() {
        if (deallocationBacktraceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(deallocationBacktrace_);
        } else {
          return deallocationBacktraceBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public int getDeallocationBacktraceCount() {
        if (deallocationBacktraceBuilder_ == null) {
          return deallocationBacktrace_.size();
        } else {
          return deallocationBacktraceBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame getDeallocationBacktrace(int index) {
        if (deallocationBacktraceBuilder_ == null) {
          return deallocationBacktrace_.get(index);
        } else {
          return deallocationBacktraceBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder setDeallocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (deallocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.set(index, value);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder setDeallocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (deallocationBacktraceBuilder_ == null) {
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.set(index, builderForValue.build());
          onChanged();
        } else {
          deallocationBacktraceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder addDeallocationBacktrace(com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (deallocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.add(value);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder addDeallocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (deallocationBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.add(index, value);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder addDeallocationBacktrace(
          com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (deallocationBacktraceBuilder_ == null) {
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.add(builderForValue.build());
          onChanged();
        } else {
          deallocationBacktraceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder addDeallocationBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (deallocationBacktraceBuilder_ == null) {
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.add(index, builderForValue.build());
          onChanged();
        } else {
          deallocationBacktraceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder addAllDeallocationBacktrace(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.BacktraceFrame> values) {
        if (deallocationBacktraceBuilder_ == null) {
          ensureDeallocationBacktraceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, deallocationBacktrace_);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder clearDeallocationBacktrace() {
        if (deallocationBacktraceBuilder_ == null) {
          deallocationBacktrace_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public Builder removeDeallocationBacktrace(int index) {
        if (deallocationBacktraceBuilder_ == null) {
          ensureDeallocationBacktraceIsMutable();
          deallocationBacktrace_.remove(index);
          onChanged();
        } else {
          deallocationBacktraceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder getDeallocationBacktraceBuilder(
          int index) {
        return getDeallocationBacktraceFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(
          int index) {
        if (deallocationBacktraceBuilder_ == null) {
          return deallocationBacktrace_.get(index);  } else {
          return deallocationBacktraceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
           getDeallocationBacktraceOrBuilderList() {
        if (deallocationBacktraceBuilder_ != null) {
          return deallocationBacktraceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(deallocationBacktrace_);
        }
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addDeallocationBacktraceBuilder() {
        return getDeallocationBacktraceFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addDeallocationBacktraceBuilder(
          int index) {
        return getDeallocationBacktraceFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame deallocation_backtrace = 6;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame.Builder>
           getDeallocationBacktraceBuilderList() {
        return getDeallocationBacktraceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
          getDeallocationBacktraceFieldBuilder() {
        if (deallocationBacktraceBuilder_ == null) {
          deallocationBacktraceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>(
                  deallocationBacktrace_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          deallocationBacktrace_ = null;
        }
        return deallocationBacktraceBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HeapObject)
    }

    // @@protoc_insertion_point(class_scope:HeapObject)
    private static final com.android.server.os.TombstoneProtos.HeapObject DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.HeapObject();
    }

    public static com.android.server.os.TombstoneProtos.HeapObject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HeapObject>
        PARSER = new com.google.protobuf.AbstractParser<HeapObject>() {
      @java.lang.Override
      public HeapObject parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<HeapObject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HeapObject> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.HeapObject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MemoryErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MemoryError)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MemoryError.Tool tool = 1;</code>
     * @return The enum numeric value on the wire for tool.
     */
    int getToolValue();
    /**
     * <code>.MemoryError.Tool tool = 1;</code>
     * @return The tool.
     */
    com.android.server.os.TombstoneProtos.MemoryError.Tool getTool();

    /**
     * <code>.MemoryError.Type type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.MemoryError.Type type = 2;</code>
     * @return The type.
     */
    com.android.server.os.TombstoneProtos.MemoryError.Type getType();

    /**
     * <code>.HeapObject heap = 3;</code>
     * @return Whether the heap field is set.
     */
    boolean hasHeap();
    /**
     * <code>.HeapObject heap = 3;</code>
     * @return The heap.
     */
    com.android.server.os.TombstoneProtos.HeapObject getHeap();
    /**
     * <code>.HeapObject heap = 3;</code>
     */
    com.android.server.os.TombstoneProtos.HeapObjectOrBuilder getHeapOrBuilder();

    public com.android.server.os.TombstoneProtos.MemoryError.LocationCase getLocationCase();
  }
  /**
   * Protobuf type {@code MemoryError}
   */
  public static final class MemoryError extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MemoryError)
      MemoryErrorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MemoryError.newBuilder() to construct.
    private MemoryError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MemoryError() {
      tool_ = 0;
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MemoryError();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.MemoryError.class, com.android.server.os.TombstoneProtos.MemoryError.Builder.class);
    }

    /**
     * Protobuf enum {@code MemoryError.Tool}
     */
    public enum Tool
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>GWP_ASAN = 0;</code>
       */
      GWP_ASAN(0),
      /**
       * <code>SCUDO = 1;</code>
       */
      SCUDO(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>GWP_ASAN = 0;</code>
       */
      public static final int GWP_ASAN_VALUE = 0;
      /**
       * <code>SCUDO = 1;</code>
       */
      public static final int SCUDO_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Tool valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Tool forNumber(int value) {
        switch (value) {
          case 0: return GWP_ASAN;
          case 1: return SCUDO;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Tool>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Tool> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Tool>() {
              public Tool findValueByNumber(int number) {
                return Tool.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.MemoryError.getDescriptor().getEnumTypes().get(0);
      }

      private static final Tool[] VALUES = values();

      public static Tool valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Tool(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MemoryError.Tool)
    }

    /**
     * Protobuf enum {@code MemoryError.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>USE_AFTER_FREE = 1;</code>
       */
      USE_AFTER_FREE(1),
      /**
       * <code>DOUBLE_FREE = 2;</code>
       */
      DOUBLE_FREE(2),
      /**
       * <code>INVALID_FREE = 3;</code>
       */
      INVALID_FREE(3),
      /**
       * <code>BUFFER_OVERFLOW = 4;</code>
       */
      BUFFER_OVERFLOW(4),
      /**
       * <code>BUFFER_UNDERFLOW = 5;</code>
       */
      BUFFER_UNDERFLOW(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>USE_AFTER_FREE = 1;</code>
       */
      public static final int USE_AFTER_FREE_VALUE = 1;
      /**
       * <code>DOUBLE_FREE = 2;</code>
       */
      public static final int DOUBLE_FREE_VALUE = 2;
      /**
       * <code>INVALID_FREE = 3;</code>
       */
      public static final int INVALID_FREE_VALUE = 3;
      /**
       * <code>BUFFER_OVERFLOW = 4;</code>
       */
      public static final int BUFFER_OVERFLOW_VALUE = 4;
      /**
       * <code>BUFFER_UNDERFLOW = 5;</code>
       */
      public static final int BUFFER_UNDERFLOW_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return USE_AFTER_FREE;
          case 2: return DOUBLE_FREE;
          case 3: return INVALID_FREE;
          case 4: return BUFFER_OVERFLOW;
          case 5: return BUFFER_UNDERFLOW;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.MemoryError.getDescriptor().getEnumTypes().get(1);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MemoryError.Type)
    }

    private int locationCase_ = 0;
    private java.lang.Object location_;
    public enum LocationCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      HEAP(3),
      LOCATION_NOT_SET(0);
      private final int value;
      private LocationCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static LocationCase valueOf(int value) {
        return forNumber(value);
      }

      public static LocationCase forNumber(int value) {
        switch (value) {
          case 3: return HEAP;
          case 0: return LOCATION_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public LocationCase
    getLocationCase() {
      return LocationCase.forNumber(
          locationCase_);
    }

    public static final int TOOL_FIELD_NUMBER = 1;
    private int tool_;
    /**
     * <code>.MemoryError.Tool tool = 1;</code>
     * @return The enum numeric value on the wire for tool.
     */
    @java.lang.Override public int getToolValue() {
      return tool_;
    }
    /**
     * <code>.MemoryError.Tool tool = 1;</code>
     * @return The tool.
     */
    @java.lang.Override public com.android.server.os.TombstoneProtos.MemoryError.Tool getTool() {
      @SuppressWarnings("deprecation")
      com.android.server.os.TombstoneProtos.MemoryError.Tool result = com.android.server.os.TombstoneProtos.MemoryError.Tool.valueOf(tool_);
      return result == null ? com.android.server.os.TombstoneProtos.MemoryError.Tool.UNRECOGNIZED : result;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>.MemoryError.Type type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.MemoryError.Type type = 2;</code>
     * @return The type.
     */
    @java.lang.Override public com.android.server.os.TombstoneProtos.MemoryError.Type getType() {
      @SuppressWarnings("deprecation")
      com.android.server.os.TombstoneProtos.MemoryError.Type result = com.android.server.os.TombstoneProtos.MemoryError.Type.valueOf(type_);
      return result == null ? com.android.server.os.TombstoneProtos.MemoryError.Type.UNRECOGNIZED : result;
    }

    public static final int HEAP_FIELD_NUMBER = 3;
    /**
     * <code>.HeapObject heap = 3;</code>
     * @return Whether the heap field is set.
     */
    @java.lang.Override
    public boolean hasHeap() {
      return locationCase_ == 3;
    }
    /**
     * <code>.HeapObject heap = 3;</code>
     * @return The heap.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.HeapObject getHeap() {
      if (locationCase_ == 3) {
         return (com.android.server.os.TombstoneProtos.HeapObject) location_;
      }
      return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
    }
    /**
     * <code>.HeapObject heap = 3;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.HeapObjectOrBuilder getHeapOrBuilder() {
      if (locationCase_ == 3) {
         return (com.android.server.os.TombstoneProtos.HeapObject) location_;
      }
      return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (tool_ != com.android.server.os.TombstoneProtos.MemoryError.Tool.GWP_ASAN.getNumber()) {
        output.writeEnum(1, tool_);
      }
      if (type_ != com.android.server.os.TombstoneProtos.MemoryError.Type.UNKNOWN.getNumber()) {
        output.writeEnum(2, type_);
      }
      if (locationCase_ == 3) {
        output.writeMessage(3, (com.android.server.os.TombstoneProtos.HeapObject) location_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tool_ != com.android.server.os.TombstoneProtos.MemoryError.Tool.GWP_ASAN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, tool_);
      }
      if (type_ != com.android.server.os.TombstoneProtos.MemoryError.Type.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (locationCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (com.android.server.os.TombstoneProtos.HeapObject) location_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.MemoryError)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.MemoryError other = (com.android.server.os.TombstoneProtos.MemoryError) obj;

      if (tool_ != other.tool_) return false;
      if (type_ != other.type_) return false;
      if (!getLocationCase().equals(other.getLocationCase())) return false;
      switch (locationCase_) {
        case 3:
          if (!getHeap()
              .equals(other.getHeap())) return false;
          break;
        case 0:
        default:
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TOOL_FIELD_NUMBER;
      hash = (53 * hash) + tool_;
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      switch (locationCase_) {
        case 3:
          hash = (37 * hash) + HEAP_FIELD_NUMBER;
          hash = (53 * hash) + getHeap().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.MemoryError prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MemoryError}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MemoryError)
        com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryError_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.MemoryError.class, com.android.server.os.TombstoneProtos.MemoryError.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.MemoryError.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tool_ = 0;

        type_ = 0;

        if (heapBuilder_ != null) {
          heapBuilder_.clear();
        }
        locationCase_ = 0;
        location_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryError_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError build() {
        com.android.server.os.TombstoneProtos.MemoryError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError buildPartial() {
        com.android.server.os.TombstoneProtos.MemoryError result = new com.android.server.os.TombstoneProtos.MemoryError(this);
        result.tool_ = tool_;
        result.type_ = type_;
        if (locationCase_ == 3) {
          if (heapBuilder_ == null) {
            result.location_ = location_;
          } else {
            result.location_ = heapBuilder_.build();
          }
        }
        result.locationCase_ = locationCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.MemoryError) {
          return mergeFrom((com.android.server.os.TombstoneProtos.MemoryError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.MemoryError other) {
        if (other == com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance()) return this;
        if (other.tool_ != 0) {
          setToolValue(other.getToolValue());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        switch (other.getLocationCase()) {
          case HEAP: {
            mergeHeap(other.getHeap());
            break;
          }
          case LOCATION_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                tool_ = input.readEnum();

                break;
              } // case 8
              case 16: {
                type_ = input.readEnum();

                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getHeapFieldBuilder().getBuilder(),
                    extensionRegistry);
                locationCase_ = 3;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int locationCase_ = 0;
      private java.lang.Object location_;
      public LocationCase
          getLocationCase() {
        return LocationCase.forNumber(
            locationCase_);
      }

      public Builder clearLocation() {
        locationCase_ = 0;
        location_ = null;
        onChanged();
        return this;
      }


      private int tool_ = 0;
      /**
       * <code>.MemoryError.Tool tool = 1;</code>
       * @return The enum numeric value on the wire for tool.
       */
      @java.lang.Override public int getToolValue() {
        return tool_;
      }
      /**
       * <code>.MemoryError.Tool tool = 1;</code>
       * @param value The enum numeric value on the wire for tool to set.
       * @return This builder for chaining.
       */
      public Builder setToolValue(int value) {

        tool_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MemoryError.Tool tool = 1;</code>
       * @return The tool.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError.Tool getTool() {
        @SuppressWarnings("deprecation")
        com.android.server.os.TombstoneProtos.MemoryError.Tool result = com.android.server.os.TombstoneProtos.MemoryError.Tool.valueOf(tool_);
        return result == null ? com.android.server.os.TombstoneProtos.MemoryError.Tool.UNRECOGNIZED : result;
      }
      /**
       * <code>.MemoryError.Tool tool = 1;</code>
       * @param value The tool to set.
       * @return This builder for chaining.
       */
      public Builder setTool(com.android.server.os.TombstoneProtos.MemoryError.Tool value) {
        if (value == null) {
          throw new NullPointerException();
        }

        tool_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MemoryError.Tool tool = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTool() {

        tool_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.MemoryError.Type type = 2;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.MemoryError.Type type = 2;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MemoryError.Type type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError.Type getType() {
        @SuppressWarnings("deprecation")
        com.android.server.os.TombstoneProtos.MemoryError.Type result = com.android.server.os.TombstoneProtos.MemoryError.Type.valueOf(type_);
        return result == null ? com.android.server.os.TombstoneProtos.MemoryError.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.MemoryError.Type type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(com.android.server.os.TombstoneProtos.MemoryError.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }

        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MemoryError.Type type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.HeapObject, com.android.server.os.TombstoneProtos.HeapObject.Builder, com.android.server.os.TombstoneProtos.HeapObjectOrBuilder> heapBuilder_;
      /**
       * <code>.HeapObject heap = 3;</code>
       * @return Whether the heap field is set.
       */
      @java.lang.Override
      public boolean hasHeap() {
        return locationCase_ == 3;
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       * @return The heap.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.HeapObject getHeap() {
        if (heapBuilder_ == null) {
          if (locationCase_ == 3) {
            return (com.android.server.os.TombstoneProtos.HeapObject) location_;
          }
          return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
        } else {
          if (locationCase_ == 3) {
            return heapBuilder_.getMessage();
          }
          return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
        }
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      public Builder setHeap(com.android.server.os.TombstoneProtos.HeapObject value) {
        if (heapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          location_ = value;
          onChanged();
        } else {
          heapBuilder_.setMessage(value);
        }
        locationCase_ = 3;
        return this;
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      public Builder setHeap(
          com.android.server.os.TombstoneProtos.HeapObject.Builder builderForValue) {
        if (heapBuilder_ == null) {
          location_ = builderForValue.build();
          onChanged();
        } else {
          heapBuilder_.setMessage(builderForValue.build());
        }
        locationCase_ = 3;
        return this;
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      public Builder mergeHeap(com.android.server.os.TombstoneProtos.HeapObject value) {
        if (heapBuilder_ == null) {
          if (locationCase_ == 3 &&
              location_ != com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance()) {
            location_ = com.android.server.os.TombstoneProtos.HeapObject.newBuilder((com.android.server.os.TombstoneProtos.HeapObject) location_)
                .mergeFrom(value).buildPartial();
          } else {
            location_ = value;
          }
          onChanged();
        } else {
          if (locationCase_ == 3) {
            heapBuilder_.mergeFrom(value);
          }
          heapBuilder_.setMessage(value);
        }
        locationCase_ = 3;
        return this;
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      public Builder clearHeap() {
        if (heapBuilder_ == null) {
          if (locationCase_ == 3) {
            locationCase_ = 0;
            location_ = null;
            onChanged();
          }
        } else {
          if (locationCase_ == 3) {
            locationCase_ = 0;
            location_ = null;
          }
          heapBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.HeapObject.Builder getHeapBuilder() {
        return getHeapFieldBuilder().getBuilder();
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.HeapObjectOrBuilder getHeapOrBuilder() {
        if ((locationCase_ == 3) && (heapBuilder_ != null)) {
          return heapBuilder_.getMessageOrBuilder();
        } else {
          if (locationCase_ == 3) {
            return (com.android.server.os.TombstoneProtos.HeapObject) location_;
          }
          return com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
        }
      }
      /**
       * <code>.HeapObject heap = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.HeapObject, com.android.server.os.TombstoneProtos.HeapObject.Builder, com.android.server.os.TombstoneProtos.HeapObjectOrBuilder>
          getHeapFieldBuilder() {
        if (heapBuilder_ == null) {
          if (!(locationCase_ == 3)) {
            location_ = com.android.server.os.TombstoneProtos.HeapObject.getDefaultInstance();
          }
          heapBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.HeapObject, com.android.server.os.TombstoneProtos.HeapObject.Builder, com.android.server.os.TombstoneProtos.HeapObjectOrBuilder>(
                  (com.android.server.os.TombstoneProtos.HeapObject) location_,
                  getParentForChildren(),
                  isClean());
          location_ = null;
        }
        locationCase_ = 3;
        onChanged();;
        return heapBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MemoryError)
    }

    // @@protoc_insertion_point(class_scope:MemoryError)
    private static final com.android.server.os.TombstoneProtos.MemoryError DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.MemoryError();
    }

    public static com.android.server.os.TombstoneProtos.MemoryError getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MemoryError>
        PARSER = new com.google.protobuf.AbstractParser<MemoryError>() {
      @java.lang.Override
      public MemoryError parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<MemoryError> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MemoryError> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryError getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CauseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Cause)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string human_readable = 1;</code>
     * @return The humanReadable.
     */
    java.lang.String getHumanReadable();
    /**
     * <code>string human_readable = 1;</code>
     * @return The bytes for humanReadable.
     */
    com.google.protobuf.ByteString
        getHumanReadableBytes();

    /**
     * <code>.MemoryError memory_error = 2;</code>
     * @return Whether the memoryError field is set.
     */
    boolean hasMemoryError();
    /**
     * <code>.MemoryError memory_error = 2;</code>
     * @return The memoryError.
     */
    com.android.server.os.TombstoneProtos.MemoryError getMemoryError();
    /**
     * <code>.MemoryError memory_error = 2;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder getMemoryErrorOrBuilder();

    public com.android.server.os.TombstoneProtos.Cause.DetailsCase getDetailsCase();
  }
  /**
   * Protobuf type {@code Cause}
   */
  public static final class Cause extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Cause)
      CauseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Cause.newBuilder() to construct.
    private Cause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Cause() {
      humanReadable_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Cause();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_Cause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_Cause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.Cause.class, com.android.server.os.TombstoneProtos.Cause.Builder.class);
    }

    private int detailsCase_ = 0;
    private java.lang.Object details_;
    public enum DetailsCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      MEMORY_ERROR(2),
      DETAILS_NOT_SET(0);
      private final int value;
      private DetailsCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailsCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailsCase forNumber(int value) {
        switch (value) {
          case 2: return MEMORY_ERROR;
          case 0: return DETAILS_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailsCase
    getDetailsCase() {
      return DetailsCase.forNumber(
          detailsCase_);
    }

    public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
    private volatile java.lang.Object humanReadable_;
    /**
     * <code>string human_readable = 1;</code>
     * @return The humanReadable.
     */
    @java.lang.Override
    public java.lang.String getHumanReadable() {
      java.lang.Object ref = humanReadable_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        humanReadable_ = s;
        return s;
      }
    }
    /**
     * <code>string human_readable = 1;</code>
     * @return The bytes for humanReadable.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHumanReadableBytes() {
      java.lang.Object ref = humanReadable_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        humanReadable_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
    /**
     * <code>.MemoryError memory_error = 2;</code>
     * @return Whether the memoryError field is set.
     */
    @java.lang.Override
    public boolean hasMemoryError() {
      return detailsCase_ == 2;
    }
    /**
     * <code>.MemoryError memory_error = 2;</code>
     * @return The memoryError.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryError getMemoryError() {
      if (detailsCase_ == 2) {
         return (com.android.server.os.TombstoneProtos.MemoryError) details_;
      }
      return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
    }
    /**
     * <code>.MemoryError memory_error = 2;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder getMemoryErrorOrBuilder() {
      if (detailsCase_ == 2) {
         return (com.android.server.os.TombstoneProtos.MemoryError) details_;
      }
      return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(humanReadable_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, humanReadable_);
      }
      if (detailsCase_ == 2) {
        output.writeMessage(2, (com.android.server.os.TombstoneProtos.MemoryError) details_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(humanReadable_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, humanReadable_);
      }
      if (detailsCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (com.android.server.os.TombstoneProtos.MemoryError) details_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.Cause)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.Cause other = (com.android.server.os.TombstoneProtos.Cause) obj;

      if (!getHumanReadable()
          .equals(other.getHumanReadable())) return false;
      if (!getDetailsCase().equals(other.getDetailsCase())) return false;
      switch (detailsCase_) {
        case 2:
          if (!getMemoryError()
              .equals(other.getMemoryError())) return false;
          break;
        case 0:
        default:
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HUMAN_READABLE_FIELD_NUMBER;
      hash = (53 * hash) + getHumanReadable().hashCode();
      switch (detailsCase_) {
        case 2:
          hash = (37 * hash) + MEMORY_ERROR_FIELD_NUMBER;
          hash = (53 * hash) + getMemoryError().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Cause parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.Cause prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Cause}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Cause)
        com.android.server.os.TombstoneProtos.CauseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_Cause_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_Cause_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.Cause.class, com.android.server.os.TombstoneProtos.Cause.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.Cause.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        humanReadable_ = "";

        if (memoryErrorBuilder_ != null) {
          memoryErrorBuilder_.clear();
        }
        detailsCase_ = 0;
        details_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_Cause_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Cause getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.Cause.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Cause build() {
        com.android.server.os.TombstoneProtos.Cause result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Cause buildPartial() {
        com.android.server.os.TombstoneProtos.Cause result = new com.android.server.os.TombstoneProtos.Cause(this);
        result.humanReadable_ = humanReadable_;
        if (detailsCase_ == 2) {
          if (memoryErrorBuilder_ == null) {
            result.details_ = details_;
          } else {
            result.details_ = memoryErrorBuilder_.build();
          }
        }
        result.detailsCase_ = detailsCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.Cause) {
          return mergeFrom((com.android.server.os.TombstoneProtos.Cause)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.Cause other) {
        if (other == com.android.server.os.TombstoneProtos.Cause.getDefaultInstance()) return this;
        if (!other.getHumanReadable().isEmpty()) {
          humanReadable_ = other.humanReadable_;
          onChanged();
        }
        switch (other.getDetailsCase()) {
          case MEMORY_ERROR: {
            mergeMemoryError(other.getMemoryError());
            break;
          }
          case DETAILS_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                humanReadable_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getMemoryErrorFieldBuilder().getBuilder(),
                    extensionRegistry);
                detailsCase_ = 2;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int detailsCase_ = 0;
      private java.lang.Object details_;
      public DetailsCase
          getDetailsCase() {
        return DetailsCase.forNumber(
            detailsCase_);
      }

      public Builder clearDetails() {
        detailsCase_ = 0;
        details_ = null;
        onChanged();
        return this;
      }


      private java.lang.Object humanReadable_ = "";
      /**
       * <code>string human_readable = 1;</code>
       * @return The humanReadable.
       */
      public java.lang.String getHumanReadable() {
        java.lang.Object ref = humanReadable_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          humanReadable_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string human_readable = 1;</code>
       * @return The bytes for humanReadable.
       */
      public com.google.protobuf.ByteString
          getHumanReadableBytes() {
        java.lang.Object ref = humanReadable_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          humanReadable_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string human_readable = 1;</code>
       * @param value The humanReadable to set.
       * @return This builder for chaining.
       */
      public Builder setHumanReadable(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        humanReadable_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string human_readable = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHumanReadable() {

        humanReadable_ = getDefaultInstance().getHumanReadable();
        onChanged();
        return this;
      }
      /**
       * <code>string human_readable = 1;</code>
       * @param value The bytes for humanReadable to set.
       * @return This builder for chaining.
       */
      public Builder setHumanReadableBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        humanReadable_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryError, com.android.server.os.TombstoneProtos.MemoryError.Builder, com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder> memoryErrorBuilder_;
      /**
       * <code>.MemoryError memory_error = 2;</code>
       * @return Whether the memoryError field is set.
       */
      @java.lang.Override
      public boolean hasMemoryError() {
        return detailsCase_ == 2;
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       * @return The memoryError.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryError getMemoryError() {
        if (memoryErrorBuilder_ == null) {
          if (detailsCase_ == 2) {
            return (com.android.server.os.TombstoneProtos.MemoryError) details_;
          }
          return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
        } else {
          if (detailsCase_ == 2) {
            return memoryErrorBuilder_.getMessage();
          }
          return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
        }
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      public Builder setMemoryError(com.android.server.os.TombstoneProtos.MemoryError value) {
        if (memoryErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          details_ = value;
          onChanged();
        } else {
          memoryErrorBuilder_.setMessage(value);
        }
        detailsCase_ = 2;
        return this;
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      public Builder setMemoryError(
          com.android.server.os.TombstoneProtos.MemoryError.Builder builderForValue) {
        if (memoryErrorBuilder_ == null) {
          details_ = builderForValue.build();
          onChanged();
        } else {
          memoryErrorBuilder_.setMessage(builderForValue.build());
        }
        detailsCase_ = 2;
        return this;
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      public Builder mergeMemoryError(com.android.server.os.TombstoneProtos.MemoryError value) {
        if (memoryErrorBuilder_ == null) {
          if (detailsCase_ == 2 &&
              details_ != com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance()) {
            details_ = com.android.server.os.TombstoneProtos.MemoryError.newBuilder((com.android.server.os.TombstoneProtos.MemoryError) details_)
                .mergeFrom(value).buildPartial();
          } else {
            details_ = value;
          }
          onChanged();
        } else {
          if (detailsCase_ == 2) {
            memoryErrorBuilder_.mergeFrom(value);
          }
          memoryErrorBuilder_.setMessage(value);
        }
        detailsCase_ = 2;
        return this;
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      public Builder clearMemoryError() {
        if (memoryErrorBuilder_ == null) {
          if (detailsCase_ == 2) {
            detailsCase_ = 0;
            details_ = null;
            onChanged();
          }
        } else {
          if (detailsCase_ == 2) {
            detailsCase_ = 0;
            details_ = null;
          }
          memoryErrorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryError.Builder getMemoryErrorBuilder() {
        return getMemoryErrorFieldBuilder().getBuilder();
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder getMemoryErrorOrBuilder() {
        if ((detailsCase_ == 2) && (memoryErrorBuilder_ != null)) {
          return memoryErrorBuilder_.getMessageOrBuilder();
        } else {
          if (detailsCase_ == 2) {
            return (com.android.server.os.TombstoneProtos.MemoryError) details_;
          }
          return com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
        }
      }
      /**
       * <code>.MemoryError memory_error = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryError, com.android.server.os.TombstoneProtos.MemoryError.Builder, com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder>
          getMemoryErrorFieldBuilder() {
        if (memoryErrorBuilder_ == null) {
          if (!(detailsCase_ == 2)) {
            details_ = com.android.server.os.TombstoneProtos.MemoryError.getDefaultInstance();
          }
          memoryErrorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.MemoryError, com.android.server.os.TombstoneProtos.MemoryError.Builder, com.android.server.os.TombstoneProtos.MemoryErrorOrBuilder>(
                  (com.android.server.os.TombstoneProtos.MemoryError) details_,
                  getParentForChildren(),
                  isClean());
          details_ = null;
        }
        detailsCase_ = 2;
        onChanged();;
        return memoryErrorBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Cause)
    }

    // @@protoc_insertion_point(class_scope:Cause)
    private static final com.android.server.os.TombstoneProtos.Cause DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.Cause();
    }

    public static com.android.server.os.TombstoneProtos.Cause getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Cause>
        PARSER = new com.google.protobuf.AbstractParser<Cause>() {
      @java.lang.Override
      public Cause parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Cause> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Cause> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Cause getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RegisterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Register)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>uint64 u64 = 2;</code>
     * @return The u64.
     */
    long getU64();
  }
  /**
   * Protobuf type {@code Register}
   */
  public static final class Register extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Register)
      RegisterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Register.newBuilder() to construct.
    private Register(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Register() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Register();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_Register_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_Register_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.Register.class, com.android.server.os.TombstoneProtos.Register.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int U64_FIELD_NUMBER = 2;
    private long u64_;
    /**
     * <code>uint64 u64 = 2;</code>
     * @return The u64.
     */
    @java.lang.Override
    public long getU64() {
      return u64_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (u64_ != 0L) {
        output.writeUInt64(2, u64_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (u64_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, u64_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.Register)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.Register other = (com.android.server.os.TombstoneProtos.Register) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getU64()
          != other.getU64()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + U64_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getU64());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Register parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Register parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Register parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.Register prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Register}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Register)
        com.android.server.os.TombstoneProtos.RegisterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_Register_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_Register_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.Register.class, com.android.server.os.TombstoneProtos.Register.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.Register.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        u64_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_Register_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Register getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.Register.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Register build() {
        com.android.server.os.TombstoneProtos.Register result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Register buildPartial() {
        com.android.server.os.TombstoneProtos.Register result = new com.android.server.os.TombstoneProtos.Register(this);
        result.name_ = name_;
        result.u64_ = u64_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.Register) {
          return mergeFrom((com.android.server.os.TombstoneProtos.Register)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.Register other) {
        if (other == com.android.server.os.TombstoneProtos.Register.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getU64() != 0L) {
          setU64(other.getU64());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 16: {
                u64_ = input.readUInt64();

                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private long u64_ ;
      /**
       * <code>uint64 u64 = 2;</code>
       * @return The u64.
       */
      @java.lang.Override
      public long getU64() {
        return u64_;
      }
      /**
       * <code>uint64 u64 = 2;</code>
       * @param value The u64 to set.
       * @return This builder for chaining.
       */
      public Builder setU64(long value) {

        u64_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 u64 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearU64() {

        u64_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Register)
    }

    // @@protoc_insertion_point(class_scope:Register)
    private static final com.android.server.os.TombstoneProtos.Register DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.Register();
    }

    public static com.android.server.os.TombstoneProtos.Register getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Register>
        PARSER = new com.google.protobuf.AbstractParser<Register>() {
      @java.lang.Override
      public Register parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Register> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Register> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Register getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ThreadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Thread)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>repeated .Register registers = 3;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.Register>
        getRegistersList();
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    com.android.server.os.TombstoneProtos.Register getRegisters(int index);
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    int getRegistersCount();
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.RegisterOrBuilder>
        getRegistersOrBuilderList();
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    com.android.server.os.TombstoneProtos.RegisterOrBuilder getRegistersOrBuilder(
        int index);

    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @return A list containing the backtraceNote.
     */
    java.util.List<java.lang.String>
        getBacktraceNoteList();
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @return The count of backtraceNote.
     */
    int getBacktraceNoteCount();
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @param index The index of the element to return.
     * @return The backtraceNote at the given index.
     */
    java.lang.String getBacktraceNote(int index);
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @param index The index of the value to return.
     * @return The bytes of the backtraceNote at the given index.
     */
    com.google.protobuf.ByteString
        getBacktraceNoteBytes(int index);

    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @return A list containing the unreadableElfFiles.
     */
    java.util.List<java.lang.String>
        getUnreadableElfFilesList();
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @return The count of unreadableElfFiles.
     */
    int getUnreadableElfFilesCount();
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @param index The index of the element to return.
     * @return The unreadableElfFiles at the given index.
     */
    java.lang.String getUnreadableElfFiles(int index);
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the unreadableElfFiles at the given index.
     */
    com.google.protobuf.ByteString
        getUnreadableElfFilesBytes(int index);

    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame>
        getCurrentBacktraceList();
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrame getCurrentBacktrace(int index);
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    int getCurrentBacktraceCount();
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getCurrentBacktraceOrBuilderList();
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(
        int index);

    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.MemoryDump>
        getMemoryDumpList();
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryDump getMemoryDump(int index);
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    int getMemoryDumpCount();
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>
        getMemoryDumpOrBuilderList();
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getMemoryDumpOrBuilder(
        int index);

    /**
     * <code>int64 tagged_addr_ctrl = 6;</code>
     * @return The taggedAddrCtrl.
     */
    long getTaggedAddrCtrl();

    /**
     * <code>int64 pac_enabled_keys = 8;</code>
     * @return The pacEnabledKeys.
     */
    long getPacEnabledKeys();
  }
  /**
   * Protobuf type {@code Thread}
   */
  public static final class Thread extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Thread)
      ThreadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Thread.newBuilder() to construct.
    private Thread(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Thread() {
      name_ = "";
      registers_ = java.util.Collections.emptyList();
      backtraceNote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      unreadableElfFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      currentBacktrace_ = java.util.Collections.emptyList();
      memoryDump_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Thread();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_Thread_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_Thread_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.Thread.class, com.android.server.os.TombstoneProtos.Thread.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REGISTERS_FIELD_NUMBER = 3;
    private java.util.List<com.android.server.os.TombstoneProtos.Register> registers_;
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.Register> getRegistersList() {
      return registers_;
    }
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.RegisterOrBuilder>
        getRegistersOrBuilderList() {
      return registers_;
    }
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    @java.lang.Override
    public int getRegistersCount() {
      return registers_.size();
    }
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Register getRegisters(int index) {
      return registers_.get(index);
    }
    /**
     * <code>repeated .Register registers = 3;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.RegisterOrBuilder getRegistersOrBuilder(
        int index) {
      return registers_.get(index);
    }

    public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
    private com.google.protobuf.LazyStringList backtraceNote_;
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @return A list containing the backtraceNote.
     */
    public com.google.protobuf.ProtocolStringList
        getBacktraceNoteList() {
      return backtraceNote_;
    }
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @return The count of backtraceNote.
     */
    public int getBacktraceNoteCount() {
      return backtraceNote_.size();
    }
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @param index The index of the element to return.
     * @return The backtraceNote at the given index.
     */
    public java.lang.String getBacktraceNote(int index) {
      return backtraceNote_.get(index);
    }
    /**
     * <code>repeated string backtrace_note = 7;</code>
     * @param index The index of the value to return.
     * @return The bytes of the backtraceNote at the given index.
     */
    public com.google.protobuf.ByteString
        getBacktraceNoteBytes(int index) {
      return backtraceNote_.getByteString(index);
    }

    public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
    private com.google.protobuf.LazyStringList unreadableElfFiles_;
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @return A list containing the unreadableElfFiles.
     */
    public com.google.protobuf.ProtocolStringList
        getUnreadableElfFilesList() {
      return unreadableElfFiles_;
    }
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @return The count of unreadableElfFiles.
     */
    public int getUnreadableElfFilesCount() {
      return unreadableElfFiles_.size();
    }
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @param index The index of the element to return.
     * @return The unreadableElfFiles at the given index.
     */
    public java.lang.String getUnreadableElfFiles(int index) {
      return unreadableElfFiles_.get(index);
    }
    /**
     * <code>repeated string unreadable_elf_files = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the unreadableElfFiles at the given index.
     */
    public com.google.protobuf.ByteString
        getUnreadableElfFilesBytes(int index) {
      return unreadableElfFiles_.getByteString(index);
    }

    public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
    private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> currentBacktrace_;
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getCurrentBacktraceList() {
      return currentBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
        getCurrentBacktraceOrBuilderList() {
      return currentBacktrace_;
    }
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    @java.lang.Override
    public int getCurrentBacktraceCount() {
      return currentBacktrace_.size();
    }
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrame getCurrentBacktrace(int index) {
      return currentBacktrace_.get(index);
    }
    /**
     * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(
        int index) {
      return currentBacktrace_.get(index);
    }

    public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
    private java.util.List<com.android.server.os.TombstoneProtos.MemoryDump> memoryDump_;
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.MemoryDump> getMemoryDumpList() {
      return memoryDump_;
    }
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>
        getMemoryDumpOrBuilderList() {
      return memoryDump_;
    }
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    @java.lang.Override
    public int getMemoryDumpCount() {
      return memoryDump_.size();
    }
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryDump getMemoryDump(int index) {
      return memoryDump_.get(index);
    }
    /**
     * <code>repeated .MemoryDump memory_dump = 5;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getMemoryDumpOrBuilder(
        int index) {
      return memoryDump_.get(index);
    }

    public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
    private long taggedAddrCtrl_;
    /**
     * <code>int64 tagged_addr_ctrl = 6;</code>
     * @return The taggedAddrCtrl.
     */
    @java.lang.Override
    public long getTaggedAddrCtrl() {
      return taggedAddrCtrl_;
    }

    public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
    private long pacEnabledKeys_;
    /**
     * <code>int64 pac_enabled_keys = 8;</code>
     * @return The pacEnabledKeys.
     */
    @java.lang.Override
    public long getPacEnabledKeys() {
      return pacEnabledKeys_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      for (int i = 0; i < registers_.size(); i++) {
        output.writeMessage(3, registers_.get(i));
      }
      for (int i = 0; i < currentBacktrace_.size(); i++) {
        output.writeMessage(4, currentBacktrace_.get(i));
      }
      for (int i = 0; i < memoryDump_.size(); i++) {
        output.writeMessage(5, memoryDump_.get(i));
      }
      if (taggedAddrCtrl_ != 0L) {
        output.writeInt64(6, taggedAddrCtrl_);
      }
      for (int i = 0; i < backtraceNote_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, backtraceNote_.getRaw(i));
      }
      if (pacEnabledKeys_ != 0L) {
        output.writeInt64(8, pacEnabledKeys_);
      }
      for (int i = 0; i < unreadableElfFiles_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, unreadableElfFiles_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      for (int i = 0; i < registers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, registers_.get(i));
      }
      for (int i = 0; i < currentBacktrace_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, currentBacktrace_.get(i));
      }
      for (int i = 0; i < memoryDump_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, memoryDump_.get(i));
      }
      if (taggedAddrCtrl_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, taggedAddrCtrl_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < backtraceNote_.size(); i++) {
          dataSize += computeStringSizeNoTag(backtraceNote_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getBacktraceNoteList().size();
      }
      if (pacEnabledKeys_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, pacEnabledKeys_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unreadableElfFiles_.size(); i++) {
          dataSize += computeStringSizeNoTag(unreadableElfFiles_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getUnreadableElfFilesList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.Thread)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.Thread other = (com.android.server.os.TombstoneProtos.Thread) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getRegistersList()
          .equals(other.getRegistersList())) return false;
      if (!getBacktraceNoteList()
          .equals(other.getBacktraceNoteList())) return false;
      if (!getUnreadableElfFilesList()
          .equals(other.getUnreadableElfFilesList())) return false;
      if (!getCurrentBacktraceList()
          .equals(other.getCurrentBacktraceList())) return false;
      if (!getMemoryDumpList()
          .equals(other.getMemoryDumpList())) return false;
      if (getTaggedAddrCtrl()
          != other.getTaggedAddrCtrl()) return false;
      if (getPacEnabledKeys()
          != other.getPacEnabledKeys()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (getRegistersCount() > 0) {
        hash = (37 * hash) + REGISTERS_FIELD_NUMBER;
        hash = (53 * hash) + getRegistersList().hashCode();
      }
      if (getBacktraceNoteCount() > 0) {
        hash = (37 * hash) + BACKTRACE_NOTE_FIELD_NUMBER;
        hash = (53 * hash) + getBacktraceNoteList().hashCode();
      }
      if (getUnreadableElfFilesCount() > 0) {
        hash = (37 * hash) + UNREADABLE_ELF_FILES_FIELD_NUMBER;
        hash = (53 * hash) + getUnreadableElfFilesList().hashCode();
      }
      if (getCurrentBacktraceCount() > 0) {
        hash = (37 * hash) + CURRENT_BACKTRACE_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentBacktraceList().hashCode();
      }
      if (getMemoryDumpCount() > 0) {
        hash = (37 * hash) + MEMORY_DUMP_FIELD_NUMBER;
        hash = (53 * hash) + getMemoryDumpList().hashCode();
      }
      hash = (37 * hash) + TAGGED_ADDR_CTRL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTaggedAddrCtrl());
      hash = (37 * hash) + PAC_ENABLED_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPacEnabledKeys());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.Thread parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.Thread prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Thread}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Thread)
        com.android.server.os.TombstoneProtos.ThreadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_Thread_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_Thread_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.Thread.class, com.android.server.os.TombstoneProtos.Thread.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.Thread.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        name_ = "";

        if (registersBuilder_ == null) {
          registers_ = java.util.Collections.emptyList();
        } else {
          registers_ = null;
          registersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        backtraceNote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        unreadableElfFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (currentBacktraceBuilder_ == null) {
          currentBacktrace_ = java.util.Collections.emptyList();
        } else {
          currentBacktrace_ = null;
          currentBacktraceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (memoryDumpBuilder_ == null) {
          memoryDump_ = java.util.Collections.emptyList();
        } else {
          memoryDump_ = null;
          memoryDumpBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        taggedAddrCtrl_ = 0L;

        pacEnabledKeys_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_Thread_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Thread getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.Thread.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Thread build() {
        com.android.server.os.TombstoneProtos.Thread result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.Thread buildPartial() {
        com.android.server.os.TombstoneProtos.Thread result = new com.android.server.os.TombstoneProtos.Thread(this);
        int from_bitField0_ = bitField0_;
        result.id_ = id_;
        result.name_ = name_;
        if (registersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            registers_ = java.util.Collections.unmodifiableList(registers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.registers_ = registers_;
        } else {
          result.registers_ = registersBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          backtraceNote_ = backtraceNote_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.backtraceNote_ = backtraceNote_;
        if (((bitField0_ & 0x00000004) != 0)) {
          unreadableElfFiles_ = unreadableElfFiles_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.unreadableElfFiles_ = unreadableElfFiles_;
        if (currentBacktraceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            currentBacktrace_ = java.util.Collections.unmodifiableList(currentBacktrace_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.currentBacktrace_ = currentBacktrace_;
        } else {
          result.currentBacktrace_ = currentBacktraceBuilder_.build();
        }
        if (memoryDumpBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            memoryDump_ = java.util.Collections.unmodifiableList(memoryDump_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.memoryDump_ = memoryDump_;
        } else {
          result.memoryDump_ = memoryDumpBuilder_.build();
        }
        result.taggedAddrCtrl_ = taggedAddrCtrl_;
        result.pacEnabledKeys_ = pacEnabledKeys_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.Thread) {
          return mergeFrom((com.android.server.os.TombstoneProtos.Thread)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.Thread other) {
        if (other == com.android.server.os.TombstoneProtos.Thread.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (registersBuilder_ == null) {
          if (!other.registers_.isEmpty()) {
            if (registers_.isEmpty()) {
              registers_ = other.registers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRegistersIsMutable();
              registers_.addAll(other.registers_);
            }
            onChanged();
          }
        } else {
          if (!other.registers_.isEmpty()) {
            if (registersBuilder_.isEmpty()) {
              registersBuilder_.dispose();
              registersBuilder_ = null;
              registers_ = other.registers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              registersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRegistersFieldBuilder() : null;
            } else {
              registersBuilder_.addAllMessages(other.registers_);
            }
          }
        }
        if (!other.backtraceNote_.isEmpty()) {
          if (backtraceNote_.isEmpty()) {
            backtraceNote_ = other.backtraceNote_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBacktraceNoteIsMutable();
            backtraceNote_.addAll(other.backtraceNote_);
          }
          onChanged();
        }
        if (!other.unreadableElfFiles_.isEmpty()) {
          if (unreadableElfFiles_.isEmpty()) {
            unreadableElfFiles_ = other.unreadableElfFiles_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureUnreadableElfFilesIsMutable();
            unreadableElfFiles_.addAll(other.unreadableElfFiles_);
          }
          onChanged();
        }
        if (currentBacktraceBuilder_ == null) {
          if (!other.currentBacktrace_.isEmpty()) {
            if (currentBacktrace_.isEmpty()) {
              currentBacktrace_ = other.currentBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureCurrentBacktraceIsMutable();
              currentBacktrace_.addAll(other.currentBacktrace_);
            }
            onChanged();
          }
        } else {
          if (!other.currentBacktrace_.isEmpty()) {
            if (currentBacktraceBuilder_.isEmpty()) {
              currentBacktraceBuilder_.dispose();
              currentBacktraceBuilder_ = null;
              currentBacktrace_ = other.currentBacktrace_;
              bitField0_ = (bitField0_ & ~0x00000008);
              currentBacktraceBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCurrentBacktraceFieldBuilder() : null;
            } else {
              currentBacktraceBuilder_.addAllMessages(other.currentBacktrace_);
            }
          }
        }
        if (memoryDumpBuilder_ == null) {
          if (!other.memoryDump_.isEmpty()) {
            if (memoryDump_.isEmpty()) {
              memoryDump_ = other.memoryDump_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureMemoryDumpIsMutable();
              memoryDump_.addAll(other.memoryDump_);
            }
            onChanged();
          }
        } else {
          if (!other.memoryDump_.isEmpty()) {
            if (memoryDumpBuilder_.isEmpty()) {
              memoryDumpBuilder_.dispose();
              memoryDumpBuilder_ = null;
              memoryDump_ = other.memoryDump_;
              bitField0_ = (bitField0_ & ~0x00000010);
              memoryDumpBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMemoryDumpFieldBuilder() : null;
            } else {
              memoryDumpBuilder_.addAllMessages(other.memoryDump_);
            }
          }
        }
        if (other.getTaggedAddrCtrl() != 0L) {
          setTaggedAddrCtrl(other.getTaggedAddrCtrl());
        }
        if (other.getPacEnabledKeys() != 0L) {
          setPacEnabledKeys(other.getPacEnabledKeys());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readInt32();

                break;
              } // case 8
              case 18: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 26: {
                com.android.server.os.TombstoneProtos.Register m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.Register.parser(),
                        extensionRegistry);
                if (registersBuilder_ == null) {
                  ensureRegistersIsMutable();
                  registers_.add(m);
                } else {
                  registersBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 34: {
                com.android.server.os.TombstoneProtos.BacktraceFrame m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.BacktraceFrame.parser(),
                        extensionRegistry);
                if (currentBacktraceBuilder_ == null) {
                  ensureCurrentBacktraceIsMutable();
                  currentBacktrace_.add(m);
                } else {
                  currentBacktraceBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 42: {
                com.android.server.os.TombstoneProtos.MemoryDump m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.MemoryDump.parser(),
                        extensionRegistry);
                if (memoryDumpBuilder_ == null) {
                  ensureMemoryDumpIsMutable();
                  memoryDump_.add(m);
                } else {
                  memoryDumpBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 48: {
                taggedAddrCtrl_ = input.readInt64();

                break;
              } // case 48
              case 58: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureBacktraceNoteIsMutable();
                backtraceNote_.add(s);
                break;
              } // case 58
              case 64: {
                pacEnabledKeys_ = input.readInt64();

                break;
              } // case 64
              case 74: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureUnreadableElfFilesIsMutable();
                unreadableElfFiles_.add(s);
                break;
              } // case 74
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {

        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.Register> registers_ =
        java.util.Collections.emptyList();
      private void ensureRegistersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          registers_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.Register>(registers_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Register, com.android.server.os.TombstoneProtos.Register.Builder, com.android.server.os.TombstoneProtos.RegisterOrBuilder> registersBuilder_;

      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.Register> getRegistersList() {
        if (registersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(registers_);
        } else {
          return registersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public int getRegistersCount() {
        if (registersBuilder_ == null) {
          return registers_.size();
        } else {
          return registersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.Register getRegisters(int index) {
        if (registersBuilder_ == null) {
          return registers_.get(index);
        } else {
          return registersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder setRegisters(
          int index, com.android.server.os.TombstoneProtos.Register value) {
        if (registersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegistersIsMutable();
          registers_.set(index, value);
          onChanged();
        } else {
          registersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder setRegisters(
          int index, com.android.server.os.TombstoneProtos.Register.Builder builderForValue) {
        if (registersBuilder_ == null) {
          ensureRegistersIsMutable();
          registers_.set(index, builderForValue.build());
          onChanged();
        } else {
          registersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder addRegisters(com.android.server.os.TombstoneProtos.Register value) {
        if (registersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegistersIsMutable();
          registers_.add(value);
          onChanged();
        } else {
          registersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder addRegisters(
          int index, com.android.server.os.TombstoneProtos.Register value) {
        if (registersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegistersIsMutable();
          registers_.add(index, value);
          onChanged();
        } else {
          registersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder addRegisters(
          com.android.server.os.TombstoneProtos.Register.Builder builderForValue) {
        if (registersBuilder_ == null) {
          ensureRegistersIsMutable();
          registers_.add(builderForValue.build());
          onChanged();
        } else {
          registersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder addRegisters(
          int index, com.android.server.os.TombstoneProtos.Register.Builder builderForValue) {
        if (registersBuilder_ == null) {
          ensureRegistersIsMutable();
          registers_.add(index, builderForValue.build());
          onChanged();
        } else {
          registersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder addAllRegisters(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.Register> values) {
        if (registersBuilder_ == null) {
          ensureRegistersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, registers_);
          onChanged();
        } else {
          registersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder clearRegisters() {
        if (registersBuilder_ == null) {
          registers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          registersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public Builder removeRegisters(int index) {
        if (registersBuilder_ == null) {
          ensureRegistersIsMutable();
          registers_.remove(index);
          onChanged();
        } else {
          registersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.Register.Builder getRegistersBuilder(
          int index) {
        return getRegistersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.RegisterOrBuilder getRegistersOrBuilder(
          int index) {
        if (registersBuilder_ == null) {
          return registers_.get(index);  } else {
          return registersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.RegisterOrBuilder>
           getRegistersOrBuilderList() {
        if (registersBuilder_ != null) {
          return registersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(registers_);
        }
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.Register.Builder addRegistersBuilder() {
        return getRegistersFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.Register.getDefaultInstance());
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public com.android.server.os.TombstoneProtos.Register.Builder addRegistersBuilder(
          int index) {
        return getRegistersFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.Register.getDefaultInstance());
      }
      /**
       * <code>repeated .Register registers = 3;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.Register.Builder>
           getRegistersBuilderList() {
        return getRegistersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.Register, com.android.server.os.TombstoneProtos.Register.Builder, com.android.server.os.TombstoneProtos.RegisterOrBuilder>
          getRegistersFieldBuilder() {
        if (registersBuilder_ == null) {
          registersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.Register, com.android.server.os.TombstoneProtos.Register.Builder, com.android.server.os.TombstoneProtos.RegisterOrBuilder>(
                  registers_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          registers_ = null;
        }
        return registersBuilder_;
      }

      private com.google.protobuf.LazyStringList backtraceNote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureBacktraceNoteIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          backtraceNote_ = new com.google.protobuf.LazyStringArrayList(backtraceNote_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @return A list containing the backtraceNote.
       */
      public com.google.protobuf.ProtocolStringList
          getBacktraceNoteList() {
        return backtraceNote_.getUnmodifiableView();
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @return The count of backtraceNote.
       */
      public int getBacktraceNoteCount() {
        return backtraceNote_.size();
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param index The index of the element to return.
       * @return The backtraceNote at the given index.
       */
      public java.lang.String getBacktraceNote(int index) {
        return backtraceNote_.get(index);
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param index The index of the value to return.
       * @return The bytes of the backtraceNote at the given index.
       */
      public com.google.protobuf.ByteString
          getBacktraceNoteBytes(int index) {
        return backtraceNote_.getByteString(index);
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param index The index to set the value at.
       * @param value The backtraceNote to set.
       * @return This builder for chaining.
       */
      public Builder setBacktraceNote(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureBacktraceNoteIsMutable();
        backtraceNote_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param value The backtraceNote to add.
       * @return This builder for chaining.
       */
      public Builder addBacktraceNote(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureBacktraceNoteIsMutable();
        backtraceNote_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param values The backtraceNote to add.
       * @return This builder for chaining.
       */
      public Builder addAllBacktraceNote(
          java.lang.Iterable<java.lang.String> values) {
        ensureBacktraceNoteIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backtraceNote_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBacktraceNote() {
        backtraceNote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string backtrace_note = 7;</code>
       * @param value The bytes of the backtraceNote to add.
       * @return This builder for chaining.
       */
      public Builder addBacktraceNoteBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureBacktraceNoteIsMutable();
        backtraceNote_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList unreadableElfFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureUnreadableElfFilesIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          unreadableElfFiles_ = new com.google.protobuf.LazyStringArrayList(unreadableElfFiles_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @return A list containing the unreadableElfFiles.
       */
      public com.google.protobuf.ProtocolStringList
          getUnreadableElfFilesList() {
        return unreadableElfFiles_.getUnmodifiableView();
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @return The count of unreadableElfFiles.
       */
      public int getUnreadableElfFilesCount() {
        return unreadableElfFiles_.size();
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param index The index of the element to return.
       * @return The unreadableElfFiles at the given index.
       */
      public java.lang.String getUnreadableElfFiles(int index) {
        return unreadableElfFiles_.get(index);
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param index The index of the value to return.
       * @return The bytes of the unreadableElfFiles at the given index.
       */
      public com.google.protobuf.ByteString
          getUnreadableElfFilesBytes(int index) {
        return unreadableElfFiles_.getByteString(index);
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param index The index to set the value at.
       * @param value The unreadableElfFiles to set.
       * @return This builder for chaining.
       */
      public Builder setUnreadableElfFiles(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUnreadableElfFilesIsMutable();
        unreadableElfFiles_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param value The unreadableElfFiles to add.
       * @return This builder for chaining.
       */
      public Builder addUnreadableElfFiles(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUnreadableElfFilesIsMutable();
        unreadableElfFiles_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param values The unreadableElfFiles to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnreadableElfFiles(
          java.lang.Iterable<java.lang.String> values) {
        ensureUnreadableElfFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unreadableElfFiles_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnreadableElfFiles() {
        unreadableElfFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string unreadable_elf_files = 9;</code>
       * @param value The bytes of the unreadableElfFiles to add.
       * @return This builder for chaining.
       */
      public Builder addUnreadableElfFilesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureUnreadableElfFilesIsMutable();
        unreadableElfFiles_.add(value);
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> currentBacktrace_ =
        java.util.Collections.emptyList();
      private void ensureCurrentBacktraceIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          currentBacktrace_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.BacktraceFrame>(currentBacktrace_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder> currentBacktraceBuilder_;

      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame> getCurrentBacktraceList() {
        if (currentBacktraceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(currentBacktrace_);
        } else {
          return currentBacktraceBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public int getCurrentBacktraceCount() {
        if (currentBacktraceBuilder_ == null) {
          return currentBacktrace_.size();
        } else {
          return currentBacktraceBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame getCurrentBacktrace(int index) {
        if (currentBacktraceBuilder_ == null) {
          return currentBacktrace_.get(index);
        } else {
          return currentBacktraceBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder setCurrentBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (currentBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.set(index, value);
          onChanged();
        } else {
          currentBacktraceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder setCurrentBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (currentBacktraceBuilder_ == null) {
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.set(index, builderForValue.build());
          onChanged();
        } else {
          currentBacktraceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder addCurrentBacktrace(com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (currentBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.add(value);
          onChanged();
        } else {
          currentBacktraceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder addCurrentBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame value) {
        if (currentBacktraceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.add(index, value);
          onChanged();
        } else {
          currentBacktraceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder addCurrentBacktrace(
          com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (currentBacktraceBuilder_ == null) {
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.add(builderForValue.build());
          onChanged();
        } else {
          currentBacktraceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder addCurrentBacktrace(
          int index, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder builderForValue) {
        if (currentBacktraceBuilder_ == null) {
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.add(index, builderForValue.build());
          onChanged();
        } else {
          currentBacktraceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder addAllCurrentBacktrace(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.BacktraceFrame> values) {
        if (currentBacktraceBuilder_ == null) {
          ensureCurrentBacktraceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, currentBacktrace_);
          onChanged();
        } else {
          currentBacktraceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder clearCurrentBacktrace() {
        if (currentBacktraceBuilder_ == null) {
          currentBacktrace_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          currentBacktraceBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public Builder removeCurrentBacktrace(int index) {
        if (currentBacktraceBuilder_ == null) {
          ensureCurrentBacktraceIsMutable();
          currentBacktrace_.remove(index);
          onChanged();
        } else {
          currentBacktraceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder getCurrentBacktraceBuilder(
          int index) {
        return getCurrentBacktraceFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(
          int index) {
        if (currentBacktraceBuilder_ == null) {
          return currentBacktrace_.get(index);  } else {
          return currentBacktraceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
           getCurrentBacktraceOrBuilderList() {
        if (currentBacktraceBuilder_ != null) {
          return currentBacktraceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(currentBacktrace_);
        }
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addCurrentBacktraceBuilder() {
        return getCurrentBacktraceFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public com.android.server.os.TombstoneProtos.BacktraceFrame.Builder addCurrentBacktraceBuilder(
          int index) {
        return getCurrentBacktraceFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance());
      }
      /**
       * <code>repeated .BacktraceFrame current_backtrace = 4;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.BacktraceFrame.Builder>
           getCurrentBacktraceBuilderList() {
        return getCurrentBacktraceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>
          getCurrentBacktraceFieldBuilder() {
        if (currentBacktraceBuilder_ == null) {
          currentBacktraceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.BacktraceFrame, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder, com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder>(
                  currentBacktrace_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          currentBacktrace_ = null;
        }
        return currentBacktraceBuilder_;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.MemoryDump> memoryDump_ =
        java.util.Collections.emptyList();
      private void ensureMemoryDumpIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          memoryDump_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.MemoryDump>(memoryDump_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder> memoryDumpBuilder_;

      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.MemoryDump> getMemoryDumpList() {
        if (memoryDumpBuilder_ == null) {
          return java.util.Collections.unmodifiableList(memoryDump_);
        } else {
          return memoryDumpBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public int getMemoryDumpCount() {
        if (memoryDumpBuilder_ == null) {
          return memoryDump_.size();
        } else {
          return memoryDumpBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDump getMemoryDump(int index) {
        if (memoryDumpBuilder_ == null) {
          return memoryDump_.get(index);
        } else {
          return memoryDumpBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder setMemoryDump(
          int index, com.android.server.os.TombstoneProtos.MemoryDump value) {
        if (memoryDumpBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryDumpIsMutable();
          memoryDump_.set(index, value);
          onChanged();
        } else {
          memoryDumpBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder setMemoryDump(
          int index, com.android.server.os.TombstoneProtos.MemoryDump.Builder builderForValue) {
        if (memoryDumpBuilder_ == null) {
          ensureMemoryDumpIsMutable();
          memoryDump_.set(index, builderForValue.build());
          onChanged();
        } else {
          memoryDumpBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder addMemoryDump(com.android.server.os.TombstoneProtos.MemoryDump value) {
        if (memoryDumpBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryDumpIsMutable();
          memoryDump_.add(value);
          onChanged();
        } else {
          memoryDumpBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder addMemoryDump(
          int index, com.android.server.os.TombstoneProtos.MemoryDump value) {
        if (memoryDumpBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryDumpIsMutable();
          memoryDump_.add(index, value);
          onChanged();
        } else {
          memoryDumpBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder addMemoryDump(
          com.android.server.os.TombstoneProtos.MemoryDump.Builder builderForValue) {
        if (memoryDumpBuilder_ == null) {
          ensureMemoryDumpIsMutable();
          memoryDump_.add(builderForValue.build());
          onChanged();
        } else {
          memoryDumpBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder addMemoryDump(
          int index, com.android.server.os.TombstoneProtos.MemoryDump.Builder builderForValue) {
        if (memoryDumpBuilder_ == null) {
          ensureMemoryDumpIsMutable();
          memoryDump_.add(index, builderForValue.build());
          onChanged();
        } else {
          memoryDumpBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder addAllMemoryDump(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.MemoryDump> values) {
        if (memoryDumpBuilder_ == null) {
          ensureMemoryDumpIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, memoryDump_);
          onChanged();
        } else {
          memoryDumpBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder clearMemoryDump() {
        if (memoryDumpBuilder_ == null) {
          memoryDump_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          memoryDumpBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public Builder removeMemoryDump(int index) {
        if (memoryDumpBuilder_ == null) {
          ensureMemoryDumpIsMutable();
          memoryDump_.remove(index);
          onChanged();
        } else {
          memoryDumpBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDump.Builder getMemoryDumpBuilder(
          int index) {
        return getMemoryDumpFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder getMemoryDumpOrBuilder(
          int index) {
        if (memoryDumpBuilder_ == null) {
          return memoryDump_.get(index);  } else {
          return memoryDumpBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>
           getMemoryDumpOrBuilderList() {
        if (memoryDumpBuilder_ != null) {
          return memoryDumpBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(memoryDump_);
        }
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDump.Builder addMemoryDumpBuilder() {
        return getMemoryDumpFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public com.android.server.os.TombstoneProtos.MemoryDump.Builder addMemoryDumpBuilder(
          int index) {
        return getMemoryDumpFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryDump memory_dump = 5;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.MemoryDump.Builder>
           getMemoryDumpBuilderList() {
        return getMemoryDumpFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>
          getMemoryDumpFieldBuilder() {
        if (memoryDumpBuilder_ == null) {
          memoryDumpBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.MemoryDump, com.android.server.os.TombstoneProtos.MemoryDump.Builder, com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder>(
                  memoryDump_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          memoryDump_ = null;
        }
        return memoryDumpBuilder_;
      }

      private long taggedAddrCtrl_ ;
      /**
       * <code>int64 tagged_addr_ctrl = 6;</code>
       * @return The taggedAddrCtrl.
       */
      @java.lang.Override
      public long getTaggedAddrCtrl() {
        return taggedAddrCtrl_;
      }
      /**
       * <code>int64 tagged_addr_ctrl = 6;</code>
       * @param value The taggedAddrCtrl to set.
       * @return This builder for chaining.
       */
      public Builder setTaggedAddrCtrl(long value) {

        taggedAddrCtrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 tagged_addr_ctrl = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTaggedAddrCtrl() {

        taggedAddrCtrl_ = 0L;
        onChanged();
        return this;
      }

      private long pacEnabledKeys_ ;
      /**
       * <code>int64 pac_enabled_keys = 8;</code>
       * @return The pacEnabledKeys.
       */
      @java.lang.Override
      public long getPacEnabledKeys() {
        return pacEnabledKeys_;
      }
      /**
       * <code>int64 pac_enabled_keys = 8;</code>
       * @param value The pacEnabledKeys to set.
       * @return This builder for chaining.
       */
      public Builder setPacEnabledKeys(long value) {

        pacEnabledKeys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 pac_enabled_keys = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPacEnabledKeys() {

        pacEnabledKeys_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Thread)
    }

    // @@protoc_insertion_point(class_scope:Thread)
    private static final com.android.server.os.TombstoneProtos.Thread DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.Thread();
    }

    public static com.android.server.os.TombstoneProtos.Thread getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Thread>
        PARSER = new com.google.protobuf.AbstractParser<Thread>() {
      @java.lang.Override
      public Thread parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Thread> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Thread> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.Thread getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BacktraceFrameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BacktraceFrame)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 rel_pc = 1;</code>
     * @return The relPc.
     */
    long getRelPc();

    /**
     * <code>uint64 pc = 2;</code>
     * @return The pc.
     */
    long getPc();

    /**
     * <code>uint64 sp = 3;</code>
     * @return The sp.
     */
    long getSp();

    /**
     * <code>string function_name = 4;</code>
     * @return The functionName.
     */
    java.lang.String getFunctionName();
    /**
     * <code>string function_name = 4;</code>
     * @return The bytes for functionName.
     */
    com.google.protobuf.ByteString
        getFunctionNameBytes();

    /**
     * <code>uint64 function_offset = 5;</code>
     * @return The functionOffset.
     */
    long getFunctionOffset();

    /**
     * <code>string file_name = 6;</code>
     * @return The fileName.
     */
    java.lang.String getFileName();
    /**
     * <code>string file_name = 6;</code>
     * @return The bytes for fileName.
     */
    com.google.protobuf.ByteString
        getFileNameBytes();

    /**
     * <code>uint64 file_map_offset = 7;</code>
     * @return The fileMapOffset.
     */
    long getFileMapOffset();

    /**
     * <code>string build_id = 8;</code>
     * @return The buildId.
     */
    java.lang.String getBuildId();
    /**
     * <code>string build_id = 8;</code>
     * @return The bytes for buildId.
     */
    com.google.protobuf.ByteString
        getBuildIdBytes();
  }
  /**
   * Protobuf type {@code BacktraceFrame}
   */
  public static final class BacktraceFrame extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BacktraceFrame)
      BacktraceFrameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BacktraceFrame.newBuilder() to construct.
    private BacktraceFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BacktraceFrame() {
      functionName_ = "";
      fileName_ = "";
      buildId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BacktraceFrame();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_BacktraceFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_BacktraceFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.BacktraceFrame.class, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder.class);
    }

    public static final int REL_PC_FIELD_NUMBER = 1;
    private long relPc_;
    /**
     * <code>uint64 rel_pc = 1;</code>
     * @return The relPc.
     */
    @java.lang.Override
    public long getRelPc() {
      return relPc_;
    }

    public static final int PC_FIELD_NUMBER = 2;
    private long pc_;
    /**
     * <code>uint64 pc = 2;</code>
     * @return The pc.
     */
    @java.lang.Override
    public long getPc() {
      return pc_;
    }

    public static final int SP_FIELD_NUMBER = 3;
    private long sp_;
    /**
     * <code>uint64 sp = 3;</code>
     * @return The sp.
     */
    @java.lang.Override
    public long getSp() {
      return sp_;
    }

    public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object functionName_;
    /**
     * <code>string function_name = 4;</code>
     * @return The functionName.
     */
    @java.lang.Override
    public java.lang.String getFunctionName() {
      java.lang.Object ref = functionName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionName_ = s;
        return s;
      }
    }
    /**
     * <code>string function_name = 4;</code>
     * @return The bytes for functionName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFunctionNameBytes() {
      java.lang.Object ref = functionName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        functionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
    private long functionOffset_;
    /**
     * <code>uint64 function_offset = 5;</code>
     * @return The functionOffset.
     */
    @java.lang.Override
    public long getFunctionOffset() {
      return functionOffset_;
    }

    public static final int FILE_NAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object fileName_;
    /**
     * <code>string file_name = 6;</code>
     * @return The fileName.
     */
    @java.lang.Override
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      }
    }
    /**
     * <code>string file_name = 6;</code>
     * @return The bytes for fileName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
    private long fileMapOffset_;
    /**
     * <code>uint64 file_map_offset = 7;</code>
     * @return The fileMapOffset.
     */
    @java.lang.Override
    public long getFileMapOffset() {
      return fileMapOffset_;
    }

    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private volatile java.lang.Object buildId_;
    /**
     * <code>string build_id = 8;</code>
     * @return The buildId.
     */
    @java.lang.Override
    public java.lang.String getBuildId() {
      java.lang.Object ref = buildId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildId_ = s;
        return s;
      }
    }
    /**
     * <code>string build_id = 8;</code>
     * @return The bytes for buildId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBuildIdBytes() {
      java.lang.Object ref = buildId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (relPc_ != 0L) {
        output.writeUInt64(1, relPc_);
      }
      if (pc_ != 0L) {
        output.writeUInt64(2, pc_);
      }
      if (sp_ != 0L) {
        output.writeUInt64(3, sp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, functionName_);
      }
      if (functionOffset_ != 0L) {
        output.writeUInt64(5, functionOffset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, fileName_);
      }
      if (fileMapOffset_ != 0L) {
        output.writeUInt64(7, fileMapOffset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, buildId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (relPc_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, relPc_);
      }
      if (pc_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, pc_);
      }
      if (sp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, sp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, functionName_);
      }
      if (functionOffset_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, functionOffset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, fileName_);
      }
      if (fileMapOffset_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, fileMapOffset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, buildId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.BacktraceFrame)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.BacktraceFrame other = (com.android.server.os.TombstoneProtos.BacktraceFrame) obj;

      if (getRelPc()
          != other.getRelPc()) return false;
      if (getPc()
          != other.getPc()) return false;
      if (getSp()
          != other.getSp()) return false;
      if (!getFunctionName()
          .equals(other.getFunctionName())) return false;
      if (getFunctionOffset()
          != other.getFunctionOffset()) return false;
      if (!getFileName()
          .equals(other.getFileName())) return false;
      if (getFileMapOffset()
          != other.getFileMapOffset()) return false;
      if (!getBuildId()
          .equals(other.getBuildId())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REL_PC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRelPc());
      hash = (37 * hash) + PC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPc());
      hash = (37 * hash) + SP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSp());
      hash = (37 * hash) + FUNCTION_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFunctionName().hashCode();
      hash = (37 * hash) + FUNCTION_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFunctionOffset());
      hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFileName().hashCode();
      hash = (37 * hash) + FILE_MAP_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFileMapOffset());
      hash = (37 * hash) + BUILD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildId().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.BacktraceFrame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.BacktraceFrame prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BacktraceFrame}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BacktraceFrame)
        com.android.server.os.TombstoneProtos.BacktraceFrameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_BacktraceFrame_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_BacktraceFrame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.BacktraceFrame.class, com.android.server.os.TombstoneProtos.BacktraceFrame.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.BacktraceFrame.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        relPc_ = 0L;

        pc_ = 0L;

        sp_ = 0L;

        functionName_ = "";

        functionOffset_ = 0L;

        fileName_ = "";

        fileMapOffset_ = 0L;

        buildId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_BacktraceFrame_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.BacktraceFrame getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.BacktraceFrame build() {
        com.android.server.os.TombstoneProtos.BacktraceFrame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.BacktraceFrame buildPartial() {
        com.android.server.os.TombstoneProtos.BacktraceFrame result = new com.android.server.os.TombstoneProtos.BacktraceFrame(this);
        result.relPc_ = relPc_;
        result.pc_ = pc_;
        result.sp_ = sp_;
        result.functionName_ = functionName_;
        result.functionOffset_ = functionOffset_;
        result.fileName_ = fileName_;
        result.fileMapOffset_ = fileMapOffset_;
        result.buildId_ = buildId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.BacktraceFrame) {
          return mergeFrom((com.android.server.os.TombstoneProtos.BacktraceFrame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.BacktraceFrame other) {
        if (other == com.android.server.os.TombstoneProtos.BacktraceFrame.getDefaultInstance()) return this;
        if (other.getRelPc() != 0L) {
          setRelPc(other.getRelPc());
        }
        if (other.getPc() != 0L) {
          setPc(other.getPc());
        }
        if (other.getSp() != 0L) {
          setSp(other.getSp());
        }
        if (!other.getFunctionName().isEmpty()) {
          functionName_ = other.functionName_;
          onChanged();
        }
        if (other.getFunctionOffset() != 0L) {
          setFunctionOffset(other.getFunctionOffset());
        }
        if (!other.getFileName().isEmpty()) {
          fileName_ = other.fileName_;
          onChanged();
        }
        if (other.getFileMapOffset() != 0L) {
          setFileMapOffset(other.getFileMapOffset());
        }
        if (!other.getBuildId().isEmpty()) {
          buildId_ = other.buildId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                relPc_ = input.readUInt64();

                break;
              } // case 8
              case 16: {
                pc_ = input.readUInt64();

                break;
              } // case 16
              case 24: {
                sp_ = input.readUInt64();

                break;
              } // case 24
              case 34: {
                functionName_ = input.readStringRequireUtf8();

                break;
              } // case 34
              case 40: {
                functionOffset_ = input.readUInt64();

                break;
              } // case 40
              case 50: {
                fileName_ = input.readStringRequireUtf8();

                break;
              } // case 50
              case 56: {
                fileMapOffset_ = input.readUInt64();

                break;
              } // case 56
              case 66: {
                buildId_ = input.readStringRequireUtf8();

                break;
              } // case 66
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private long relPc_ ;
      /**
       * <code>uint64 rel_pc = 1;</code>
       * @return The relPc.
       */
      @java.lang.Override
      public long getRelPc() {
        return relPc_;
      }
      /**
       * <code>uint64 rel_pc = 1;</code>
       * @param value The relPc to set.
       * @return This builder for chaining.
       */
      public Builder setRelPc(long value) {

        relPc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 rel_pc = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRelPc() {

        relPc_ = 0L;
        onChanged();
        return this;
      }

      private long pc_ ;
      /**
       * <code>uint64 pc = 2;</code>
       * @return The pc.
       */
      @java.lang.Override
      public long getPc() {
        return pc_;
      }
      /**
       * <code>uint64 pc = 2;</code>
       * @param value The pc to set.
       * @return This builder for chaining.
       */
      public Builder setPc(long value) {

        pc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 pc = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPc() {

        pc_ = 0L;
        onChanged();
        return this;
      }

      private long sp_ ;
      /**
       * <code>uint64 sp = 3;</code>
       * @return The sp.
       */
      @java.lang.Override
      public long getSp() {
        return sp_;
      }
      /**
       * <code>uint64 sp = 3;</code>
       * @param value The sp to set.
       * @return This builder for chaining.
       */
      public Builder setSp(long value) {

        sp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 sp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSp() {

        sp_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object functionName_ = "";
      /**
       * <code>string function_name = 4;</code>
       * @return The functionName.
       */
      public java.lang.String getFunctionName() {
        java.lang.Object ref = functionName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          functionName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string function_name = 4;</code>
       * @return The bytes for functionName.
       */
      public com.google.protobuf.ByteString
          getFunctionNameBytes() {
        java.lang.Object ref = functionName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          functionName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string function_name = 4;</code>
       * @param value The functionName to set.
       * @return This builder for chaining.
       */
      public Builder setFunctionName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        functionName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string function_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFunctionName() {

        functionName_ = getDefaultInstance().getFunctionName();
        onChanged();
        return this;
      }
      /**
       * <code>string function_name = 4;</code>
       * @param value The bytes for functionName to set.
       * @return This builder for chaining.
       */
      public Builder setFunctionNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        functionName_ = value;
        onChanged();
        return this;
      }

      private long functionOffset_ ;
      /**
       * <code>uint64 function_offset = 5;</code>
       * @return The functionOffset.
       */
      @java.lang.Override
      public long getFunctionOffset() {
        return functionOffset_;
      }
      /**
       * <code>uint64 function_offset = 5;</code>
       * @param value The functionOffset to set.
       * @return This builder for chaining.
       */
      public Builder setFunctionOffset(long value) {

        functionOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 function_offset = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFunctionOffset() {

        functionOffset_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object fileName_ = "";
      /**
       * <code>string file_name = 6;</code>
       * @return The fileName.
       */
      public java.lang.String getFileName() {
        java.lang.Object ref = fileName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fileName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string file_name = 6;</code>
       * @return The bytes for fileName.
       */
      public com.google.protobuf.ByteString
          getFileNameBytes() {
        java.lang.Object ref = fileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string file_name = 6;</code>
       * @param value The fileName to set.
       * @return This builder for chaining.
       */
      public Builder setFileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        fileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string file_name = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFileName() {

        fileName_ = getDefaultInstance().getFileName();
        onChanged();
        return this;
      }
      /**
       * <code>string file_name = 6;</code>
       * @param value The bytes for fileName to set.
       * @return This builder for chaining.
       */
      public Builder setFileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        fileName_ = value;
        onChanged();
        return this;
      }

      private long fileMapOffset_ ;
      /**
       * <code>uint64 file_map_offset = 7;</code>
       * @return The fileMapOffset.
       */
      @java.lang.Override
      public long getFileMapOffset() {
        return fileMapOffset_;
      }
      /**
       * <code>uint64 file_map_offset = 7;</code>
       * @param value The fileMapOffset to set.
       * @return This builder for chaining.
       */
      public Builder setFileMapOffset(long value) {

        fileMapOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 file_map_offset = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFileMapOffset() {

        fileMapOffset_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object buildId_ = "";
      /**
       * <code>string build_id = 8;</code>
       * @return The buildId.
       */
      public java.lang.String getBuildId() {
        java.lang.Object ref = buildId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string build_id = 8;</code>
       * @return The bytes for buildId.
       */
      public com.google.protobuf.ByteString
          getBuildIdBytes() {
        java.lang.Object ref = buildId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string build_id = 8;</code>
       * @param value The buildId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        buildId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string build_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildId() {

        buildId_ = getDefaultInstance().getBuildId();
        onChanged();
        return this;
      }
      /**
       * <code>string build_id = 8;</code>
       * @param value The bytes for buildId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        buildId_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BacktraceFrame)
    }

    // @@protoc_insertion_point(class_scope:BacktraceFrame)
    private static final com.android.server.os.TombstoneProtos.BacktraceFrame DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.BacktraceFrame();
    }

    public static com.android.server.os.TombstoneProtos.BacktraceFrame getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BacktraceFrame>
        PARSER = new com.google.protobuf.AbstractParser<BacktraceFrame>() {
      @java.lang.Override
      public BacktraceFrame parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<BacktraceFrame> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BacktraceFrame> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.BacktraceFrame getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ArmMTEMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ArmMTEMetadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * One memory tag per granule (e.g. every 16 bytes) of regular memory.
     * </pre>
     *
     * <code>bytes memory_tags = 1;</code>
     * @return The memoryTags.
     */
    com.google.protobuf.ByteString getMemoryTags();
  }
  /**
   * Protobuf type {@code ArmMTEMetadata}
   */
  public static final class ArmMTEMetadata extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ArmMTEMetadata)
      ArmMTEMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArmMTEMetadata.newBuilder() to construct.
    private ArmMTEMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArmMTEMetadata() {
      memoryTags_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ArmMTEMetadata();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_ArmMTEMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_ArmMTEMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.ArmMTEMetadata.class, com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder.class);
    }

    public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString memoryTags_;
    /**
     * <pre>
     * One memory tag per granule (e.g. every 16 bytes) of regular memory.
     * </pre>
     *
     * <code>bytes memory_tags = 1;</code>
     * @return The memoryTags.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMemoryTags() {
      return memoryTags_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!memoryTags_.isEmpty()) {
        output.writeBytes(1, memoryTags_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!memoryTags_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, memoryTags_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.ArmMTEMetadata)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.ArmMTEMetadata other = (com.android.server.os.TombstoneProtos.ArmMTEMetadata) obj;

      if (!getMemoryTags()
          .equals(other.getMemoryTags())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MEMORY_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getMemoryTags().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.ArmMTEMetadata prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ArmMTEMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ArmMTEMetadata)
        com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_ArmMTEMetadata_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_ArmMTEMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.ArmMTEMetadata.class, com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.ArmMTEMetadata.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        memoryTags_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_ArmMTEMetadata_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.ArmMTEMetadata getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.ArmMTEMetadata build() {
        com.android.server.os.TombstoneProtos.ArmMTEMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.ArmMTEMetadata buildPartial() {
        com.android.server.os.TombstoneProtos.ArmMTEMetadata result = new com.android.server.os.TombstoneProtos.ArmMTEMetadata(this);
        result.memoryTags_ = memoryTags_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.ArmMTEMetadata) {
          return mergeFrom((com.android.server.os.TombstoneProtos.ArmMTEMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.ArmMTEMetadata other) {
        if (other == com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance()) return this;
        if (other.getMemoryTags() != com.google.protobuf.ByteString.EMPTY) {
          setMemoryTags(other.getMemoryTags());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                memoryTags_ = input.readBytes();

                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private com.google.protobuf.ByteString memoryTags_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * One memory tag per granule (e.g. every 16 bytes) of regular memory.
       * </pre>
       *
       * <code>bytes memory_tags = 1;</code>
       * @return The memoryTags.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMemoryTags() {
        return memoryTags_;
      }
      /**
       * <pre>
       * One memory tag per granule (e.g. every 16 bytes) of regular memory.
       * </pre>
       *
       * <code>bytes memory_tags = 1;</code>
       * @param value The memoryTags to set.
       * @return This builder for chaining.
       */
      public Builder setMemoryTags(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        memoryTags_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * One memory tag per granule (e.g. every 16 bytes) of regular memory.
       * </pre>
       *
       * <code>bytes memory_tags = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMemoryTags() {

        memoryTags_ = getDefaultInstance().getMemoryTags();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ArmMTEMetadata)
    }

    // @@protoc_insertion_point(class_scope:ArmMTEMetadata)
    private static final com.android.server.os.TombstoneProtos.ArmMTEMetadata DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.ArmMTEMetadata();
    }

    public static com.android.server.os.TombstoneProtos.ArmMTEMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArmMTEMetadata>
        PARSER = new com.google.protobuf.AbstractParser<ArmMTEMetadata>() {
      @java.lang.Override
      public ArmMTEMetadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ArmMTEMetadata> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ArmMTEMetadata> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.ArmMTEMetadata getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MemoryDumpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MemoryDump)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string register_name = 1;</code>
     * @return The registerName.
     */
    java.lang.String getRegisterName();
    /**
     * <code>string register_name = 1;</code>
     * @return The bytes for registerName.
     */
    com.google.protobuf.ByteString
        getRegisterNameBytes();

    /**
     * <code>string mapping_name = 2;</code>
     * @return The mappingName.
     */
    java.lang.String getMappingName();
    /**
     * <code>string mapping_name = 2;</code>
     * @return The bytes for mappingName.
     */
    com.google.protobuf.ByteString
        getMappingNameBytes();

    /**
     * <code>uint64 begin_address = 3;</code>
     * @return The beginAddress.
     */
    long getBeginAddress();

    /**
     * <code>bytes memory = 4;</code>
     * @return The memory.
     */
    com.google.protobuf.ByteString getMemory();

    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     * @return Whether the armMteMetadata field is set.
     */
    boolean hasArmMteMetadata();
    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     * @return The armMteMetadata.
     */
    com.android.server.os.TombstoneProtos.ArmMTEMetadata getArmMteMetadata();
    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     */
    com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder getArmMteMetadataOrBuilder();

    public com.android.server.os.TombstoneProtos.MemoryDump.MetadataCase getMetadataCase();
  }
  /**
   * Protobuf type {@code MemoryDump}
   */
  public static final class MemoryDump extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MemoryDump)
      MemoryDumpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MemoryDump.newBuilder() to construct.
    private MemoryDump(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MemoryDump() {
      registerName_ = "";
      mappingName_ = "";
      memory_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MemoryDump();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryDump_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryDump_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.MemoryDump.class, com.android.server.os.TombstoneProtos.MemoryDump.Builder.class);
    }

    private int metadataCase_ = 0;
    private java.lang.Object metadata_;
    public enum MetadataCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      ARM_MTE_METADATA(6),
      METADATA_NOT_SET(0);
      private final int value;
      private MetadataCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static MetadataCase valueOf(int value) {
        return forNumber(value);
      }

      public static MetadataCase forNumber(int value) {
        switch (value) {
          case 6: return ARM_MTE_METADATA;
          case 0: return METADATA_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public MetadataCase
    getMetadataCase() {
      return MetadataCase.forNumber(
          metadataCase_);
    }

    public static final int REGISTER_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object registerName_;
    /**
     * <code>string register_name = 1;</code>
     * @return The registerName.
     */
    @java.lang.Override
    public java.lang.String getRegisterName() {
      java.lang.Object ref = registerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        registerName_ = s;
        return s;
      }
    }
    /**
     * <code>string register_name = 1;</code>
     * @return The bytes for registerName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRegisterNameBytes() {
      java.lang.Object ref = registerName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        registerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MAPPING_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object mappingName_;
    /**
     * <code>string mapping_name = 2;</code>
     * @return The mappingName.
     */
    @java.lang.Override
    public java.lang.String getMappingName() {
      java.lang.Object ref = mappingName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mappingName_ = s;
        return s;
      }
    }
    /**
     * <code>string mapping_name = 2;</code>
     * @return The bytes for mappingName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMappingNameBytes() {
      java.lang.Object ref = mappingName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mappingName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
    private long beginAddress_;
    /**
     * <code>uint64 begin_address = 3;</code>
     * @return The beginAddress.
     */
    @java.lang.Override
    public long getBeginAddress() {
      return beginAddress_;
    }

    public static final int MEMORY_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString memory_;
    /**
     * <code>bytes memory = 4;</code>
     * @return The memory.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMemory() {
      return memory_;
    }

    public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     * @return Whether the armMteMetadata field is set.
     */
    @java.lang.Override
    public boolean hasArmMteMetadata() {
      return metadataCase_ == 6;
    }
    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     * @return The armMteMetadata.
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.ArmMTEMetadata getArmMteMetadata() {
      if (metadataCase_ == 6) {
         return (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_;
      }
      return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
    }
    /**
     * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder getArmMteMetadataOrBuilder() {
      if (metadataCase_ == 6) {
         return (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_;
      }
      return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registerName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, registerName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mappingName_);
      }
      if (beginAddress_ != 0L) {
        output.writeUInt64(3, beginAddress_);
      }
      if (!memory_.isEmpty()) {
        output.writeBytes(4, memory_);
      }
      if (metadataCase_ == 6) {
        output.writeMessage(6, (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registerName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, registerName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mappingName_);
      }
      if (beginAddress_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, beginAddress_);
      }
      if (!memory_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, memory_);
      }
      if (metadataCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.MemoryDump)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.MemoryDump other = (com.android.server.os.TombstoneProtos.MemoryDump) obj;

      if (!getRegisterName()
          .equals(other.getRegisterName())) return false;
      if (!getMappingName()
          .equals(other.getMappingName())) return false;
      if (getBeginAddress()
          != other.getBeginAddress()) return false;
      if (!getMemory()
          .equals(other.getMemory())) return false;
      if (!getMetadataCase().equals(other.getMetadataCase())) return false;
      switch (metadataCase_) {
        case 6:
          if (!getArmMteMetadata()
              .equals(other.getArmMteMetadata())) return false;
          break;
        case 0:
        default:
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REGISTER_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getRegisterName().hashCode();
      hash = (37 * hash) + MAPPING_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMappingName().hashCode();
      hash = (37 * hash) + BEGIN_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginAddress());
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
      switch (metadataCase_) {
        case 6:
          hash = (37 * hash) + ARM_MTE_METADATA_FIELD_NUMBER;
          hash = (53 * hash) + getArmMteMetadata().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryDump parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.MemoryDump prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MemoryDump}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MemoryDump)
        com.android.server.os.TombstoneProtos.MemoryDumpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryDump_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryDump_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.MemoryDump.class, com.android.server.os.TombstoneProtos.MemoryDump.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.MemoryDump.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        registerName_ = "";

        mappingName_ = "";

        beginAddress_ = 0L;

        memory_ = com.google.protobuf.ByteString.EMPTY;

        if (armMteMetadataBuilder_ != null) {
          armMteMetadataBuilder_.clear();
        }
        metadataCase_ = 0;
        metadata_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryDump_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryDump getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryDump build() {
        com.android.server.os.TombstoneProtos.MemoryDump result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryDump buildPartial() {
        com.android.server.os.TombstoneProtos.MemoryDump result = new com.android.server.os.TombstoneProtos.MemoryDump(this);
        result.registerName_ = registerName_;
        result.mappingName_ = mappingName_;
        result.beginAddress_ = beginAddress_;
        result.memory_ = memory_;
        if (metadataCase_ == 6) {
          if (armMteMetadataBuilder_ == null) {
            result.metadata_ = metadata_;
          } else {
            result.metadata_ = armMteMetadataBuilder_.build();
          }
        }
        result.metadataCase_ = metadataCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.MemoryDump) {
          return mergeFrom((com.android.server.os.TombstoneProtos.MemoryDump)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.MemoryDump other) {
        if (other == com.android.server.os.TombstoneProtos.MemoryDump.getDefaultInstance()) return this;
        if (!other.getRegisterName().isEmpty()) {
          registerName_ = other.registerName_;
          onChanged();
        }
        if (!other.getMappingName().isEmpty()) {
          mappingName_ = other.mappingName_;
          onChanged();
        }
        if (other.getBeginAddress() != 0L) {
          setBeginAddress(other.getBeginAddress());
        }
        if (other.getMemory() != com.google.protobuf.ByteString.EMPTY) {
          setMemory(other.getMemory());
        }
        switch (other.getMetadataCase()) {
          case ARM_MTE_METADATA: {
            mergeArmMteMetadata(other.getArmMteMetadata());
            break;
          }
          case METADATA_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                registerName_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 18: {
                mappingName_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 24: {
                beginAddress_ = input.readUInt64();

                break;
              } // case 24
              case 34: {
                memory_ = input.readBytes();

                break;
              } // case 34
              case 50: {
                input.readMessage(
                    getArmMteMetadataFieldBuilder().getBuilder(),
                    extensionRegistry);
                metadataCase_ = 6;
                break;
              } // case 50
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int metadataCase_ = 0;
      private java.lang.Object metadata_;
      public MetadataCase
          getMetadataCase() {
        return MetadataCase.forNumber(
            metadataCase_);
      }

      public Builder clearMetadata() {
        metadataCase_ = 0;
        metadata_ = null;
        onChanged();
        return this;
      }


      private java.lang.Object registerName_ = "";
      /**
       * <code>string register_name = 1;</code>
       * @return The registerName.
       */
      public java.lang.String getRegisterName() {
        java.lang.Object ref = registerName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          registerName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string register_name = 1;</code>
       * @return The bytes for registerName.
       */
      public com.google.protobuf.ByteString
          getRegisterNameBytes() {
        java.lang.Object ref = registerName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          registerName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string register_name = 1;</code>
       * @param value The registerName to set.
       * @return This builder for chaining.
       */
      public Builder setRegisterName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        registerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string register_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRegisterName() {

        registerName_ = getDefaultInstance().getRegisterName();
        onChanged();
        return this;
      }
      /**
       * <code>string register_name = 1;</code>
       * @param value The bytes for registerName to set.
       * @return This builder for chaining.
       */
      public Builder setRegisterNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        registerName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object mappingName_ = "";
      /**
       * <code>string mapping_name = 2;</code>
       * @return The mappingName.
       */
      public java.lang.String getMappingName() {
        java.lang.Object ref = mappingName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mappingName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mapping_name = 2;</code>
       * @return The bytes for mappingName.
       */
      public com.google.protobuf.ByteString
          getMappingNameBytes() {
        java.lang.Object ref = mappingName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mappingName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mapping_name = 2;</code>
       * @param value The mappingName to set.
       * @return This builder for chaining.
       */
      public Builder setMappingName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        mappingName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mapping_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMappingName() {

        mappingName_ = getDefaultInstance().getMappingName();
        onChanged();
        return this;
      }
      /**
       * <code>string mapping_name = 2;</code>
       * @param value The bytes for mappingName to set.
       * @return This builder for chaining.
       */
      public Builder setMappingNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        mappingName_ = value;
        onChanged();
        return this;
      }

      private long beginAddress_ ;
      /**
       * <code>uint64 begin_address = 3;</code>
       * @return The beginAddress.
       */
      @java.lang.Override
      public long getBeginAddress() {
        return beginAddress_;
      }
      /**
       * <code>uint64 begin_address = 3;</code>
       * @param value The beginAddress to set.
       * @return This builder for chaining.
       */
      public Builder setBeginAddress(long value) {

        beginAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 begin_address = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginAddress() {

        beginAddress_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString memory_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes memory = 4;</code>
       * @return The memory.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMemory() {
        return memory_;
      }
      /**
       * <code>bytes memory = 4;</code>
       * @param value The memory to set.
       * @return This builder for chaining.
       */
      public Builder setMemory(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        memory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes memory = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMemory() {

        memory_ = getDefaultInstance().getMemory();
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.ArmMTEMetadata, com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder, com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder> armMteMetadataBuilder_;
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       * @return Whether the armMteMetadata field is set.
       */
      @java.lang.Override
      public boolean hasArmMteMetadata() {
        return metadataCase_ == 6;
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       * @return The armMteMetadata.
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.ArmMTEMetadata getArmMteMetadata() {
        if (armMteMetadataBuilder_ == null) {
          if (metadataCase_ == 6) {
            return (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_;
          }
          return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
        } else {
          if (metadataCase_ == 6) {
            return armMteMetadataBuilder_.getMessage();
          }
          return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
        }
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      public Builder setArmMteMetadata(com.android.server.os.TombstoneProtos.ArmMTEMetadata value) {
        if (armMteMetadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          armMteMetadataBuilder_.setMessage(value);
        }
        metadataCase_ = 6;
        return this;
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      public Builder setArmMteMetadata(
          com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder builderForValue) {
        if (armMteMetadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          armMteMetadataBuilder_.setMessage(builderForValue.build());
        }
        metadataCase_ = 6;
        return this;
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      public Builder mergeArmMteMetadata(com.android.server.os.TombstoneProtos.ArmMTEMetadata value) {
        if (armMteMetadataBuilder_ == null) {
          if (metadataCase_ == 6 &&
              metadata_ != com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance()) {
            metadata_ = com.android.server.os.TombstoneProtos.ArmMTEMetadata.newBuilder((com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_)
                .mergeFrom(value).buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          if (metadataCase_ == 6) {
            armMteMetadataBuilder_.mergeFrom(value);
          }
          armMteMetadataBuilder_.setMessage(value);
        }
        metadataCase_ = 6;
        return this;
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      public Builder clearArmMteMetadata() {
        if (armMteMetadataBuilder_ == null) {
          if (metadataCase_ == 6) {
            metadataCase_ = 0;
            metadata_ = null;
            onChanged();
          }
        } else {
          if (metadataCase_ == 6) {
            metadataCase_ = 0;
            metadata_ = null;
          }
          armMteMetadataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      public com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder getArmMteMetadataBuilder() {
        return getArmMteMetadataFieldBuilder().getBuilder();
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      @java.lang.Override
      public com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder getArmMteMetadataOrBuilder() {
        if ((metadataCase_ == 6) && (armMteMetadataBuilder_ != null)) {
          return armMteMetadataBuilder_.getMessageOrBuilder();
        } else {
          if (metadataCase_ == 6) {
            return (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_;
          }
          return com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
        }
      }
      /**
       * <code>.ArmMTEMetadata arm_mte_metadata = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.android.server.os.TombstoneProtos.ArmMTEMetadata, com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder, com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder>
          getArmMteMetadataFieldBuilder() {
        if (armMteMetadataBuilder_ == null) {
          if (!(metadataCase_ == 6)) {
            metadata_ = com.android.server.os.TombstoneProtos.ArmMTEMetadata.getDefaultInstance();
          }
          armMteMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.android.server.os.TombstoneProtos.ArmMTEMetadata, com.android.server.os.TombstoneProtos.ArmMTEMetadata.Builder, com.android.server.os.TombstoneProtos.ArmMTEMetadataOrBuilder>(
                  (com.android.server.os.TombstoneProtos.ArmMTEMetadata) metadata_,
                  getParentForChildren(),
                  isClean());
          metadata_ = null;
        }
        metadataCase_ = 6;
        onChanged();;
        return armMteMetadataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MemoryDump)
    }

    // @@protoc_insertion_point(class_scope:MemoryDump)
    private static final com.android.server.os.TombstoneProtos.MemoryDump DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.MemoryDump();
    }

    public static com.android.server.os.TombstoneProtos.MemoryDump getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MemoryDump>
        PARSER = new com.google.protobuf.AbstractParser<MemoryDump>() {
      @java.lang.Override
      public MemoryDump parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<MemoryDump> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MemoryDump> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryDump getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MemoryMappingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MemoryMapping)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 begin_address = 1;</code>
     * @return The beginAddress.
     */
    long getBeginAddress();

    /**
     * <code>uint64 end_address = 2;</code>
     * @return The endAddress.
     */
    long getEndAddress();

    /**
     * <code>uint64 offset = 3;</code>
     * @return The offset.
     */
    long getOffset();

    /**
     * <code>bool read = 4;</code>
     * @return The read.
     */
    boolean getRead();

    /**
     * <code>bool write = 5;</code>
     * @return The write.
     */
    boolean getWrite();

    /**
     * <code>bool execute = 6;</code>
     * @return The execute.
     */
    boolean getExecute();

    /**
     * <code>string mapping_name = 7;</code>
     * @return The mappingName.
     */
    java.lang.String getMappingName();
    /**
     * <code>string mapping_name = 7;</code>
     * @return The bytes for mappingName.
     */
    com.google.protobuf.ByteString
        getMappingNameBytes();

    /**
     * <code>string build_id = 8;</code>
     * @return The buildId.
     */
    java.lang.String getBuildId();
    /**
     * <code>string build_id = 8;</code>
     * @return The bytes for buildId.
     */
    com.google.protobuf.ByteString
        getBuildIdBytes();

    /**
     * <code>uint64 load_bias = 9;</code>
     * @return The loadBias.
     */
    long getLoadBias();
  }
  /**
   * Protobuf type {@code MemoryMapping}
   */
  public static final class MemoryMapping extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MemoryMapping)
      MemoryMappingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MemoryMapping.newBuilder() to construct.
    private MemoryMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MemoryMapping() {
      mappingName_ = "";
      buildId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MemoryMapping();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryMapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_MemoryMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.MemoryMapping.class, com.android.server.os.TombstoneProtos.MemoryMapping.Builder.class);
    }

    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
    private long beginAddress_;
    /**
     * <code>uint64 begin_address = 1;</code>
     * @return The beginAddress.
     */
    @java.lang.Override
    public long getBeginAddress() {
      return beginAddress_;
    }

    public static final int END_ADDRESS_FIELD_NUMBER = 2;
    private long endAddress_;
    /**
     * <code>uint64 end_address = 2;</code>
     * @return The endAddress.
     */
    @java.lang.Override
    public long getEndAddress() {
      return endAddress_;
    }

    public static final int OFFSET_FIELD_NUMBER = 3;
    private long offset_;
    /**
     * <code>uint64 offset = 3;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }

    public static final int READ_FIELD_NUMBER = 4;
    private boolean read_;
    /**
     * <code>bool read = 4;</code>
     * @return The read.
     */
    @java.lang.Override
    public boolean getRead() {
      return read_;
    }

    public static final int WRITE_FIELD_NUMBER = 5;
    private boolean write_;
    /**
     * <code>bool write = 5;</code>
     * @return The write.
     */
    @java.lang.Override
    public boolean getWrite() {
      return write_;
    }

    public static final int EXECUTE_FIELD_NUMBER = 6;
    private boolean execute_;
    /**
     * <code>bool execute = 6;</code>
     * @return The execute.
     */
    @java.lang.Override
    public boolean getExecute() {
      return execute_;
    }

    public static final int MAPPING_NAME_FIELD_NUMBER = 7;
    private volatile java.lang.Object mappingName_;
    /**
     * <code>string mapping_name = 7;</code>
     * @return The mappingName.
     */
    @java.lang.Override
    public java.lang.String getMappingName() {
      java.lang.Object ref = mappingName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mappingName_ = s;
        return s;
      }
    }
    /**
     * <code>string mapping_name = 7;</code>
     * @return The bytes for mappingName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMappingNameBytes() {
      java.lang.Object ref = mappingName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mappingName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private volatile java.lang.Object buildId_;
    /**
     * <code>string build_id = 8;</code>
     * @return The buildId.
     */
    @java.lang.Override
    public java.lang.String getBuildId() {
      java.lang.Object ref = buildId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildId_ = s;
        return s;
      }
    }
    /**
     * <code>string build_id = 8;</code>
     * @return The bytes for buildId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBuildIdBytes() {
      java.lang.Object ref = buildId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOAD_BIAS_FIELD_NUMBER = 9;
    private long loadBias_;
    /**
     * <code>uint64 load_bias = 9;</code>
     * @return The loadBias.
     */
    @java.lang.Override
    public long getLoadBias() {
      return loadBias_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (beginAddress_ != 0L) {
        output.writeUInt64(1, beginAddress_);
      }
      if (endAddress_ != 0L) {
        output.writeUInt64(2, endAddress_);
      }
      if (offset_ != 0L) {
        output.writeUInt64(3, offset_);
      }
      if (read_ != false) {
        output.writeBool(4, read_);
      }
      if (write_ != false) {
        output.writeBool(5, write_);
      }
      if (execute_ != false) {
        output.writeBool(6, execute_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, mappingName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, buildId_);
      }
      if (loadBias_ != 0L) {
        output.writeUInt64(9, loadBias_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (beginAddress_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, beginAddress_);
      }
      if (endAddress_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, endAddress_);
      }
      if (offset_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, offset_);
      }
      if (read_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, read_);
      }
      if (write_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, write_);
      }
      if (execute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, execute_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, mappingName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buildId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, buildId_);
      }
      if (loadBias_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, loadBias_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.MemoryMapping)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.MemoryMapping other = (com.android.server.os.TombstoneProtos.MemoryMapping) obj;

      if (getBeginAddress()
          != other.getBeginAddress()) return false;
      if (getEndAddress()
          != other.getEndAddress()) return false;
      if (getOffset()
          != other.getOffset()) return false;
      if (getRead()
          != other.getRead()) return false;
      if (getWrite()
          != other.getWrite()) return false;
      if (getExecute()
          != other.getExecute()) return false;
      if (!getMappingName()
          .equals(other.getMappingName())) return false;
      if (!getBuildId()
          .equals(other.getBuildId())) return false;
      if (getLoadBias()
          != other.getLoadBias()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + BEGIN_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginAddress());
      hash = (37 * hash) + END_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndAddress());
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOffset());
      hash = (37 * hash) + READ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRead());
      hash = (37 * hash) + WRITE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getWrite());
      hash = (37 * hash) + EXECUTE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getExecute());
      hash = (37 * hash) + MAPPING_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMappingName().hashCode();
      hash = (37 * hash) + BUILD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildId().hashCode();
      hash = (37 * hash) + LOAD_BIAS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLoadBias());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.MemoryMapping parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.MemoryMapping prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MemoryMapping}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MemoryMapping)
        com.android.server.os.TombstoneProtos.MemoryMappingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryMapping_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryMapping_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.MemoryMapping.class, com.android.server.os.TombstoneProtos.MemoryMapping.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.MemoryMapping.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        beginAddress_ = 0L;

        endAddress_ = 0L;

        offset_ = 0L;

        read_ = false;

        write_ = false;

        execute_ = false;

        mappingName_ = "";

        buildId_ = "";

        loadBias_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_MemoryMapping_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryMapping getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.MemoryMapping.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryMapping build() {
        com.android.server.os.TombstoneProtos.MemoryMapping result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.MemoryMapping buildPartial() {
        com.android.server.os.TombstoneProtos.MemoryMapping result = new com.android.server.os.TombstoneProtos.MemoryMapping(this);
        result.beginAddress_ = beginAddress_;
        result.endAddress_ = endAddress_;
        result.offset_ = offset_;
        result.read_ = read_;
        result.write_ = write_;
        result.execute_ = execute_;
        result.mappingName_ = mappingName_;
        result.buildId_ = buildId_;
        result.loadBias_ = loadBias_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.MemoryMapping) {
          return mergeFrom((com.android.server.os.TombstoneProtos.MemoryMapping)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.MemoryMapping other) {
        if (other == com.android.server.os.TombstoneProtos.MemoryMapping.getDefaultInstance()) return this;
        if (other.getBeginAddress() != 0L) {
          setBeginAddress(other.getBeginAddress());
        }
        if (other.getEndAddress() != 0L) {
          setEndAddress(other.getEndAddress());
        }
        if (other.getOffset() != 0L) {
          setOffset(other.getOffset());
        }
        if (other.getRead() != false) {
          setRead(other.getRead());
        }
        if (other.getWrite() != false) {
          setWrite(other.getWrite());
        }
        if (other.getExecute() != false) {
          setExecute(other.getExecute());
        }
        if (!other.getMappingName().isEmpty()) {
          mappingName_ = other.mappingName_;
          onChanged();
        }
        if (!other.getBuildId().isEmpty()) {
          buildId_ = other.buildId_;
          onChanged();
        }
        if (other.getLoadBias() != 0L) {
          setLoadBias(other.getLoadBias());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                beginAddress_ = input.readUInt64();

                break;
              } // case 8
              case 16: {
                endAddress_ = input.readUInt64();

                break;
              } // case 16
              case 24: {
                offset_ = input.readUInt64();

                break;
              } // case 24
              case 32: {
                read_ = input.readBool();

                break;
              } // case 32
              case 40: {
                write_ = input.readBool();

                break;
              } // case 40
              case 48: {
                execute_ = input.readBool();

                break;
              } // case 48
              case 58: {
                mappingName_ = input.readStringRequireUtf8();

                break;
              } // case 58
              case 66: {
                buildId_ = input.readStringRequireUtf8();

                break;
              } // case 66
              case 72: {
                loadBias_ = input.readUInt64();

                break;
              } // case 72
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private long beginAddress_ ;
      /**
       * <code>uint64 begin_address = 1;</code>
       * @return The beginAddress.
       */
      @java.lang.Override
      public long getBeginAddress() {
        return beginAddress_;
      }
      /**
       * <code>uint64 begin_address = 1;</code>
       * @param value The beginAddress to set.
       * @return This builder for chaining.
       */
      public Builder setBeginAddress(long value) {

        beginAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 begin_address = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginAddress() {

        beginAddress_ = 0L;
        onChanged();
        return this;
      }

      private long endAddress_ ;
      /**
       * <code>uint64 end_address = 2;</code>
       * @return The endAddress.
       */
      @java.lang.Override
      public long getEndAddress() {
        return endAddress_;
      }
      /**
       * <code>uint64 end_address = 2;</code>
       * @param value The endAddress to set.
       * @return This builder for chaining.
       */
      public Builder setEndAddress(long value) {

        endAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 end_address = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndAddress() {

        endAddress_ = 0L;
        onChanged();
        return this;
      }

      private long offset_ ;
      /**
       * <code>uint64 offset = 3;</code>
       * @return The offset.
       */
      @java.lang.Override
      public long getOffset() {
        return offset_;
      }
      /**
       * <code>uint64 offset = 3;</code>
       * @param value The offset to set.
       * @return This builder for chaining.
       */
      public Builder setOffset(long value) {

        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 offset = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOffset() {

        offset_ = 0L;
        onChanged();
        return this;
      }

      private boolean read_ ;
      /**
       * <code>bool read = 4;</code>
       * @return The read.
       */
      @java.lang.Override
      public boolean getRead() {
        return read_;
      }
      /**
       * <code>bool read = 4;</code>
       * @param value The read to set.
       * @return This builder for chaining.
       */
      public Builder setRead(boolean value) {

        read_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool read = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRead() {

        read_ = false;
        onChanged();
        return this;
      }

      private boolean write_ ;
      /**
       * <code>bool write = 5;</code>
       * @return The write.
       */
      @java.lang.Override
      public boolean getWrite() {
        return write_;
      }
      /**
       * <code>bool write = 5;</code>
       * @param value The write to set.
       * @return This builder for chaining.
       */
      public Builder setWrite(boolean value) {

        write_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool write = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearWrite() {

        write_ = false;
        onChanged();
        return this;
      }

      private boolean execute_ ;
      /**
       * <code>bool execute = 6;</code>
       * @return The execute.
       */
      @java.lang.Override
      public boolean getExecute() {
        return execute_;
      }
      /**
       * <code>bool execute = 6;</code>
       * @param value The execute to set.
       * @return This builder for chaining.
       */
      public Builder setExecute(boolean value) {

        execute_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool execute = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearExecute() {

        execute_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object mappingName_ = "";
      /**
       * <code>string mapping_name = 7;</code>
       * @return The mappingName.
       */
      public java.lang.String getMappingName() {
        java.lang.Object ref = mappingName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mappingName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mapping_name = 7;</code>
       * @return The bytes for mappingName.
       */
      public com.google.protobuf.ByteString
          getMappingNameBytes() {
        java.lang.Object ref = mappingName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mappingName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mapping_name = 7;</code>
       * @param value The mappingName to set.
       * @return This builder for chaining.
       */
      public Builder setMappingName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        mappingName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mapping_name = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMappingName() {

        mappingName_ = getDefaultInstance().getMappingName();
        onChanged();
        return this;
      }
      /**
       * <code>string mapping_name = 7;</code>
       * @param value The bytes for mappingName to set.
       * @return This builder for chaining.
       */
      public Builder setMappingNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        mappingName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object buildId_ = "";
      /**
       * <code>string build_id = 8;</code>
       * @return The buildId.
       */
      public java.lang.String getBuildId() {
        java.lang.Object ref = buildId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string build_id = 8;</code>
       * @return The bytes for buildId.
       */
      public com.google.protobuf.ByteString
          getBuildIdBytes() {
        java.lang.Object ref = buildId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string build_id = 8;</code>
       * @param value The buildId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        buildId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string build_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildId() {

        buildId_ = getDefaultInstance().getBuildId();
        onChanged();
        return this;
      }
      /**
       * <code>string build_id = 8;</code>
       * @param value The bytes for buildId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        buildId_ = value;
        onChanged();
        return this;
      }

      private long loadBias_ ;
      /**
       * <code>uint64 load_bias = 9;</code>
       * @return The loadBias.
       */
      @java.lang.Override
      public long getLoadBias() {
        return loadBias_;
      }
      /**
       * <code>uint64 load_bias = 9;</code>
       * @param value The loadBias to set.
       * @return This builder for chaining.
       */
      public Builder setLoadBias(long value) {

        loadBias_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 load_bias = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLoadBias() {

        loadBias_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MemoryMapping)
    }

    // @@protoc_insertion_point(class_scope:MemoryMapping)
    private static final com.android.server.os.TombstoneProtos.MemoryMapping DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.MemoryMapping();
    }

    public static com.android.server.os.TombstoneProtos.MemoryMapping getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MemoryMapping>
        PARSER = new com.google.protobuf.AbstractParser<MemoryMapping>() {
      @java.lang.Override
      public MemoryMapping parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<MemoryMapping> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MemoryMapping> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.MemoryMapping getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 fd = 1;</code>
     * @return The fd.
     */
    int getFd();

    /**
     * <code>string path = 2;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();

    /**
     * <code>string owner = 3;</code>
     * @return The owner.
     */
    java.lang.String getOwner();
    /**
     * <code>string owner = 3;</code>
     * @return The bytes for owner.
     */
    com.google.protobuf.ByteString
        getOwnerBytes();

    /**
     * <code>uint64 tag = 4;</code>
     * @return The tag.
     */
    long getTag();
  }
  /**
   * Protobuf type {@code FD}
   */
  public static final class FD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FD)
      FDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FD.newBuilder() to construct.
    private FD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FD() {
      path_ = "";
      owner_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_FD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_FD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.FD.class, com.android.server.os.TombstoneProtos.FD.Builder.class);
    }

    public static final int FD_FIELD_NUMBER = 1;
    private int fd_;
    /**
     * <code>int32 fd = 1;</code>
     * @return The fd.
     */
    @java.lang.Override
    public int getFd() {
      return fd_;
    }

    public static final int PATH_FIELD_NUMBER = 2;
    private volatile java.lang.Object path_;
    /**
     * <code>string path = 2;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OWNER_FIELD_NUMBER = 3;
    private volatile java.lang.Object owner_;
    /**
     * <code>string owner = 3;</code>
     * @return The owner.
     */
    @java.lang.Override
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      }
    }
    /**
     * <code>string owner = 3;</code>
     * @return The bytes for owner.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TAG_FIELD_NUMBER = 4;
    private long tag_;
    /**
     * <code>uint64 tag = 4;</code>
     * @return The tag.
     */
    @java.lang.Override
    public long getTag() {
      return tag_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (fd_ != 0) {
        output.writeInt32(1, fd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, owner_);
      }
      if (tag_ != 0L) {
        output.writeUInt64(4, tag_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, fd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, owner_);
      }
      if (tag_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, tag_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.FD)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.FD other = (com.android.server.os.TombstoneProtos.FD) obj;

      if (getFd()
          != other.getFd()) return false;
      if (!getPath()
          .equals(other.getPath())) return false;
      if (!getOwner()
          .equals(other.getOwner())) return false;
      if (getTag()
          != other.getTag()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FD_FIELD_NUMBER;
      hash = (53 * hash) + getFd();
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (37 * hash) + OWNER_FIELD_NUMBER;
      hash = (53 * hash) + getOwner().hashCode();
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTag());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.FD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.FD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.FD parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.FD prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FD)
        com.android.server.os.TombstoneProtos.FDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_FD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_FD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.FD.class, com.android.server.os.TombstoneProtos.FD.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.FD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fd_ = 0;

        path_ = "";

        owner_ = "";

        tag_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_FD_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.FD getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.FD.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.FD build() {
        com.android.server.os.TombstoneProtos.FD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.FD buildPartial() {
        com.android.server.os.TombstoneProtos.FD result = new com.android.server.os.TombstoneProtos.FD(this);
        result.fd_ = fd_;
        result.path_ = path_;
        result.owner_ = owner_;
        result.tag_ = tag_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.FD) {
          return mergeFrom((com.android.server.os.TombstoneProtos.FD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.FD other) {
        if (other == com.android.server.os.TombstoneProtos.FD.getDefaultInstance()) return this;
        if (other.getFd() != 0) {
          setFd(other.getFd());
        }
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
          onChanged();
        }
        if (!other.getOwner().isEmpty()) {
          owner_ = other.owner_;
          onChanged();
        }
        if (other.getTag() != 0L) {
          setTag(other.getTag());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                fd_ = input.readInt32();

                break;
              } // case 8
              case 18: {
                path_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 26: {
                owner_ = input.readStringRequireUtf8();

                break;
              } // case 26
              case 32: {
                tag_ = input.readUInt64();

                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int fd_ ;
      /**
       * <code>int32 fd = 1;</code>
       * @return The fd.
       */
      @java.lang.Override
      public int getFd() {
        return fd_;
      }
      /**
       * <code>int32 fd = 1;</code>
       * @param value The fd to set.
       * @return This builder for chaining.
       */
      public Builder setFd(int value) {

        fd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 fd = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFd() {

        fd_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object path_ = "";
      /**
       * <code>string path = 2;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string path = 2;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string path = 2;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string path = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {

        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>string path = 2;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        path_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object owner_ = "";
      /**
       * <code>string owner = 3;</code>
       * @return The owner.
       */
      public java.lang.String getOwner() {
        java.lang.Object ref = owner_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          owner_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string owner = 3;</code>
       * @return The bytes for owner.
       */
      public com.google.protobuf.ByteString
          getOwnerBytes() {
        java.lang.Object ref = owner_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          owner_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string owner = 3;</code>
       * @param value The owner to set.
       * @return This builder for chaining.
       */
      public Builder setOwner(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        owner_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string owner = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwner() {

        owner_ = getDefaultInstance().getOwner();
        onChanged();
        return this;
      }
      /**
       * <code>string owner = 3;</code>
       * @param value The bytes for owner to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        owner_ = value;
        onChanged();
        return this;
      }

      private long tag_ ;
      /**
       * <code>uint64 tag = 4;</code>
       * @return The tag.
       */
      @java.lang.Override
      public long getTag() {
        return tag_;
      }
      /**
       * <code>uint64 tag = 4;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(long value) {

        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 tag = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {

        tag_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FD)
    }

    // @@protoc_insertion_point(class_scope:FD)
    private static final com.android.server.os.TombstoneProtos.FD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.FD();
    }

    public static com.android.server.os.TombstoneProtos.FD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FD>
        PARSER = new com.google.protobuf.AbstractParser<FD>() {
      @java.lang.Override
      public FD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<FD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.FD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LogBufferOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LogBuffer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    java.util.List<com.android.server.os.TombstoneProtos.LogMessage>
        getLogsList();
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    com.android.server.os.TombstoneProtos.LogMessage getLogs(int index);
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    int getLogsCount();
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    java.util.List<? extends com.android.server.os.TombstoneProtos.LogMessageOrBuilder>
        getLogsOrBuilderList();
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    com.android.server.os.TombstoneProtos.LogMessageOrBuilder getLogsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code LogBuffer}
   */
  public static final class LogBuffer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LogBuffer)
      LogBufferOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogBuffer.newBuilder() to construct.
    private LogBuffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogBuffer() {
      name_ = "";
      logs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogBuffer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_LogBuffer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_LogBuffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.LogBuffer.class, com.android.server.os.TombstoneProtos.LogBuffer.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOGS_FIELD_NUMBER = 2;
    private java.util.List<com.android.server.os.TombstoneProtos.LogMessage> logs_;
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    @java.lang.Override
    public java.util.List<com.android.server.os.TombstoneProtos.LogMessage> getLogsList() {
      return logs_;
    }
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.android.server.os.TombstoneProtos.LogMessageOrBuilder>
        getLogsOrBuilderList() {
      return logs_;
    }
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    @java.lang.Override
    public int getLogsCount() {
      return logs_.size();
    }
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogMessage getLogs(int index) {
      return logs_.get(index);
    }
    /**
     * <code>repeated .LogMessage logs = 2;</code>
     */
    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogMessageOrBuilder getLogsOrBuilder(
        int index) {
      return logs_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      for (int i = 0; i < logs_.size(); i++) {
        output.writeMessage(2, logs_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      for (int i = 0; i < logs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, logs_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.LogBuffer)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.LogBuffer other = (com.android.server.os.TombstoneProtos.LogBuffer) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getLogsList()
          .equals(other.getLogsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (getLogsCount() > 0) {
        hash = (37 * hash) + LOGS_FIELD_NUMBER;
        hash = (53 * hash) + getLogsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogBuffer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.LogBuffer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LogBuffer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LogBuffer)
        com.android.server.os.TombstoneProtos.LogBufferOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_LogBuffer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_LogBuffer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.LogBuffer.class, com.android.server.os.TombstoneProtos.LogBuffer.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.LogBuffer.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        if (logsBuilder_ == null) {
          logs_ = java.util.Collections.emptyList();
        } else {
          logs_ = null;
          logsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_LogBuffer_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogBuffer getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.LogBuffer.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogBuffer build() {
        com.android.server.os.TombstoneProtos.LogBuffer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogBuffer buildPartial() {
        com.android.server.os.TombstoneProtos.LogBuffer result = new com.android.server.os.TombstoneProtos.LogBuffer(this);
        int from_bitField0_ = bitField0_;
        result.name_ = name_;
        if (logsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            logs_ = java.util.Collections.unmodifiableList(logs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.logs_ = logs_;
        } else {
          result.logs_ = logsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.LogBuffer) {
          return mergeFrom((com.android.server.os.TombstoneProtos.LogBuffer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.LogBuffer other) {
        if (other == com.android.server.os.TombstoneProtos.LogBuffer.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (logsBuilder_ == null) {
          if (!other.logs_.isEmpty()) {
            if (logs_.isEmpty()) {
              logs_ = other.logs_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLogsIsMutable();
              logs_.addAll(other.logs_);
            }
            onChanged();
          }
        } else {
          if (!other.logs_.isEmpty()) {
            if (logsBuilder_.isEmpty()) {
              logsBuilder_.dispose();
              logsBuilder_ = null;
              logs_ = other.logs_;
              bitField0_ = (bitField0_ & ~0x00000001);
              logsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLogsFieldBuilder() : null;
            } else {
              logsBuilder_.addAllMessages(other.logs_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 18: {
                com.android.server.os.TombstoneProtos.LogMessage m =
                    input.readMessage(
                        com.android.server.os.TombstoneProtos.LogMessage.parser(),
                        extensionRegistry);
                if (logsBuilder_ == null) {
                  ensureLogsIsMutable();
                  logs_.add(m);
                } else {
                  logsBuilder_.addMessage(m);
                }
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {

        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        name_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.android.server.os.TombstoneProtos.LogMessage> logs_ =
        java.util.Collections.emptyList();
      private void ensureLogsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          logs_ = new java.util.ArrayList<com.android.server.os.TombstoneProtos.LogMessage>(logs_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.LogMessage, com.android.server.os.TombstoneProtos.LogMessage.Builder, com.android.server.os.TombstoneProtos.LogMessageOrBuilder> logsBuilder_;

      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.LogMessage> getLogsList() {
        if (logsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(logs_);
        } else {
          return logsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public int getLogsCount() {
        if (logsBuilder_ == null) {
          return logs_.size();
        } else {
          return logsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.LogMessage getLogs(int index) {
        if (logsBuilder_ == null) {
          return logs_.get(index);
        } else {
          return logsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder setLogs(
          int index, com.android.server.os.TombstoneProtos.LogMessage value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.set(index, value);
          onChanged();
        } else {
          logsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder setLogs(
          int index, com.android.server.os.TombstoneProtos.LogMessage.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.set(index, builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder addLogs(com.android.server.os.TombstoneProtos.LogMessage value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.add(value);
          onChanged();
        } else {
          logsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder addLogs(
          int index, com.android.server.os.TombstoneProtos.LogMessage value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.add(index, value);
          onChanged();
        } else {
          logsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder addLogs(
          com.android.server.os.TombstoneProtos.LogMessage.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.add(builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder addLogs(
          int index, com.android.server.os.TombstoneProtos.LogMessage.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.add(index, builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder addAllLogs(
          java.lang.Iterable<? extends com.android.server.os.TombstoneProtos.LogMessage> values) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, logs_);
          onChanged();
        } else {
          logsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder clearLogs() {
        if (logsBuilder_ == null) {
          logs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          logsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public Builder removeLogs(int index) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.remove(index);
          onChanged();
        } else {
          logsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.LogMessage.Builder getLogsBuilder(
          int index) {
        return getLogsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.LogMessageOrBuilder getLogsOrBuilder(
          int index) {
        if (logsBuilder_ == null) {
          return logs_.get(index);  } else {
          return logsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public java.util.List<? extends com.android.server.os.TombstoneProtos.LogMessageOrBuilder>
           getLogsOrBuilderList() {
        if (logsBuilder_ != null) {
          return logsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(logs_);
        }
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.LogMessage.Builder addLogsBuilder() {
        return getLogsFieldBuilder().addBuilder(
            com.android.server.os.TombstoneProtos.LogMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public com.android.server.os.TombstoneProtos.LogMessage.Builder addLogsBuilder(
          int index) {
        return getLogsFieldBuilder().addBuilder(
            index, com.android.server.os.TombstoneProtos.LogMessage.getDefaultInstance());
      }
      /**
       * <code>repeated .LogMessage logs = 2;</code>
       */
      public java.util.List<com.android.server.os.TombstoneProtos.LogMessage.Builder>
           getLogsBuilderList() {
        return getLogsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.android.server.os.TombstoneProtos.LogMessage, com.android.server.os.TombstoneProtos.LogMessage.Builder, com.android.server.os.TombstoneProtos.LogMessageOrBuilder>
          getLogsFieldBuilder() {
        if (logsBuilder_ == null) {
          logsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.android.server.os.TombstoneProtos.LogMessage, com.android.server.os.TombstoneProtos.LogMessage.Builder, com.android.server.os.TombstoneProtos.LogMessageOrBuilder>(
                  logs_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          logs_ = null;
        }
        return logsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LogBuffer)
    }

    // @@protoc_insertion_point(class_scope:LogBuffer)
    private static final com.android.server.os.TombstoneProtos.LogBuffer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.LogBuffer();
    }

    public static com.android.server.os.TombstoneProtos.LogBuffer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LogBuffer>
        PARSER = new com.google.protobuf.AbstractParser<LogBuffer>() {
      @java.lang.Override
      public LogBuffer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LogBuffer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogBuffer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogBuffer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LogMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LogMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string timestamp = 1;</code>
     * @return The timestamp.
     */
    java.lang.String getTimestamp();
    /**
     * <code>string timestamp = 1;</code>
     * @return The bytes for timestamp.
     */
    com.google.protobuf.ByteString
        getTimestampBytes();

    /**
     * <code>uint32 pid = 2;</code>
     * @return The pid.
     */
    int getPid();

    /**
     * <code>uint32 tid = 3;</code>
     * @return The tid.
     */
    int getTid();

    /**
     * <code>uint32 priority = 4;</code>
     * @return The priority.
     */
    int getPriority();

    /**
     * <code>string tag = 5;</code>
     * @return The tag.
     */
    java.lang.String getTag();
    /**
     * <code>string tag = 5;</code>
     * @return The bytes for tag.
     */
    com.google.protobuf.ByteString
        getTagBytes();

    /**
     * <code>string message = 6;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 6;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code LogMessage}
   */
  public static final class LogMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LogMessage)
      LogMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogMessage.newBuilder() to construct.
    private LogMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogMessage() {
      timestamp_ = "";
      tag_ = "";
      message_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.server.os.TombstoneProtos.internal_static_LogMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.server.os.TombstoneProtos.internal_static_LogMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.server.os.TombstoneProtos.LogMessage.class, com.android.server.os.TombstoneProtos.LogMessage.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private volatile java.lang.Object timestamp_;
    /**
     * <code>string timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      }
    }
    /**
     * <code>string timestamp = 1;</code>
     * @return The bytes for timestamp.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PID_FIELD_NUMBER = 2;
    private int pid_;
    /**
     * <code>uint32 pid = 2;</code>
     * @return The pid.
     */
    @java.lang.Override
    public int getPid() {
      return pid_;
    }

    public static final int TID_FIELD_NUMBER = 3;
    private int tid_;
    /**
     * <code>uint32 tid = 3;</code>
     * @return The tid.
     */
    @java.lang.Override
    public int getTid() {
      return tid_;
    }

    public static final int PRIORITY_FIELD_NUMBER = 4;
    private int priority_;
    /**
     * <code>uint32 priority = 4;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }

    public static final int TAG_FIELD_NUMBER = 5;
    private volatile java.lang.Object tag_;
    /**
     * <code>string tag = 5;</code>
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      }
    }
    /**
     * <code>string tag = 5;</code>
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 6;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 6;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 6;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, timestamp_);
      }
      if (pid_ != 0) {
        output.writeUInt32(2, pid_);
      }
      if (tid_ != 0) {
        output.writeUInt32(3, tid_);
      }
      if (priority_ != 0) {
        output.writeUInt32(4, priority_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, tag_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, message_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, timestamp_);
      }
      if (pid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pid_);
      }
      if (tid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, tid_);
      }
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, priority_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, tag_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, message_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.android.server.os.TombstoneProtos.LogMessage)) {
        return super.equals(obj);
      }
      com.android.server.os.TombstoneProtos.LogMessage other = (com.android.server.os.TombstoneProtos.LogMessage) obj;

      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
      if (getPid()
          != other.getPid()) return false;
      if (getTid()
          != other.getTid()) return false;
      if (getPriority()
          != other.getPriority()) return false;
      if (!getTag()
          .equals(other.getTag())) return false;
      if (!getMessage()
          .equals(other.getMessage())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
      hash = (37 * hash) + PID_FIELD_NUMBER;
      hash = (53 * hash) + getPid();
      hash = (37 * hash) + TID_FIELD_NUMBER;
      hash = (53 * hash) + getTid();
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.server.os.TombstoneProtos.LogMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.android.server.os.TombstoneProtos.LogMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LogMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LogMessage)
        com.android.server.os.TombstoneProtos.LogMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.server.os.TombstoneProtos.internal_static_LogMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.server.os.TombstoneProtos.internal_static_LogMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.server.os.TombstoneProtos.LogMessage.class, com.android.server.os.TombstoneProtos.LogMessage.Builder.class);
      }

      // Construct using com.android.server.os.TombstoneProtos.LogMessage.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        timestamp_ = "";

        pid_ = 0;

        tid_ = 0;

        priority_ = 0;

        tag_ = "";

        message_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.server.os.TombstoneProtos.internal_static_LogMessage_descriptor;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogMessage getDefaultInstanceForType() {
        return com.android.server.os.TombstoneProtos.LogMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogMessage build() {
        com.android.server.os.TombstoneProtos.LogMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.server.os.TombstoneProtos.LogMessage buildPartial() {
        com.android.server.os.TombstoneProtos.LogMessage result = new com.android.server.os.TombstoneProtos.LogMessage(this);
        result.timestamp_ = timestamp_;
        result.pid_ = pid_;
        result.tid_ = tid_;
        result.priority_ = priority_;
        result.tag_ = tag_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.android.server.os.TombstoneProtos.LogMessage) {
          return mergeFrom((com.android.server.os.TombstoneProtos.LogMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.server.os.TombstoneProtos.LogMessage other) {
        if (other == com.android.server.os.TombstoneProtos.LogMessage.getDefaultInstance()) return this;
        if (!other.getTimestamp().isEmpty()) {
          timestamp_ = other.timestamp_;
          onChanged();
        }
        if (other.getPid() != 0) {
          setPid(other.getPid());
        }
        if (other.getTid() != 0) {
          setTid(other.getTid());
        }
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
        }
        if (!other.getTag().isEmpty()) {
          tag_ = other.tag_;
          onChanged();
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                timestamp_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 16: {
                pid_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                tid_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                priority_ = input.readUInt32();

                break;
              } // case 32
              case 42: {
                tag_ = input.readStringRequireUtf8();

                break;
              } // case 42
              case 50: {
                message_ = input.readStringRequireUtf8();

                break;
              } // case 50
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private java.lang.Object timestamp_ = "";
      /**
       * <code>string timestamp = 1;</code>
       * @return The timestamp.
       */
      public java.lang.String getTimestamp() {
        java.lang.Object ref = timestamp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          timestamp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string timestamp = 1;</code>
       * @return The bytes for timestamp.
       */
      public com.google.protobuf.ByteString
          getTimestampBytes() {
        java.lang.Object ref = timestamp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timestamp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {

        timestamp_ = getDefaultInstance().getTimestamp();
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 1;</code>
       * @param value The bytes for timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestampBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        timestamp_ = value;
        onChanged();
        return this;
      }

      private int pid_ ;
      /**
       * <code>uint32 pid = 2;</code>
       * @return The pid.
       */
      @java.lang.Override
      public int getPid() {
        return pid_;
      }
      /**
       * <code>uint32 pid = 2;</code>
       * @param value The pid to set.
       * @return This builder for chaining.
       */
      public Builder setPid(int value) {

        pid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPid() {

        pid_ = 0;
        onChanged();
        return this;
      }

      private int tid_ ;
      /**
       * <code>uint32 tid = 3;</code>
       * @return The tid.
       */
      @java.lang.Override
      public int getTid() {
        return tid_;
      }
      /**
       * <code>uint32 tid = 3;</code>
       * @param value The tid to set.
       * @return This builder for chaining.
       */
      public Builder setTid(int value) {

        tid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTid() {

        tid_ = 0;
        onChanged();
        return this;
      }

      private int priority_ ;
      /**
       * <code>uint32 priority = 4;</code>
       * @return The priority.
       */
      @java.lang.Override
      public int getPriority() {
        return priority_;
      }
      /**
       * <code>uint32 priority = 4;</code>
       * @param value The priority to set.
       * @return This builder for chaining.
       */
      public Builder setPriority(int value) {

        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 priority = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriority() {

        priority_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tag_ = "";
      /**
       * <code>string tag = 5;</code>
       * @return The tag.
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tag = 5;</code>
       * @return The bytes for tag.
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tag = 5;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {

        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 5;</code>
       * @param value The bytes for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        tag_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 6;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 6;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 6;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {

        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 6;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        message_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LogMessage)
    }

    // @@protoc_insertion_point(class_scope:LogMessage)
    private static final com.android.server.os.TombstoneProtos.LogMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.server.os.TombstoneProtos.LogMessage();
    }

    public static com.android.server.os.TombstoneProtos.LogMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LogMessage>
        PARSER = new com.google.protobuf.AbstractParser<LogMessage>() {
      @java.lang.Override
      public LogMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LogMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.server.os.TombstoneProtos.LogMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrashDetail_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrashDetail_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StackHistoryBufferEntry_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StackHistoryBufferEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StackHistoryBuffer_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StackHistoryBuffer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Tombstone_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Tombstone_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Tombstone_ThreadsEntry_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Tombstone_ThreadsEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Tombstone_GuestThreadsEntry_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Tombstone_GuestThreadsEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Signal_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Signal_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeapObject_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeapObject_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemoryError_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemoryError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Cause_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Cause_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Register_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Register_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Thread_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Thread_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BacktraceFrame_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BacktraceFrame_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ArmMTEMetadata_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ArmMTEMetadata_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemoryDump_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemoryDump_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemoryMapping_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemoryMapping_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FD_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FD_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogBuffer_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogBuffer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogMessage_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017tombstone.proto\"0\n\013CrashDetail\022\014\n\004name" +
      "\030\001 \001(\014\022\014\n\004data\030\002 \001(\014J\005\010\003\020\350\007\"X\n\027StackHist" +
      "oryBufferEntry\022\035\n\004addr\030\001 \001(\0132\017.Backtrace" +
      "Frame\022\n\n\002fp\030\002 \001(\004\022\013\n\003tag\030\003 \001(\004J\005\010\004\020\350\007\"S\n" +
      "\022StackHistoryBuffer\022\013\n\003tid\030\001 \001(\004\022)\n\007entr" +
      "ies\030\002 \003(\0132\030.StackHistoryBufferEntryJ\005\010\003\020" +
      "\350\007\"\211\006\n\tTombstone\022\033\n\004arch\030\001 \001(\0162\r.Archite" +
      "cture\022!\n\nguest_arch\030\030 \001(\0162\r.Architecture" +
      "\022\031\n\021build_fingerprint\030\002 \001(\t\022\020\n\010revision\030" +
      "\003 \001(\t\022\021\n\ttimestamp\030\004 \001(\t\022\013\n\003pid\030\005 \001(\r\022\013\n" +
      "\003tid\030\006 \001(\r\022\013\n\003uid\030\007 \001(\r\022\025\n\rselinux_label" +
      "\030\010 \001(\t\022\024\n\014command_line\030\t \003(\t\022\026\n\016process_" +
      "uptime\030\024 \001(\r\022\034\n\013signal_info\030\n \001(\0132\007.Sign" +
      "al\022\025\n\rabort_message\030\016 \001(\t\022#\n\rcrash_detai" +
      "ls\030\025 \003(\0132\014.CrashDetail\022\026\n\006causes\030\017 \003(\0132\006" +
      ".Cause\022(\n\007threads\030\020 \003(\0132\027.Tombstone.Thre" +
      "adsEntry\0223\n\rguest_threads\030\031 \003(\0132\034.Tombst" +
      "one.GuestThreadsEntry\022\'\n\017memory_mappings" +
      "\030\021 \003(\0132\016.MemoryMapping\022\037\n\013log_buffers\030\022 " +
      "\003(\0132\n.LogBuffer\022\025\n\010open_fds\030\023 \003(\0132\003.FD\022\021" +
      "\n\tpage_size\030\026 \001(\r\022\032\n\022has_been_16kb_mode\030" +
      "\027 \001(\010\0221\n\024stack_history_buffer\030\032 \001(\0132\023.St" +
      "ackHistoryBuffer\0327\n\014ThreadsEntry\022\013\n\003key\030" +
      "\001 \001(\r\022\026\n\005value\030\002 \001(\0132\007.Thread:\0028\001\032<\n\021Gue" +
      "stThreadsEntry\022\013\n\003key\030\001 \001(\r\022\026\n\005value\030\002 \001" +
      "(\0132\007.Thread:\0028\001J\005\010\033\020\350\007\"\352\001\n\006Signal\022\016\n\006num" +
      "ber\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\014\n\004code\030\003 \001(\005\022\021\n" +
      "\tcode_name\030\004 \001(\t\022\022\n\nhas_sender\030\005 \001(\010\022\022\n\n" +
      "sender_uid\030\006 \001(\005\022\022\n\nsender_pid\030\007 \001(\005\022\031\n\021" +
      "has_fault_address\030\010 \001(\010\022\025\n\rfault_address" +
      "\030\t \001(\004\022,\n\027fault_adjacent_metadata\030\n \001(\0132" +
      "\013.MemoryDumpJ\005\010\013\020\350\007\"\275\001\n\nHeapObject\022\017\n\007ad" +
      "dress\030\001 \001(\004\022\014\n\004size\030\002 \001(\004\022\026\n\016allocation_" +
      "tid\030\003 \001(\004\022-\n\024allocation_backtrace\030\004 \003(\0132" +
      "\017.BacktraceFrame\022\030\n\020deallocation_tid\030\005 \001" +
      "(\004\022/\n\026deallocation_backtrace\030\006 \003(\0132\017.Bac" +
      "ktraceFrame\"\245\002\n\013MemoryError\022\037\n\004tool\030\001 \001(" +
      "\0162\021.MemoryError.Tool\022\037\n\004type\030\002 \001(\0162\021.Mem" +
      "oryError.Type\022\033\n\004heap\030\003 \001(\0132\013.HeapObject" +
      "H\000\"&\n\004Tool\022\014\n\010GWP_ASAN\020\000\022\t\n\005SCUDO\020\001\"\005\010\002\020" +
      "\347\007\"|\n\004Type\022\013\n\007UNKNOWN\020\000\022\022\n\016USE_AFTER_FRE" +
      "E\020\001\022\017\n\013DOUBLE_FREE\020\002\022\020\n\014INVALID_FREE\020\003\022\023" +
      "\n\017BUFFER_OVERFLOW\020\004\022\024\n\020BUFFER_UNDERFLOW\020" +
      "\005\"\005\010\006\020\347\007B\n\n\010locationJ\005\010\004\020\350\007\"W\n\005Cause\022\026\n\016" +
      "human_readable\030\001 \001(\t\022$\n\014memory_error\030\002 \001" +
      "(\0132\014.MemoryErrorH\000B\t\n\007detailsJ\005\010\003\020\350\007\",\n\010" +
      "Register\022\014\n\004name\030\001 \001(\t\022\013\n\003u64\030\002 \001(\004J\005\010\003\020" +
      "\350\007\"\377\001\n\006Thread\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022" +
      "\034\n\tregisters\030\003 \003(\0132\t.Register\022\026\n\016backtra" +
      "ce_note\030\007 \003(\t\022\034\n\024unreadable_elf_files\030\t " +
      "\003(\t\022*\n\021current_backtrace\030\004 \003(\0132\017.Backtra" +
      "ceFrame\022 \n\013memory_dump\030\005 \003(\0132\013.MemoryDum" +
      "p\022\030\n\020tagged_addr_ctrl\030\006 \001(\003\022\030\n\020pac_enabl" +
      "ed_keys\030\010 \001(\003J\005\010\n\020\350\007\"\255\001\n\016BacktraceFrame\022" +
      "\016\n\006rel_pc\030\001 \001(\004\022\n\n\002pc\030\002 \001(\004\022\n\n\002sp\030\003 \001(\004\022" +
      "\025\n\rfunction_name\030\004 \001(\t\022\027\n\017function_offse" +
      "t\030\005 \001(\004\022\021\n\tfile_name\030\006 \001(\t\022\027\n\017file_map_o" +
      "ffset\030\007 \001(\004\022\020\n\010build_id\030\010 \001(\tJ\005\010\t\020\350\007\",\n\016" +
      "ArmMTEMetadata\022\023\n\013memory_tags\030\001 \001(\014J\005\010\002\020" +
      "\350\007\"\246\001\n\nMemoryDump\022\025\n\rregister_name\030\001 \001(\t" +
      "\022\024\n\014mapping_name\030\002 \001(\t\022\025\n\rbegin_address\030" +
      "\003 \001(\004\022\016\n\006memory\030\004 \001(\014\022+\n\020arm_mte_metadat" +
      "a\030\006 \001(\0132\017.ArmMTEMetadataH\000B\n\n\010metadataJ\004" +
      "\010\005\020\006J\005\010\007\020\350\007\"\273\001\n\rMemoryMapping\022\025\n\rbegin_a" +
      "ddress\030\001 \001(\004\022\023\n\013end_address\030\002 \001(\004\022\016\n\006off" +
      "set\030\003 \001(\004\022\014\n\004read\030\004 \001(\010\022\r\n\005write\030\005 \001(\010\022\017" +
      "\n\007execute\030\006 \001(\010\022\024\n\014mapping_name\030\007 \001(\t\022\020\n" +
      "\010build_id\030\010 \001(\t\022\021\n\tload_bias\030\t \001(\004J\005\010\n\020\350" +
      "\007\"A\n\002FD\022\n\n\002fd\030\001 \001(\005\022\014\n\004path\030\002 \001(\t\022\r\n\005own" +
      "er\030\003 \001(\t\022\013\n\003tag\030\004 \001(\004J\005\010\005\020\350\007\";\n\tLogBuffe" +
      "r\022\014\n\004name\030\001 \001(\t\022\031\n\004logs\030\002 \003(\0132\013.LogMessa" +
      "geJ\005\010\003\020\350\007\"p\n\nLogMessage\022\021\n\ttimestamp\030\001 \001" +
      "(\t\022\013\n\003pid\030\002 \001(\r\022\013\n\003tid\030\003 \001(\r\022\020\n\010priority" +
      "\030\004 \001(\r\022\013\n\003tag\030\005 \001(\t\022\017\n\007message\030\006 \001(\tJ\005\010\007" +
      "\020\350\007*W\n\014Architecture\022\t\n\005ARM32\020\000\022\t\n\005ARM64\020" +
      "\001\022\007\n\003X86\020\002\022\n\n\006X86_64\020\003\022\013\n\007RISCV64\020\004\022\010\n\004N" +
      "ONE\020\005\"\005\010\006\020\347\007B(\n\025com.android.server.osB\017T" +
      "ombstoneProtosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrashDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrashDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrashDetail_descriptor,
        new java.lang.String[] { "Name", "Data", });
    internal_static_StackHistoryBufferEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_StackHistoryBufferEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StackHistoryBufferEntry_descriptor,
        new java.lang.String[] { "Addr", "Fp", "Tag", });
    internal_static_StackHistoryBuffer_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_StackHistoryBuffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StackHistoryBuffer_descriptor,
        new java.lang.String[] { "Tid", "Entries", });
    internal_static_Tombstone_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Tombstone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Tombstone_descriptor,
        new java.lang.String[] { "Arch", "GuestArch", "BuildFingerprint", "Revision", "Timestamp", "Pid", "Tid", "Uid", "SelinuxLabel", "CommandLine", "ProcessUptime", "SignalInfo", "AbortMessage", "CrashDetails", "Causes", "Threads", "GuestThreads", "MemoryMappings", "LogBuffers", "OpenFds", "PageSize", "HasBeen16KbMode", "StackHistoryBuffer", });
    internal_static_Tombstone_ThreadsEntry_descriptor =
      internal_static_Tombstone_descriptor.getNestedTypes().get(0);
    internal_static_Tombstone_ThreadsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Tombstone_ThreadsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Tombstone_GuestThreadsEntry_descriptor =
      internal_static_Tombstone_descriptor.getNestedTypes().get(1);
    internal_static_Tombstone_GuestThreadsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Tombstone_GuestThreadsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Signal_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Signal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Signal_descriptor,
        new java.lang.String[] { "Number", "Name", "Code", "CodeName", "HasSender", "SenderUid", "SenderPid", "HasFaultAddress", "FaultAddress", "FaultAdjacentMetadata", });
    internal_static_HeapObject_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_HeapObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeapObject_descriptor,
        new java.lang.String[] { "Address", "Size", "AllocationTid", "AllocationBacktrace", "DeallocationTid", "DeallocationBacktrace", });
    internal_static_MemoryError_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_MemoryError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemoryError_descriptor,
        new java.lang.String[] { "Tool", "Type", "Heap", "Location", });
    internal_static_Cause_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Cause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Cause_descriptor,
        new java.lang.String[] { "HumanReadable", "MemoryError", "Details", });
    internal_static_Register_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Register_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Register_descriptor,
        new java.lang.String[] { "Name", "U64", });
    internal_static_Thread_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Thread_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Thread_descriptor,
        new java.lang.String[] { "Id", "Name", "Registers", "BacktraceNote", "UnreadableElfFiles", "CurrentBacktrace", "MemoryDump", "TaggedAddrCtrl", "PacEnabledKeys", });
    internal_static_BacktraceFrame_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_BacktraceFrame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BacktraceFrame_descriptor,
        new java.lang.String[] { "RelPc", "Pc", "Sp", "FunctionName", "FunctionOffset", "FileName", "FileMapOffset", "BuildId", });
    internal_static_ArmMTEMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ArmMTEMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ArmMTEMetadata_descriptor,
        new java.lang.String[] { "MemoryTags", });
    internal_static_MemoryDump_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_MemoryDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemoryDump_descriptor,
        new java.lang.String[] { "RegisterName", "MappingName", "BeginAddress", "Memory", "ArmMteMetadata", "Metadata", });
    internal_static_MemoryMapping_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_MemoryMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemoryMapping_descriptor,
        new java.lang.String[] { "BeginAddress", "EndAddress", "Offset", "Read", "Write", "Execute", "MappingName", "BuildId", "LoadBias", });
    internal_static_FD_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_FD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FD_descriptor,
        new java.lang.String[] { "Fd", "Path", "Owner", "Tag", });
    internal_static_LogBuffer_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_LogBuffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogBuffer_descriptor,
        new java.lang.String[] { "Name", "Logs", });
    internal_static_LogMessage_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_LogMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogMessage_descriptor,
        new java.lang.String[] { "Timestamp", "Pid", "Tid", "Priority", "Tag", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
