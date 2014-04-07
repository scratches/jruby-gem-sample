Hello Gem
=========

Simple gem to test packaging etc.

Set up a local ruby environment (so sudo not required):

    $ rvm use 1.9.2

Build the gem

    $ gem build hello.gemspec
	
Install it

    $ gem install hello-*.gem

Run it

    $ hello
    Hello (0.0.1): 
    $ hello world
    Hello (0.0.1): world

Build and install a different version:

    $ VERSION=0.0.2 gem build hello.gemspec
    $ gem install hello-*.gem

Run it:

    $ hello world
    Hello (0.0.2): world

Run a different version:

    $ hello _0.0.1_ world
    Hello (0.0.1): world

Uninstall a particular version

    $ gem uninstall 0.0.2
