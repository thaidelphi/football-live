package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p2 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f19660e = -1;

    /* renamed from: a  reason: collision with root package name */
    private final a f19661a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19662b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19663c;

    /* renamed from: d  reason: collision with root package name */
    private final long f19664d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public p2(a aVar, long j10, long j11, long j12) {
        this.f19661a = aVar;
        this.f19662b = j10;
        this.f19663c = j11;
        this.f19664d = j12;
    }

    public a a() {
        return this.f19661a;
    }

    public long b() {
        return this.f19664d;
    }

    public long c() {
        return this.f19663c;
    }

    public long d() {
        return this.f19662b;
    }

    public boolean e() {
        a aVar = this.f19661a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f19661a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
