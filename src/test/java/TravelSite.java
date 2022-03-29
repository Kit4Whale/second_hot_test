import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TravelSite {

    @Test
    void articleSearch() {
        open("https://www.kovinov.com/");
        $("[id=litravel]").click();
        $("#travel .second-level-menu.travel a").click();
        $(".title").click();
        $(".story").shouldHave(text("На Арбаику через каньон реки Хашупсе"));

    }
}
