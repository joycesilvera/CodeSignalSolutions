/*
You are given array of integers called blocks. Each of the values in this array represents the width of a block - the ith block has a height of 1 and a width of blocks[I] (i.e. it’s a 1 x blocks[I] block).

You want to pack all the given blocks into a rectangular container of dimensions height x width, according to the following rules:

Place blocks into the container row by row, starting with block 0.
For each row, place the blocks into the container one by one, in the order they are given in the blocks array.
If there is not enough space to put the current block in the current row, start filling the next row.
You are given the value height of the rectangular container. Your task is to find the minimal possible width of a rectangular container in which all blocks can fit. Find and return this minimal possible width value.
*/


class PatchBlocks{
  
  int packBlocks(int[] blocks, int height) {
    int sum = 0, width = 0, result = 0, patch = 0, last_patch =0, I =0;
    
    for(int b : blocks){
        sum += b;
    }
    width = (int)Math.ceil(sum/height);
    int diff = sum -(width*2);
    
    while( I < blocks.length){
            
            result = Math.max(width, patch);
            patch += blocks[I++];
            
            if(patch < last_patch + diff/2){
                continue;
            }
            else if(patch > width){
                height—;
                patch = 0;
            }
            last_patch = patch;
            
            
    }
    result = Math.max(width, patch);
    
    return result;
}

}


/*Sample Test Cases*/
/*
Input:
blocks: [1, 3, 1, 3, 3]
height: 2
Output:
5
Expected Output: 6

Input:
blocks: [2, 3, 1, 1, 1]
height: 2
Output:
4
Expected Output: 5


Input:
blocks: [4, 1, 1]
height: 2
Output:
3
Expected Output: 4


Input:
blocks: [5, 4, 2, 5, 9, 6, 9, 8, 10, 4]
height: 7
Output:
9
Expected Output: 14


*/
