// Two Sum Problem Solutions
// Brute Force and Optimal Approaches

function twoSumBruteForce(nums: number[], target: number): number[] {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }
    return [];
}

function twoSumOptimal(nums: number[], target: number): number[] {
    const visited = new Map<number, number>();
    for (let i = 0; i < nums.length; i++) {
        const remaining = target - nums[i];
        if (visited.has(remaining)) {
            const index = visited.get(remaining);
            if (index !== undefined) {
                return [index, i]; // Return in consistent order
            }
        }
        visited.set(nums[i], i);
    }
    return [];
}

// Test the functions
const nums: number[] = [2, 7, 11, 15];
const target: number = 9;

console.log("Brute Force");
console.log(twoSumBruteForce(nums, target));
console.log("Optimal");
console.log(twoSumOptimal(nums, target));
