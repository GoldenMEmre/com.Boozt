package testlogger;

import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Optional;
import org.junit.jupiter.api.extension.TestWatcher;
import pages.JavaLog;

public class TestResultLogger implements TestWatcher {

    JavaLog log = new JavaLog();
    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName + " PASSED");
    }
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage() ;
        log.error(testName + " FAILED with cause : " + testFailCause);
    }
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
    }
    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
    }
}

