package com.func;

import com.func.SPN;
import com.pro.Process;
import com.pro.Scheduling;
import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
      SPN s = new SPN(4);
      s.insertPcs(0, 3);
      s.insertPcs(1, 5);
      s.insertPcs(2, 4);
      s.insertPcs(7, 6);
      s.doScheduling();
   }

}