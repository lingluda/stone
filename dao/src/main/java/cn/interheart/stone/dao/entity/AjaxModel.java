package cn.interheart.stone.dao.entity;

public class AjaxModel {
    private boolean success = false;
    private String msg = "";
    private Object data;

    public AjaxModel(boolean success)
    {
        this.success = success;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
