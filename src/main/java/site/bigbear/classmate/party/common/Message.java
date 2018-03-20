package site.bigbear.classmate.party.common;

import com.sun.net.httpserver.Authenticator;

/**
 * 前后台交互信息基础格式
 * @author cheyantao
 */
public class  Message {
    private String info;
    private Object data;
    private Boolean success;
    private Integer errorCode;

    public Message(String info, Object data, Boolean success, Integer
            errorCode) {
        this.info = info;
        this.data = data;
        this.success = success;
        this.errorCode = errorCode;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
