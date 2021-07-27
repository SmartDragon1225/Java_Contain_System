package com.tian.dev;

import java.sql.Array;
import java.util.Arrays;

/**
 * Package: com.wu.dev
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/27 10:25
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public class Dev {
    public static void main(String[] args) {
        System.out.println("这是测试多人开发的git提交代码！");
        int arr[] = {0,5,4,3,2,7,8};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int arr[],int left,int right){
        int l = left;
        int r = right;
        int q = arr[(left+right)/2];
        while (l<r){
            while (arr[l]<q){
                l++;
            }
            while (arr[r]>q){
                r--;
            }
            if(l>=r){
                break;
            }
            int t = arr[l];arr[l] = arr[r];arr[r] = t;
            if(arr[l]==q){
                r--;
            }
            if(arr[r]==q){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r){
            quick(arr,left,r);
        }
        if(right>l){
            quick(arr,l,right);
        }
    }
}
