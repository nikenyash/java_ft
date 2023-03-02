package ru.stqa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Nikita", "JR", "Shirobokov", "GPB", "Moscow, Golutvinskiy pereulok, 1", "909090", "89099090065", "88005550099", "abv@gg.ru", "bhss@fs.ru", "test3"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Oleg", "JR", "Tarenkov", "1C", "Moscow, Golutvinskiy pereulok, 10", "919191", "89099090066", "88005550088", "abv@tt.ru", "bhss@fsr.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();

  }

}
