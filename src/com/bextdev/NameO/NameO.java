package com.bextdev.NameO;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;

public class NameO extends AndroidNonvisibleComponent {

  public NameO(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Returns the sum of the given list of integers.")
  public int SumAll(YailList integers) {
    int sum = 0;

    for (final Object o : integers.toArray()) {
      try {
        sum += Integer.parseInt(o.toString());
      } catch (NumberFormatException e) {
        throw new YailRuntimeError(e.toString(), "NumberFormatException");
      }
    }

    return sum;
  }
}
