package Testing;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class methods {
    public void selectOption(String field, String element){
        $(field).click();

        //$x("//option[text() = \"" + element + "\"]").click();
        $$("option").find(text(element)).click();


        $(field).shouldHave(text(element));
    }
}
