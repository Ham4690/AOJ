$hourToSec = 3600
$minToSec  = 60

def exchangeToDigitalTime(inputSec)
    hour = inputSec / $hourToSec
    swpTime  = inputSec % $hourToSec
    min  = swpTime / $minToSec
    sec  = swpTime % $minToSec
    
    return hour, min, sec
end

input_s = gets.to_i

h, m, s = exchangeToDigitalTime(input_s)

puts "#{h}:#{m}:#{s}"