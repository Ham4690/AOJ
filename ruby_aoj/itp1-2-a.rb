def cmpNumVal(a, b)
  if a > b
      s = 'a > b'
  elsif a < b
      s = 'a < b'
  else
      s = 'a == b'
  end
end
      
a, b = gets.chomp.split.map(&:to_i)

puts cmpNumVal(a, b)