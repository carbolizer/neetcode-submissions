from typing import List


def find_max_in_each_list(nested_arr: List[List[int]]) -> List[int]:
    max_element = 0
    list_of_max_elements = []
    for sub_list in nested_arr:
        for element in sub_list:
            max_element = max(element, max_element)
        list_of_max_elements.append(max_element)
        max_element = 0
    return list_of_max_elements
    

# do not modify below this line
print(find_max_in_each_list([[1, 2], [3, 4, 2]]))
print(find_max_in_each_list([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(find_max_in_each_list([[5, 6, 2, 8], [9], [9, 10], [11, 10, 11]]))
