package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class qk {

    /* renamed from: c  reason: collision with root package name */
    private static qk f19892c;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f19893a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f19894b = new ConcurrentHashMap<>();

    qk() {
    }

    public static synchronized qk b() {
        qk qkVar;
        synchronized (qk.class) {
            if (f19892c == null) {
                f19892c = new qk();
            }
            qkVar = f19892c;
        }
        return qkVar;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f19893a;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f19893a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f19894b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f19893a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f19894b;
    }

    public void d() {
        synchronized (this) {
            this.f19893a.clear();
        }
    }
}
