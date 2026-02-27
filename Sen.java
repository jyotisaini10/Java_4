import java.util.*;

public class Sen {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the sentense");
        Scanner sc= new Scanner(System.in);

        str= sc.nextLine();
        

        char [] word= new char[str.length()];
       
        int index=0;
        for(int i=0; i<str.length(); i++){
                 char ch= str.charAt(i);
                 if(ch!=' '){
                    word[index++]= ch;

                 }else{
                    for(int j=index-1; j>=0; j--){
                        System.out.print(word[j]);
                    }
                    System.out.print(" ");
                    index=0;
                 }
        }
        for(int j= index-1; j>=0; j--){
            System.out.print(word[j]);
        }



        sc.close();
    }
}
