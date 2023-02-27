package ru.stqa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {

    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Oleg", "JR", "Tarenkov", "1C", "Moscow, Golutvinskiy pereulok, 10", "919191", "89099090066", "88005550088", "abv@tt.ru", "bhss@fsr.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();

  }

}
