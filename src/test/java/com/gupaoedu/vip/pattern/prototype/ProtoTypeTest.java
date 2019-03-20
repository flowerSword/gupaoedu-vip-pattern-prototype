/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProtoTypeTest
 * Author:   huchu
 * Date:     2019/3/20 15:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.prototype;

import com.gupaoedu.vip.pattern.prototype.simple.Client;
import com.gupaoedu.vip.pattern.prototype.simple.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈浅克隆〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        //创建一个需要具体克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        //填充属性，方便测试
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("huchu");
        List<String> hobbies = new ArrayList<>();
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA);

        //创建一个client 对象
        Client client = new Client();
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(concretePrototypeClone);
        System.out.println("克隆对象中引用类型地址值："+concretePrototypeClone.getHobbies());
        System.out.println("原对象中引用类型地址值："+concretePrototypeA.getHobbies());
        System.out.println("对象地址比较"+(concretePrototypeClone.getHobbies() == concretePrototypeA.getHobbies()));
    }

}