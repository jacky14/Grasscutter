// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShapeType.proto

package emu.grasscutter.net.proto;

public final class ShapeTypeOuterClass {
  private ShapeTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ShapeType}
   */
  public enum ShapeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE = 0;</code>
     */
    SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE(0),
    /**
     * <code>SHAPE_TYPE_OBSTACLE_SHAPE_BOX = 1;</code>
     */
    SHAPE_TYPE_OBSTACLE_SHAPE_BOX(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE = 0;</code>
     */
    public static final int SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE_VALUE = 0;
    /**
     * <code>SHAPE_TYPE_OBSTACLE_SHAPE_BOX = 1;</code>
     */
    public static final int SHAPE_TYPE_OBSTACLE_SHAPE_BOX_VALUE = 1;


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
    public static ShapeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ShapeType forNumber(int value) {
      switch (value) {
        case 0: return SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE;
        case 1: return SHAPE_TYPE_OBSTACLE_SHAPE_BOX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShapeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ShapeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ShapeType>() {
            public ShapeType findValueByNumber(int number) {
              return ShapeType.forNumber(number);
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
      return emu.grasscutter.net.proto.ShapeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShapeType[] VALUES = values();

    public static ShapeType valueOf(
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

    private ShapeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ShapeType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ShapeType.proto*U\n\tShapeType\022%\n!SHAPE_" +
      "TYPE_OBSTACLE_SHAPE_CAPSULE\020\000\022!\n\035SHAPE_T" +
      "YPE_OBSTACLE_SHAPE_BOX\020\001B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
