/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   huchu
 * Date:     2019/3/20 15:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.prototype.simple;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class Client {
    /*private Prototype prototype;
    public Client(Prototype prototype){
        this.prototype = prototype;
    }*/
    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }

}