public class nqueens {
    public static void nQueens(int row,char board[][]){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueens(row+1,board);
            board[row][j]='X';
        }



    }
    public static void printBoard(char board[][]){
        System.out.println();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
                
            }
             System.out.println();
            
        }
       
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        
        } 
        nQueens(0,board);
        
    }
    
}
