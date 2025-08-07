package main

import "fmt"

func main()  {
	nums := []int{2, 7, 11, 15}
	target := 9

	fmt.Println("Brute Force")
	fmt.Println(twoSumBruteForce(nums, target))

	fmt.Println("Optimal")
	fmt.Println(twoSumOptimal(nums, target))

}

func twoSumBruteForce(nums []int, target int) []int	{
	for i:=0; i<len(nums); i++ {
		for j:=i+1; j<len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}
	}
	return []int{}
}

func twoSumOptimal(nums []int, target int) []int {
	visited := make(map[int]int)

	for i:=0; i<len(nums); i++ {
		remaining := target - nums[i]
		if j, exist := visited[remaining]; exist {
			return []int{i, j}
		}
		visited[nums[i]] = i;
	}
	return []int{}
}