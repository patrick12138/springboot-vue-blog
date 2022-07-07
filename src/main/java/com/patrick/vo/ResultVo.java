package com.patrick.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo implements Serializable {
    private int code; // 200是正常，非200表示异常
    private String msg;
    private Object data;

    public static ResultVo succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static ResultVo succ(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static ResultVo fail(String msg) {
        return fail(400, msg, null);
    }

    public static ResultVo fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static ResultVo fail(int code, String msg, Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
