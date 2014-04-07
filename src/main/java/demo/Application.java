package demo;

import java.util.Collections;

import org.jruby.CompatVersion;
import org.jruby.Ruby;
import org.jruby.RubyInstanceConfig;
import org.jruby.RubyInstanceConfig.CompileMode;
import org.jruby.RubyRuntimeAdapter;
import org.jruby.javasupport.JavaEmbedUtils;

public class Application {

	private Ruby runtime;

	private RubyRuntimeAdapter evaler;

	public Application() {
		RubyInstanceConfig config = new RubyInstanceConfig();
		config.setCompatVersion(CompatVersion.RUBY1_9);
		config.setCompileMode(CompileMode.OFF);
		this.runtime = JavaEmbedUtils.initialize(Collections.emptyList(), config);
		this.evaler = JavaEmbedUtils.newRuntimeAdapter();
	}

	public static void main(String[] args) {
		String rendered = new Application().render();
		System.out.println(rendered);
	}

	private String render() {
		return evaler.eval(runtime, "require 'json'; {:message=>'Hello'}.to_json").toString();
	}
}
