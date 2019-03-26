package com.graph;

/**
 * 从图中找两点之间最短路径
 * @author YangFan
 */
public class ShortestPath {

    /**
     * 采用Floyd算法实现
     * @param arr
     * @return
     */
    public static int[][] compute(int[][] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // 当i != j时执行计算最短路径的过程；当i = j时，arr[i][j]的值已经是0，不用执行寻找最短路径的过程
                if(i != j) {
                    for(int k = 0; k < n; k++) {
                        // 当(i,k)或(k,j)之间的距离为无穷远时，就不用执行计算最短距离操作了
                        if(arr[i][k] != -1 && arr[k][j] != -1) {
                            // 不断计算i，j两点之间的最短距离
                            if(arr[i][j] == -1 || arr[i][j] > arr[i][k] + arr[k][j]) {
                                arr[i][j] = arr[i][k] + arr[k][j];
                            }
                        }
                    }
                }
            }
        }

        return arr;

    }
}
