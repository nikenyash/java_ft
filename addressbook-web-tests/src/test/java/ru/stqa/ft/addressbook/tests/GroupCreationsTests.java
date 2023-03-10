package ru.stqa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.GroupData;

public class GroupCreationsTests  extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    int before = app.getGroupHelper().getGroupCount();
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }

}
