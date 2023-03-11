package ru.stqa.ft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private final String firstname;
  private final String midname;
  private final String lastname;
  private final String company;
  private final String address;
  private final String homephone;
  private final String mobilephone;
  private final String workphone;
  private final String firstemail;
  private final String secondemail;
  private final String group;
  private int id;

  public int getId() { return id; }

  public ContactData(String firstname, String midname, String lastname, String company, String address, String homephone, String mobilephone, String workphone, String firstemail, String secondemail, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstname = firstname;
    this.midname = midname;
    this.lastname = lastname;
    this.company = company;
    this.address = address;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.workphone = workphone;
    this.firstemail = firstemail;
    this.secondemail = secondemail;
    this.group = group;
  }

  public ContactData(int id, String firstname, String midname, String lastname, String company, String address, String homephone, String mobilephone, String workphone, String firstemail, String secondemail, String group) {
    this.id = id;
    this.firstname = firstname;
    this.midname = midname;
    this.lastname = lastname;
    this.company = company;
    this.address = address;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.workphone = workphone;
    this.firstemail = firstemail;
    this.secondemail = secondemail;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMidname() {
    return midname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getWorkphone() {
    return workphone;
  }

  public String getFirstemail() {
    return firstemail;
  }

  public String getSecondemail() {
    return secondemail;
  }

  public String getGroup() {
    return group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (!Objects.equals(firstname, that.firstname)) return false;
    return Objects.equals(lastname, that.lastname);
  }

  @Override
  public int hashCode() {
    int result = firstname != null ? firstname.hashCode() : 0;
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }

}
