package com.recorder.net.model;

import java.io.Serializable;

/**
 * Created by rmss on 2015/11/23.
 */
public class UserCheckInfo implements Serializable{
    String uid;
    String token;

    public String getUid() {
        return uid;
    }

    public String getToken() {
        return token;
    }
}
