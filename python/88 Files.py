filename = r"E:\Study Material\Code\KGcoding_Solutions\README.md"

try:
    with open(filename, 'r') as file:
        print("File contents:")
        for line in file:
            print(line, end='')
except FileNotFoundError:
    print(f"File not found: {filename}")
