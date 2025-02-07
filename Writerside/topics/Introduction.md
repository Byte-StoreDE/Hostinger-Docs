# Create a simple module

<web-summary>
Discover how to create a simple module for Hostinger by following a step-by-step guide to set up your workspace, structure your module, and define your main class.
</web-summary>

Developing a module for Hostinger can be an exciting and rewarding task. Here's a step-by-step guide to help you get
started:

### Workspace Setup

1. Create Maven or Gradle Projekt.
2. Add Library to a pom or build file.
   #### Maven
   <code-block lang="xml">
        &lt;dependency&gt;
            &lt;groupId&gt;de.bytestore.hostinger&lt;/groupId&gt;
            &lt;artifactId&gt;core&lt;/artifactId&gt;
            &lt;version&gt;%version%&lt;/version&gt;
            &lt;!-- USING PLAIN (Lite without compiled Frontend) --&gt;
            &lt;classifier&gt;plain&lt;/classifier&gt;
            &lt;exclusions&gt;
                &lt;exclusion&gt;
                    &lt;groupId&gt;com.vaadin&lt;/groupId&gt;
                    &lt;artifactId&gt;vaadin-bom&lt;/artifactId&gt;
                &lt;/exclusion&gt;
            &lt;/exclusions&gt;
        &lt;/dependency&gt;
   </code-block>

   #### Gradle
   <code-block lang="groovy">
      implementation 'de.bytestore.hostinger:core:%version%:plain'
   </code-block>
3. Import Maven or Gradle Dependencies.

### Module Structure

Hostinger uses the [Jmix Plugin Addon](https://github.com/Gamer08YT/jmix-plugin-addon), which is based
on [PF4J Framework](https://pf4j.org/) to load plugins, so if anything is unclear, you can look at their
documentation.

1. Create your package in the following format (xx.xx.hostinger.**modulename**) -> **For example,
   de.bytestore.hostinger.docker**
2. Following names for sub packages should be used:

   | Name           | Description                                 |
                                                                                                                                    |----------------|---------------------------------------------|
   | service        | Contains your Spring Service Classes.       |
   | entity*        | Contains your JPA Objects.                  |
   | configurations | Contains your Spring Configuration Classes. |
   | roles          | Contains your JMIX Role / Group definitions |
   | settings*      | Contains your App Settings definitions      |
   | view*          | Contains your JMIX View Classes             |

   *Custom JPA Changelog generation is currently not supported for Modules :(
3. Create your first Main Class in the format (Name**Module.class**) and extend it was Plugin -> **For example,
   DockerModule.java**.
   ```java
   package de.bytestore.hostinger.docker;
   
   import org.pf4j.Plugin;
   import org.slf4j.Logger;
   import org.slf4j.LoggerFactory;
   
   public class DockerModule extends Plugin {
       Logger logger = LoggerFactory.getLogger(DockerModule.class);
   
       @Override
       public void start() {
           // This message will be loaded if Hostinger starts your Module.
           logger.info("Starting...");
       }
   
       @Override
       public void stop() {
           // This message will be loaded if Hostinger stops your Module.
           logger.info("Stopping...");
       }
   
       @Override
       public void delete() {
           // This message will be loaded if Hostinger deletes your Module.
           logger.info("Deleting...");
       }
   }
   ``` 

4. Define your Module definition file so that hostinger can load it, create an Manifest File with the following content:
   <code-block lang="yaml" id="plugin-manifest">
   Manifest-Version: 1.0
   Plugin-Class: de.bytestore.hostinger.docker.DockerModule
   Plugin-Id: docker
   Plugin-Provider: Max Mustermann
   Plugin-Version: 1.0.0
   </code-block>

   For more information, there's [a PF4J docs' page](https://pf4j.org/doc/getting-started.html) describing the
   descriptor file.

<note id="deployment" title="Do you need technical support or are you interested in individual development?">
Feel free to contact our technical team.
<a href="mailto:development@byte-store.de">development@byte-store.de</a>

</note>

## Troubleshooting:

No Extensions getting found?

Please enable Annotations for your Project. see [PF4J Troubleshooting](https://pf4j.org/doc/troubleshooting.html)

![annotation.png.png](https://github.com/Gamer08YT/jmix-plugin-addon/raw/master/assets/img/annotation.png)

If you use Gradle, please add the following to your build.gradle.

```groovy
annotationProcessor(group: 'org.pf4j', name: 'pf4j', version: "<pf4jVersion>")
``` 

<seealso>
    <category ref="core">
        <a href="API.topic">API reference</a>
        <a href="https://javadoc.byte-store.de/">JavaDoc</a>
    </category>
</seealso>