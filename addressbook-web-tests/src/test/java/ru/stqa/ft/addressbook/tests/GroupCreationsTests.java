package ru.stqa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ft.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationsTests  extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
