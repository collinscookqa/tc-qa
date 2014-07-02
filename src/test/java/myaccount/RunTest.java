package myaccount;


import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "myaccountfeature/test.feature",
format = {"html:target/cucumber"})
public class RunTest {

}
