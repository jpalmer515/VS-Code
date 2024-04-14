def fibonacci(x):
    counter = 0
    x1, x2 = 0, 1

    if x == 1:
        return x1
    else:
        while counter < x:
            xf = x1 + x2
            x1 = x2
            x2 = xf
            counter += 1

total = 0
fibonacci_places = []
#count = 0
x = int(input("Enter a number: "))

#while len(fibonacci_places) < x:
#    fibonacci_places.append(fibonacci(x))

#for i in fibonacci_places:
#    if i % 2 == 0:
#        total += i

#while len(fibonacci_places) < x:       #x=9 / total = 306
#    fibonacci_places.append(fibonacci(x))
#    if fibonacci(x) % 2 ==0:
#        total += fibonacci(x)

#while count < x:
#    if fibonacci(x) % 2 == 0:
#        count += 1      #count += 1 vs count += count + 1
#        total += fibonacci(x)

while range(0, x):       
    total += fibonacci(x)

print(total)