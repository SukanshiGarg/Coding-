class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
    return s;
}
        StringBuilder[] row = new StringBuilder[numRows];
    for(int i=0;i<numRows;i++){
        row[i]= new StringBuilder();
    }
    int dir =1;
    int currRow =0;
    for(char c : s.toCharArray()){
       
         row[currRow].append(c);
        if(currRow == numRows-1){
            dir = -1;
        }else if(currRow == 0){
            dir = 1;
        }
        
        currRow = currRow + dir;
    }
    StringBuilder sb = new StringBuilder();
    for(StringBuilder k : row){
        sb.append(k);
    }
    return sb.toString();


    }
}