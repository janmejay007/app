package BalancedStack;

import java.util.Stack;

public class ValidOrNotBracketSequence {
    public static void main(String[] args) {
        int count=0;
        String str="((()))))?";
        char[] ch=str.toCharArray();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('||ch[i]==')'){


            }
            else{
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("not valid");
        }
        else{
            System.out.println("valid");
        }
        }
    }

