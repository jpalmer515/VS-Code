#What is the prime number at the nth place?

def is_prime(number_to_check):
    for i in range(2, int(number_to_check**0.5)+1):
        if number_to_check % i == 0:
            return False
    return True

primes = []
n = int(input("Enter a prime place: "))
counter = 1

while len(primes) < n:

    counter = counter + 1
    if is_prime(counter):
        primes.append(counter)

print(primes[-1])