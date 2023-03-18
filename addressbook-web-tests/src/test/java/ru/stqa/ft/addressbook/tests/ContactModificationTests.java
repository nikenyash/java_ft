package ru.stqa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.ContactData;
import ru.stqa.ft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

  @Test (enabled = false)
  public void testContactModification() {
    if (! app.getContactHelper().isThereAContact()) {

      app.goTo().groupPage();
      if (app.group().list().size() == 0) {
        app.group().create(new GroupData().withName("test1"));
      }
      String groupname = app.group().getGroupName();

      app.getContactHelper().createContact(new ContactData("Nikita", "JR", "Shirobokov",
              "GPB", "Moscow, Golutvinskiy pereulok, 1", "909090",
              "89099090065", "88005550099", "abv@gg.ru", "bhss@fs.ru", groupname));
    }

    app.goTo().returnToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().initContactModification(before.size() - 1);

    ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Oleg", "JR", "Tarenkov",
            "GPB", "Moscow, Golutvinskiy pereulok, 1", "909090",
            "89099090065", "88005550099", "abv@gg.ru", "bhss@fs.ru", null);

    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.goTo().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
