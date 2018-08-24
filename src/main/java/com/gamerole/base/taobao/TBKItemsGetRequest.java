package com.gamerole.base.taobao;

import com.taobao.api.request.ItemsGetRequest;

public class TBKItemsGetRequest extends ItemsGetRequest {
    public String getApiMethodName() {
        return "taobao.tbk.item.get";
    }
}
