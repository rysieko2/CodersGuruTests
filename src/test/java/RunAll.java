import codersguru.RunCucumberTests;
import codersguru.RunJunitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({RunJunitTests.class, RunCucumberTests.class})


public class RunAll {}
