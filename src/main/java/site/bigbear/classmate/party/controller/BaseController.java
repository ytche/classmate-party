package site.bigbear.classmate.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.AbstractController;
import site.bigbear.classmate.party.common.Constant;
import site.bigbear.classmate.party.common.Message;
import site.bigbear.classmate.party.pojo.BaseEntity;

/**
 * @author cheyantao
 */
public  class BaseController<T extends BaseEntity>{

    /**
     * 发挥前台信息
     * @param success
     * @param data
     * @param info
     * @param errorCode
     * @return
     */
    public Message sendMessage(boolean success,Object data,String info,int
            errorCode){
        return  new Message(info,data,success,errorCode);
    }

    public Message sendSuccess(Object data){
        return this.sendMessage(true,data,null, Constant.SUCCESS_CODE);
    }
    public Message sendFail(String info,int errorCode){
        return  this.sendMessage(false,null,info,errorCode);
    }
}
