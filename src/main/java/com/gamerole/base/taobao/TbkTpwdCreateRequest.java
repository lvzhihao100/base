package com.gamerole.base.taobao;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

public class TbkTpwdCreateRequest extends BaseTaobaoRequest {
    private String user_id;
    private String text;
    private String url;
    private String logo;
    private String ext;
    @Override
    public String getApiMethodName() {
        return "taobao.tbk.tpwd.create";
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("user_id", this.user_id);
        txtParams.put("text", this.text);
        txtParams.put("url", this.url);
        txtParams.put("logo", this.logo);
        txtParams.put("ext", this.ext);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Class getResponseClass() {
        return null;
    }

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(user_id, "user_id");
        RequestCheckUtils.checkNotEmpty(text, "text");
        RequestCheckUtils.checkNotEmpty(url, "url");
        RequestCheckUtils.checkNotEmpty(logo, "logo");
        RequestCheckUtils.checkNotEmpty(ext, "ext");
    }
}
