/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JinGuBang
 * Author:   huchu
 * Date:     2019/3/20 15:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.prototype.simple.deep;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d =10;
    public void big(){
        h*=2;
        d*=2;
    }
    public void small(){
        h/=2;
        d/=2;
    }
}