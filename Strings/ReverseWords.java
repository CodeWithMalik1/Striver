public class ReverseWords {
    public static String reverse(String str){
        String temp="";
        String ans="";
        int left=0,right=str.length()-1;
        while(left<=right){
            char ch=str.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(ans!=""){
                    ans=temp+" "+ans;

                }
                else{
                    ans=temp;
                }
                temp="";
            }
            
            left++;

        }
        ans=temp+" "+ans;
        return ans;

    }
    public static void main(String[] args) {
        String str="Hello welcome to the world!";
        System.out.println(reverse(str));

    }
    
}
