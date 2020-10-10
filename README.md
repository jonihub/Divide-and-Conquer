# Divide and Conquer

## Last Occurence

#### Submission for CPSC 280

This is a program which finds the last occurence of **k** in a sorted array.

:exclamation: :fire: Must implement a **divide and conquer** strategy. :fire: :exclamation:

### Instructions
*Input:*  

* n                  the number of integers that follow
* n integers, sorted, can contain duplicates
* k                  search target

*Output:*  The index of the last occurrence of k in the sorted array you read in

**===============================================================================**

## Select

#### Submission for CPSC 280

This is a program which finds the **kth smallest element** in an unsorted array.

:exclamation: :fire: Must implement a **divide and conquer** strategy. :fire: :exclamation: 

### Instructions
Use the partition :floppy_disk: algorithm from quicksort. :runner: 

*Pseudocode:*  

```
 int select(arr, first, last, k)

       base case (when last-first is small)

       mid = partition(arr, first, last);  

       if (k <= mid - first)   return select(arr, first, mid – 1, k)

       else if (k > mid – first + 1) return select arr, mid + 1, last, k – (mid – first + 1))

       else return arr[mid]
 ```
