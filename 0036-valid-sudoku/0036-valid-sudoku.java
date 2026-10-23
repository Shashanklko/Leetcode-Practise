class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i =0 ;i<board.length; i++){
            for(int j=0;j<board[i].length;j++){
                char num = board[i][j];

                if(num=='.'){
                    continue;
                }
                String row = num +"in row"+ i;
                String col = num +"in col"+ j;
                int position = (i/3)*3 + (j/3);
                String box = num +"in box"+ position;

                if(seen.contains(row)||
                   seen.contains(col)||
                   seen.contains(box)){
                    return false;
                }

                seen.add(row);
                seen.add(col);
                seen.add(box);
            }
        }
        return true;
    }
}