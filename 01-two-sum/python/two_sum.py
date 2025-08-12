nums = [2,7,11,15]
target = 9

def twoSumBruteForce(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i]+nums[j]== target:
                return [i, j]
    return []


def twoSumOptimal(nums, target):
    visited = {}
    for i in range(len(nums)):
        remaining = target - nums[i]
        if remaining in visited:
            return [i, visited[remaining]]
        visited[nums[i]] = i;
    return []

print("Brute")
print(twoSumBruteForce(nums, target))
print("Optimal")
print(twoSumOptimal(nums, target))