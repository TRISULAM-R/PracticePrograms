package practiceProg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {

    @DataProvider(name = "Test Data")
    public Object[][] testData() {
        Object[][] testData = new Object[2][2];

        testData[0][0] = "trisulam";
        testData[0][1] = "1234";

        testData[1][0] = "Kumar";
        testData[1][1] = "1234";

        return testData;
    }

    @Test(dataProvider = "Test Data")
    public void testUserData(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}

