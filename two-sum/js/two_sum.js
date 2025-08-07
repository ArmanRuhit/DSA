nums = [2,7,11,15]
target = 9

function twoSumBruteForce(nums, target){
    for(i = 0; i<length(nums); i++){
        for(j=i+1; j<length(nums); j++){
            if (nums[i]+nums[j] == target){
                return [i, j]
            }
        }
    }
    return []
}

function twoSumOptimal(nums, target){
    visited = {}
    for(i=0; i<length(nums); i++){
        remaining = target - nums[i];
        if(visited[remaining]){
            return [i, visited[remaining]]
        }
        visited[nums[i]] = i
    }

    return []
}

console.log("Brute Force")
console.log(twoSumBruteForce(nums, target))
console.log("Optimal")
console.log(twoSumOptimal(nums, target))
