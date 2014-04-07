Simple sample app testing JRuby Gem in a Jar packaging.

There is a "hello" gem in src/main/resources/META-INF and a dependency
on jruby-complete. The main Application just prints "Hello (...)" with 
the version of the hello gem in brackets.

It runs on the command line with "mvn spring-boot:run" but not in the IDE
or with "mvn package && java -jar target/*.jar".

