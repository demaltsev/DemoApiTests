package wiki;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class WikiTest {

    private static final String URL = "https://ru.wikipedia.org/wiki/Java";

    @Test
    public void allHrefTest() {
        Selenide.open(URL);
        ElementsCollection href = $$x("//div[@id='toc']//a[@href]");
        List<String> links = new ArrayList<>();

        href.forEach(x -> links.add(x.getAttribute("href")));

//        List<Integer> linksLength=href.stream().map(x->x.getAttribute("href").length()).collect(Collectors.toList());



        for (int i = 0; i < links.size(); i++) {
            String listUrl = links.get(i);
            Selenide.open(listUrl);
            String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
            Assert.assertEquals(listUrl, currentUrl);
        }

//        while (links.size() > 0) {
//            int randomNum = new Random().nextInt(links.size());
//            Selenide.open(links.get(randomNum));
//            links.remove(WebDriverRunner.getWebDriver().getCurrentUrl());
//        }



    }
}
