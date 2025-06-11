class ArrayOperations:
    def __init__(self,nums:list):
        self.nums=list(nums)

    class Operation:
        def __init__(self, data_list: list):
            self.data = data_list

        def mean(self):
            return sum(self.data) / len(self.data)
        
        def median(self):
            sorted_data = sorted(self.data)
            n = len(sorted_data)

            if n % 2 == 1:
                return float(sorted_data[n // 2])
            else:
                mid1 = sorted_data[n // 2 - 1]
                mid2 = sorted_data[n // 2]
                return (mid1 + mid2) / 2.0


arr_ops1 = ArrayOperations([1, 5, 2, 8, 3])
op1 = arr_ops1.Operation(arr_ops1.nums)
print(f"Mean: {op1.mean()}")
print(f"Median: {op1.median()}")
