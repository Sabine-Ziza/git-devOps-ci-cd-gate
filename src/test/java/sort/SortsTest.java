package sort;

import base.BaseTests;

import org.testng.annotations.Test;
import page.SortFilter;

public class SortsTest extends BaseTests {
  @Test
    public void testFilterProducts(){
      SortFilter sortFilter = new SortFilter(driver);
      sortFilter.sortProduct("Name (A - Z)");

  }
}
