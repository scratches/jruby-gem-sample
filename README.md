Simple sample app testing JRuby Gem in a Jar packaging.

There is a "hello" gem in lib/src/main/resources/ and a dependency
on jruby. The main Application just prints "Hello (...)" with 
the version of the hello gem in brackets.

You can run the "app" project like this:

```
$ mvn install
$ (cd app; mvn spring-boot:run)
```

But this won't work:

```
$ java -jar app/target/*.jar
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:53)
	at java.lang.Thread.run(Thread.java:744)
Caused by: org.jruby.exceptions.RaiseException: (LoadError) no such file to load -- hello
	at org.jruby.RubyKernel.require(org/jruby/RubyKernel.java:1085)
	at RUBY.require(file:/home/dsyer/dev/boot/workspace/jruby-app/app/target/jruby-app-0.0.1-SNAPSHOT.jar!/lib/jruby-stdlib-1.7.11.jar!/lib/jruby-stdlib-1.7.11.jar!/META-INF/jruby.home/lib/ruby/shared/rubygems/core_ext/kernel_require.rb:55)
	at RUBY.(root)(<script>:1)
```

