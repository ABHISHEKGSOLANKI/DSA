package org.leetcode.graphs.dsf.easy;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image, 1,1, 2);
    }
        public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int tar = image[sr][sc];

            if(tar==color){
                return image;
            }

            dfs(sr,sc,image,tar,color);

            return image;
        }

        public static void dfs(int i,int j, int image[][], int tar, int color){
        System.out.println("["+i+","+j+"]");
            if(i<0 || i>=image.length || j<0 || j>=image[0].length){
                return;
            }
            if(image[i][j]!=tar){
                return;
            }
            image[i][j]=color;
        System.out.println(Arrays.toString(image[0]));
        System.out.println(Arrays.toString(image[1]));
        System.out.println(Arrays.toString(image[2]));
            // top
            dfs(i-1,j,image,tar,color);
            // bottom
            dfs(i+1,j,image,tar,color);
            // left
            dfs(i,j-1,image,tar,color);
            // right
            dfs(i,j+1,image,tar,color);
        }

}
