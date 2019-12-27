package com.wusichao.leetcode.dec2019;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wusichao
 * @date 2019/12/23 11:07
 */
public class TwoSum {
    public static void main(String[] args) {
       /* int[] result = twoSum(new int[]{1, 2, 5, 5}, 10);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/
        test(new ArrayList<>(), 1);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyMap = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            keyMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (keyMap.containsKey(target - nums[i]) && i != keyMap.get(target - nums[i])) {
                return new int[]{i, keyMap.get(target - nums[i])};
            }
        }
        return null;
    }

    private static void test(List<Person> list, Integer a) {
        List<Person> b = list;
        Integer c = a;
        System.out.println(b);
        System.out.println(c);
        list.add(new Person("a", 2));
        a++;
        System.out.println(b);
        System.out.println(c);

    }

    @Data
    @ToString
    @AllArgsConstructor
    private static class Person{

        private String name;

        private Integer age;
    }

}
