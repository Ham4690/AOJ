def isDifValEach( a )
  sizeNum = a.size - 1
  checkflag = false 

  for i in 0..sizeNum
    for j in (i+1)..sizeNum
      if a[i] == a[j]
        return checkflag
      end
    end
  end
    
  checkflag = true

end

inputArray = gets.chomp.split.map(&:to_i)

if inputArray == inputArray.sort && isDifValEach(inputArray)
    puts 'Yes'
else
    puts 'No'
end