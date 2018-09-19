// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SimpleMessge.proto

package example.simple;

public final class SimpleMessge {
  private SimpleMessge() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SimpleMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:example.simple.SimpleMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 count = 1;</code>
     */
    int getCount();

    /**
     * <code>string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 2;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    java.util.List<java.lang.Integer> getSampleListList();
    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    int getSampleListCount();
    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    int getSampleList(int index);
  }
  /**
   * Protobuf type {@code example.simple.SimpleMessage}
   */
  public  static final class SimpleMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:example.simple.SimpleMessage)
      SimpleMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SimpleMessage.newBuilder() to construct.
    private SimpleMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SimpleMessage() {
      count_ = 0;
      message_ = "";
      sampleList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SimpleMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              count_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                sampleList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              sampleList_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                sampleList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                sampleList_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          sampleList_ = java.util.Collections.unmodifiableList(sampleList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return example.simple.SimpleMessge.internal_static_example_simple_SimpleMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return example.simple.SimpleMessge.internal_static_example_simple_SimpleMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              example.simple.SimpleMessge.SimpleMessage.class, example.simple.SimpleMessge.SimpleMessage.Builder.class);
    }

    private int bitField0_;
    public static final int COUNT_FIELD_NUMBER = 1;
    private int count_;
    /**
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 2;</code>
     */
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
     * <code>string message = 2;</code>
     */
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

    public static final int SAMPLE_LIST_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> sampleList_;
    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getSampleListList() {
      return sampleList_;
    }
    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    public int getSampleListCount() {
      return sampleList_.size();
    }
    /**
     * <code>repeated int32 sample_list = 3;</code>
     */
    public int getSampleList(int index) {
      return sampleList_.get(index);
    }
    private int sampleListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (count_ != 0) {
        output.writeInt32(1, count_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
      }
      if (getSampleListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(sampleListMemoizedSerializedSize);
      }
      for (int i = 0; i < sampleList_.size(); i++) {
        output.writeInt32NoTag(sampleList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, count_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sampleList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(sampleList_.get(i));
        }
        size += dataSize;
        if (!getSampleListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sampleListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof example.simple.SimpleMessge.SimpleMessage)) {
        return super.equals(obj);
      }
      example.simple.SimpleMessge.SimpleMessage other = (example.simple.SimpleMessge.SimpleMessage) obj;

      boolean result = true;
      result = result && (getCount()
          == other.getCount());
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && getSampleListList()
          .equals(other.getSampleListList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      if (getSampleListCount() > 0) {
        hash = (37 * hash) + SAMPLE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSampleListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static example.simple.SimpleMessge.SimpleMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(example.simple.SimpleMessge.SimpleMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code example.simple.SimpleMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:example.simple.SimpleMessage)
        example.simple.SimpleMessge.SimpleMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return example.simple.SimpleMessge.internal_static_example_simple_SimpleMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return example.simple.SimpleMessge.internal_static_example_simple_SimpleMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                example.simple.SimpleMessge.SimpleMessage.class, example.simple.SimpleMessge.SimpleMessage.Builder.class);
      }

      // Construct using example.simple.SimpleMessge.SimpleMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        count_ = 0;

        message_ = "";

        sampleList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return example.simple.SimpleMessge.internal_static_example_simple_SimpleMessage_descriptor;
      }

      public example.simple.SimpleMessge.SimpleMessage getDefaultInstanceForType() {
        return example.simple.SimpleMessge.SimpleMessage.getDefaultInstance();
      }

      public example.simple.SimpleMessge.SimpleMessage build() {
        example.simple.SimpleMessge.SimpleMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public example.simple.SimpleMessge.SimpleMessage buildPartial() {
        example.simple.SimpleMessge.SimpleMessage result = new example.simple.SimpleMessge.SimpleMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.count_ = count_;
        result.message_ = message_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          sampleList_ = java.util.Collections.unmodifiableList(sampleList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.sampleList_ = sampleList_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof example.simple.SimpleMessge.SimpleMessage) {
          return mergeFrom((example.simple.SimpleMessge.SimpleMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(example.simple.SimpleMessge.SimpleMessage other) {
        if (other == example.simple.SimpleMessge.SimpleMessage.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (!other.sampleList_.isEmpty()) {
          if (sampleList_.isEmpty()) {
            sampleList_ = other.sampleList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureSampleListIsMutable();
            sampleList_.addAll(other.sampleList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        example.simple.SimpleMessge.SimpleMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (example.simple.SimpleMessge.SimpleMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int count_ ;
      /**
       * <code>int32 count = 1;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>int32 count = 1;</code>
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 count = 1;</code>
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 2;</code>
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
       * <code>string message = 2;</code>
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
       * <code>string message = 2;</code>
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
       * <code>string message = 2;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 2;</code>
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

      private java.util.List<java.lang.Integer> sampleList_ = java.util.Collections.emptyList();
      private void ensureSampleListIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          sampleList_ = new java.util.ArrayList<java.lang.Integer>(sampleList_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public java.util.List<java.lang.Integer>
          getSampleListList() {
        return java.util.Collections.unmodifiableList(sampleList_);
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public int getSampleListCount() {
        return sampleList_.size();
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public int getSampleList(int index) {
        return sampleList_.get(index);
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public Builder setSampleList(
          int index, int value) {
        ensureSampleListIsMutable();
        sampleList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public Builder addSampleList(int value) {
        ensureSampleListIsMutable();
        sampleList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public Builder addAllSampleList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSampleListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sampleList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 sample_list = 3;</code>
       */
      public Builder clearSampleList() {
        sampleList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:example.simple.SimpleMessage)
    }

    // @@protoc_insertion_point(class_scope:example.simple.SimpleMessage)
    private static final example.simple.SimpleMessge.SimpleMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new example.simple.SimpleMessge.SimpleMessage();
    }

    public static example.simple.SimpleMessge.SimpleMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SimpleMessage>
        PARSER = new com.google.protobuf.AbstractParser<SimpleMessage>() {
      public SimpleMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SimpleMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SimpleMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SimpleMessage> getParserForType() {
      return PARSER;
    }

    public example.simple.SimpleMessge.SimpleMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_simple_SimpleMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_simple_SimpleMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SimpleMessge.proto\022\016example.simple\"D\n\r" +
      "SimpleMessage\022\r\n\005count\030\001 \001(\005\022\017\n\007message\030" +
      "\002 \001(\t\022\023\n\013sample_list\030\003 \003(\005b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_example_simple_SimpleMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_simple_SimpleMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_simple_SimpleMessage_descriptor,
        new java.lang.String[] { "Count", "Message", "SampleList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}