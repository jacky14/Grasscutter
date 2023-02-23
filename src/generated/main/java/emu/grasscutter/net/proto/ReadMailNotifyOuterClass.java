// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadMailNotify.proto

package emu.grasscutter.net.proto;

public final class ReadMailNotifyOuterClass {
  private ReadMailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReadMailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadMailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @return A list containing the mailIdList.
     */
    java.util.List<java.lang.Integer> getMailIdListList();
    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @return The count of mailIdList.
     */
    int getMailIdListCount();
    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    int getMailIdList(int index);
  }
  /**
   * Protobuf type {@code ReadMailNotify}
   */
  public static final class ReadMailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReadMailNotify)
      ReadMailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadMailNotify.newBuilder() to construct.
    private ReadMailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadMailNotify() {
      mailIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReadMailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReadMailNotify(
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
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mailIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              mailIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                mailIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mailIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          mailIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.class, emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ReadMailNotify.LGJJGCAHHCD}
     */
    public enum LGJJGCAHHCD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1487;</code>
       */
      PEPPOHPHJOJ(1, 1487),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final LGJJGCAHHCD DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final LGJJGCAHHCD EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1487;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1487;
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
      public static LGJJGCAHHCD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LGJJGCAHHCD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1487: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LGJJGCAHHCD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LGJJGCAHHCD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LGJJGCAHHCD>() {
              public LGJJGCAHHCD findValueByNumber(int number) {
                return LGJJGCAHHCD.forNumber(number);
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
        return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final LGJJGCAHHCD[] VALUES = getStaticValuesArray();
      private static LGJJGCAHHCD[] getStaticValuesArray() {
        return new LGJJGCAHHCD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static LGJJGCAHHCD valueOf(
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

      private LGJJGCAHHCD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ReadMailNotify.LGJJGCAHHCD)
    }

    public static final int MAILIDLIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList mailIdList_;
    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @return A list containing the mailIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMailIdListList() {
      return mailIdList_;
    }
    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @return The count of mailIdList.
     */
    public int getMailIdListCount() {
      return mailIdList_.size();
    }
    /**
     * <code>repeated uint32 mailIdList = 15;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    public int getMailIdList(int index) {
      return mailIdList_.getInt(index);
    }
    private int mailIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getMailIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(mailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < mailIdList_.size(); i++) {
        output.writeUInt32NoTag(mailIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < mailIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mailIdList_.getInt(i));
        }
        size += dataSize;
        if (!getMailIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mailIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify other = (emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify) obj;

      if (!getMailIdListList()
          .equals(other.getMailIdListList())) return false;
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
      if (getMailIdListCount() > 0) {
        hash = (37 * hash) + MAILIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify prototype) {
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
     * Protobuf type {@code ReadMailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadMailNotify)
        emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.class, emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.newBuilder()
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
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify build() {
        emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify buildPartial() {
        emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result = new emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mailIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mailIdList_ = mailIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify other) {
        if (other == emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.getDefaultInstance()) return this;
        if (!other.mailIdList_.isEmpty()) {
          if (mailIdList_.isEmpty()) {
            mailIdList_ = other.mailIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMailIdListIsMutable();
            mailIdList_.addAll(other.mailIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mailIdList_ = emptyIntList();
      private void ensureMailIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mailIdList_ = mutableCopy(mailIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @return A list containing the mailIdList.
       */
      public java.util.List<java.lang.Integer>
          getMailIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mailIdList_) : mailIdList_;
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @return The count of mailIdList.
       */
      public int getMailIdListCount() {
        return mailIdList_.size();
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @param index The index of the element to return.
       * @return The mailIdList at the given index.
       */
      public int getMailIdList(int index) {
        return mailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @param index The index to set the value at.
       * @param value The mailIdList to set.
       * @return This builder for chaining.
       */
      public Builder setMailIdList(
          int index, int value) {
        ensureMailIdListIsMutable();
        mailIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @param value The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addMailIdList(int value) {
        ensureMailIdListIsMutable();
        mailIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @param values The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMailIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMailIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mailIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mailIdList = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMailIdList() {
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:ReadMailNotify)
    }

    // @@protoc_insertion_point(class_scope:ReadMailNotify)
    private static final emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify();
    }

    public static emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadMailNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReadMailNotify>() {
      @java.lang.Override
      public ReadMailNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadMailNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadMailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadMailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReadMailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReadMailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReadMailNotify.proto\"\206\001\n\016ReadMailNotif" +
      "y\022\022\n\nmailIdList\030\017 \003(\r\"`\n\013LGJJGCAHHCD\022\010\n\004" +
      "NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\317\013\022\017\n\013DCDNILFDFLB\020" +
      "\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReadMailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReadMailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReadMailNotify_descriptor,
        new java.lang.String[] { "MailIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
