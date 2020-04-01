
inputNums = gets.chomp.split.map(&:to_i)

inputNums.sort!

puts "#{inputNums[0]} #{inputNums[1]} #{inputNums[2]}"