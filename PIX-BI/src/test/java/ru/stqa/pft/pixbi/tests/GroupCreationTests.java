package ru.stqa.pft.pixbi.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.pixbi.model.GroupDate;

public class GroupCreationTests extends TestBase {
    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupDate("name", "header", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().logoutPage();
    }


}
