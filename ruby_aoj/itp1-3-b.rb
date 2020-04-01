
inputNum = gets().chomp.to_i
con = 1

if inputNum > 0 then
    while inputNum > 0 do
        puts "Case #{con}: #{inputNum}"
        con += 1
        inputNum = gets().chomp.to_i
    end
end