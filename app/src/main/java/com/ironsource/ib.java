package com.ironsource;

import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ib {

    /* renamed from: a  reason: collision with root package name */
    private long f17822a = new Date().getTime();

    public static long a(ib ibVar) {
        if (ibVar == null) {
            return 0L;
        }
        return new Date().getTime() - ibVar.f17822a;
    }
}
