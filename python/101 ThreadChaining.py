import threading

def hello():
    for _ in range(11):
        print(f"Hello from thread: {threading.current_thread().name}")

t1 = threading.Thread(target=hello, name="Thread-1")
t2 = threading.Thread(target=hello, name="Thread-2")
t3 = threading.Thread(target=hello, name="Thread-3")
print("\n\n\t",t1.name,"\n\n")
print(t1.is_alive())
t1.start()
print(t1.is_alive())
t1.join()
print(t1.is_alive())

print("\n\n\t",t2.name,"\n\n")
print(t2.is_alive())
t2.start()
print(t2.is_alive())
t2.join()
print(t2.is_alive())

print("\n\n\t",t3.name,"\n\n")
print(t3.is_alive())
t3.start()
print(t3.is_alive())
t3.join()
print(t3.is_alive())