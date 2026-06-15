package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o2 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f19485e = -1;

    /* renamed from: a  reason: collision with root package name */
    private final a f19486a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19487b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19488c;

    /* renamed from: d  reason: collision with root package name */
    private final long f19489d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public o2(a aVar, long j10, long j11, long j12) {
        this.f19486a = aVar;
        this.f19487b = j10;
        this.f19488c = j11;
        this.f19489d = j12;
    }

    public a a() {
        return this.f19486a;
    }

    public long b() {
        return this.f19489d;
    }

    public long c() {
        return this.f19488c;
    }

    public long d() {
        return this.f19487b;
    }

    public boolean e() {
        a aVar = this.f19486a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f19486a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
