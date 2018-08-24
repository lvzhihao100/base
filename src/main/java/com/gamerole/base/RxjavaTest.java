package com.gamerole.base;

import com.gamerole.base.taobao.TBKItemsGetRequest;
import com.gamerole.base.taobao.TbkTpwdCreateRequest;
import com.gamerole.base.taobao.TbkTpwdCreateResponse;
import com.taobao.api.*;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.ItempropvaluesGetRequest;
import com.taobao.api.request.ItemsGetRequest;
import com.taobao.api.response.ItempropvaluesGetResponse;
import com.taobao.api.response.ItemsGetResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.util.ArrayList;
import java.util.Iterator;

public class RxjavaTest {
    public static void main(String[] args) throws ApiException {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            iterator.remove();
        }
    }

    private static void pwdCreate() throws ApiException {
//        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "24939469", "f16c513c3e87f8182a9ec4d0126f1a7d");
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "24937623", "142ee2efc106d92af1c7e85982ffd2ef");
        TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
        req.setUserId("123");
        req.setText("长度大于5个字符");
        req.setUrl("https://uland.taobao.com/");
        req.setLogo("https://uland.taobao.com/");
        req.setExt("{}");
        TaobaoResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }

    private static void itemGet() throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "24937623", "142ee2efc106d92af1c7e85982ffd2ef");
        ItemsGetRequest req = new TBKItemsGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
        req.setQ("女装");
//        req.setCat("16,18");
//        req.setItemloc("杭州");
//        req.setSort("tk_rate_des");
//        req.setIsTmall(false);
//        req.setIsOverseas(false);
        req.setStartPrice(10L);
        req.setEndPrice(10L);
//        req.setStartTkRate(123L);
//        req.setEndTkRate(123L);
//        req.setPlatform(1L);
        req.setPageSize(20L);
        ItemsGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
}
