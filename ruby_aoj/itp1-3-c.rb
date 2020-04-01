def isZero?(x,y)
  if x <= 0 && y <= 0 then
    return false
  end
  return true
end


x, y = gets.chomp.split.map(&:to_i)

while isZero?(x, y) do
  if y < x then
    puts "#{y} #{x}"
  else
    puts "#{x} #{y}"
  end

  x, y = gets.chomp.split.map(&:to_i)
end