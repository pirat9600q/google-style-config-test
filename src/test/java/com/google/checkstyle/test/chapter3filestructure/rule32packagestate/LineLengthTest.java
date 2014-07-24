package com.google.checkstyle.test.chapter3filestructure.rule32packagestate; //ok

import java.io.File;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.google.checkstyle.test.base.ConfigurationBuilder;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.Configuration; 
import com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck;
import com.google.checkstyle.test.base.BaseCheckTestSupport;

public class LineLengthTest extends BaseCheckTestSupport{
    
    static ConfigurationBuilder builder;
    
    @BeforeClass
    public static void setConfigurationBuilder() throws CheckstyleException {
        builder = new ConfigurationBuilder(new File("src/"),
                "checkstyle_google_style.xml");
    }

    @Test
    public void emptyTest() throws IOException, Exception {

        final String[] expected = {};
        
        Configuration checkConfig = builder.getCheckConfig("LineLength");
        String filePath = builder.getFilePath("LineLengthInput");
        
        verify(checkConfig, filePath, expected);
    }
}


