package ru.stqa.ft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.ContactData;
import ru.stqa.ft.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("x", "test2", "test3"));
    }
    String groupname = app.getGroupHelper().getGroupName();

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Nikita", "JR", "Shirobokov", "GPB", "Moscow, Golutvinskiy pereulok, 1", "909090", "89099090065", "88005550099", "abv@gg.ru", "bhss@fs.ru", groupname), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }

}
