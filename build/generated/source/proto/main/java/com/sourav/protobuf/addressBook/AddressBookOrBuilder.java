// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

package com.sourav.protobuf.addressBook;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:my.addressbook.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .my.addressbook.Person people = 1;</code>
   */
  java.util.List<com.sourav.protobuf.addressBook.Person> 
      getPeopleList();
  /**
   * <code>repeated .my.addressbook.Person people = 1;</code>
   */
  com.sourav.protobuf.addressBook.Person getPeople(int index);
  /**
   * <code>repeated .my.addressbook.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .my.addressbook.Person people = 1;</code>
   */
  java.util.List<? extends com.sourav.protobuf.addressBook.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .my.addressbook.Person people = 1;</code>
   */
  com.sourav.protobuf.addressBook.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
