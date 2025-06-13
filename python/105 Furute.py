from concurrent.futures import ThreadPoolExecutor
import time

def factorial(n):
    time.sleep(2)
    if n <= 1:
        return 1
    result = 1
    for i in range(2, n + 1):
        result *= i
    return result

executor = ThreadPoolExecutor(max_workers=3)
futures = []
for i in range(10):
    future = executor.submit(factorial, i)
    futures.append(future)

for future in futures:
    result = future.result()
    print("Result is:", result)

executor.shutdown()
