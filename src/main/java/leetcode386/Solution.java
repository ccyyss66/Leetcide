package main.java.leetcode386;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            if(i<=n){
                list.add(i);
                add(list,n,i);
            }else{
                break;
            }
        }
        return list;
    }

    private void add(List<Integer> list, int n, int startNum){
        startNum *= 10;
        for(int i = 0; i < 10; i++,startNum++){
            if(startNum<=n){
                list.add(startNum);
                add(list, n, startNum);
            }else{
                return;
            }
        }
    }
}
