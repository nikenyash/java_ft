package ru.stqa.ft.addressbook.model;

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

  public ContactData(String firstname, String midname, String lastname, String company, String address, String homephone, String mobilephone, String workphone, String firstemail, String secondemail) {
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
}
