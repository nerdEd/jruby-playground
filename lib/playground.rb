require 'java'
java_import 'com.schmalzle.Venkman'

venkman = Venkman.new

array = %w[hello world lists]
array << 42

puts venkman.countMe(array)
