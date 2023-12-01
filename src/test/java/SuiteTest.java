

/**
 *
 * @author Louise
 */
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("junitTests")
@IncludeClassNamePatterns("^.*Tests?$")
public class SuiteTest {
    
}
