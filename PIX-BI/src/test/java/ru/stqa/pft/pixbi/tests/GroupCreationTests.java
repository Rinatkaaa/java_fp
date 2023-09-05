package ru.stqa.pft.pixbi.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.pixbi.model.GroupDate;

public class GroupCreationTests extends TestBase {
    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("name", "header", "footer"));
        app.submitGroupCreation();
        app.logoutPage();
    }


}
