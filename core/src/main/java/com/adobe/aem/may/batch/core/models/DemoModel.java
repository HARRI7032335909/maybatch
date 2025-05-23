package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel implements Demo{
    @ValueMapValue
    private String text;  //instance variable
    @ValueMapValue
    private String des;
    @ValueMapValue
    private int num;
  //getter and setter 
    //getter -->to get the value from the variabl
    @Override
    public String getArticleTitle() {
        return text;
    }
    @Override
    public String getArticleDes() {
       return des; 
    }
    @Override
    public int getArticleNum() {

        return num;
       
    }

   
    
  
    

}
