package com.company;
/*
methodName_scenario_expectedBehavior
                transform_NormalString_RoundBracketsAdded()

methodName_expectedBehavior_scenario
                transform_RoundBracketsAdded_NormalString()

[test][tested feature]
            testRoundBracketsAddedToString
            roundBracketsAddedToString

 should_expectedBehavior_when_scenario
            should_addRoundBrackets_when_normalString

 given_precondition_when_scenario_then_expectedBehavior
             givenNormalStringWhenTransformAddRoundBracketsThenRoundBracketsAdded





 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddRoundBracketsToStringTest {
    // given
    // run scenario
    // check expectations

    @Test
    public void addRoundBracketsForNormalString(){
      String given="Hello";
      String expected="(Hello)";
      AddRoundBracketsToString addRoundBracketsToString=new AddRoundBracketsToString();

      Assertions.assertEquals(expected,addRoundBracketsToString.transform(given));
    }

    @Test
    public void returnRoundBracketsStringWhenNull(){
        String given=null;
        String expected="()";
        AddRoundBracketsToString addRoundBracketsToString=new AddRoundBracketsToString();

        Assertions.assertEquals(expected,addRoundBracketsToString.transform(given));
    }

}
