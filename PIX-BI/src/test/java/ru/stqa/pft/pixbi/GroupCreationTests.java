package ru.stqa.pft.pixbi;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("name", "header", "footer"));
        submitGroupCreation();
        logoutPage();
    }


}
