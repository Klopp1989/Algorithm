package com.graph;

/**
 * 测试用例01。用无向无图测试。
 * @author YangFan
 */
public class TestCase01 {

    public static void main(String[] args) {

        /**
         * 定义一个无向图，有6个节点A,B,C,D,E,F
         * A到F有三条路径：
         * A-(1)-B-(1)-E-(3)-F
         * A-(2)-C-(1)-E-(3)-F
         * A-(3)-D-(1)-F
         * 注：括号中间数字表示路径长度。如最后一条路径表示A到D距离3，D到F距离1
         *
         * 将上图用一个6x6的二维数组表示
         * arr[0][0]为0，表示A到A距离是0，arr[2][4]为1，表示C至E距离1
         * 用-1表示无穷远，arr[0][4],arr[0][5]均为-1，表示AE，AF之间不能直达。
         */
        int[][] arr = {
                { 0,  1,  2,  3, -1, -1},
                { 1,  0, -1, -1,  1, -1},
                { 2, -1,  0, -1,  1, -1},
                { 3, -1, -1,  0, -1,  1},
                {-1,  1,  1, -1,  0,  3},
                {-1, -1, -1,  1,  3,  0}
        };

        arr = ShortestPath.compute(arr);

        System.out.println("A至F的最短路径：" + arr[0][5]);

    }
}
