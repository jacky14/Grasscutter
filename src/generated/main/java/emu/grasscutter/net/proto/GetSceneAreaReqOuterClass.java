// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetSceneAreaReq.proto

package emu.grasscutter.net.proto;

public final class GetSceneAreaReqOuterClass {
  private GetSceneAreaReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetSceneAreaReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetSceneAreaReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sceneId = 6;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 belongUid = 5;</code>
     * @return The belongUid.
     */
    int getBelongUid();
  }
  /**
   * Protobuf type {@code GetSceneAreaReq}
   */
  public static final class GetSceneAreaReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetSceneAreaReq)
      GetSceneAreaReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSceneAreaReq.newBuilder() to construct.
    private GetSceneAreaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSceneAreaReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSceneAreaReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetSceneAreaReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 40: {

              belongUid_ = input.readUInt32();
              break;
            }
            case 48: {

              sceneId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.class, emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.Builder.class);
    }

    /**
     * Protobuf enum {@code GetSceneAreaReq.PGIBAKBFMPG}
     */
    public enum PGIBAKBFMPG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 288;</code>
       */
      PEPPOHPHJOJ(1, 288),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PGIBAKBFMPG DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PGIBAKBFMPG EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 288;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 288;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static PGIBAKBFMPG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PGIBAKBFMPG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 288: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PGIBAKBFMPG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PGIBAKBFMPG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PGIBAKBFMPG>() {
              public PGIBAKBFMPG findValueByNumber(int number) {
                return PGIBAKBFMPG.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PGIBAKBFMPG[] VALUES = getStaticValuesArray();
      private static PGIBAKBFMPG[] getStaticValuesArray() {
        return new PGIBAKBFMPG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PGIBAKBFMPG valueOf(
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

      private final int index;
      private final int value;

      private PGIBAKBFMPG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GetSceneAreaReq.PGIBAKBFMPG)
    }

    public static final int SCENEID_FIELD_NUMBER = 6;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 6;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int BELONGUID_FIELD_NUMBER = 5;
    private int belongUid_;
    /**
     * <code>uint32 belongUid = 5;</code>
     * @return The belongUid.
     */
    @java.lang.Override
    public int getBelongUid() {
      return belongUid_;
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
      if (belongUid_ != 0) {
        output.writeUInt32(5, belongUid_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(6, sceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (belongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, belongUid_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq other = (emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getBelongUid()
          != other.getBelongUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + BELONGUID_FIELD_NUMBER;
      hash = (53 * hash) + getBelongUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq prototype) {
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
     * Protobuf type {@code GetSceneAreaReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetSceneAreaReq)
        emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.class, emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        belongUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.internal_static_GetSceneAreaReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq build() {
        emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq buildPartial() {
        emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq result = new emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq(this);
        result.sceneId_ = sceneId_;
        result.belongUid_ = belongUid_;
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
        if (other instanceof emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq other) {
        if (other == emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getBelongUid() != 0) {
          setBelongUid(other.getBelongUid());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 6;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 6;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int belongUid_ ;
      /**
       * <code>uint32 belongUid = 5;</code>
       * @return The belongUid.
       */
      @java.lang.Override
      public int getBelongUid() {
        return belongUid_;
      }
      /**
       * <code>uint32 belongUid = 5;</code>
       * @param value The belongUid to set.
       * @return This builder for chaining.
       */
      public Builder setBelongUid(int value) {
        
        belongUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 belongUid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBelongUid() {
        
        belongUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetSceneAreaReq)
    }

    // @@protoc_insertion_point(class_scope:GetSceneAreaReq)
    private static final emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq();
    }

    public static emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSceneAreaReq>
        PARSER = new com.google.protobuf.AbstractParser<GetSceneAreaReq>() {
      @java.lang.Override
      public GetSceneAreaReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetSceneAreaReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetSceneAreaReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSceneAreaReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSceneAreaReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetSceneAreaReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GetSceneAreaReq.proto\"\227\001\n\017GetSceneArea" +
      "Req\022\017\n\007sceneId\030\006 \001(\r\022\021\n\tbelongUid\030\005 \001(\r\"" +
      "`\n\013PGIBAKBFMPG\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020" +
      "\240\002\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013" +
      "EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetSceneAreaReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetSceneAreaReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetSceneAreaReq_descriptor,
        new java.lang.String[] { "SceneId", "BelongUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
