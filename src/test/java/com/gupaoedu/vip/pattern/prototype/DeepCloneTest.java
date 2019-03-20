/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DeepCloneTest
 * Author:   huchu
 * Date:     2019/3/20 15:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.vip.pattern.prototype;

import com.gupaoedu.vip.pattern.prototype.simple.deep.QiTianDaSheng;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆："+(qiTianDaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng clone2 = q.shallowClone(q);
        System.out.println("浅克隆："+(q.jinGuBang == clone2.jinGuBang));
    }

}