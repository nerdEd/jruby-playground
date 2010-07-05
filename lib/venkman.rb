require 'java'
java_import 'com.schmalzle.Venkman'

require 'rubygems'
require 'sinatra'

get '/' do
  v = Venkman.new
  v.deployContainmentGrid
end
