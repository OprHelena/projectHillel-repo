package ua.ithillet.lesson5;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HillelListImplementTest {

    WorkWithArrays workWithArrays = new WorkWithArrays();

    private static final String[] arrayWords = {"arise", "awake", "be", "bear", "beat", "become", "begin", "bend", "bet",
            "bind", "bite", "bleed", "blow", "break", "breed", "bring", "build", "buy", "catch", "choose", "cling", "come", "cost",
            "cut", "deal", "dig", "do", "draw", "drink", "drive", "eat", "fall", "feed", "feel", "fight", "find", "flee", "fly", "forbid",
            "forget", "forgive", "freeze", "get", "give", "go", "grow", "hang", "have", "hide", "hit", "hold", "hurt", "keep", "know",
            "lay", "lead", "learn", "leave", "lend", "let", "lie", "light", "lose", "make", "mean", "meet", "pay", "put", "read", "ride"};

    private static final String[] checkArray = {"awake", "become", "bite", "bring"};
    private static final String[] checkRemoveItem = {"awake", "become", "bring"};
    private static final String item = "bite";

    private static final String[] checkNegScenarioArray = {"awake", "become", "eat", "bring", "lose"};
    private static final String itemNeg = "lose";


    @Test
    public void checkPositiveScenarios() {
        SoftAssertions softAssertions = new SoftAssertions();
        workWithArrays.add(arrayWords[1]);
        workWithArrays.add(arrayWords[5]);
        workWithArrays.add(arrayWords[10]);
        workWithArrays.add(arrayWords[15]);
        softAssertions.assertThat(Arrays.stream(workWithArrays.getAll()).toList()).as("The context of arrays is the same").isEqualTo(Arrays.stream(checkArray).toList());
        softAssertions.assertThat(workWithArrays.size()).as("The array sizes matches").isNotEqualTo(checkNegScenarioArray.length);
        softAssertions.assertThat(workWithArrays.contains(itemNeg)).as("The array contains required value").isFalse();
        softAssertions.assertThat(workWithArrays.indexOf(itemNeg)).as("The right index").isEqualTo(-1);
        softAssertions.assertThat(workWithArrays.get(2)).as("The index is correct").isNotEqualTo(itemNeg);
        softAssertions.assertThat(workWithArrays.remove(2)).as("The item is removed").isNotEqualTo(itemNeg);
        softAssertions.assertThat(workWithArrays.getAll()).as("The array after removed value is correct").isNotEqualTo(checkNegScenarioArray);
        softAssertions.assertAll();
    }

    @Test
    public void checkNegativeScenarios() {
        SoftAssertions softAssertions = new SoftAssertions();
        workWithArrays.add(arrayWords[1]);
        workWithArrays.add(arrayWords[5]);
        workWithArrays.add(arrayWords[10]);
        workWithArrays.add(arrayWords[15]);
        softAssertions.assertThat(Arrays.stream(workWithArrays.getAll()).toList()).as("The context of arrays is not the same").isNotEqualTo(Arrays.stream(checkNegScenarioArray).toList());
        softAssertions.assertThat(workWithArrays.size()).as("Array sizes do not match").isNotEqualTo(checkNegScenarioArray.length);
        softAssertions.assertThat(workWithArrays.contains(item)).as("The array does not contain required value").isTrue();
        softAssertions.assertThat(workWithArrays.indexOf(item)).as("The wrong index").isEqualTo(0);
        softAssertions.assertThat(workWithArrays.get(2)).as("The index is not correct").isEqualTo(item);
        softAssertions.assertThat(workWithArrays.remove(2)).as("The item is not removed").isEqualTo(item);
        softAssertions.assertThat(workWithArrays.remove(7)).as("There is incorrect index").isEqualTo("Incorrect value. Try one more! ");
        softAssertions.assertThat(workWithArrays.getAll()).as("The array after removed value is not correct").isEqualTo(checkRemoveItem);
        softAssertions.assertAll();
    }
}
