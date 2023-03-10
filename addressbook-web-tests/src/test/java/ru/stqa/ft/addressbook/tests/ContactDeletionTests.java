package ru.stqa.ft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.ContactData;
import ru.stqa.ft.addressbook.model.GroupData;

import java.util.List;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() {
    if (! app.getContactHelper().isThereAContact()) {
      
      app.getNavigationHelper().gotoGroupPage();
      if (! app.getGroupHelper().isThereAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("x", "test2", "test3"));
      }
      String groupname = app.getGroupHelper().getGroupName();

      app.getContactHelper().createContact(new ContactData("Nikita", "JR", "Shirobokov", "GPB", "Moscow, Golutvinskiy pereulok, 1", "909090", "89099090065", "88005550099", "abv@gg.ru", "bhss@fs.ru", groupname));
    }

    app.getNavigationHelper().returnToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().acceptAlert();
    app.getNavigationHelper().returnToHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size() - 1);
    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);

  }

}
