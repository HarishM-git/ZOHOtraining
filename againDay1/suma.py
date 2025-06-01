class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=[]
        ds=[]
        def rc(i:int,arr:list,t:int,ds:list,ans:list):
            if i==len(arr):
                if t==0:
                    ans.append(ds[:])
                return
            if arr[i]<=t:
                ds.append(arr[i])
                rc(i,arr,t-arr[i],ds,ans)
                ds.pop()
            rc(i+1,arr,t,ds,ans)
        rc(0,candidates,target,ds,ans)
        return ans

