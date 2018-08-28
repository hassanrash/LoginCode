package com.ibm.autotest.mockappication;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(

        features = "src/test/resourses/MockApp",
        glue = {"src/test/java/com.ibm.autotest.mockappication"},
        format = {"json:target/integration_cucumber.json"},
        tags = {"@login"}
   )                         
                                    //what tags to incluse(@)/exclude(@~)
public class LoginTest {

}
