/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class QUwithPath {
    
    private final int N;
    private final int []id;
    
    public QUwithPath(int N){
        this.N = N;
        id = new int[N];
        for(int i=0; i < N; ++i){
            id[i] = i;
        }
    }
    
    private int root(int i){
        while(i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    
    public void union(int x, int y){
        int i = root(x);
        int j = root(y);
        id[i] = j;
    }
    
    public boolean connected(int x, int y){
        return root(x) == root(y);
    }
    
}
