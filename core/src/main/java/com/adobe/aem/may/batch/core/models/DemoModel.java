package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel {
    @ValueMapValue
    private String text;  //instance variable
    @ValueMapValue
    private String desc;
    @ValueMapValue
    private int num;
  //getter and setter 
    //getter -->to get the value from the variabl

    public String getText() {
        return text;
    }
    public String getDesc() {
        return desc;
    }
    public int getNum() {
        return num;
    }

    
  
    

}
