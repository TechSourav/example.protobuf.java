// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

package com.sourav.protobuf.addressBook;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_my_addressbook_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_my_addressbook_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_my_addressbook_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_my_addressbook_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_my_addressbook_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_my_addressbook_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AddressBook.proto\022\016my.addressbook\032\037goo" +
      "gle/protobuf/timestamp.proto\"\223\002\n\006Person\022" +
      "\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t" +
      "\0222\n\006phones\030\004 \003(\0132\".my.addressbook.Person" +
      ".PhoneNumber\0220\n\014last_updated\030\005 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\032M\n\013PhoneNumber\022\016\n" +
      "\006number\030\001 \001(\t\022.\n\004type\030\002 \001(\0162 .my.address" +
      "book.Person.PhoneType\"+\n\tPhoneType\022\n\n\006MO" +
      "BILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002\"5\n\013AddressBoo" +
      "k\022&\n\006people\030\001 \003(\0132\026.my.addressbook.Perso" +
      "nB]\n\037com.sourav.protobuf.addressBookB\021Ad" +
      "dressBookProtosP\001\252\002$Google.Protobuf.Exam" +
      "ples.AddressBookb\006proto3"
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
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_my_addressbook_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_my_addressbook_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_my_addressbook_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "LastUpdated", });
    internal_static_my_addressbook_Person_PhoneNumber_descriptor =
      internal_static_my_addressbook_Person_descriptor.getNestedTypes().get(0);
    internal_static_my_addressbook_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_my_addressbook_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_my_addressbook_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_my_addressbook_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_my_addressbook_AddressBook_descriptor,
        new java.lang.String[] { "People", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}