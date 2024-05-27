package Testing;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

class thirdTest {
    @Test
    public void selectDropDawnMenu() {
        open("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        methods select = new methods();


        select.selectOption("#dropdowm-menu-1", "Python");


        select.selectOption("#dropdowm-menu-2", "JUnit");


        select.selectOption("#dropdowm-menu-3", "CSS");


    }
}