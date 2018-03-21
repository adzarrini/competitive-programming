package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// God Save the i-th Queen
class IthQueen{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int X,Y,N;
            X=Integer.parseInt(st.nextToken());
            Y=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
            if(X==0){break;}
            boolean[] row=new boolean[X];
            boolean[] col=new boolean[Y];
            boolean[] diag1=new boolean[X+Y-1];//x+y
            boolean[] diag2=new boolean[X+Y-1];//x-y+Y-1
            while(N-->0){
                st = new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken())-1;
                int y=Integer.parseInt(st.nextToken())-1;
                row[x]=col[y]=diag1[x+y]=diag2[x-y+Y-1]=1>0;
            }
            int counter=0;
            for(int x=0;x<X;++x){
                if(row[x])continue;
                for(int y=0;y<Y;++y){
                    if(!(col[y]||diag1[x+y]||diag2[x-y+Y-1])){
                        ++counter;
                    }
                }
            }
            bw.write(counter+"\n");
        }
        bw.flush();
        bw.close();
    }
}