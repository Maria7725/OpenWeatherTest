package com.openweather.tests;

import com.openweather.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FistTest extends BaseTest {
@Test
    public void getPageTitletest() {
        String title = driver.getTitle();
        Assert.assertEquals("Current weather and forecast - OpenWeatherMap", title);
    }
}
