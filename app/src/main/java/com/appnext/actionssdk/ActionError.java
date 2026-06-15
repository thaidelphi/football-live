package com.appnext.actionssdk;

import com.appnext.core.AppnextError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionError extends AppnextError {
    public static final String ACTION_EXPIRED = "Action Expired";
    public static final String ACTION_NOT_READY = "Action Not Ready";
    public static final String PACKAGE_NOT_APPROVED = "Package Not Approved";

    public ActionError(String str) {
        super(str);
    }
}
