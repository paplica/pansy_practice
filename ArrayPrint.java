/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gotoa
 */


public class ArrayPrint{
        public static void main(String[]args){
            int [] x={2,0,-4,8,-2,9,-1};
            int [] y=new int [x.length];
            int [] z=x;
            z=new int [x.length];
            for(int i=0;i<x.length;i++)
                y[i]=x[(i+3)%x.length];
            for(int i=0;i<x.length;i++)
                if(x[i]<y[i])
                    z[i]=x[i]-y[i];
                else
                    z[i]=x[i]+y[i];
                printA(x);
                printA(y);
                printA(z);
        }
        static void printA(int [] x){
            for(int i=0;i<x.length;i++)
                System.out.print(x[i]+" ");
            System.out.println();
        }
    }
