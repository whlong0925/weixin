package com.mercedesme.wx;

import com.thoughtworks.xstream.converters.basic.StringConverter;

public class XStreamDataConverter extends StringConverter {

  @Override
  public String toString(Object obj) {
    return "<![CDATA[" + super.toString(obj) + "]]>";
  }

}