/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        //TestCases tests = new TestCases(); // Initialize your test class

        //TODO: call your test case functions one after other here

        //tests.testCase01();
        //tests.testCase02();
        //tests.testCase03();
        //tests.testCase04();
        //tests.testCase05();
        //tests.testCase06();
        //tests.testCase07();
        //tests.testCase08();
        //tests.testCase09();
        //tests.testCase10();

        //END Tests

        //tests.endTest(); // End your test by clearning connections and closing browser

        // AmazonSearch search = new AmazonSearch();
        // search.testCase01();
        // search.endTest();

        // CountHyperlinks link = new CountHyperlinks();
        // link.testCase01();
        // link.endTest();

        // PostOnLinkedin post = new PostOnLinkedin();
        // post.testCase01();
        // post.endTest();

        // ImageUrlsBookMyShow url = new ImageUrlsBookMyShow();
        // url.testCase01();
        // url.endTest();

        // WindowHandle windows = new WindowHandle();
        // windows.testCase01();
        // windows.endTest();

        // ImdbRatings movieDetails = new ImdbRatings();
        // movieDetails.testCase01();
        // movieDetails.endTest();

        NestedFramesText textInFrames = new NestedFramesText();
        textInFrames.testCase01();
        textInFrames.endTest();

    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
