package com.google.android.gms.common;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f12039a;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f12039a = intent;
    }
}
