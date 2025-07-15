class Solution {
    public boolean isValid(String word) {
        boolean digit=false;
        
        boolean vow=false;
        boolean con=false;
        int count=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
                digit=true;
                count++;
                continue;
            }
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vow=true;
                count++;
                continue;
            }
            if(c=='b'||c=='c'||c=='g'||c=='h'||c=='d'||c=='k'||c=='f'||c=='j'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||c=='B'||c=='C'||c=='D'||c=='K'||c=='F'||c=='G'||c=='H'||c=='J'||c=='L'||c=='M'||c=='N'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){
                con=true;
                count++;
                continue;
            }
            else{
                return false;
            }
        }
            if(count>=3&&(con==true)&&(vow==true)){
                return true;
            }
            else{
                return false;
            }
        }

    
}