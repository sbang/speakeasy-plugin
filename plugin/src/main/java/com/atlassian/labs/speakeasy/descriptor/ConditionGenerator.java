package com.atlassian.labs.speakeasy.descriptor;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Element;

import java.util.List;

/**
 *
 */
public interface ConditionGenerator
{
    Element addConditionElement(Element parentElement);
}
