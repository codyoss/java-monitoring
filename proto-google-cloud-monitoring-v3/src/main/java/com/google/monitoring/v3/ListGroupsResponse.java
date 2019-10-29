/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `ListGroups` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListGroupsResponse}
 */
public final class ListGroupsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListGroupsResponse)
    ListGroupsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListGroupsResponse.newBuilder() to construct.
  private ListGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListGroupsResponse() {
    group_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListGroupsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                group_ = new java.util.ArrayList<com.google.monitoring.v3.Group>();
                mutable_bitField0_ |= 0x00000001;
              }
              group_.add(
                  input.readMessage(com.google.monitoring.v3.Group.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        group_ = java.util.Collections.unmodifiableList(group_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_ListGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListGroupsResponse.class,
            com.google.monitoring.v3.ListGroupsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int GROUP_FIELD_NUMBER = 1;
  private java.util.List<com.google.monitoring.v3.Group> group_;
  /**
   *
   *
   * <pre>
   * The groups that match the specified filters.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.Group group = 1;</code>
   */
  public java.util.List<com.google.monitoring.v3.Group> getGroupList() {
    return group_;
  }
  /**
   *
   *
   * <pre>
   * The groups that match the specified filters.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.Group group = 1;</code>
   */
  public java.util.List<? extends com.google.monitoring.v3.GroupOrBuilder> getGroupOrBuilderList() {
    return group_;
  }
  /**
   *
   *
   * <pre>
   * The groups that match the specified filters.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.Group group = 1;</code>
   */
  public int getGroupCount() {
    return group_.size();
  }
  /**
   *
   *
   * <pre>
   * The groups that match the specified filters.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.Group group = 1;</code>
   */
  public com.google.monitoring.v3.Group getGroup(int index) {
    return group_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The groups that match the specified filters.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.Group group = 1;</code>
   */
  public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder(int index) {
    return group_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < group_.size(); i++) {
      output.writeMessage(1, group_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < group_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, group_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.monitoring.v3.ListGroupsResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListGroupsResponse other =
        (com.google.monitoring.v3.ListGroupsResponse) obj;

    if (!getGroupList().equals(other.getGroupList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getGroupCount() > 0) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroupList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.ListGroupsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The `ListGroups` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListGroupsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListGroupsResponse)
      com.google.monitoring.v3.ListGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListGroupsResponse.class,
              com.google.monitoring.v3.ListGroupsResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListGroupsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGroupFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        groupBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupsResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupsResponse build() {
      com.google.monitoring.v3.ListGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupsResponse buildPartial() {
      com.google.monitoring.v3.ListGroupsResponse result =
          new com.google.monitoring.v3.ListGroupsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          group_ = java.util.Collections.unmodifiableList(group_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListGroupsResponse) {
        return mergeFrom((com.google.monitoring.v3.ListGroupsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListGroupsResponse other) {
      if (other == com.google.monitoring.v3.ListGroupsResponse.getDefaultInstance()) return this;
      if (groupBuilder_ == null) {
        if (!other.group_.isEmpty()) {
          if (group_.isEmpty()) {
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupIsMutable();
            group_.addAll(other.group_);
          }
          onChanged();
        }
      } else {
        if (!other.group_.isEmpty()) {
          if (groupBuilder_.isEmpty()) {
            groupBuilder_.dispose();
            groupBuilder_ = null;
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGroupFieldBuilder()
                    : null;
          } else {
            groupBuilder_.addAllMessages(other.group_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.monitoring.v3.ListGroupsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListGroupsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.monitoring.v3.Group> group_ =
        java.util.Collections.emptyList();

    private void ensureGroupIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        group_ = new java.util.ArrayList<com.google.monitoring.v3.Group>(group_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.Group,
            com.google.monitoring.v3.Group.Builder,
            com.google.monitoring.v3.GroupOrBuilder>
        groupBuilder_;

    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.Group> getGroupList() {
      if (groupBuilder_ == null) {
        return java.util.Collections.unmodifiableList(group_);
      } else {
        return groupBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public int getGroupCount() {
      if (groupBuilder_ == null) {
        return group_.size();
      } else {
        return groupBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public com.google.monitoring.v3.Group getGroup(int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);
      } else {
        return groupBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder setGroup(int index, com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.set(index, value);
        onChanged();
      } else {
        groupBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder setGroup(int index, com.google.monitoring.v3.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder addGroup(com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
      } else {
        groupBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder addGroup(int index, com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(index, value);
        onChanged();
      } else {
        groupBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder addGroup(com.google.monitoring.v3.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder addGroup(int index, com.google.monitoring.v3.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder addAllGroup(
        java.lang.Iterable<? extends com.google.monitoring.v3.Group> values) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, group_);
        onChanged();
      } else {
        groupBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public Builder removeGroup(int index) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.remove(index);
        onChanged();
      } else {
        groupBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public com.google.monitoring.v3.Group.Builder getGroupBuilder(int index) {
      return getGroupFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder(int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);
      } else {
        return groupBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public java.util.List<? extends com.google.monitoring.v3.GroupOrBuilder>
        getGroupOrBuilderList() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(group_);
      }
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public com.google.monitoring.v3.Group.Builder addGroupBuilder() {
      return getGroupFieldBuilder().addBuilder(com.google.monitoring.v3.Group.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public com.google.monitoring.v3.Group.Builder addGroupBuilder(int index) {
      return getGroupFieldBuilder()
          .addBuilder(index, com.google.monitoring.v3.Group.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The groups that match the specified filters.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.Group group = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.Group.Builder> getGroupBuilderList() {
      return getGroupFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.Group,
            com.google.monitoring.v3.Group.Builder,
            com.google.monitoring.v3.GroupOrBuilder>
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.monitoring.v3.Group,
                com.google.monitoring.v3.Group.Builder,
                com.google.monitoring.v3.GroupOrBuilder>(
                group_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListGroupsResponse)
  private static final com.google.monitoring.v3.ListGroupsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListGroupsResponse();
  }

  public static com.google.monitoring.v3.ListGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGroupsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListGroupsResponse>() {
        @java.lang.Override
        public ListGroupsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListGroupsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.ListGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
