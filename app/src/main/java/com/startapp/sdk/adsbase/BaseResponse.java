package com.startapp.sdk.adsbase;

import com.ironsource.b9;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 3276484898993249723L;
    protected Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;
    private String errorMessage = null;

    public final String a() {
        return this.errorMessage;
    }

    public final boolean b() {
        return this.validResponse;
    }

    public final String toString() {
        return "BaseResponse [parameters=" + this.parameters + ", validResponse=" + this.validResponse + ", errorMessage=" + this.errorMessage + b9.i.f16698e;
    }
}
