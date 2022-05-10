package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Job")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent",
                        "Permanent Tester jobs in Harrow on the Hill"},
                {"Tester","London","upto 10 miles","40000","60000","Per Annum","Permanent",
                         "Permanent Tester jobs in London"},
        {"Customer Service","Wales","upto 35 miles","40000","70000","Per Month","Contract",
        "Permanent Customer Service jobs in Wales"},
    {"Tester","croydon","upto 50 miles","40000","60000","Per Annum","Permanent",
                         "Permanent Tester jobs in Croydon"},
        {"Developer","London","upto 20 miles","460000","70000","Per Annum","Permanent",
        "Permanent Developer jobs in London"},
                {"Tester","Scotland","upto 5 miles","40000","60000","Per Annum","Contract",
                "Permanent Tester jobs in Scotland"},


        };
        return data;
    }
}
