package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TryArrayList {

//  public static void breakThis(List<String> ls) {
  public static void breakThis(List ls) {
    ls.add(0, LocalDate.now()); // fails (properly) with typed argument
  }

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
//    List<String> ls = new ArrayList<String>();
    ls.add("Fred");

    // other code here...
    breakThis(ls);
    // generics is compile time only checking (and if we leave types off, can be broken)
//    String s = (String)(ls.get(0)); // cast is "real" generated by compiler
    String s = ls.get(0); // throw class cast exception?

    ls.add("Sheila");
    // typed ls rejectes this
//    ls.add(LocalDate.now());
  }
}
