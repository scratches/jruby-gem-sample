require "rubygems"

module Hello

  VERSION = File.basename(File.expand_path("../..", __FILE__))[/hello-(.*)/,1] || "???"

  class Runner

    def self.run(args=[])
      new.run(args)
    end

    def run(args)
      puts("Hello (%s): %s" % [Hello::VERSION, args.join(' ')])
    end
    
  end

end

