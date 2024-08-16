import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Lesson7Tests {


    @BeforeAll
    static void beforeAll(){
        //Один для всех
        Configuration.browserSize = "1920*1080";
    }

    @Test
    void testUserForm(){
        open("https://demoqa.com/text-box");


        SelenideElement name = $("#userName");
        SelenideElement email = $("#userEmail");
        SelenideElement adress = $("#currentAddress");
        SelenideElement pAdress = $("#permanentAddress");

        //$(".main-header").shouldHave(Condition.text("Text Box"));
        name.setValue("Anatoliy");
        email.setValue("t0l4ik.kas1@gmail.com");
        adress.setValue("Saina 10");
        pAdress.setValue("Almaty");
        $("#submit").click();
        $("#output").shouldBe(Condition.visible);

    }
}
