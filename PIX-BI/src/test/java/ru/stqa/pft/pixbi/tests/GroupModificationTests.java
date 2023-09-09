package ru.stqa.pft.pixbi.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.pixbi.model.GroupDate;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupDate("name", "header", "footer"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().logoutPage();
    }
}
