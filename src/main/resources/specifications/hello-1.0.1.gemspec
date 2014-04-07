# -*- encoding: utf-8 -*-

Gem::Specification.new do |s|
  s.name = %q{hello}
  s.version = "1.0.1"

  s.required_rubygems_version = Gem::Requirement.new(">= 0") if s.respond_to? :required_rubygems_version=
  s.authors = [%q{VMware}]
  s.date = %q{2011-12-05}
  s.description = %q{Hello Gem.}
  s.email = %q{support@vmware.com}
  s.executables = [%q{hello}]
  s.files = [%q{bin/hello}]
  s.homepage = %q{http://vmware.com}
  s.require_paths = [%q{lib}]
  s.rubygems_version = %q{1.8.9}
  s.summary = %q{Hello Gem.}

  if s.respond_to? :specification_version then
    s.specification_version = 3

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
    else
    end
  else
  end
end
