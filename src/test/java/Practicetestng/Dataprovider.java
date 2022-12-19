package Practicetestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

    @DataProvider(name = "Name")
    public Object[] Barkha (){
        return new Object[]{ " barkha agrawal"};

    }

@Test(dataProvider = "Name")
    public void demo(String surname){
    System.out.println(surname);
}

// we can use single and multi array as well




}
