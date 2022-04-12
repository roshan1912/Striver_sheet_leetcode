class Solution {
    public void gameOfLife(int[][] board) {
        int dir[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
      int row=board.length;
      int col=board[0].length;
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          int live=0,dead=0;
          for(int k[]:dir){
             int curr_i=i+k[0],curr_j=j+k[1];
             if(curr_i<0 || curr_i>=row || curr_j<0 || curr_j>=col)continue;
             if(board[curr_i][curr_j]==1 || board[curr_i][curr_j]==2)live++;
             else if(board[curr_i][curr_j]==0 || board[curr_i][curr_j]==3) dead++;
          }
          board[i][j]=solve(board[i][j],live,dead);
          
        }
      }
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(board[i][j]==3)board[i][j]=1;
          else if(board[i][j]==2)board[i][j]=0;
        }
      }
    }
  public int solve(int val,int l,int d){
    if(val==1 || val==3){  
      if(l < 2)return 2;
      else if(l==2 || l==3)return 1;
      else if(l > 3)return 2;
    }else{ 
      if(l==3)return 3;
      else return 0;
    }
    return -5;
    }
}