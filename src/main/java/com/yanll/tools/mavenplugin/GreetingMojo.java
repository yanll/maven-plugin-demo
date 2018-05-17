package com.yanll.tools.mavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by YANLL on 2017/02/14.
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(property = "sayhi.greeting", defaultValue = "Hello World!")
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(greeting);
    }
}
