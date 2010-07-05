package com.schmalzle;

import java.util.*;

public class Venkman {

  public String deployContainmentGrid() {
    return "DEPLOYED!!!!";
  }

  public Integer countMe(List<String> strings) {
  
    // This code will fail, but I can pass a mixed array in and it won't
    // List<String> myList = new ArrayList<String>();
    // myList.add("hello");
    // myList.add(42);

    return strings.size();
  }
}
