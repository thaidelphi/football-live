package com.google.firebase.installations;

import c6.j;
/* compiled from: FirebaseInstallationsException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final a f14866a;

    /* compiled from: FirebaseInstallationsException.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f14866a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f14866a = aVar;
    }
}
