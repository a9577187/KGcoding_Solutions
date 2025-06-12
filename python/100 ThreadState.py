import threading

def hello():
    for _ in range(11):
        print(f"Hello from thread: {threading.current_thread().name}")

t1 = threading.Thread(target=hello, name="Thread-1")
t2 = threading.Thread(target=hello, name="Thread-2")
print(t1.is_alive())
print(t2.is_alive())
t1.start()
t2.start()
print(t1.is_alive())
print(t2.is_alive())
t1.join()
t2.join()
print(t1.is_alive())
print(t2.is_alive())