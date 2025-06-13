from concurrent.futures import ThreadPoolExecutor

class PrintNumbers:
    def __call__(self):
        for i in range(1, 11):
            print(f"Number is {i}")

executor = ThreadPoolExecutor(max_workers=1)
task = PrintNumbers()
executor.submit(task)
executor.shutdown(wait=True)
