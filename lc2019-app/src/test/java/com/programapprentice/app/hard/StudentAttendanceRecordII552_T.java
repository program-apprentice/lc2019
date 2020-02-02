package com.programapprentice.app.hard;

import org.junit.Test;

public class StudentAttendanceRecordII552_T {
  StudentAttendanceRecordII552 solution = new StudentAttendanceRecordII552();

  @Test
  public void test1() {
    int n = 3;
    int result = solution.checkRecord(n);
    System.out.println(result);
  }
}
