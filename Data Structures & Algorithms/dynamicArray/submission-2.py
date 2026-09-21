class DynamicArray:
    
    def __init__(self, capacity: int):
        self.my_array = []
        if capacity > 0:
            self.capacity = capacity
        else:
            raise ValueError("Capacity Must be Greater than 0")


    def get(self, i: int) -> int:
        return self.my_array[i]

    def set(self, i: int, n: int) -> None:
        self.my_array[i] = n

    def pushback(self, n: int) -> None:
        if (len(self.my_array) == self.capacity):
            self.resize()
            self.my_array.append(n)
        else:
            self.my_array.append(n)

    def popback(self) -> int:
        return self.my_array.pop()
    def resize(self) -> None:
        self.capacity = self.capacity * 2

    def getSize(self) -> int:
        count = 0
        for _ in self.my_array:
            count += 1
        return count
    
    def getCapacity(self) -> int:
        return self.capacity
