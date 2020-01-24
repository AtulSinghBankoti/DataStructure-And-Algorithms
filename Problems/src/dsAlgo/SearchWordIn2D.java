package dsAlgo;

public class SearchWordIn2D {
    
    void searchWordIn2D(char [][]toD, String str){
        for(int i=0;i<toD.length;i++){
            for(int j=0;j<toD[i].length;j++){
                if(search(toD, i, j, str, "HL", 0)){
                    System.out.println("found at"+i+" "+0);
                }else if(search(toD, i, j, str, "HR", 0)){
                    System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "VU", 0)){
                    System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "VD", 0)){
                    System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "LRD", 0)){
                     System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "LRDR", 0)){
                     System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "RLD", 0)){
                     System.out.println("found at"+i+" "+j);
                }else if(search(toD, i, j, str, "RLDR", 0)){
                     System.out.println("found at"+i+" "+j);
                }
            }
        }
    }
    
    
    boolean search(char [][]toD,int r,int c,String str,String dir,int l){
        //System.out.println(":::::::::::::::::::::::");
        if(str.length()==l){
           // System.out.println("jjjj>>>>>");
            return true;
        }else if((r >= toD.length || r <0) || (c >= toD[0].length || c<0) || !(toD[r][c]==str.charAt(l))){
            //System.out.println("k>>>r"+r+" c"+c+" l"+l);
            return false;
        }else{
            //System.out.println(">>l"+l+" >"+toD[r][c]+"=="+str.charAt(l));
            switch(dir){
                case "HL":
                    c--;
                    break;
                case "HR":
                    c++;
                    //System.out.println("here>HR..");
                    break;
                case "VU":
                    r--;
                    break;
                case "VD":
                    r++;
                    break;
                case "LRD":
                    c++;
                    r++;
                    break;
                case "LRDR":
                    c--;
                    r--;
                    break;
                case "RLD":
                    c--;
                    r++;
                    break;
                case "RLDR":
                    r--;
                    c++;
                    break;
            }
            //System.out.println("r>"+r+" c>"+c);
           //System.out.println(":::::::::::::::::::::::");
            return search(toD, r, c, str, dir, ++l);
        }
    }
    
    
    
    public static void main(String[] args) {
       String str="GEEKS";
       char [][]input={{'G','E','E','K','S','F','O','R','G','E','E','K','S'},
                        {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
                        {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}
                        };
       new SearchWordIn2D().searchWordIn2D(input, str);
        System.out.println("finished..!!");
       
    }
}
