package com.graph;

/**
 * 测试用例02。用有向图测试。
 * @author YangFan
 */
public class TestCase02 {

    public static void main(String[] args) {
        
        /**
         * 将Case01中的无向图变成有向图。
         * 数据稍作修改，定义A至D距离3，D到A距离1，其它节点不变（距离不变且双向距离相同），数组如下
         */
        int[][] arr = {
                { 0,  1,  2,  3, -1, -1},
                { 1,  0, -1, -1,  1, -1},
                { 2, -1,  0, -1,  1, -1},
                { 1, -1, -1,  0, -1,  1},
                {-1,  1,  1, -1,  0,  3},
                {-1, -1, -1,  1,  3,  0}
        };

        arr = ShortestPath.compute(arr);

        System.out.println("A至F的最短路径：" + arr[0][5]);
        System.out.println("F至A的最短路径：" + arr[5][0]);

    }
}
