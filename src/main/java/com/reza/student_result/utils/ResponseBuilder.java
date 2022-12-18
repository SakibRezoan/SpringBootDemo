package com.reza.student_result.utils;

import com.reza.student_result.constant.ResponseStatus;
import lombok.Data;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResponseBuilder implements Response {
    private final ResponseType type;

    private String status = null;
    private Object data = null;
    private Object meta = null;
    private String message = null;
    private Object errors = null;

    public ResponseBuilder(ResponseType type) {
        this.type = type;
    }

    public static ResponseBuilder success(Object data) {
        ResponseBuilder response = new ResponseBuilder(ResponseType.DATA);
        response.status = ResponseStatus.SUCCESS;
        response.data = data;
        return response;
    }

    public static ResponseBuilder success(Object data, String message) {
        ResponseBuilder response = new ResponseBuilder(ResponseType.DATA);
        response.status = ResponseStatus.SUCCESS;
        response.data = data;
        response.message = message;
        return response;

    }

    public static ResponseBuilder error(Object errors) {
        ResponseBuilder response = new ResponseBuilder(ResponseType.ERROR);
        response.errors = errors;
        response.status = ResponseStatus.ERROR;
        return response;
    }

    public static ResponseBuilder error(Object errors, String message) {
        ResponseBuilder response = new ResponseBuilder(ResponseType.ERROR);
        response.errors = errors;
        response.status = ResponseStatus.ERROR;
        response.message = message;

        return response;
    }

    @Override
    public JSONObject getJson() {
        Map<String, Object> maps = new HashMap<>();
        switch (this.type) {
            case DATA:
                maps.put("status", status);
                maps.put("data", data);
                maps.put("meta", meta);
                maps.put("message",message);
            case ERROR:
                maps.put("status", status);
                maps.put("error", errors);
                maps.put("message", message);
        }
        return new JSONObject(maps);

    }

}
