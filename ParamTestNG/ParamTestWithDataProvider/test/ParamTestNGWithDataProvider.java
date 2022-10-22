/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.paramTestNG.core.GetMaxOccurringChar;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Hoang Anh
 */
public class ParamTestNGWithDataProvider {
    private GetMaxOccurringChar getMaxOccurringChar;

   @BeforeMethod
   public void initialize() {
      getMaxOccurringChar = new GetMaxOccurringChar();
   }


   @DataProvider(name = "test1")
   public static Object[][] getMaxOccurringChar() {
      return new Object[][] {{'l', "Hello World"}, {'d',"Introduction to Software Engineering"}, {'t',"Software Testing"}, {'e', "Software development project"}, {'e', "Software Requirements"}};
   }
   @Test(dataProvider = "test1")
   public void testgetMaxOccurringChar(char c, String string) {
      System.out.println(c + " " + string);
      Assert.assertEquals(c, getMaxOccurringChar.getMaxOccurringChar(string));
   }
}
