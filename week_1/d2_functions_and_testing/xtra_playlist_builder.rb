#---
# Excerpted from "Programming Ruby 1.9 and 2.0",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/ruby4 for more book information.
#---
class PlaylistBuilder
  Entry = Struct.new(:artist, :title)

  attr_reader :playlist
  def initialize(db)
    @playlist = []
  end

  def include_artist(name)
    @playlist = [ ]
    7.times { @playlist << Entry.new("krauss", "") }
  end

  def include_title(name)
    @playlist = [ ]
    13.times { @playlist << Entry.new("", "midnight") }
  end

end unless defined? PlaylistBuilder

module DBI
  class DBI
    def disconnect
    end
  end
  def connect(arg)
    DBI.new
  end
  module_function :connect
end


# DBI stands for Database Independent Interface for Ruby, which means DBI provides an abstraction layer between the Ruby code and the underlying database, allowing you to switch database implementations really easily. It defines a set of methods, variables, and conventions that provide a consistent database interface, independent of the actual database being used.
