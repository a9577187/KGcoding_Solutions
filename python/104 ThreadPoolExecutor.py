from concurrent.futures import ThreadPoolExecutor, wait, ALL_COMPLETED
import threading
import time
import random

class SleepTask:
    def __call__(self):
        thread_name = threading.current_thread().name
        print(f"Started with Thread: {thread_name}")
        time.sleep(random.randint(1, 5))
        print(f"Ended with Thread: {thread_name}")

executor = ThreadPoolExecutor(max_workers=5)
tasks = [executor.submit(SleepTask()) for _ in range(10)]

done, not_done = wait(tasks, timeout=10, return_when=ALL_COMPLETED)

if not_done:
    print("EMERGENCY SHUTDOWN")
    executor.shutdown(wait=False, cancel_futures=True)
else:
    executor.shutdown()
