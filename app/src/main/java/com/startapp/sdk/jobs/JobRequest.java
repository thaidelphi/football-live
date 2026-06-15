package com.startapp.sdk.jobs;

import java.util.ArrayList;
import java.util.UUID;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class JobRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f23328a;

    /* renamed from: b  reason: collision with root package name */
    public final UUID f23329b = UUID.randomUUID();

    /* renamed from: c  reason: collision with root package name */
    public final Network f23330c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23331d;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Network {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        ANY,
        UNMETERED
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a<B extends a<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f23335a;

        /* renamed from: b  reason: collision with root package name */
        public Network f23336b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f23337c;

        @SafeVarargs
        public a(Class<? extends b>... clsArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends b> cls : clsArr) {
                arrayList.add(cls.getName());
            }
            this.f23335a = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public JobRequest(a<?> aVar) {
        this.f23328a = aVar.f23335a;
        this.f23330c = aVar.f23336b;
        this.f23331d = aVar.f23337c;
    }

    public static int a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString().hashCode();
    }
}
